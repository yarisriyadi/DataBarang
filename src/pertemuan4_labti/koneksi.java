package pertemuan4_labti;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class koneksi {
    private Statement data = null;
    private Connection conn = null;
    
    private String url = "jdbc:mysql://localhost:3306/labti_pert4";
    private String user = "root";
    private String password = "";
    
    public koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            data = this.conn.createStatement();
            System.out.println("Koneksi Berhasil");
        }
        catch (Throwable e){
            System.out.println("Error Found : "+e);
            System.exit(1);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public Statement getStatement(){
        return data;
    }
}
