
import java.util.Scanner;
public class Kakao {

	public static void main(String[] args) {
		
	
		kakao2();
	}



public static void kakao() {
	Scanner scanner=new Scanner(System.in);
	int [][] map1=new int[5][5];
	int [][] map2=new int[5][5];
	
	char [][]map3=new char[5][5];
	System.out.println("ù��° �迭 �����Է� ");
	
	for(int i=0; i<map1.length; i++) {
		System.out.print((i+1)+"��° �� �����Է�(���� 0~31) : ");
		int inputNumber=scanner.nextInt();
		for(int j=0; j<map1[i].length; j++) {
			map1[i][4-j]=inputNumber%2;
			inputNumber/=2;
		}	
	}
	


	
	System.out.println("�ι�° �迭 ���� �Է�");
	for(int i=0; i<map2.length; i++) {
		System.out.print((i+1)+"��° �� �����Է�(���� 0~31) : ");
		int inputNumber=scanner.nextInt();
		for(int j=0; j<map2[i].length; j++) {
			map2[i][4-j]=inputNumber%2;
			inputNumber/=2;
		}	
	}
	for(int i=0; i<map1.length; i++) {
		for(int j=0; j<map1[i].length; j++) {
			if(map1[i][j]==1 || map2[i][j]==1) {
				map3[i][j]='#';
			}else {
				map3[i][j]=' ';
			}
		}
	
	}
	for(int i=0; i<map3.length; i++) {
		for(int j=0; j<map3[i].length; j++) {
			System.out.print(map3[i][j]);
		}
	System.out.println();
	}

}


//�� �޼ҵ尡 ����!!!
public static void kakao2() {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("�迭�� ���̸� �Է����ּ��� > ");
	int size=scanner.nextInt();
	
	int[][]map1=new int[size][size];
	int [][]map2=new int[size][size];
	char[][] map=new char[size][size];
	
	//�Է°��� ���� ���
	// 5->31, 6->63
	
	int range=1;
	
	for(int i=0; i<size; i++) {
		range*=2;
	}
	range=-1;
	
	System.out.println("ù��° �迭");
	for(int i=0; i<map1.length; i++) {
		System.out.print((i+1)+"��° �� �����Է� (���� 0~"+range+") :");
		int inputNumber=scanner.nextInt();
		for(int j=0; j<map1[i].length; j++) {
			
			//���̰� 5 -> 4 3 2 1 0  ,    ���̰� 6 -> 5 4 3 2 1 0
			map1[i][map[i].length-1-j] = inputNumber%2;
			inputNumber/=2;
		}
	}
	System.out.println("�ι�° �迭 ���� �Է�");
	for(int i=0; i<map2.length; i++) {
		System.out.print((i+1)+"��° �� �����Է�(���� 0~31) : ");
		int inputNumber=scanner.nextInt();
		for(int j=0; j<map2[i].length; j++) {
			map2[i][map2[i].length-1-j]=inputNumber%2;
			inputNumber/=2;
		}	
	}
	for(int i=0; i<map1.length; i++) {
		for(int j=0; j<map1[i].length; j++) {
			if(map1[i][j]==1 || map2[i][j]==1) {
				map[i][j]='#';
			}else {
				map[i][j]=' ';
			}
		}
	
	}
	for(int i=0; i<map.length; i++) {
		for(int j=0; j<map[i].length; j++) {
			System.out.print(map[i][j]);
		}
	System.out.println();
	}
}
}
