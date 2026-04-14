package Adapter;
import java.sql.ResultSet;

public interface IBancoDadosUtil{
    
    // Biblioteca atual
    
    public void conectar(String url, String usuario, String senha);
    public void desconectar();
    public ResultSet executarQuery(String query);
}