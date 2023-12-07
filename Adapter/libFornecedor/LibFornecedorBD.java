package Adapter.libFornecedor;

import java.sql.ResultSet;

public class LibFornecedorBD{
    
    public LibFornecedorBD(){}
    
    // Biblioteca Externa
    
    public void connect(String url, String user, String password){
        
    }
    
    public void disconnect(){
        
    }
    
    public IQueryResultLibFornecedorBD execute(String query){
        return null;
    }
}