package org.example.wrapper.classes;

// Importar o projeto lombok que faz automaticamente a criação dos Getters e Setters
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Classe hospede para o trabalho
public class Guest {

    /*
        - private permite apenas a classe dele acessar o valores, para maiores controles
        das variaveis da classe.

        - Impedir que acessem as variaveis diretamente, obrigando a usar os metodos,

        - Sem modificador do pacote : será o mesmo da sua classe
    */

    //Variaveis
    private String title;
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private String country;
    private String dateOfBirth;
    private String email;

    // Métodos - CamelCase

}
