package Java_TextBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ch8_5 {

	public static void main(String[] args) {
		
		FileInputStream fn=null;
		FileInputStream fn1=null;
		String path="C:\\Users\\user\\Desktop\\";
		String fileName="elvis1.txt";
		String fileName1="elvis1 - ���纻.txt";
		
		try {
			fn=new FileInputStream(path+fileName);
			fn1=new FileInputStream(path+fileName1);
			if(CompareFile(fn,fn1)) {
				System.out.println("������ �����ϴ�.");
			}else {
				System.out.println("������ �ٸ��ϴ�");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	public static boolean CompareFile(FileInputStream fn, FileInputStream fn1) throws IOException {
		
		byte [] fnBuf=new byte[1024];
		byte [] fn1Buf=new byte[1024];
		
		int fnCount=0;
		int fn1Count=0;
		
		while(true) {
			
			
				fnCount=fn.read(fnBuf,0,fnBuf.length);
				fn1Count=fn1.read(fn1Buf,0,fnBuf.length);
				
				if(fnCount != fn1Count) {
					return false;
				}
				
				if(fnCount==-1)  //���ϳ�����
					break;
				
				for(int i=0; i<fnCount; i++) {
					if(fnBuf[i] != fn1Buf[i]) {
						return false;
					}
				}
				
			} 
			return true;
		}
	}

