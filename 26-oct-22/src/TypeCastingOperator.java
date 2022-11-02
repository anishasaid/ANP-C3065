//type casting with primitive data types
public class TypeCastingOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1;       //8 bits = 1 byte - range  -128 to 127
		b1=90;
		int i1=78;     // 32 bits = 4 bytes
		
		byte b2=(byte)i1;  //type casting - int to byte conversion 
		
		int i2= b1;
		
		float f1=89.56f;
		int i3=(int)f1;
		
		System.out.println(i3);
		
	}

}
