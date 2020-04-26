import java.util.ArrayList;

public class Matilda extends Pajaro{

	public Matilda(int danio) {
		super(danio);
	}
	public void atacar(int pos, ArrayList <Object> lista) {
		super.atacar(pos, lista);
		if(pos+1<=lista.size()-1&&(lista.get(pos)instanceof Cerdo||lista.get(pos)==null)) {
			if(lista.get(pos+1)instanceof Cerdo) {
				((Cerdo) lista.get(pos+1)).quitavida(30);
				((Cerdo) lista.get(pos+1)).quitarCerdo(lista, pos+1);
			}else
				if(lista.get(pos+1)instanceof Bloque)
					((Bloque) lista.get(pos+1)).restarResi(30);
		}
		if(pos-1>=0&&(lista.get(pos)instanceof Cerdo||lista.get(pos)==null)) {
			if(lista.get(pos-1)instanceof Cerdo) {
				((Cerdo) lista.get(pos-1)).quitavida(30);
				((Cerdo) lista.get(pos-1)).quitarCerdo(lista, pos-1);
			}else
				if(lista.get(pos-1)instanceof Bloque)
					((Bloque) lista.get(pos-1)).restarResi(30);
		}
	}
	public String toString() {
		return "matilda:"+super.toString();
	}
}
