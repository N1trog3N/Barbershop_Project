package models;

public class Barber extends User {
    private String BarberName;
    private String BarberLastName;

    public Barber(String BarberName, String BarberLastName, String username, String password) {
        super(username, password, false, true);
        this.BarberName = BarberName;
        this.BarberLastName = BarberLastName;
    }

    @Override
    public void getFunctionality() {
        System.out.println("Barber Functionality");
    }

    private void checkRecord(){

    }

    private void acceptRecord(){

    }

    private void editRecord(){

    }
}
