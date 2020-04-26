import java.util.ArrayList;

public class Chuck extends Pajaro{
	public Chuck(int danio) {
		super(danio);
	}

	public void atacar(int pos, ArrayList<Object>lista) {
		super.atacar(pos, lista);
		if(pos+1<lista.size()&&(lista.get(pos)instanceof Cerdo||lista.get(pos)==null)) {
			if(lista.get(pos+1)instanceof Cerdo) {
				((Cerdo) lista.get(pos+1)).quitavida(30);
				((Cerdo) lista.get(pos+1)).quitarCerdo(lista, pos+1);
			}else
				if(lista.get(pos+1)instanceof Bloque) {
					((Bloque) lista.get(pos+1)).restarResi(30);
					((Bloque) lista.get(pos+1)).quitarBloque(lista, pos+1);
				}	
		}
		if(pos+2<lista.size()&&(lista.get(pos+1)instanceof Cerdo||lista.get(pos+1)==null)) {
			if(lista.get(pos+2)instanceof Cerdo) {
				((Cerdo) lista.get(pos+2)).quitavida(10);
				((Cerdo) lista.get(pos+2)).quitarCerdo(lista, pos+2);
			}else
				if(lista.get(pos+2)instanceof Bloque) {
					((Bloque) lista.get(pos+2)).restarResi(10);
					((Bloque) lista.get(pos+2)).quitarBloque(lista, pos+2);
				}
		}
	}
	public String toString() {
		return "chuck"+super.toString();
	}
}





