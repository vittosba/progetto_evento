package Class;
import java.util.Scanner;
class Main{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Utility U = new Utility();

        System.out.println("Benvenuto e grazie per aver scelto il nostro sito");

        String scelta;
        // Boolean bool = false;
        do{
            System.out.println(" Vuoi Registrarti? " + "Inserire si o no"); 
            scelta = in.next();
            System.out.println("Hai scelto" + scelta);  

        }while (scelta.compareTo("si") != 0 && scelta.compareTo("no") != 0);

        if (scelta.compareTo("si") == 0){
            //Registrazione
            
            String email_utente;
            do {
                System.out.println("Inserire email: ");
                email_utente = in.next();
            } while (!U.verificaCorrettezzaEmail(email_utente));

            Boolean email_verificata_utente = U.verificaCorrettezzaEmail(email_utente);

            System.out.println("Inserire nome: ");
            String nome_utente = in.next();

            System.out.println("Inserire cognome: ");
            String cognome_utente = in.next();

            String password_utente;
            do {
                System.out.println("Inserire password: ");
                password_utente = in.next();
                System.out.println(U.verificaPassword(password_utente));
            } while (!U.verificaPassword(password_utente));

            // verifica registrazione tramite file
            
            Utente newUtente = new Utente(nome_utente, cognome_utente, email_utente, email_verificata_utente, password_utente);

            System.out.println( newUtente.Nome() + " " + newUtente.Cognome() + " " + newUtente.Email());
        }
        in.close();
        System.out.println(" Vuoi Prenotarti? " + "Inserire si o no");
        

        
    }

}

