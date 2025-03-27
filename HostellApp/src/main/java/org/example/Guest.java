package org.example;

// Importar o projeto lombok que faz automaticamente a criação dos Getters e Setters
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Classe hospede para o trabalho
public class Guest {

    //Variaveis
    String title;
    String firstName;
    String lastName;
    String address;
    String zipCode;
    String country;
    String dateOfBirth;
    String email;


    // Métodos - CamelCase
}
