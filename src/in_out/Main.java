package in_out;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            PlikiUtils.zapisOdczyt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            PlikiUtils.odczytZPliku();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PlikiUtils.atrybuty();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
