package string;

public class Test {

	public static void main(String[] args) {
		float f1[]=new float[2];
		float f2[]=new float[2];
		float[] f3=f1;
		long x=42;
		f1[0]=42.0f;
		
		System.out.println("f1==f2: " + (f1==f2));
		System.out.println("x==f1[0]: " + (x==f1[0]));
		System.out.println("f1==f3: " + (f1==f3));
		System.out.println("f2[1]==f1[1]: " + (f2[1]==f1[1]));

	}

}
