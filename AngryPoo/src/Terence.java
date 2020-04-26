import java.util.ArrayList;

public class Terence extends Pajaro{

	public Terence(int danio) {
		super(danio);
	}
	public void atacar(int pos, ArrayList <Object> lis) {
		super.atacar(pos, lis);
		if(lis.get(pos) instanceof Cerdo || lis.get(pos) instanceof Cerdo)
			lis.set(pos, null);
		if(pos+1<=(lis.size()/2)-1) {
			if(lis.get(pos+1)instanceof Cerdo) {
			((Cerdo) lis.get(pos+1)).quitavida(30);
			((Cerdo) lis.get(pos+1)).quitarCerdo(lis, pos+1);
			}else
				if(lis.get(pos+1)instanceof Bloque) {
					((Bloque) lis.get(pos+1)).restarResi(30);
					((Bloque) lis.get(pos+1)).quitarBloque(lis, pos+1);
			}	
		}
		if(pos-1>=0) {
			if(lis.get(pos-1)instanceof Cerdo) {
				((Cerdo) lis.get(pos-1)).quitavida(30);
				((Cerdo) lis.get(pos-1)).quitarCerdo(lis, pos-1);
		}else
				if(lis.get(pos-1)instanceof Bloque) {
					((Bloque) lis.get(pos-1)).restarResi(30);
					((Bloque) lis.get(pos-1)).quitarBloque(lis, pos-1);
				}
		}
	}
	public String toString() {
		return "Terence:"+super.toString();
	}
}
