package chap11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User beforeUser = new User("aaa","1234","홍길동","구로",16);
		User afterUser = null;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		FileOutputStream fileOS = null;
		ObjectOutputStream objectOS = null;
		FileInputStream fileIS = null;
		ObjectInputStream objectIS =null;
		try {
			fileOS = new FileOutputStream(path + "\\userinfo.ser");
			objectOS = new ObjectOutputStream(fileOS);
			objectOS.writeObject(beforeUser);
			fileIS = new FileInputStream(path + "\\userinfo.ser");
			objectIS = new ObjectInputStream(fileIS);
			afterUser = (User)objectIS.readObject();
			System.out.println(afterUser);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				objectOS.close();
				fileOS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		System.out.println("I/O END");
	}

}
