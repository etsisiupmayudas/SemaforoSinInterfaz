package semaforo;
public class SemaforoDcha extends Semaforo{
	
	private int colorDcha;

	public SemaforoDcha() {
	  super();  //lo pone automáticamente el compilador
	  setColorDcha(ROJO);
	}
	
	public SemaforoDcha(int colorDcha) {
	  super();   // o this();
	  setColorDcha(colorDcha);
	}

	public SemaforoDcha(int colorCentral, int colorDcha) {
	  super(colorCentral);
		// this(colorDcha); No es posible, solo puede haber un this() o un super() como primera instrucción del constructor.
		setColorDcha(colorDcha);
	}

	public int getColorDcha() {
	  return colorDcha;//devuelve el color derecha que tiene el semáforo
	}
	  
	public void setColorDcha(int colorDcha) {
	  this.colorDcha = colorDcha;	  	
	}
	  
	public boolean equals(SemaforoDcha s) {
	  return super.equals(s) && colorDcha == s.getColorDcha(); /* Compara la instancia del semáforo con el semáforo
	   que se pasa por parámetro. Devuelve true cuando tienen los el mismo color (son iguales).
	   El parámetro s de Semáforo se compara con la instancia. Polimorfismo: argumento SemaforoDcha
	   se pasa a parámetro Semaforo. */
	}
	  
	public SemaforoDcha clone() {
	  return new SemaforoDcha(getColorCentral(),getColorDcha());//Crea una copia del semáforo y la devuelve.
	}
	
	public String toString() {
		return super.toString()+" ,Dcha: "+colorDcha; // Redefinición del método toString
	} 

}
