// See https://aka.ms/new-console-template for more information
using System;

class Sobrecarga {
    public Sobrecarga() {}

    public int Media(int x, int y) {
        return (x + y) / 2;
    }

    public double Media(double x, double y) {
        return (x + y) / 2;
    }

    public float Media(float x, float y) {
        return (x + y) / 2;
    }

    public int Media(string x, string y) {
        return (int.Parse(x) + int.Parse(y)) / 2;
    }
}

class Program {
    static void Main(string[] args) {
        Sobrecarga s = new Sobrecarga();
        
        Console.WriteLine(s.Media(3, 5));
        Console.WriteLine(s.Media(3.5, 5.5));
        Console.WriteLine(s.Media(3.0f, 5.0f));
        Console.WriteLine(s.Media("3", "5"));


        InclusaoConta inclusao = new InclusaoConta();

        inclusao.incluirConta(new Conta());
        inclusao.incluirConta(new ContaCorrente());
        inclusao.incluirConta(new ContaPoupanca());
    }
}

