package gtt.datamodel;

import java.util.Vector;

public class GrandTournoi {

	private int id;
	private String nom;
	private Vector<Personnage> personnages;
	private Vector<Personnage> bosses;
	private Vector<Tournoi> tournois;
	private Personnage gagnant;

	public GrandTournoi(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return String.join((String.valueOf((char) 32)), System.getProperty("line.separator"), nom, ": grand tournoi n°",
				String.valueOf(id), System.getProperty("line.separator"));
	}
}
