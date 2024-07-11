package application;

import entities.Printer;
import entities.Scanner;

public class Program {

	public static void main(String[] args) {
		Printer p =  new Printer ("1080");
		p.prcessDoc(" My Letter");
		p.print(" My Letter");
		
		Scanner s = new Scanner("2000");
		s.prcessDoc(" My email");
		System.out.println("scan result: " + s.scan());

	}

}
