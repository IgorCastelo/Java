package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
//criação do arquivo

		/*
		 * String[] lines = new String[] { "Baton garoto, 1.00 , 12 ",
		 * "Serenata de amor, 1.50 , 30 ", "Sonho de valsa, 1.25, 36 " };
		 * 
		 * String path = "C:\\Users\\User\\Documents";// cria o caminho
		 * 
		 * boolean sucess = new File(path + "\\out").mkdir();// cria a pasta
		 * System.out.println("pasta criada:" + sucess);
		 * 
		 * path += "\\out\\summary.txt"; try (BufferedWriter bw = new BufferedWriter(new
		 * FileWriter(path, true))) {// tenta escrever for (String line : lines) {
		 * bw.write(line); bw.newLine(); } } catch (IOException e) {
		 * e.printStackTrace(); 
		 * 
		 * //leitura do arquivo try (BufferedReader br = new BufferedReader(new
		 * FileReader(path))) { for (String line : lines) { br.readLine();
		 * System.out.println(line); } } catch (IOException e) { e.printStackTrace(); }
		 * } }
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] lines = new String[] { "Ventilador Mundial , 139 , 5 \nAir Fry Elgin, 200 , 2 " };
		String path = "C:\\Users\\User\\Documents\\input.csv";
		
		//cria
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {// tenta escrever
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Ler
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String itemCsv = br.readLine();
			while(itemCsv!=null) {
				System.out.println(itemCsv);
				itemCsv = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
