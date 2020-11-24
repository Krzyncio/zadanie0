package com.company;

public class Main {

    public static void main(String[] args) {

        Phone xiaomi = new Phone();
        xiaomi.model = "Redmi Note 9";
        xiaomi.brand = "Xiaomi";
        xiaomi.weight = 180.00;

        System.out.println("Mój wybrany telefon to " + xiaomi.brand + " model " + xiaomi.model + " ważący " + xiaomi.weight + " gram");


        Animal dog = new Animal();
        dog.name = "Burek";
        dog.age = 13.5;
        dog.race = "owczarek niemiecki";
        dog.weight = 25.6;


        System.out.println("Mam psa, który wabi się " + dog.name + ", ma " + dog.age + " rok, waży " + dog.weight +
                            " kg i jest rasy " + dog.race);

        Human wife = new Human();
        wife.firstName = "Mariola";
        wife.hairColor = "rudy";
        wife.age = 30;
        wife.weight = 90.6;

        System.out.println("Moja żona ma na inię " + wife.firstName + " i ma " + wife.age + " lat");
        System.out.println("Nie dość, że ma " + wife.hairColor + " kolo włosów, to jeszcze waży, AŻ " + wife.weight + " kg!!!");
        System.out.println("Nie dość, że ma " + wife.hairColor + " kolo włosów, to jeszcze waży, AŻ " + wife.weight + " kg!!!");
        System.out.println("Nie dość, że ma " + wife.hairColor + " kolo włosów, to jeszcze waży, AŻ " + wife.weight + " kg!!!");


    }

}
