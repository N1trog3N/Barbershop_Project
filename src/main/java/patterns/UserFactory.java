package patterns;
import models.Client;
import models.Barber;
import models.Administrator;

public class UserFactory {
    public static Client createClient(String name, String lastName, int phoneNumber, String username, String password) {
        return new Client(name, lastName, phoneNumber, username, password);
    }

    public static Barber createBarber(String barberName, String barberLastName, String username, String password) {
        return new Barber(barberName, barberLastName, username, password);
    }

    public static Administrator createAdministrator(String username, String password) {
        return new Administrator(username, password);
    }
}
