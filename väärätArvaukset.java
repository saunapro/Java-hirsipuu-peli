//TÄMÄ LUOKKA SIIS PITÄÄ KIRJAA VÄÄRIEN VASTAUKSIEN MÄÄRÄSTÄ


public class väärätArvaukset {
    
    private int laskuri = 0;

    public väärätArvaukset() {
        this.laskuri = 0;
    }

    public void lisää() {
        laskuri++;
    }
    public int getLaskuri() {
        return laskuri;
    }
}
