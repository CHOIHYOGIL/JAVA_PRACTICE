package MethodTesting;

public class compareTo {

	public static void main(String[] args) {
		
		Integer x=3;
		Integer y=4;
		int z=5;
		int k=5;
		System.out.println(x.compareTo(y));
		System.out.println(x.compareTo(z));
		
		System.out.println(Integer.compare(z, k));
	}

}
