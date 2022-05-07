/**
 * 
 *<b1> @author MatteoMalorgio </b1>
 * <u1> @version 1.0 </u1> 
 */

public class Trapezio {
/**
 * 
 */
private float baseMag;	
private float baseMin;
private float altezza;	
/**
 * 
 * @param baseMag attributo per la base maggiore 
 * @param baseMin attributo per la base minore
 * @param altezza attributo per l'altezza
 */

public Trapezio(float baseMag, float baseMin, float altezza) {
		this.baseMag = baseMag;
		this.baseMin = baseMin;
		this.altezza = altezza;
}

/**
 * 
 * @return ritornerà la misura area
 */
public float calcoloArea() {
	return((baseMag + baseMin) * altezza/2);
}
/**
 * 
 * @param args
 */
public static void main(String[] args) {

	Trapezio t = new Trapezio(3.0f,2.0f,1.5f);
	System.out.println(t.calcoloArea());
}

}
