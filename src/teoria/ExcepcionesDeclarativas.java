package teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionesDeclarativas {

	public static void main(String[] args) {
		File infile = new File("datos.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(infile);
			while (sc.hasNextLine())
				System.out.println(sc.next());
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("El fichero no existe");
		} finally {
			if (sc != null)
				sc.close();
		}

	}

}
