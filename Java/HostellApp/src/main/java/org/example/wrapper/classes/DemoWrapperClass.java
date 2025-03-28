package org.example.wrapper.classes;

public class DemoWrapperClass {
    public static void main(String[] args) {
        //tipos primitivos: byte, short, long, int, float, double, char, boolenan
        //Whapper Classes: Byte, Short, Long, Integer, Float, Double, Boolean, Character

        int i = 50;
        System.out.println("i é igual a " + i);

        Integer iWrapper = new Integer(i); // Desatualizado
        System.out.println(iWrapper.toString());

        // int a = iWrapper.intValue();
        int a = iWrapper;   //Desempacotar

        double x = 10.0;
        Double xWrapper = x;    //Empacotando o tipo primitivo na Wrapper

        // Exemplos Slides:

        Integer numeroDeprecated = new Integer(5); // obsoleto, não usar
        Integer numeroValueOf = Integer.valueOf(5); // Alternativa 1: usada atualmente
        Integer numeroAutoBoxing = 5; // Alternativa 2: usada atualmente

        System.out.println(numeroDeprecated);
        System.out.println(numeroValueOf);
        System.out.println(numeroAutoBoxing);

        //Long deprecatedNumberLong = new Long(5.5);
        Long deprecatedValueOfLong = Long.valueOf((long)5.0);
        Long deprecatedNumberLongAlternative = (long)5.5;   //Forcar o compilador transformar no tipo desejado

        //System.out.println(deprecatedNumberLong);
        System.out.println(deprecatedValueOfLong);
        System.out.println(deprecatedNumberLongAlternative);


    }
}
