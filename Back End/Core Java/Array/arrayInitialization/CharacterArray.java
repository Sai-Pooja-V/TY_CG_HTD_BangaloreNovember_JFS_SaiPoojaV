package com.cg.arrayClass.arrayInitialization;

public class CharacterArray {
	public static void main(String[] args) {
		char[] c = new char[4];
		c[0]='A';
		c[1]=10;
		c[2]='g';
		c[3]='m';
		
		for(int i =0 ;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
}
