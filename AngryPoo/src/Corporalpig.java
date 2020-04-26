
public class Corporalpig extends Cerdo {
	private boolean casco;
	public Corporalpig(int vida) {
		super(vida);
		this.casco=true;
	}
	public boolean getCasco() {
		return this.casco;
	}
	public void setCasco(boolean m) {
		this.casco=m;
	}
	
	@Override
	public void quitavida(int danio) {
		// TODO Auto-generated method stub
		if(this.casco == true)
			this.casco = false;
		else
			super.quitavida(danio);
	}
	public String toString() {
		return "Corporalpig:"+super.toString()+"casco:"+this.casco;
	}
}
