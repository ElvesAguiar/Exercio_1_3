package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Programa3 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Student student = new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
	
	System.out.println("FINAL GRADE = "+student.notaFinal());
	System.out.println(student.approved());
	
	
	sc.close();

	}

}
