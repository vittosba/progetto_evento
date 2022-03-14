public class Utility {
    private static Utility istanza = null;
    private Utility() {}
    public static Utility getMyUtility() {
        if (istanza == null)
            istanza = new Utility();
            return istanza;
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