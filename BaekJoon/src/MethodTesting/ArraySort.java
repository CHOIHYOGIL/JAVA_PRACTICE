package MethodTesting;

import java.util.Arrays;
import java.util.Collections;



public class ArraySort {

	public static void main(String[] args) {
		
		Integer []arr= {12,6,153,34,1};
		
		Arrays.sort(arr,Collections.reverseOrder());    //�������� ����ҋ��� Integer�� Wrapper Ŭ���� ���!
		
		for(int i:arr) {
			System.out.println(" [ "+ i+ "]");
		}
		
		
 
	}

}
