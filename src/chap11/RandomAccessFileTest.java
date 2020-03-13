package chap11;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			raf = new RandomAccessFile(path + "\\stream2.txt", "rw");
			System.out.println("시작 포인터 : " + raf.getFilePointer());
			raf.writeInt(75);
			System.out.println("done.");
			raf.writeBoolean(false);
			System.out.println("done.");
			raf.writeChar('A');
			System.out.println("done.");
			raf.writeLong(1000000000000000000L);
			System.out.println("done.");
			System.out.println("포인터 : " + raf.getFilePointer());
			raf.seek(0);
			System.out.println("포인터 : " + raf.getFilePointer());
			System.out.println(raf.readInt());
			System.out.println(raf.readBoolean());
			System.out.println(raf.readChar());
			System.out.println(raf.readLong());
			System.out.println("포인터 : " + raf.getFilePointer());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
