public class Singleton {
    
    private static Singleton instance = null;
    public String valor;
    
    private Singleton(String valor){
        this.valor = valor;
    }
    
    public static Singleton getInstance(String valor){
        if(instance == null){
            instance  = new Singleton(valor);
        }
        
        
        return instance;
    }
}
