package Polimorfismo.Parametrico;

import java.util.Iterator;
import java.util.List;

public class Parametrico{
    
    public Parametrico(){}
    
    public <T> void executar(List<T> lista){
        for (Iterator iterator = lista.iterator(); iterator.hasNext();){
            T t = (T) iterator.next();
            System.out.println(t);
        }
    }
}