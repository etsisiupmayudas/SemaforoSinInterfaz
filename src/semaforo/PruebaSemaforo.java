package semaforo;
public class PruebaSemaforo {

	public static void main(String[] args) {
		Semaforo s1;
		Semaforo s2;
		SemaforoDcha sd1;
		SemaforoDcha sd2;
		Semaforo sd3;

		s1 = new Semaforo(Semaforo.AMBAR);
		s2 = new Semaforo(Semaforo.VERDE);
		sd1 = new SemaforoDcha(Semaforo.VERDE);
		sd2 = new SemaforoDcha(Semaforo.ROJO,Semaforo.AMBAR);
		sd3 = new SemaforoDcha(Semaforo.AMBAR,Semaforo.ROJO);

		System.out.println("s1: "+s1+", s2: "+s2+", sd1: "+sd1+", sd2: "+sd2+", sd3: "+sd3);

		System.out.println(s1.equals(s2));

		System.out.println(sd1.getColorCentral()+", "+sd1.getColorDcha());

	}

}
