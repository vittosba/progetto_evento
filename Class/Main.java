package Class;
import java.util.Scanner;
class Main{

    public static void main(String[] args) {

        System.out.println("Benvenuto e grazie per aver scelto il nostro sito");

        System.out.println(" Vuoi Registrarti? " + "Inserire si o no");  

        Scanner in = new Scanner(System.in);
        String scelta = " ";
        do{
            scelta = in.next(); 
        }while (scelta != "si" || scelta != "no");
        in.close();
        if (scelta == "si"){
            //Registrazione
            System.out.println("Inserire email: ");
            String email_utente = in.next();
            Utility U = new Utility();
            U.verificaCorrettezzaEmail(email_utente);
            Boolean email_verificata_utente = U.verificaCorrettezzaEmail(email_utente);
            System.out.println("Inserire nome: ");
            String nome_utente = in.next();
            System.out.println("Inserire cognome: ");
            String cognome_utente = in.next();
            System.out.println("Inserire password: ");
            String password_utente = in.next();
            //verifica registrazione tramite file
            Utente newUtente = new Utente(nome_utente, cognome_utente, email_utente, email_verificata_utente, password_utente);

            System.out.println( newUtente.Nome() + " " + newUtente.Cognome() + " " + newUtente.Email());
        }

        System.out.println(" Vuoi Prenotarti? " + "Inserire si o no");
        

        
    }

}

