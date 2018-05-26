package gtt.datamodel;

import java.util.Map;
import java.util.Vector;

public class Tournoi {
	private int id;
	private Vector<Participant> listeParticipants;
	private Vector<Participant> listeElimines;
	private Vector<Joueur> listeJoueurs;
	private Participant gagnant;
	private Map<Joueur, Participant> mapRepechage;
	private Map<Joueur, Participant> mapParrainage;
	private Vector<Combat> listeCombats;


}
