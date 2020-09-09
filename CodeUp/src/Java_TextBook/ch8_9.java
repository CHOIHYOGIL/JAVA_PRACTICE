package Java_TextBook;

import java.io.File;

public class ch8_9 {

	public static void main(String[] args) {
		String path="C:\\Users\\user\\Desktop\\";
		File f=new File(path);
		File subFiles[]=f.listFiles();
		
		int count=0;
		for(int i=0; i<subFiles.length; i++) {
			
			String name=subFiles[i].getName();
			int index = name.lastIndexOf('.');  //���� �̸��� . �� �ִ� ��ġ ã��
			
			if(index==-1)
				continue;
			
			String ext=name.substring(index); //������ ã�� .��ġ�������� ���� �����б�
			System.out.println(ext);
			if(ext.equals(".png")) {
				System.out.println(subFiles[i].getPath()+" ����");
				subFiles[i].delete();
				count++;
			}
			
		}
		
		System.out.println("�� "+count+"���� .PNG������ �����Ͽ����ϴ�.");
		
		

	}

}
