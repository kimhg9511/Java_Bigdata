package chap11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class SequenceInputStreamTest {
	/**
	 * SequenceInputStream 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream fIn1 = null;
		FileInputStream fIn2 = null;
		FileInputStream fIn3 = null;
		SequenceInputStream si1 = null;
		SequenceInputStream si2 = null;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			fIn1 = new FileInputStream(path + "\\input.txt");
			fIn2 = new FileInputStream(path + "\\input2.txt");
			fIn3 = new FileInputStream(path + "\\input3.txt");

			Vector<FileInputStream> fIn = new Vector<FileInputStream>();
			fIn.add(fIn1);
			fIn.add(fIn2);
			fIn.add(fIn3);
			Enumeration<FileInputStream> fIns = fIn.elements();

			si1 = new SequenceInputStream(fIns);
			int var_readbyte = -1;
			while ((var_readbyte = si1.read()) != -1) {
				System.out.println((char)var_readbyte);
			}
			System.out.println();
			
			fIn1 = new FileInputStream(path + "\\input.txt");
			fIn2 = new FileInputStream(path + "\\input2.txt");

			si2 = new SequenceInputStream(fIn1, fIn2);
			var_readbyte = -1;
			while ((var_readbyte = si2.read()) != -1) {
				System.out.println((char)var_readbyte);
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fIn1.close();
				fIn2.close();
				fIn3.close();
				si1.close();
				si2.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
