package Classi;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class Main{

    private static Connessione connessione;

    public static void main(String[] args) throws SQLException {
        connessione = Connessione.getInstance();
        
    }

        /*public void readConnessione() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Statement stmt=connessione.getConnection().createStatement();
                ResultSet rs=stmt.executeQuery("show databases;");
                
                int c = 0;
                while (rs.next()){
                    Utente utent = new Utente();
                    postiAuto[c] = utent;
                    c++;
                }
            }catch(Exception e){ 
                System.out.println(e); 
            }
        }*/

        Evento evento = new Evento("", "", "", 0, "");
        public void addConnessione(Evento event) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                PreparedStatement ps=connessione.getConnection().prepareStatement("INSERT INTO 'evento' ('Tipo', 'Data', 'Luogo', 'capacita_persone', 'artista') VALUES (" + ", " + event.getTipo() + ", " + event.getData() + ", " + event.getLuogo() + ", " + event.getCapacitaPersone() + ", " + event.getArtista() +"): " );
                int status = ps.executeUpdate();
                System.out.println(status);
            } catch (Exception e) { System.out.println(e);}
        }
    
        public void deleteConnessione(String luogo){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                PreparedStatement ps = connessione.getConnection().prepareStatement("DELETE FROM evento WHERE luogo =" + luogo);
                int status = ps.executeUpdate();
                System.out.println(status);
            } catch (Exception e) { System.out.println(e);}
        }
    
        public void updateConnessione(String luogo, String Data){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                PreparedStatement ps = connessione.getConnection().prepareStatement("UPDATE evento SET Artista = Artista " + Data + "WHERE luogo =" + luogo + "); ");
                int status = ps.executeUpdate();
                System.out.println(status);
            } catch (Exception e) { System.out.println(e);}
        }
    
}

