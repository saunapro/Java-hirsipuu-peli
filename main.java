import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner tiedostonlukija = new Scanner(new File("sanalista.txt")); // tekstitiedosto

        Scanner lukija = new Scanner(System.in);

        List<String> sanat = new ArrayList<>();

        while (tiedostonlukija.hasNextLine()) {
            sanat.add(tiedostonlukija.nextLine());
        }

        Random random = new Random();

        String sana = sanat.get(random.nextInt(sanat.size()));

        System.out.println(sana);

    }
}