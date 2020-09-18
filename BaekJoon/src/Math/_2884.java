package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2884 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int hour=Integer.parseInt(st.nextToken());
		int min=Integer.parseInt(st.nextToken());
		
		if(min-45<0) {
			min=min+15;
			if(hour-1<0) {
				hour=hour+23;
			}else {
				hour=hour-1;
			}
		
		
		}else {
			hour=hour;
			min=min-45;
		}
		
		bw.write(hour+" "+min);
		bw.flush();
		bw.close();
		br.close();
	}

}
