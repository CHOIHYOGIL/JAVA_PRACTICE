import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _4153 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int arr[]=new int[3];
		int index=0;
		while(true) {
			st=new StringTokenizer(br.readLine());
			arr[0]=Integer.parseInt(st.nextToken());
			arr[1]=Integer.parseInt(st.nextToken());
			arr[2]=Integer.parseInt(st.nextToken());
			
			if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
				break;
			}
			
			
			Arrays.sort(arr);
			if(arr[2]*arr[2]==arr[1]*arr[1]+arr[0]*arr[0]) {
				bw.write("right\n");
			}else {
				bw.write("wrong\n");
			}
			
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
