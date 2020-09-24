package Eratosthenes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2312 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while (T > 0) {
			int N = Integer.parseInt(br.readLine());
			int[] count = new int[N + 1];
			for (int i = 2; i <= N; i++) {
				if (N % i == 0) {
					count[i]++;
					N /= i;
					i = 1;
					continue;
				}
			}
			for (int i = 0; i < count.length; i++) {
				if (count[i] > 0) {
					bw.write(i + " " + count[i] + "\n");
				}
			}
			T--;
		}
		br.close();
		bw.flush();
		bw.close();
		
	}

}

