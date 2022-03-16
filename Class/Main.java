package Class;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
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
            } while (!U.verificaPassword(password_utente));

            // verifica registrazione tramite file
            
            Utente newUtente = new Utente(nome_utente, cognome_utente, email_utente, email_verificata_utente, password_utente);

            String nomeFile = "archivio.txt";
            try {
                FileWriter fw = new FileWriter(nomeFile, true);
                String linea = newUtente.Nome() + " " + newUtente.Cognome() + " " + newUtente.Email() + " " + newUtente.Password()+ " ";
                fw.write(linea + "\r\n");
                fw.close();
            } catch (Exception e) {
            }
    

            System.out.println( newUtente.Nome() + " " + newUtente.Cognome() + " " + newUtente.Email());

            
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
        
        int[] arr = new int[]{12,3,5,7,8,15,9};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }

        ArrayList<Object> arrlist = new ArrayList<Object>();
        arrlist.add("ciao");
        arrlist.add(17);
        for(int i = 0; i <arrlist.size(); i++){
            System.out.println(arrlist.get(i).toString());
        }

        Set<Object> Number_Set = new HashSet<>(); 
        Number_Set.add(12); 
        Number_Set.add(4); 
        Number_Set.add(2); 
        Number_Set.add(6); 
        Number_Set.add(9); 
        System.out.print("Set:"); 
        System.out.println(Number_Set); 
        System.out.print("Sorted TreeSet:");
        Set<Object> tree_Set = new TreeSet<>(Number_Set); 
        System.out.println(tree_Set);

        System.out.println(" Vuoi Prenotarti? " + "Inserire si o no");        
    }
}

