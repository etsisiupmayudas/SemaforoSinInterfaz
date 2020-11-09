package semaforo;

public class Semaforo{

	public static final int ROJO=0;
	public static final int AMBAR=1;
	public static final int VERDE=2;
	public static final int APAGADO=3;

	private int colorCentral;

	public Semaforo() {
	  setColorCentral(ROJO);
	}
	
	public Semaforo(int colorCentral) {
	  setColorCentral(colorCentral);
	}
	
	public int getColorCentral() {
	  return colorCentral;// devuelve el color central que tiene el semáforo.
	}
	  
	public void setColorCentral(int colorCentral) {
	  this.colorCentral = colorCentral;// el parámetro es el colorCentral que se le pone al semáforo
	}
	  
	public boolean equals(Semaforo s) {
	  return colorCentral == s.getColorCentral();/* Compara la instancia del semáforo con el semáforo que
	  se pasa por parámetro. Dos semáforos tienen el mismo color si se encuentran en
	  el mismo estado.  El parámetro s  de lSemáforo se compara con la instancia. Devuelve true si son iguales. */
	}
	  
	public Semaforo clone() {
	  return new Semaforo(colorCentral);//Crea una copia del semáforo y la devuelve.
	}
	
	public String toString() {
		return "Centro: "+colorCentral;
	} 

}
