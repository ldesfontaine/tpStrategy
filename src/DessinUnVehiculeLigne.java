import java.util.List;

public class DessinUnVehiculeLigne implements DessinCatalogue {
    @Override
    public void dessine(List<VueVehicule> vehicules) {
        for (VueVehicule vehicule : vehicules) {
            vehicule.dessine();
            System.out.println();  // end of line
        }
    }
}