import java.util.ArrayList;

public class Bloque{
	private int resistencia;
	public Bloque (int resistencia) {
		this.resistencia=resistencia;
	}
	
	public String toString() {
		return "resistencia:"+this.resistencia;
	}
	
	public void restarResi(int danio) {
		this.resistencia = this.resistencia- danio;
		if(this.resistencia<0)
			this.resistencia = 0;
	}
	public void quitarBloque(ArrayList<Object>listaT,int pos) {
		if(listaT.get(pos) instanceof Bloque && this.resistencia==0) {
			listaT.set(pos, null);
		}
	}
}
