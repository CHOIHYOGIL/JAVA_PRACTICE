package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		
		
		int arr[]=new int[n];
		int count=0;
	
		int index=0;
			st=new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				arr[index++]=Integer.parseInt(st.nextToken());
				
			}
	
	int sosuCnt=0, cnt=0;
		for(int i=1; i<=n; i++) {
			sosuCnt=0;
			for(int j=1; j<=arr[i-1]; j++) {
				if(arr[i-1]%j==0)
					sosuCnt++;
			}
			if(sosuCnt==2)
				cnt++;
			
		}
		
		System.out.println(cnt);
	}

}
