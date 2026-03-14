package org.example;

public class Main {

    public static void main(String[] args){

        final double fator = 5.0 / 9.0;
        final double ajuste = 32;

        final double fahrenheit = 89;
        final double celcius = (fahrenheit - ajuste) * fator;

        System.out.println("Hoje esta " + celcius + " C");
    }
}