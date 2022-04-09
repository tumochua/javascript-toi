package fileCore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileMain {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		try {

			fos = new FileOutputStream("tumochua.text");

			for (;;) {
				Scanner scan = new Scanner(System.in);
				System.out.println("nhap");
				String line = scan.nextLine() + "\n";
				byte[] b = line.getBytes();
				fos.write(b);

				System.out.println("ban co muon nhap tiep ko Y/N");

				String clone = scan.nextLine();
				if (clone.equalsIgnoreCase("n")) {
					break;
				}

			}

			fos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream fin = new FileInputStream("tumochua.text");
			StringBuilder bud = new StringBuilder();
			int code;
			while ((code = fin.read()) != -1) {
				char trave2 = (char) code;
				bud.append(trave2);

			}

			System.out.println(bud.toString());

			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
