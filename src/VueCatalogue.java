import java.util.ArrayList;
import java.util.List;

public class VueCatalogue {
    private DessinCatalogue dessin;
    private List<VueVehicule> contenu;

    public VueCatalogue(DessinCatalogue dessin) {
        this.dessin = dessin;
        this.contenu = new ArrayList<>();
        // Initialisation simulée du contenu
        contenu.add(new VueVehicule("Voiture A"));
        contenu.add(new VueVehicule("Voiture B"));
        contenu.add(new VueVehicule("Voiture C"));
        contenu.add(new VueVehicule("Voiture D"));
        contenu.add(new VueVehicule("Voiture E"));
    }

    public void dessine() {
        dessin.dessine(contenu);
    }
}