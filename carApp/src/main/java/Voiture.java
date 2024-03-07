public class Voiture {
    private static final int MAX_SPEED = 120;
    private static final int SPEED_INCREMENT = 10;
    private static final String MAX_SPEED_REACHED_MESSAGE= "La vitesse maximale est atteinte."
    private static final String CAR_STOPPED_MESSAGE= "La voiture est déjà à l'arrêt."
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }
    public void demarrerVoiture(Voiture voiture) {
        if (estAdulte()) {
            System.out.println(nom + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture(Voiture voiture) {
        System.out.println(nom + " arrête la voiture.");
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (canAccelerate()) {
            vitesse += SPEED_INCREMENT;
           afficherDetails();
        } else {
            System.out.println(MAX_SPEED_REACHED_MESSAGE);
        }
    }

    public void ralentir() {
        if (canDecelerate()) {
            vitesse -= SPEED_INCREMENT;
            afficherDetails();
        } else {
            System.out.println(CAR_STOPPED_MESSAGE);
        }
    }
    private boolean canAccelerate() {
        return vitesse + SPEED_INCREMENT <= MAX_SPEED;
    }
    private boolean canDecelerate() {
        return vitesse - SPEED_INCREMENT >= 0;
    }
    private void afficherDetails(){
        System.out.println("Modèle : " + modele);
        System.out.println("Couleur : " + couleur);
        System.out.println("Vitesse actuelle : " + vitesse);
    }
}

