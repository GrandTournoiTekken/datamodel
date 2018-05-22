package gtt.datamodel;

import java.util.Vector;

public class Tournoi {
	private int id;
	private Vector<Participant> participants;
	private Vector<Participant> elimines;
	private Participant gagnant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vector<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(Vector<Participant> participants) {
		this.participants = participants;
	}

	public Vector<Participant> getElimines() {
		return elimines;
	}

	public void setElimines(Vector<Participant> elimines) {
		this.elimines = elimines;
	}

	public Participant getGagnant() {
		return gagnant;
	}

	public void setGagnant(Participant gagnant) {
		this.gagnant = gagnant;
	}

}
