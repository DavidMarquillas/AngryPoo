import java.util.ArrayList;

public class Cerdo {
	private int vida;
	public Cerdo(int vida) {
		this.vida = vida;
	}
	public String toString() {
		return "vida:"+this.vida;
	}
	public void quitavida(int danio) {
		this.vida = this.vida - danio;
		if(this.vida<0)
			this.vida = 0;
	}
	public void quitarCerdo(ArrayList<Object>listaT,int pos) {
		if(listaT.get(pos) instanceof Cerdo && this.vida==0) {
			listaT.set(pos, null);
		}
	}
}
