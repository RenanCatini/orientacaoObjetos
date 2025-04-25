package hostelapp.model;

public class TestCustomer {
    public static void main(String[] args) {

        Guest guest = new Guest();
        guest.setName("Florentino");
        guest.setLastName("Ariza");
        System.out.println(guest.getName() + " " + guest.getLastName());

        Guest guest2 = new Guest();
        guest2.setName("Fermina");
        guest2.setLastName("Daza");
        System.out.println(guest2.getName() + " " + guest.getLastName());

        Address address = new Address("Rua X", "123", "Alfenas", "MG");

        guest2.setAddress(address);
        System.out.println(guest2.getAddress().getCity());

    }
}
