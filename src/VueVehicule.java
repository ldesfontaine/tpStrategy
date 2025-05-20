public class VueVehicule {
    private String description;

    public VueVehicule(String description) {
        this.description = description;
    }

    public void dessine() {
        System.out.print(description); // Affiche la description du véhicule
    }
}