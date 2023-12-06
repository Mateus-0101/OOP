package Polimorfismo.Inclusao;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(){}

    @Override
    public void tipo(){
        System.out.println("Conta Poupança");
    }
}
