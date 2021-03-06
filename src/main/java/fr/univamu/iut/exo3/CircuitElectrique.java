package fr.univamu.iut.exo3;
import java.util.ArrayList;
import java.util.List;

public class CircuitElectrique extends Composant {

    private List<Composant> mesComposants;

    /** Constructors **/

    public void CircuitElectrique() {
        this.mesComposants = new ArrayList<Composant>();
    }

    public void Ajouter(Composant composant) {
        this.mesComposants.add(composant);
    }
    public void Supprimer(Composant composant) {
        this.mesComposants.remove(composant);
    }
    @Override
    public void Executer() {
        for (Composant comp:mesComposants) {
            comp.Executer();
        }
    }
    public void getComposant(Composant mesComposants) {
        this.mesComposants = (List<Composant>) mesComposants;
    }
    public List<Composant> getComposant() {
        return mesComposants;
    }
    public void Afficher() {
        System.out.println(mesComposants);
    }
}
