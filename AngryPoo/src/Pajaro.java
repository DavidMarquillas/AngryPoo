import java.util.ArrayList;

public class Pajaro {
	private int danio;
	
	public Pajaro(int danio){
		this.danio=danio;
	}
	
	public int getDanio() {
		return this.danio;
	}
	public void setDanio(int danio) {
		this.danio=danio;
	}
	public void atacar(int pos, ArrayList<Object> lista) {
		if(lista.get(pos)instanceof Cerdo) {
			((Cerdo) lista.get(pos)).quitavida(danio);
			((Cerdo) lista.get(pos)).quitarCerdo(lista, pos);
		}	else
				if(lista.get(pos)instanceof Bloque) {
					((Bloque) lista.get(pos)).restarResi(danio);
					((Bloque) lista.get(pos)).quitarBloque(lista, pos);
				}
	}
	
	
	
	public String toString() {
		return "danio:"+this.danio ;
	}
}
