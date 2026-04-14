package Polimorfismo;

public class Sobrecarga {
    
    public Sobrecarga(){}

    public int media(int x, int y){
        return (x+y)/2;
    }

    public double media(double x, double y){
        return (x+y)/2;
    }

    public float media(float x, float y){
        return (x+y)/2;
    }

    public int media(String x, String y){
        return (Integer.parseInt(x) + Integer.parseInt(y))/2;
    }
}
