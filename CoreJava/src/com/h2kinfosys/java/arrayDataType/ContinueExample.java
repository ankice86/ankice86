package com.h2kinfosys.java.arrayDataType;
public class ContinueExample {

	public static void main(String[] args) {
		
	 for(int i = 0 ; i < 10 ; i++) {
			if(i%2 == 0){
				continue; // break;
			}
			
			System.out.println("After Condition 2 = "+i);
		}
	}
}
