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
}
