package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Programa1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
	
	
		Rectangle rectangle = new Rectangle(width, height);
		
		
		
		System.out.printf("AREA = %.2f\r\n"
				+ "PERIMETER = %.2f\r\n"
				+ "DIAGONAL = %.2f",rectangle.Area(),rectangle.Perimeter(),rectangle.Diagonal());
		
		
		
		
		sc.close();
	}

}
