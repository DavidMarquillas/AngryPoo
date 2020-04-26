import java.util.ArrayList;
       
public class Angry {
	private int cant;
	protected ArrayList <Pajaro> lista;
	public Angry() {
		this.lista =new ArrayList<Pajaro>();
	}
	public void generarpajaros(int tam) {
		int i=0,y;
		cant=(int)(75*tam)/100;
		
		while(i<cant) {
			y=(int)(Math.random()*7)+1;
			switch(y) {
			case 1:
				this.lista.add(new Red(50));
			break;
			case 2:
				this.lista.add(new Chuck(60));
			break;
			case 3:
				this.lista.add(new Blue(20));
				break;
			case 4:
				this.lista.add(new Hal(50));
				break;
			case 5:
				this.lista.add(new Matilda(60));
				break;
			case 6:
				this.lista.add(new Bomb(80));
				break;
			case 7:
				this.lista.add(new Terence(0));
				break;
			}i++;
		}
	}
	
	public int cantPajaros(int cant) {
		return (int)(75*cant)/100;
	}
	public ArrayList<Pajaro> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Pajaro> lista) {
		this.lista = lista;
	}
	public String toString() {
		String cad="lista[";
		for(int i=0;i<cant;i++) {
			cad=cad+"pos "+i+": "+this.lista.get(i)+", ";
		}
		return cad+"]"+this.lista.size();
	}
	

}