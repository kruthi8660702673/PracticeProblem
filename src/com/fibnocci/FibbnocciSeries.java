package com.fibnocci;

public class FibbnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3;
		int i;
		int count=10;
		System.out.print(n1+" "+n2+'\n');
		for(i=0;i<count;i++) {
			n3=n1+n2;
			System.out.println(""+n3+'\n');
			n1=n2;
			n2=n3;
		}
	}
	
}
