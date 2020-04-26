import java.util.ArrayList;

public class Terreno {
	private int tam;
	protected ArrayList <Object> lisob;
	public ArrayList<Object> getLisob() {
		return lisob;
	}

	public void setLisob(ArrayList<Object> lisob) {
		this.lisob = lisob;
	}

	public Terreno() {
		this.lisob=new ArrayList<Object>();
	}
	
	public int random(int sup,int inf) {
		return (int)(Math.random()*sup)+inf;
	}
	
     public void generarTerreno(int cant) {
		int c2,blo, i=0,c;tam = cant*3;
		for(int j=0;j<tam;j++) {
			c2=this.random(2, 1);
			  if(c2==2) {
			    	blo=this.random(3,1);
			    	if(blo==1) {
					this.lisob.add(j,new Vidrio(50));
				}else
					if(blo==2) {
						this.lisob.add(j,new Madera(150));
					}else
						if(blo==3){
							this.lisob.add(j,new Madera(150));
					}
		   }else
				this.lisob.add(j, null);
		}
        System.out.println(lisob);
		while(i<cant) {
		    c=this.random(this.lisob.size()-1,0);
		    c2=this.random(2,1);
		    if(c2==1&& (this.lisob.get(c)instanceof Bloque|| this.lisob.get(c)==null)) {
		    	
		    	this.lisob.set(c, new Minionpig(50));
		    	i++;
		    }else
		    	if(c2==2&& (this.lisob.get(c)instanceof Bloque|| this.lisob.get(c)==null)) {
		    	this.lisob.set(c, new Corporalpig(50));i++;
		    	}
		    	
				}
			
		}
	
	
	public String toString() {
		String cad="listaT[";
		for(int i=0;i<tam;i++) {
			cad=cad+"pos "+i+": "+this.lisob.get(i)+", ";
		}
		return cad+"]"+this.lisob.size();
	}
}
	





