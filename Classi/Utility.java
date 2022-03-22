package Classi;
class Utility {
    private static Utility verificaEmail;
    public Utility() {

    }
    public static Utility getUtility(){
        if (verificaEmail == null){
            verificaEmail = new Utility();
        }
        return verificaEmail;
    }
    public enum tipo_Ammessi {
        evento_musicale, evento_teatrale, evento_comico, evento_sportivo
    }

    public boolean verificaCorrettezzaEmail(String email){
        int posChiocciola = email.indexOf("@");
        int posPunto = 0;
        //Troviamo prima occorrenza del punto partendo dalla fine, per calcolarci il dominio
        for(int i=email.length()-1;i>0;i--){
            if(email.charAt(i)=='.'){
                posPunto = i;
                break;
            }
        }
        boolean verificaPreChiocciola = false;
        boolean verificaPostChiocciola = false;
        int contatoreDominio = 0;
        for(int i=posChiocciola-1; i>0 ;i-- )
        {
            
            if(((int)email.charAt(i)>=65)&&((int)email.charAt(i)<=122)
                ||(int)email.charAt(i)>=48&&(int)email.charAt(i)<=57
                ||(int)email.charAt(i)==95 || (int)email.charAt(i)==46
                ||(int)email.charAt(i)==45)
            {
                verificaPreChiocciola = true;
                
            }
            else
            {
                verificaPreChiocciola = false;
                break;
            }
        }
            
        
        if(verificaPreChiocciola==true)
            for(int i = posChiocciola+1; i<posPunto;i++)
                if((int)email.charAt(i)>=65&&(int)email.charAt(i)<=122||(int)email.charAt(i)>=48&&(int)email.charAt(i)<=57)
                    verificaPostChiocciola = true;
                else
                    {
                        verificaPostChiocciola = false;
                        break;
                    }
            
        
        if(verificaPostChiocciola==true)
            for(int i = posPunto+1; i<email.length();i++)
                if((int)email.charAt(i)>=65&&(int)email.charAt(i)<=122)
                    contatoreDominio++;
        if(contatoreDominio>=2){
            return true;
        }
        return false;
                
            
        
    }

    public boolean verificaPassword(String password) {
        if (password.length() >= 8) {
            Boolean maiuscola = false;
            Boolean minuscola = false;
            Boolean numero = false;
            Boolean speciale = false;
            String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    maiuscola = true;
                }

                if (Character.isLowerCase(password.charAt(i))) {
                    minuscola = true;
                }

                if (Character.isDigit(password.charAt(i))) {
                    numero = true;
                }
                if (specialChars.indexOf(password.charAt(i)) != -1) {
                    speciale = true;
                }
            }

            if (maiuscola && minuscola && numero && speciale) {
                return true;
            }
        }
        return false;
    }
}


