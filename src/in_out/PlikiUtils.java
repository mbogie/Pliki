package in_out;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

public class PlikiUtils {

    public static void zapisOdczyt() throws IOException{
        Path plik1 = Paths.get("e:\\plik1.txt");
        Charset charset = Charset.forName("UTF-8");
        //zapis
        byte[] fileArray = "Ala ma kota".getBytes(charset);
        Files.write(plik1, fileArray, StandardOpenOption.CREATE);
        //odczyt
        byte[] readFileArray = Files.readAllBytes(plik1);
        String odczytanyPlik = new String(readFileArray,charset);
        System.out.println(odczytanyPlik);
    }


    public static void odczytZPliku() throws IOException{
        Path plik1 = Paths.get("e:\\zadanie1.txt");
        byte[] readFileArray = Files.readAllBytes(plik1);
        String odczytanyPlik = new String(readFileArray,Charset.forName("utf-8"));
        //System.out.println(odczytanyPlik);


        String[] imiona = odczytanyPlik.split(";");

        Arrays.stream(imiona)
                .filter(imie-> imie.endsWith("a"))
                .forEach(System.out::println);}

    public static void atrybuty() throws IOException{
        Path file = Paths.get("e:\\plik1.txt");
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
        System.out.println("isDirectory: " + attr.isDirectory());
        System.out.println("isOther: " + attr.isOther());
        System.out.println("isRegularFile: " + attr.isRegularFile());
        System.out.println("isymbolicLink: " + attr.isSymbolicLink());
        System.out.println("creationTime: " + attr.creationTime());
        System.out.println(attr.size());



    }

}
