package tema9Caso2;

public class ExcepcionDiaSup100 extends Exception{
	public ExcepcionDiaSup100 () {
		super("El diametro supera los 100km.");
	}
}