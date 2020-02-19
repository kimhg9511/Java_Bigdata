public class ConversionTest {
	/**
	 * �삎 蹂��솚 �삁�젣
	 * 
	 */
	public static void main(String[] args) {
		//�겙 ���엯�쑝濡� �옄�룞 蹂��솚
		byte var_byte1 = 10;
		int var_int1 = var_byte1;
		System.out.println("var_int1 = " + var_int1);
		
		//紐낆떆�쟻 �삎 蹂��솚: �겙 ���엯�쓽 媛믪쓣 �옉�� ���엯�쓽 蹂��닔�뿉 �븷�떦
		//紐낆떆�쟻�쑝濡� �삎 蹂��솚�빐 二쇱� �븡�쑝硫� 而댄뙆�씪 �삤瑜� 諛쒖깮
		int var_int2 = 100;
		byte var_byte2 = (byte)var_int2;
		
		//char�� short
		short var_short1 = 200;
		char var_char1 = (char)var_short1;
		System.out.println("var_char1 = " + var_char1);
		
		//int ���엯蹂대떎 �옉�� ���엯�쓽 �젙�닔 �뿰�궛 : int�삎�쑝濡� 蹂��솚�맖
		//int�삎蹂대떎 �옉�� ���엯�쓽 蹂��닔�뿉 媛믪쓣 �븷�떦�븯�젮硫� 紐낆떆�쟻�쑝濡� �삎 蹂��솚�빐 二쇱뼱�빞 �븿
		byte var_byte3 = 20;
		byte var_byte4 = 40;
		byte var_result1 = (byte)(var_byte3 + var_byte4);
		
		char var_char2 = 'A';
		int var_int_result1 = var_char2 + 1;
		System.out.println("var_int_result1 = " + var_int_result1);
		
		//�뿰�궛�떆 �뵾�뿰�궛�옄 以� 蹂대떎 �겙 ���엯�쑝濡� �삎 蹂��솚�맂 �썑 �뿰�궛�맖
		int var_int3 = 100;
		long var_long1 = 100;
		long var_long_result1 = var_int3 + var_long1;
		System.out.println("var_long_result1 = " + var_long_result1);
	
		//�젙�닔�� �떎�닔瑜� �뿰�궛�븯硫� �떎�닔 ���엯�쑝濡� �옄�룞 �삎 蹂��솚�맂 �썑 �뿰�궛�맖
		long var_long2 = 100;
		float var_float1 = 3.14f;
		float var_float_result1 = var_long2 + var_float1;
		System.out.println("var_float_result1 = " + var_float_result1);
		
		//float ���엯怨� double ���엯�쓣 �뿰�궛�븯硫� double ���엯�쑝濡� 蹂��솚�맖
		float var_float2 = 3.33f;
		double var_double3 = 4.22;
		double var_long_result2 = var_float2 + var_double3;
		System.out.println("var_long_result2 = " + var_long_result2);
		}
	

}
