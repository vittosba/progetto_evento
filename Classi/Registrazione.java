package Classi;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Registrazione {

    public void Registrazione_utente(){
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
            } while (!U.verificaPassword(password_utente));

            // verifica registrazione tramite file
            
            Utente newUtente = new Utente(nome_utente, cognome_utente, email_utente, email_verificata_utente, password_utente);

            String nomeFile = "archivio.txt";
            try {
                FileWriter fw = new FileWriter(nomeFile, true);
                String linea = newUtente.restituisceNome() + " " + newUtente.restituisceCognome() + " " + newUtente.restituisceEmail() + " " + newUtente.restituiscePassword()+ " ";
                fw.write(linea + "\r\n");
                fw.close();
            } catch (Exception e) {
            }
    

            System.out.println( newUtente.restituisceNome() + " " + newUtente.restituisceCognome() + " " + newUtente.restituisceEmail());

            
            try{
                FileReader fr = new FileReader(nomeFile);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine())!=null){
                    int spazio1 = linea.indexOf(" ");
                    String nome = linea.substring(0,spazio1);

                    int spazio2 = linea.indexOf(" ");
                    String cognome = linea.substring(spazio1,spazio2);
                    System.out.println(nome + cognome);

                    int spazio3 = linea.indexOf(" ");
                    String mail = linea.substring(spazio2,spazio3);
                    int spazio4 = linea.indexOf(" ");
                    String password = linea.substring(spazio3,spazio4);

                    Utente visualizzaUtente = new Utente(nome, cognome, mail, true, password);

                    if (visualizzaUtente == newUtente) {
                        System.out.println("Read and Write working");
                    }
                    else {
                        System.out.println("Read and Write not working");
                    }
                }
                br.close();
                }catch(Exception e){
                }
        }
        in.close();
    }
}