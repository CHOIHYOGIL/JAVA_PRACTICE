package simple_loop;
import java.util.Scanner;
public class BubbleSort {

public void bubbleSort() {

Scanner scanner = new Scanner(System.in);

int[] arr = new int[5];

int sum = 0;

// �ݺ����� ���� �Է�

for (int i = 0; i < 5; i++) {

System.out.print((i + 1) + "��° ���� �Է� : ");

arr[i] = scanner.nextInt();

sum += arr[i];

}

// �������� �ڵ�

for(int i=0; i<arr.length; i++){

for(int j=0; j<arr.length-i-1; j++){

if(arr[j]>arr[j+1]){

int temp=arr[j+1];

arr[j+1]=arr[j];

arr[j]=temp;

}

}

}


// ��� �ڵ�

System.out.print("���� ��� : ");

for (int i = 0; i < arr.length; i++) {

System.out.print(arr[i] + "\t");


}

System.out.println("\n�Է��� ���� �� ���� : " + sum);

}

}