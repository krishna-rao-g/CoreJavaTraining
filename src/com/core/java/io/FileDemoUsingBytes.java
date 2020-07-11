package com.core.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemoUsingBytes {

	public static void main(String[] args) {
		//fileCreate();
		// CRUD

		//writeToFile();
		readFromFIle();
	}

	private static void writeToFile() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("Saturday.txt"));
			BufferedOutputStream bs = new BufferedOutputStream(fos);
			String text = "Today is Input class and Thread class";
			bs.write(text.getBytes());

			// fos.write(text.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void readFromFIle() {
		try {
			FileInputStream fis = new FileInputStream(new File("Saturday.txt"));
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			do {
				//i = fis.read();
				i = bis.read();
				if (i != -1) {
					System.out.print((char) i);
				}
			} while (i != -1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void fileCreate() {
		// new file does not create a file
		File f = new File("Saturday.txt");
		// File f = new File("/Users/krishnaRao/training/Saturday.txt");
		// "/Users/krishnaRao/IOClass.txt"

		if (f.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File does not exist creating it. Do you want to create?");
			Scanner sc = new Scanner(System.in);
			String userInput = sc.next();
			if (userInput != null) {
				if (userInput.equals("YES")) {
					performFileCreation(f);
				}
			}
		}
	}

	private static void performFileCreation(File f) {
			try {
				f.createNewFile(); // checked exception
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File created");
			
			try {
				Mechanic mc = new Mechanic();
			} catch (Exception2 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Mechanic1 mc = new Mechanic1();
	}

}

// unchecked excepiton
class Exception1 extends RuntimeException{
	
}

// checked exception
class Exception2 extends Exception{
	
}

class Mechanic {
	Mechanic() throws Exception2{
		throw new Exception2();
	}
}

class Mechanic1 {
	Mechanic1() throws Exception1{
		throw new Exception1();
	}
}
