package chap06;

import chap06_1.*;

public class AccessControllTest extends ProtectedData{ // use protect
/**
 * 접근 제한자 테스트
 * @param args
 */
	void printVar() {
		System.out.println(protectedVar);
	} // Protected State Access Allowed
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateData pd = new PrivateData(); 
		//System.out.println(pd.privateVar); ERROR! Private
		DefaultData df = new DefaultData();
		//System.out.println(df.defaultVar); ERROR! Default
		AccessControllTest pt = new AccessControllTest();
		pt.printVar(); // Protected State Access Allowed
		PublicData pb = new PublicData();
		System.out.println(pb.publicVar);
	}

}
