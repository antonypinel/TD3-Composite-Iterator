package fr.univamu.iut.exo3;
import java.util.List;

public class CircuitElectrique extends Composant {

    private List<Composant> mesComposants;

    /** Constructors **/

    public void CircuitElectrique() {
        this.mesComposants = mesComposants;
    }

    public void Ajouter(Composant composant) {
        this.mesComposants.add(composant);
    }
    public void Supprimer(Composant composant) {
        this.mesComposants.remove(composant);
    }
    @Override
    public void Executer() {

    }
    public void Acceder() {

    }
}
