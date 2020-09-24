package Eratosthenes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11502 {

	static boolean []isPrime=new boolean[1001];  //false 이면 소수, true면 소수 x
	static int[] primeList=new int[1001];
	static int primeCnt; //primeList index
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T=Integer.parseInt(br.readLine());
		int testCase[]=new int[T];
		int max=0;
		
		for(int i=0; i<T; i++) {
			
			testCase[i]=Integer.parseInt(br.readLine());
			if(testCase[i]>max) {
				max=testCase[i];
			}
			
		}
	
		findPrime(max);
		
		
		for(int i=0; i<T; i++) {
			int cnt=0;
			
			// 2+2 + 홀수인 소수
				if(!isPrime[testCase[i]-4]) {
					
					cnt++;
					bw.write(2+" "+ 2+" "+(testCase[i]-4)+"\n");
					continue;
				}
	
		
		
		//홀수인 소수 3개로 이루어진 경우
		outerloop:
			for(int j=1; j<primeCnt; j++) {
				for(int k=1; j<primeCnt; k++) {
					for(int p=1; p<primeCnt; p++) {
						if(primeList[j]+primeList[k]+primeList[p]==testCase[i]) {
							cnt++;
							bw.write(primeList[j]+" "+primeList[k]+" "+primeList[p]+"\n");
							break outerloop;
						}
					}
				}
			}
				//3개의 소수로 이루어져있지 않은경우
				if(cnt==0)
					bw.write(0+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	static void findPrime(int max) {
		
		for(int i=2; i*i<=max; i++) {
			for(int j=i*i; j<=max; j+=i) {
				if(!isPrime[j]) {
					isPrime[j]=true;
				}
			}
		}
		
		
		for(int i=2; i<=max; i++) {
			if(!isPrime[i]) {
				primeList[primeCnt++]=i;
			}
		}
	}

}
