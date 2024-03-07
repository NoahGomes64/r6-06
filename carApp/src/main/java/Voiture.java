public class Voiture {
    private static final int MAX_SPEED = 120;
    private static final int SPEED_INCREMENT = 10;
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + SPEED_INCREMENT <= MAX_SPEED) {
            vitesse += SPEED_INCREMENT;
           afficherDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - SPEED_INCREMENT >= 0) {
            vitesse -= SPEED_INCREMENT;
            afficherDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
    private void afficherDetails(){
        System.out.println("Modèle : " + modele);
        System.out.println("Couleur : " + couleur);
        System.out.println("Vitesse actuelle : " + vitesse);
    }
}

