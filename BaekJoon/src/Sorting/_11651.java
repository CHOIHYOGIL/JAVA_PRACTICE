package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _11651 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
          
		int n=scanner.nextInt();
		int[][]arr=new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0]=scanner.nextInt();
			arr[i][1]=scanner.nextInt();
			
		}
		
//		Arrays.sort(arr, (o1,o2)->{
//			if(o1[1]==o2[1]) {
//				return Integer.compare(o1[0], o1[1]);
//			}else {
//				return Integer.compare(o1[1], o2[1]);
//			}
//		});
		Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {   
                if(x[1]==y[1]){   
                	// YÁÂÇ¥°¡ µ¿ÀÏÇÏ¸é XÁÂÇ¥ ¼øÀ¸·Î
                	return Integer.compare(x[0], y[0]);
                }
                // YÁÂÇ¥ ¼øÀ¸·Î
                return Integer.compare(x[1], y[1]);
            }
        });
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}

}
