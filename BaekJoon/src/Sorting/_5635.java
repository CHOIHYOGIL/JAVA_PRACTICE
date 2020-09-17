package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _5635 {

	public static void main(String[] args) throws IOException {
	
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int n=Integer.parseInt(br.readLine());
	
	people []peoples=new people[n];
	
	for(int i=0; i<n; i++) {
		StringTokenizer st=new StringTokenizer(br.readLine());
		String name=st.nextToken();
		String a= st.nextToken();
		String b=st.nextToken();
		String c=st.nextToken();
		
		if(a.length()==1) a="0"+a;
		if(b.length()==1) b="0"+b;
		
		peoples[i]=new people(name, Integer.parseInt(c+b+a));
		
	}
	
	Arrays.sort(peoples, new Comparator<people>() {
		
		public int compare(people o1, people o2) {
			return o2.getBirthday()-o1.getBirthday();
		}
	});

    bw.write(peoples[0].name + "\n");
    bw.write(peoples[n - 1].name + "\n");
    bw.flush();
    br.close();
    bw.close();
	}

}

class people{
	String name;
	int birthday;

	public people(String name, int birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	
}