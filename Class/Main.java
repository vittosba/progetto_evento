import java.util.Scanner;

package Class;
class Main{

    public static void main(String[] args) {

        System.out.println("Benvenuto e grazie per aver scelto il nostro sito");

        System.out.println(" Vuoi Registrarti? " + "Inserire si o no");  

        Scanner in = new Scanner(System.in);
        String scelta = " ";
        do{
            scelta = in.next(); 
        }while (scelta != "si" || scelta != "no");
        if (scelta == "si"){
            //Registrazione
            String nome_utente = " ";
            String cognome_utente = " "; 
            String email_utente = " "; 
            Boolean email_verificata_utente = false;
            String password_utente = " "; 
            Boolean registrazione_utente = false;
            
            Utente newUtente = new Utente(nome_utente, cognome_utente, email_utente, email_verificata_utente, password_utente, registrazione_utente);
        }
        System.out.println(" Vuoi Prenotarti? " + "Inserire si o no");

        
    }

}

