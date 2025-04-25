package hostelapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Guest {
    private String name;
    private String lastName;
    private Address address;

    // Toda primeira linha de um construtor em Java ou é uma chamada super() ou um this () recursivo
    // Vamos aprender a palavra reservada super no momento que estudarmos herança

    public Guest() {
        // this ou super
        this(null);
    }

    public Guest(String name) {
        this(name, null);
    }

    public Guest(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static void main(String[] args) {

        Guest guest = new Guest();

        guest.setName("Atticus");
        guest.setLastName("Finch");

        System.out.println(guest.getName() + " " + guest.getLastName());
    }

}
