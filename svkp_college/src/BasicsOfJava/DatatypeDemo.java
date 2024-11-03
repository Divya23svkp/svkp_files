package BasicsOfJava;

public class DatatypeDemo {

	public static void main(String[] args) {
               
		//byte - 1 byte
		 byte byteMax=127;
		 byte byteMin=-128;
		 System.out.println("Min range of byte is"  +byteMin +" Max range of byte" +byteMax);
		 
		 //short -2 bytes
		 short shortMax=32767;
		 short shortMin=-32768;
		 System.out.println("Min range of short is"  +shortMin +" Max range of short" +shortMax);
		 
		 //int - 4 bytes
		 int IntMax=2147483647;
		 int IntMin=-214743648;
		 System.out.println("Min range of int is"  +IntMin +" Max range of int" +IntMax);
		 
		 //long - 8 bytes
		 long maxLong=9223372036854775807L;
		 long minLong=-9223372036854775808L;
		 System.out.println("Min range of Long is"  +minLong +" Max range of Long" +maxLong);
		 
		 
		 //float - 4 bytes //double -8 bytes
		 float f=3234.141243278345f;
		 double d=3456.1412451234567890234567891d;
		 System.out.println("float value"  +f +" double" + d); 
		 
		 //boolean
		 boolean status=false;
		 System.out.println("boolean value is"  + status);
		 
		 char c='M';
		 System.out.println("char value"  +c);
	}

}
