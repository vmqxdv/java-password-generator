package org.exercise.pswGen;

import java.util.Scanner;

public class passwordGenerator {
  public static void main(String[] args) {
    String name;
    String surname;
    String favouriteColor;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;

    Scanner in = new Scanner(System.in);

    System.out.println(
        "Benvenuto nel programma di generazione password!!\nPer ottenere la tua nuova password, compila i campi che ti verranno proposti.\n\n");

    System.out.println("Il tuo nome:");
    name = in.nextLine();

    System.out.println("Il tuo cognome:");
    surname = in.nextLine();

    System.out.println("Il tuo colore preferito:");
    favouriteColor = in.nextLine();

    System.out.println("Il tuo giorno di nascita:");
    dayOfBirth = in.nextInt();

    System.out.println("Il tuo mese di nascita:");
    monthOfBirth = in.nextInt();

    System.out.println("Il tuo anno di nascita:");
    yearOfBirth = in.nextInt();

    int dateNumSum = dayOfBirth + monthOfBirth + yearOfBirth;

    System.out.println("Compilazione completata con successo!! La tua nuova password è:\n"
        + String.join("-", name, surname, favouriteColor, String.valueOf(dateNumSum)));
  }
}
