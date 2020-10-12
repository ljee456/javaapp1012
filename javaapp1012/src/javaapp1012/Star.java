package javaapp1012;

public class Star {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
//		for(int i=1; i<=5; i=i+1) {
//			for(int j=1; j<=i; j=j+1) {	
//				System.out.printf("*");
//			}
//			System.out.printf("\n");
//		}
		
		//**
		//****
		//******
		//********
		//**********
//		for(int i=1; i<=5; i=i+1)	{
//			for(int j=1; j<=2*i-1; j=j+1) {
//				System.out.printf("*");
//			}
//			System.out.printf("\n");
//		}

		//*****
		//****
		//***
		//**
		//*
//		for(int i=1; i<=5; i=i+1) {
//			for(int j=1; j<=6-i; j=j+1) {
//				System.out.printf("*");
//			}
//			System.out.printf("\n");
//		}
		
		//*
		//**
		//***
		//**
		//*
		for(int i=1; i<=5; i=i+1) {
			if(i <= 3) {
				for(int j=1; j<=i; j=j+1) {
					System.out.printf("*");
				}
			
			}else
				for(int j=1; j<=6-i; j=j+1) {
					System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}
}
