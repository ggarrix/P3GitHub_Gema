package clasesTemaSiete;

import java.time.LocalDate;
import java.util.Date;

public class Texto {
	
	private int longitud;
	private String cadena;
	private final LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	
	public Texto(int longitud, String cadena) {
		this.longitud = longitud;
		this.cadena = cadena;
		this.fechaCreacion = LocalDate.now();
		this.fechaModificacion = LocalDate.now();
	}
	
	public void addCharInit(char a) {
		
		if (longitud>cadena.length()) {
			if (cadena.length()+1>longitud) {
				System.out.println("La cadena es demnasiado grande.");
			} else {
				this.cadena=a+cadena;
				fechaModificacion=LocalDate.now();
			}
		} else {
			System.out.println("La cadena está completa.");
		}
		
	}
	
	public void addCharFinal(char a) {
		
		if (longitud>cadena.length()) {
			if (cadena.length()+1>longitud) {
				System.out.println("La cadena es demnasiado grande.");
			} else {
				this.cadena=cadena+a;
				fechaModificacion=LocalDate.now();
			}
		} else {
			System.out.println("La cadena está completa.");
		}
		
	}
	
	public void addStringInit(String a) {
		
		if (longitud>cadena.length()) {
			if (a.length()+cadena.length()>longitud) {
				System.out.println("La cadena es demnasiado grande.");
			} else {
				this.cadena=a+cadena;
				fechaModificacion=LocalDate.now();
			}
		} else {
			System.out.println("La cadena está completa.");
		}
		
	}
	
	public void addStringFinal(String a) {
		
		if (longitud>cadena.length()) {
			if (a.length()+cadena.length()>longitud) {
				System.out.println("La cadena es demnasiado grande.");
			} else {
				this.cadena=cadena+a;
				fechaModificacion=LocalDate.now();
			}
		} else {
			System.out.println("La cadena está completa.");
		}
		
	}
	
	public int vocales() {
		
		int contador=0;
		
		for (int i=0;i<cadena.length();i++) {
			char b=cadena.charAt(i);
			if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U') {
				contador++;
			}
		}
		return contador;
	}
	
	

}
