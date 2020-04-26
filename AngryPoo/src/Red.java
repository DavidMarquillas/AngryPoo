import java.util.ArrayList;

public class Red extends Pajaro{
	public Red(int danio) {
		super(danio);
	}
	
	public void atacar(int pos, ArrayList <Object> lista) {
	super.atacar(pos, lista);
		if(pos+1<=lista.size()-1
				&& (lista.get(pos)instanceof Cerdo||lista.get(pos)==null)) {
			if(lista.get(pos+1)instanceof Cerdo) {
				((Cerdo) lista.get(pos+1)).quitavida(50);
				((Cerdo) lista.get(pos+1)).quitarCerdo(lista, pos+1);
			}else 
				if(lista.get(pos+1)instanceof Bloque) {
					((Bloque) lista.get(pos+1)).restarResi(25);
					((Bloque) lista.get(pos+1)).quitarBloque(lista, pos+1);
			}
		}
	}
	public String toString() {
		return "red:"+super.toString();
	}
}
