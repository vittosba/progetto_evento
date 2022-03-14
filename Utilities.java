// import java.lang.Enum;

public class Utility {
    private static Utility istanza = null;
    private Utility() {}
    public static Utility getMyUtility() {
        if (istanza == null)
            istanza = new Utility();
            return istanza;
    }
    public enum tipo_Ammessi {
        evento_musicale, evento_teatrale, evento_comico, evento_sportivo
    }
    public Boolean email_valida (String email) {
        Boolean email_valida = false;
        if(email.contains('@')) {
            // @ in che posizione?
            // sottostringa da @ in poi
            // se in sottostringa contains '.' --> email_valida = true
        }
        return email_valida;
    }
}