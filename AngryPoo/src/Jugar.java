import java.util.ArrayList;

public class Jugar {
	Terreno terreno;
	
	public Jugar() {
		
	}

	private boolean recorrer(ArrayList<Object> list) {
		int j=0;boolean ban=false;
		while(list.size()-1>j && ban==false) {
			if(list.get(j) instanceof Cerdo)
				ban=true;
			else
				j++;
		}
		return ban;
	}
	public void jugar(ArrayList<Pajaro>listaP,ArrayList<Object>listaT) {
		int vuelta=1,p,ch;
		while (listaP.size()>0 && this.recorrer(listaT)==true){
			//System.out.println(listaP.size());
	       if (listaP.get(0)instanceof Chuck) {ch=listaP.size()/2;
	           p=(int)(Math.random()*listaP.size())+ch;
	           //System.out.println(p);
	           listaP.get(0).atacar(p, listaT);
	           
	        }else 
	        	if(listaP.get(0)instanceof Terence) {
	        		p=(int)(Math.random()*listaT.size())+0;
	        		//System.out.println(p);
	        		listaP.get(0).atacar(p, listaT);
	        		
	        	}else {
	        		p=(int)(Math.random()*listaT.size())+0;
	        		//System.out.println(p);
	        		listaP.get(0).atacar(p, listaT);
	        		}
	  
			
			System.out.println("\nAtaque numero: "+vuelta);vuelta++;
			System.out.println(listaP.get(0)+" cae en la posicion: "+p);
			listaP.remove(0);
			System.out.println("\nAngrys "+listaP);
			System.out.println("\nTerreno bloques y cerdos:"+listaT);
		}
		if (listaP.size()==0 && recorrer(listaT)==true)
			System.out.println("\nPartida perdida! ");
		else
			System.out.println("Partida ganada! ");
	}
	
	//posicion de caida
	public int posAtaque(int tam) {
		return (int)(Math.random()*tam)+0;
	}

	public int posChuck(int tam) {
		return (int)(Math.random()*tam)+(int)tam/2;
	}
	

	public int posTerence(int tam) {
		return (int)(Math.random()*(int)(tam-1)/2)+0;
	}

}



