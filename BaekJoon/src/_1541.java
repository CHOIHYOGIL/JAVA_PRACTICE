import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1541 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		String []arr=input.split("-");
		
		int min=0;
		min+=sum(arr[0].split("\\+"));
		
		for(int i=1; i<arr.length; i++) {
			min-=sum(arr[i].split("\\+"));
		}
		System.out.println(min);
		
	}

	static int sum(String []input) {
		int result=0;
		for(String num: input) {
			result+=Integer.parseInt(num);
		}
		return result;
	}
}
