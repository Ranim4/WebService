
function chargerContenu() {
	var httprequest;
	if (window.XMLHttpRequest) {
		// Tous les navigateurs sauf l'ami Internet Explorer
		httprequest = new XMLHttpRequest();
	} else {
		// Que pour internet explorer
		httprequest = new ActiveXObject("Msxm12.XMLHTTP");
	}

	httprequest.onreadystatechange = function() {
		if (httprequest.readyState == 4) {
			if (httprequest.status == 200) {
				var contenuJSON = JSON.parse(httprequest.responseText);
				var maDiv = document.getElementById("seances_holder");
				maDiv.innerHTML = "";

				for (i = 0; i < contenuJSON.length; i++) {
					var divNote = document.createElement("div");

					var pDate = document.createElement("p");
					var pPrix = document.createElement("p");
					var pHeure = document.createElement("p");
					var pFilm = document.createElement("p");
					pDate.innerHTML = "Date : "+ contenuJSON[i].dateSeance;
					pPrix.innerHTML = "Prix : "+ contenuJSON[i].prix;
					pHeure.innerHTML = "De : "+ contenuJSON[i].heureDebut + " a " + contenuJSON[i].heureFin;
					/*pFilm.innerHTML = "Film : "+ contenuJSON[i]*/
					divNote.appendChild(pDate);
					divNote.appendChild(pPrix);
					divNote.appendChild(pHeure);
				/*	divNote.appendChild(pFilm);*/
					
					var pEspace = document.createElement("hr");
					divNote.appendChild(pEspace);
					
					maDiv.appendChild(divNote);
				}
			} else {
				alert("Une erreur s'est produite : " + httprequest.responseText);
			}
		}
	};

	httprequest.open("GET", "http://localhost:8080/TPGestionSeancesCinema/rest/seances", true);
	httprequest.send();
}














