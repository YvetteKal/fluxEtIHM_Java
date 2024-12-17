import java.io.Serializable;

//utilisee dans le fichier Main.java

public class Voituree implements Serializable{

    int nombrePneus;
    int nombrePortes;
    String marque;

    //constructeur
    public Voituree(int nombrePneus, int nombrePortes, String marque){

        this.nombrePneus = nombrePneus;
        this.nombrePortes = nombrePortes;
        this.marque = marque;

    }

    public String description (){
        return "marque: "+this.marque+ ", nombre des pneus: " +this.nombrePneus+ ", nombre des portes: "+this.nombrePortes;
    }


}
