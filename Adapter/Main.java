package Adapter;

import Adapter.libFornecedor.*;
import java.sql.ResultSet;

public class Main
{
	public static void main(String[] args) {
	    
		LibFornecedorBD libFornecedorBD = new LibFornecedorBD();
		
		IBancoDadosUtil bancoDadosUtil = new BancoDadosAdapter(libFornecedorBD);
		
		bancoDadosUtil.conectar("http://teste/final", "Adpater", "Desing Pattern");
		
		String query = "select * from Alunos";
		ResultSet resultSet = bancoDadosUtil.executarQuery(query);
		
		bancoDadosUtil.desconectar();
	}
}
