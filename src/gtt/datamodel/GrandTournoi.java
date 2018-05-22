package gtt.datamodel;

import java.util.Vector;

public class GrandTournoi {

    private int id ;
    private String nom;
    private Vector<Personnage> personnages ;
    private Vector<Personnage> bosses ;
    private Vector<Tournoi> tournois ;
    private Personnage gagnant ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Vector<Personnage> getBosses() {
        return bosses;
    }

    public void setBosses(Vector<Personnage> bosses) {
        this.bosses = bosses;
    }

    public Vector<Tournoi> getTournois() {
        return tournois;
    }

    public void setTournois(Vector<Tournoi> tournois) {
        this.tournois = tournois;
    }

    public Personnage getGagnant() {
        return gagnant;
    }

    public void setGagnant(Personnage gagnant) {
        this.gagnant = gagnant;
    }

    public Vector<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(Vector<Personnage> personnages) {
        this.personnages = personnages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
