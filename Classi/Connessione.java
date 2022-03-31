package Classi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public final class Connessione {

    static Connection connection;
    private static Connessione INSTANCE;
    private String pas = "Lorenzo1@";

    private Connessione() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/progettoeventi","Lspagnoli02", pas);
    }

    public static Connessione getInstance() throws SQLException {
        if(INSTANCE == null) {
            INSTANCE = new Connessione();
        }

        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }
    
}