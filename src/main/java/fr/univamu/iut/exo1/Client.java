package fr.univamu.iut.exo1;

public class Client {
    public static void main(String[] args) {
        Nombre nextDroite = new Nombre (5);
        Nombre basGauche = new Nombre(2);
        Nombre basDroite = new Nombre(3);
        Expression head = new NoeudInterne('*', new NoeudInterne('-', basGauche, basDroite), nextDroite);
        System.out.println(head.CalculateValue());
    }
}
