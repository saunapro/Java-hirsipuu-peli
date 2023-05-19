     //TÄMÄ ON SIIS LUOKKA JOKA TOTEUTTAA OIKEIDEN ARVAUKSIEN TOIMINNALLISUUDEN



import java.util.ArrayList;
import java.util.List;



public class oikeatArvaukset {


    //LUOMME LISTAN JOKA SÄILÖÖ OIKEAT VASTAUKSET

    private List<Character> arvaukset;

    public oikeatArvaukset() {
        this.arvaukset = new ArrayList<>();
    }


    //TÄMÄ METODI LISÄÄ KIRJAIMEN LISTAAN

    public void lisää(Character arvaus) {
        arvaukset.add(arvaus);
    }

}
