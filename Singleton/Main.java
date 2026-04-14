public class Main
{
	public static void main(String[] args) {
		
		Singleton instancia1 = Singleton.getInstance("Instância: 1");
		Singleton instancia2 = Singleton.getInstance("Instância: 2");
		
		System.out.println(instancia1.valor);
		System.out.println(instancia2.valor);
	}
}
