import java.util.ArrayList;

public class Bomb extends Pajaro{
	public Bomb(int danio) {
		super(danio);
	}
	public void atacar(int pos, ArrayList<Object> lista) {
		super.atacar(pos, lista);
		//Ataque de la izquierda
		super.atacar(pos, lista);
		if(pos-1>=0&&(lista.get(pos)instanceof Cerdo||lista.get(pos)==null)) {
			if(lista.get(pos-1)instanceof Cerdo) {
				((Cerdo) lista.get(pos-1)).quitavida(25);
				((Cerdo) lista.get(pos-1)).quitarCerdo(lista, pos-1);
			}else
				if(lista.get(pos-1)instanceof Bloque) {
					((Bloque) lista.get(pos-1)).restarResi(25);
					((Bloque) lista.get(pos-1)).quitarBloque(lista, pos-1);
			}	
		}if(pos-2>=0&&(lista.get(pos-1)instanceof Cerdo||lista.get(pos-1)==null)) {
			if(lista.get(pos-2)instanceof Cerdo) {
				((Cerdo) lista.get(pos-2)).quitavida(5);
				((Cerdo) lista.get(pos-2)).quitarCerdo(lista, pos-2);
			}else
				if(lista.get(pos-2)instanceof Bloque) {
					((Bloque) lista.get(pos-2)).restarResi(5);
					((Bloque) lista.get(pos-2)).quitarBloque(lista, pos-2);
				}			
			//Ataque de la derecha
			if(pos+1<=lista.size()-1&&(lista.get(pos)instanceof Cerdo||lista.get(pos)==null)) {
				if(lista.get(pos+1)instanceof Cerdo) {
					((Cerdo) lista.get(pos+1)).quitavida(25);
					((Cerdo) lista.get(pos+1)).quitarCerdo(lista, pos+1);
				}else
					if(lista.get(pos+1)instanceof Bloque) {
						((Bloque) lista.get(pos+1)).restarResi(25);
						((Bloque) lista.get(pos+1)).quitarBloque(lista, pos+1);
				}	
			}if(pos+2<=lista.size()-1&&(lista.get(pos+1)instanceof Cerdo||lista.get(pos+1)==null)) {
				if(lista.get(pos+2)instanceof Cerdo) {
					((Cerdo) lista.get(pos+2)).quitavida(5);
					((Cerdo) lista.get(pos+2)).quitarCerdo(lista, pos+2);
				}else
					if(lista.get(pos+2)instanceof Bloque) {
						((Bloque) lista.get(pos+2)).restarResi(5);
						((Bloque) lista.get(pos+2)).quitarBloque(lista, pos+2);
					}
			}
		}
	}
	public String toString() {
		return "Bomb:"+super.toString();
	}
}
