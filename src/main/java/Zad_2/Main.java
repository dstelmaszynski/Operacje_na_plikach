package Zad_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //scanner do wprowadzanie tekstu przez uzytkowanika
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź tekst: ");
        String textInput = scanner.nextLine();

        //nowy plik + zapis
        File file2 = new File("wynik_2.txt");
        PrintWriter saveText = new PrintWriter("wynik_2.txt");
        saveText.write(textInput);
        saveText.close();

        //wyswietlanie linii z pliku
        Scanner scanner1 = new Scanner(file2);
        System.out.println(scanner1.nextLine());
    }
}
