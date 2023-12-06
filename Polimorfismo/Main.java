package Polimorfismo;

import Polimorfismo.Inclusao.*;

public class Main {
    
    public static void main(String[] args){

        InclusaoConta inclusao = new InclusaoConta();
        inclusao.incluirTipo(new Conta());
        inclusao.incluirTipo(new ContaCorrente());
        inclusao.incluirTipo(new ContaPoupanca());
    }
}
