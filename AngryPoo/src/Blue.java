import java.util.ArrayList;

public class Blue extends Pajaro{
	public Blue(int danio) {
		super(danio);
	}
	public void atacar(int pos, ArrayList<Object>lista) {
		super.atacar(pos, lista);
		
		if(pos+2<=lista.size()-1 && (lista.get(pos)instanceof Cerdo||lista.get(pos)==null)) {
			if(lista.get(pos+2)instanceof Cerdo) {
				((Cerdo) lista.get(pos+2)).quitavida(20);
				((Cerdo) lista.get(pos+2)).quitarCerdo(lista, pos+2);
			}else 
				if(lista.get(pos+2)instanceof Bloque) {
					((Bloque) lista.get(pos+2)).restarResi(20);
					((Bloque) lista.get(pos+2)).quitarBloque(lista, pos+2);
			}
			
			
			if(pos-2>=0 && (lista.get(pos)instanceof Cerdo||lista.get(pos)==null)) {
				if(lista.get(pos-2)instanceof Cerdo) {
					((Cerdo) lista.get(pos-2)).quitavida(20);
					((Cerdo) lista.get(pos-2)).quitarCerdo(lista, pos-2);
				}else 
					if(lista.get(pos-2)instanceof Bloque) {
						((Bloque) lista.get(pos-2)).restarResi(20);
						((Bloque) lista.get(pos-2)).quitarBloque(lista, pos-2);
				}
			}
		}
	}
	public String toString() {
		return "blue:"+super.toString();
	}
}
