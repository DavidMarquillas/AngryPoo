import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese cantidad de cerdos: ");
		int cantidad = entrada.nextInt();
		Terreno t1=new Terreno();
         Angry a1=new Angry();
        t1.generarTerreno(cantidad);
        a1.generarpajaros(cantidad);
       /* System.out.println(a1);
        System.out.println(t1);*/
        
		Jugar juego=new Jugar();
		juego.jugar(a1.getLista(),t1.getLisob());
		entrada.close();
	}
}
