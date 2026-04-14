package Adapter;

import java.sql.ResultSet;
import Adapter.libFornecedor.*;

public class BancoDadosAdapter implements IBancoDadosUtil{
    
    private LibFornecedorBD dbBiblioteca;
    
    // Adaptador
    
    public BancoDadosAdapter(LibFornecedorBD dbBiblioteca){
        this.dbBiblioteca = dbBiblioteca;
    }
    
    @Override
    public void conectar(String url, String usuario, String senha){
        this.dbBiblioteca.connect(url,usuario,senha);
    }
    
    @Override
    public void desconectar(){
        this.dbBiblioteca.disconnect();
    }
    
    @Override
    public ResultSet executarQuery(String query){
        IQueryResultLibFornecedorBD resultLibFornecedorBD = this.dbBiblioteca.execute(query);
        
        ResultSet novoResultSet = null;
        novoResultSet = converterQueryResultToResultSet(resultLibFornecedorBD);
        
        return novoResultSet;
    }
    
    private ResultSet converterQueryResultToResultSet(IQueryResultLibFornecedorBD result){
        ResultSet novoResultSet = null;
        
        return novoResultSet;
    }
}
