package Zad_1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("plik.txt");

        //sprawdzenie czy plik istnieje
        boolean exists = file.exists();
        System.out.println("This file exists: " + exists);

        //sciezka absolutna
        File absolutePath = file.getAbsoluteFile();
        System.out.println("Ten plik jest w: " + absolutePath);

        //zapis do pliku
        File file1 = new File("wynik.txt");
        PrintWriter zapis = new PrintWriter("wynik.txt");
        zapis.println("Dominik jest fajny");
        zapis.println("Beata jest fajniejsza");
        zapis.println("Tosia jest najfajniejsza");
        zapis.close();

        //wyswietlanie zawartosci pliku
        Scanner scanner = new Scanner(file1);
        //petla while do wyswietlania do zdefiniowanego momentu .hasnext()
        while (scanner.hasNext()){
            String textReader = scanner.nextLine();
            System.out.println(textReader);
        }
    }
}
