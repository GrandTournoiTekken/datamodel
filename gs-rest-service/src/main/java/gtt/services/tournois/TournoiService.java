package gtt.services.tournois;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gtt.datamodel.GrandTournoi;

@RestController
public class TournoiService {

	private final static AtomicLong counter = new AtomicLong();

	@RequestMapping("/tournoi/nouveau")
	public GrandTournoi nouveauGrandTournoi(@RequestParam(value = "nom", defaultValue = "Grand Tournoi") String nom) {
		return new GrandTournoi((int) counter.incrementAndGet(), nom);
	}

}
