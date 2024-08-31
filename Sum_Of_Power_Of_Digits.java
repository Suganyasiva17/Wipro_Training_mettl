// Sum of powers of successive digits


import java.io.*;
import  java.util.*;
class SumOfPowersOfDigits {

	public int sumOfPowerOfDigits(int input1){
		int sum=1;
		int digit=input1%10;
		int cdigit=0;
		input1/=10;
		while(input1!=0){
		    cdigit=input1%10;
		    sum+=Math.pow(cdigit,digit);
		    digit=cdigit;
		}
		return sum;
	}
}
