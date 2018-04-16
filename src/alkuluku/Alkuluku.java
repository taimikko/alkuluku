/*
Alkuluku on lukua yksi suurempi kokonaisluku, joka on jaollinen vain luvulla yksi ja itsellään.
Kymmenen ensimmäistä alkulukua ovat 2, 3, 5, 7, 11, 13, 17, 19, 23 ja 29. Kirjoita
Javalla Primes-ohjelma, joka lukee käyttäjältä kokonaisluvun ja ilmoittaa onko luku alkuluku
vai ei. Ohjelma tulostaa virheilmoituksen, jos käyttäjä antaa syötteeksi luvun, joka
on pienempi tai yhtä suuri kuin yksi.
Vihje: Tässä tehtävässä ratkaisuksi riittää raaka laskentavoima silmukan muodossa.
Tämä tehtävä tarkistetaan automaattisesti. Varmista, että ohjelmasi toimii esimerkkien
mukaisesti. Huomaa, että rivien alkuun tai loppuun ei tulosteta välilyöntejä ja että kaikki
tulostettavat rivit päätetään rivinvaihtoon.
Esimerkki ohjelman toiminnasta, kun syöte on 997.
Hello! I am a prime detective.
Please, enter an integer:
997
997 is a prime number.
 */
package alkuluku;

import java.util.Scanner;

/**
 *
 * @author ELY
 */
public class Alkuluku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Hello! I am a prime detective.");
        System.out.println("Please, enter an integer:");
        int luku = myScanner.nextInt();
        if (luku <= 1) {
            System.out.println("Anna kokonaisluku, joka on isompi kuin yksi.");
        } else {
            boolean alkuluku = true;
            for (int i=2; i<luku; i++) {
                if (luku % i == 0) {
                    System.out.println("Luku "+luku+" ei ole alkuluku.");
                    alkuluku = false;
                    break;
                }
            } 
            if (alkuluku) {
                System.out.println(luku + " on alkuluku.");
            }
        }
        
        
      
        
        myScanner.close();
    }
    
}
