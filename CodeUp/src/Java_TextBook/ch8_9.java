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
			int index = name.lastIndexOf('.');  //파일 이름중 . 이 있는 위치 찾음
			
			if(index==-1)
				continue;
			
			String ext=name.substring(index); //위에서 찾은 .위치에서부터 다음 문자읽기
			System.out.println(ext);
			if(ext.equals(".png")) {
				System.out.println(subFiles[i].getPath()+" 삭제");
				subFiles[i].delete();
				count++;
			}
			
		}
		
		System.out.println("총 "+count+"개의 .PNG파일을 삭제하였습니다.");
		
		

	}

}
