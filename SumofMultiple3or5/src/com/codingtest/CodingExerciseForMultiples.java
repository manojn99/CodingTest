package com.codingtest;

public class CodingExerciseForMultiples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfMultiples =0;
		for (int i=0; i<1000;i++){
			if(i%3==0 || i%5==0){
				sumOfMultiples+=i;
			}
		}
		System.out.println("Sum of multiples of 3 or 5 below 1000 is "+sumOfMultiples);	
	}

}
