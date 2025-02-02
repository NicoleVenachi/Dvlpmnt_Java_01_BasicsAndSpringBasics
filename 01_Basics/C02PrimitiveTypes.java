package com.basics.primitives;

public class C02PrimitiveTypes {
	public static void main(String[] args) {
		// Declaracion e inicializacion
		byte b = 1;
		short s;
		s = 2;
		int i = 3;
		long l  =4;
		
		char c = 'a';
		
		boolean bool = true;
		
		float f = 1.2f;
		double d = 1.3;
		
		long l2 = 2_000_000_000_000L;
		
		var v = 1;
		v = 2;
//		v = 1.2;
		
		// Casteo
		int i3 = s;
		System.out.println(i3);
		
		char c2 = 100;
		System.out.println(c2);
		
		double d2 = i3;
		d2 = l;
		
		b = (byte)i3;
		
		byte b2 = (byte)128;
		System.out.println(b2);
		
//		Conversion back
		long number = 499_999_999_000_000_001L;
		double converted = (double) number;
		System.out.println(number - (long) converted);
		
//		Autoboxing and unboxing
		Integer i4 = 1;
		int i5 = i4;
	}
}
