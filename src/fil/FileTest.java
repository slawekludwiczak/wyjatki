package fil;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("test.txt"));
        String text = "";
        while(scan.hasNextLine()) {
            text += scan.nextLine()+"\n";
        }

        System.out.println(text);
        String[] split = text.split("\\s"); //podziel tekst po dowolnym białym znaku
        System.out.println(Arrays.toString(split)); //wyświetlamy słowa
        System.out.println("Ilość słów " + split.length);

        String textWithoutWhitespace = text.replaceAll("\\s", ""); //zamień białe znaki na nic
        System.out.println(textWithoutWhitespace); //tekst bez białych znaków
        System.out.println("Ilość czarnych znaków " + textWithoutWhitespace.length());

        System.out.println("Ilość wszystkich znaków " + text.length());

    }
}
