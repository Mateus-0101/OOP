package Polimorfismo;

import Polimorfismo.Inclusao.*;

public class Main {
    
    public static void main(String[] args){

        InclusaoConta inclusao = new InclusaoConta();
        inclusao.incluirTipo(new Conta());
        inclusao.incluirTipo(new ContaCorrente());
        inclusao.incluirTipo(new ContaPoupanca());

        Sobrecarga overload = new Sobrecarga();
        overload.media(2, 5);
        overload.media(37.1, 54.3);
        overload.media(34.2f, 63.7f);
        overload.media("5", "9");

        //Substituição/Override
        Conta conta = new Conta();
        conta.tipo();

        ContaCorrente corrente = new ContaCorrente();
        corrente.tipo();

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.tipo();
    }
}
