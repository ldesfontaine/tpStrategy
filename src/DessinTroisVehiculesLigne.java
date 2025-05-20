import java.util.List;

public class DessinTroisVehiculesLigne implements DessinCatalogue {
    @Override
    public void dessine(List<VueVehicule> vehicules) {
        int count = 0;
        for (VueVehicule vehicule : vehicules) {
            vehicule.dessine();
            count++;
            if (count % 3 == 0) {
                System.out.println(); // Saut de ligne après trois véhicules
            } else {
                System.out.print(" "); // Espace entre les véhicules
            }
        }
        if (count % 3 != 0) {
            System.out.println(); // Saut de ligne final si la dernière ligne est incomplète
        }
    }
}