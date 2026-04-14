package Polimorfismo.Parametrico;

import java.util.ArrayList;

public class ExecutarParametrico{
    
    public ExecutarParametrico(){}
    
    public void executar(){
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Albert");
        nomes.add("Barry");
        nomes.add("Chris");
        
        new ExecutarParametrico().executar(nomes);
    }
}
