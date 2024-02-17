package pracice.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileFunc {

	public static void main(String[] args) {
		String filepath1 = "C:\\files\\test2.txt";
		File f = new File(filepath1);

		writeFile(f);
		readFile(f);

	}

	public static void writeFile(File f1) {

		if (!f1.exists()) {

			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(f1));
			bw.write("Hi");
			bw.newLine();
			bw.write("how are you");
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readFile(File f1) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String line = "";
		try {
			while ((line = br.readLine()) != null) {

				System.out.println(line);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
