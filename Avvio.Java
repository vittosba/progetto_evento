import java.io*;
public class Avvio {
    public static void main(String[] args) {
        Utility controllomail = new Utility();
        String input = JOptionPane.showInputDialog(" Inserire Messaggio")
        if(controllomail.email_valida(input)=true) {
            JOptionPane.showMessageDialog(null, "Email Verificata");
        }
}
    
