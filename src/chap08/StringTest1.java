package chap08;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "testString";
		String string2 = "testString";
		System.out.println(string1 == string2);
		
		String orgString = new String("Java");
		String lastString = orgString.concat("Fighting");
		System.out.println(orgString == lastString);
		
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb2 = sb.append("Fighting");
		System.out.println(sb == sb2);
		
	}

}
