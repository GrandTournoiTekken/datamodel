package gtt.services.tournois;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gtt.datamodel.GrandTournoi;
import gtt.storage.Storage;

@RestController
public class GrandTournoiService {

	private final static Logger log = LoggerFactory.getLogger(GrandTournoiService.class);
	private final static AtomicLong counter = new AtomicLong(-1);

	@RequestMapping(value = "/tournoi/nouveau", method = RequestMethod.POST)
	public GrandTournoi nouveauGrandTournoi(@RequestParam(value = "nom", defaultValue = "Grand Tournoi") String nom) {
		int id = (int) counter.incrementAndGet();
		GrandTournoi grandTournoi = new GrandTournoi(id, nom);
		Storage.grandsTournois.addElement(grandTournoi);	
		Storage.file.save(Storage.grandsTournois);
		return grandTournoi;
	}

	@RequestMapping(value = "/tournoi/voir/{id}", method = RequestMethod.GET)
	public ResponseEntity<GrandTournoi> voirGrandTournoi(@PathVariable(required = true) int id,
			@RequestParam(value = "nom", defaultValue = "Grand Tournoi") String nom) {
		try {
			GrandTournoi grandTournoi = Storage.grandsTournois.get(id);
			return new ResponseEntity<GrandTournoi>(grandTournoi, HttpStatus.OK);
		} catch (Exception e) {
			log.error("Pas de grand tournoi trouvé à l'id " + id);
			return new ResponseEntity<GrandTournoi>(HttpStatus.NO_CONTENT);
		}
	}

}
