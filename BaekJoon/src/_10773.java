package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class _10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n=Integer.parseInt(br.readLine());
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0; i<n; i++) {
			int k=Integer.parseInt(br.readLine());
			if(k==0) {
				stack.pop();
			}else {
				stack.push(k);
			}
		}
		int sum=0;
	
		while(!stack.isEmpty()) { 
			sum += stack.pop();
			}

		
		
		bw.write(sum+"\n");

		bw.flush();
		bw.close();
		br.close();
		
	}

}
