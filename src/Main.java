import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.UIManager;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String tijdstip = dateFormat.format(new Date());
        String locatie = "'Haagse Hogeschool, Zoetermeer'";
        String foutmelding = "";
        String bootnnrd1 = "<html><font color=#ff0000>[BOOTNUMMER: </font>"; //Kleurt de tekst rood
        String bootnnrd2 = "<html><font color=#ff0000>] </font>"; //Kleurt de tekst rood
        String letop = "<html><font color=#ff0000>[Let op!] </font>"; //Kleurt de tekst rood
        String f1 = "<html><font color=#ff0000>[FOUTMELDING: ERC<2] </font>"; //Kleurt de tekst rood
        String f2 = "<html><font color=#ff0000>[FOUTMELDING: ERC>2&<5] </font>"; //Kleurt de tekst rood
        String f3 = "<html><font color=#ff0000>[FOUTMELDING: ERC>5] </font>"; //Kleurt de tekst rood
        UIManager.put("OptionPane.okButtonText", "Begrepen");
        boolean y = true;
        int bootnummer = 1;
        double waardewater = 1.0;

        if(waardewater <2.0){
                    foutmelding = f1; //Deze foutmelding geeft aan dat de waarde onder de 2.0 zit.
                }
                else if(waardewater >2.0 && waardewater <5.0){
                    foutmelding = f2; //Deze foutmelding geeft aan dat de waarde boven de 2.0 zit maar onder de 5.0.
        }
                else{
                    foutmelding = f3; //Deze foutmelding geeft aan dat de waarde van het water boven de 5.0 zit.
        }

                if(y == true){
                    JOptionPane.showMessageDialog(null, letop+"\nHet water is momenteel erg vervuild op locatie " +locatie+".\nHet gemeten water heeft momenteel een waarde van "+waardewater+"."+"\nRaadpleeg nu verantwoordelijke@dafuture.nl, vermeld het bootnummer en foutmelding in dit bericht."+"\n\nDeze meting vond plaats op ["+tijdstip+"]"+ "\n\n"+foutmelding +"\n"+bootnnrd1+bootnummer+bootnnrd2, "Waarschuwing! Uw aandacht is vereist!",JOptionPane.OK_OPTION);
                }
    }
}
