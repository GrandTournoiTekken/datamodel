package gtt.datamodel;

public class Participant {
	private int id;
	private Personnage perso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Personnage getPerso() {
		return perso;
	}

	public void setPerso(Personnage perso) {
		this.perso = perso;
	}
}
