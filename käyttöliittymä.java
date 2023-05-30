import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class käyttöliittymä {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("HUOM: Älä käytä isoja kirjaimia.");




        //KUTSUTAAN MUUT LUOKAT


        oikeatArvaukset oikea = new oikeatArvaukset();

        //HALLITSEE OIKEAT VASTAUKSET
        
        väärätArvaukset väärä = new väärätArvaukset();

        //HALLITSEE VÄÄRÄT VASTAUKSET

    

        

        //HAETAAN TEKSTITIEDOSTO



        Scanner tiedostonlukija = new Scanner(new File("sanalista.txt"));

        Scanner lukija = new Scanner(System.in);



        //LUODAAN LISTA JOHON TALLENNAMME TEKSTITIEDOSTON SISÄLLÖN

        List<String> sanat = new ArrayList<>();
        while (tiedostonlukija.hasNextLine()) {
            sanat.add(tiedostonlukija.nextLine());
        }

    
        //KÄYTÄMME JAVAN RANDOM() METODIA JOLLA HAEMME SATTUMANVARAISEN SANAN LISTASTA

        Random random = new Random();
        String sana = sanat.get(random.nextInt(sanat.size()));
        ArrayList<Character> väärätSanat = new ArrayList<>();



        //MUUTAMME JOKAISEN ARVATTAVAN SANAN KIRJAIMEN ALAVIIVAKSI

        String arvattavaSana = "";
        for (int i = 0; i < sana.length(); i++) {
            arvattavaSana += "_";



        //SEURAA TOISTOLAUSE JOKA TOTEUTTAA OHJELMAN TOIMINNALLISUUDEN


        }
        while (true) {


        //PERUS TULOSTUKSET. JOS SYÖTE ON PIDEMPI KUIN YKSI KIRJAIN TAI TYHJÄ, KEHOTAMME SYÖTTÄMÄÄN YHDEN KIRJAIMEN


            System.out.println(arvattavaSana);
            System.out.println("Syötä kirjain:");

            String syötettyKirjain = lukija.nextLine();

            if (syötettyKirjain.length() > 1) {
                System.out.println("Syötä yksi kirjain!");
                continue;
            }

            if(syötettyKirjain.equals("")){
                continue;
            }
            if(syötettyKirjain.matches(".*\\d.*")){
                System.out.println("Älä käytä numeroita!");
                continue;
            }
            if(syötettyKirjain.matches(".*[^a-zA-Z0-9].*")){
                System.out.println("Älä käytä erikoisia merkkejä!");
                continue;
            }
            if(väärätSanat.contains(syötettyKirjain.charAt(0))) {
                System.out.println("Kyseistä kirjainta on jo arvattu kerran!");
            }
            

            
        //TARKISTAMME, SISÄLTÄÄKÖ ARVATTAVA SANA SYÖTETTYÄ KIRJAINTA, JOS EI, AJAMME VÄÄRÄ LUOKAN METODIN, JOKA LISÄÄ VÄÄRIIN ARVAUKSIIN YHDEN


            char arvattuKirjain = syötettyKirjain.charAt(0);

            if(väärätSanat.contains(arvattuKirjain)){}

            else if (sana.indexOf(arvattuKirjain) == -1) {
                väärä.lisää();
                väärätSanat.add(arvattuKirjain);
                // VÄÄRÄTARVAUKSET METODIN MUUNTAJAAN TULEE LISÄTÄ 1 JOS TÄMÄ IF- LAUSE ON TOSI



        //MUULLOIN LISÄÄMME ARVATTAVAAN SANAAN UUDEN KIRJAIMEN


            } else {
                oikea.lisää(arvattuKirjain);
                char[] uusiArvattavaSana = arvattavaSana.toCharArray();
                for (int i = 0; i < sana.length(); i++) {
                    if (sana.charAt(i) == arvattuKirjain) {
                        uusiArvattavaSana[i] = arvattuKirjain;
                    }
                }
                arvattavaSana = new String(uusiArvattavaSana);
            }


            //JOS PIILOTETTU SANA ON SAMA, KUIN ARVATTAVA SANA, VOITTAA PELIN

            if (arvattavaSana.equals(sana)) {
                System.out.println(sana);
                System.out.println("Voitto!");
                break;
            }


            //HIRSIPUU GRAFIIKAN TOTEUTUS RATKAISU SEKÄ PELIN HÄVIÄMISEN TOIMINNALLISUUS


            //HAE TÄÄLLÄ VÄÄRÄTARVAUKSET METODIN MUUNTAJAN SUMMA JOTTA VOIMME RAKENTAA HIRSIPUUN VÄÄRIEN VASTAUKSIEN MÄÄRÄN MUKAAN

            if (väärä.getLaskuri() == 1) {
                System.out.println("+---+ \n|   | \n|   0\n| \n|\n ");
            }
            if (väärä.getLaskuri() == 2) {
                System.out.println("+---+ \n|   | \n|   0\n|   |\n|\n ");
            }
            if (väärä.getLaskuri() == 3) {
                System.out.println("+---+ \n|   | \n|   0\n|  /|\n|\n ");
            }
            if (väärä.getLaskuri() == 4) {
                System.out.println("+---+ \n|   | \n|   0\n|  /|\\ \n|\n ");
            }
            if (väärä.getLaskuri() == 5) {
                System.out.println("+---+ \n|   | \n|   0\n|  /|\\ \n|  /\n ");
            }
            if (väärä.getLaskuri() == 6) {
                System.out.println("+---+ \n|   | \n|   0\n|  /|\\ \n|  / \\ \n ");
                System.out.println("Tappio! Oikea sana oli: " + sana);
                break;
            }
        }
    }
}
