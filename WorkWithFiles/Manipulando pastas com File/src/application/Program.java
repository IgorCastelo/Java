package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); //Lista de pastas
		
		System.out.println("FOLDERS(pastas): ");
		for(File folder:folders) {
			System.out.println(folder);
		}
		
		File[] Files = path.listFiles(File::isFile); //Lista de documentos
		System.out.println("FILES(documentos): ");
		for(File file:Files) {
			System.out.println(file);
		}
		
		boolean sucess = new File (strPath+"\\subdirTesteJava").mkdir();//criar uma subpasta chamadasubDurTesteJava no diretorio documentos. 
		System.out.println("Directory created sucessfully: " + sucess);//sucess retorna se o diretorio 
		
		sc.close();
		
		
	}

}
