package com.core.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemoUsingChars {

	public static void main(String[] args) {

		writeToFile();

		readFromFile();

	}

	public static void writeToFile() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
         try {
			fw = new FileWriter(new File("Saturday.txt"));
			bw = new BufferedWriter(fw);
			bw.append("End of today session, Cannot cover threads, we will take tommorrow");
			bw.append("\n \t Any questions");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	public static void readFromFile() {
		int i;
		char buf[];
		try {
			FileReader fr = new FileReader(new File("Saturday.txt"));
			BufferedReader br = new BufferedReader(fr);
			buf = new char[300];
			br.read(buf);
			String output = new String(buf);
			System.out.println(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
