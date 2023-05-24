package Unidad8Caso1;

import java.util.Random;

public interface radio {

	public static final String encender= "Enciende la radio y escuchamos la emisora: ";
	
	public static void escuchar() {
		Random ran = new Random();
		int num = ran.nextInt(4) + 1;
		
		String sintonia="";
		if(num==1)sintonia="m80";
		else if (num==2)sintonia="cope";
		else if (num==3)sintonia="cadena 100";
		else sintonia="europa FM";
		System.out.println(encender + sintonia);
	}
	
}
