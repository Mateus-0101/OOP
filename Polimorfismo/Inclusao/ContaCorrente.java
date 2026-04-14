package Polimorfismo.Inclusao;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(){}

    @Override
    public void tipo(){
        System.out.println("Conta Corrente");
    }
}
