// See https://aka.ms/new-console-template for more information
using System;

public class Singleton{

    private static Singleton instance = null;
    public string valor {get; set;}

    private Singleton(String valor){
        this.valor = valor;
    }

    public static Singleton getInstance(String valor){
        if(instance == null){
            instance = new Singleton(valor);
        }

        return instance;
    }
}

class Program{
    static void Main(string[] args){
        Singleton singleton1 =  Singleton.getInstance("1");
        Singleton singleton2 =  Singleton.getInstance("2");

        Console.WriteLine(singleton1.valor);
        Console.WriteLine(singleton2.valor);
    }
}

