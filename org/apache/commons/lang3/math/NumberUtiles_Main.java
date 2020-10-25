package org.apache.commons.lang3.math;

import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;
public class NumberUtiles_Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//while(true){
	Scanner s =new Scanner(System.in);
		String number=s.nextLine();
		System.out.println(NumberUtils.createNumber(number)+" "+NumberUtils.createNumber(number).getClass().getName());
	
	}
	//}

}
