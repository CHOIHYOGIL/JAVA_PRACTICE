package Kakao;

import java.util.ArrayList;
import java.util.HashMap;
 
public class kakaoLRU {

	public static void main(String[] args) {
		
		
		list();
		
	}
	
	//HashMap �̿�
	public static void map() {
		
			String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome","Paris","Jeju","NewYork","Rome"};
			
			int cacheSize=2;
			int totaltime=0;
			HashMap<String, Integer> cache=new HashMap<String,Integer>();
			if(cacheSize==0) {
				totaltime=5*cities.length;
			}else {
				for(int i=0; i<cities.length; i++) {
					
					if(cache.containsKey(cities[i].toLowerCase())) {   //ĳ�ÿ� ���ø��� �ִ°��
						
						totaltime+=1;
						
						for(String key: cache.keySet()) {    //HashMap�� ����ִ� Ű���� ��ü. �� ���⼭�� �����̸���
							cache.put(key,cache.get(key)+1);
						}
						cache.put(cities[i].toLowerCase(), 0);   //���� ��ü 1�� ������Ű�� ���� �ֱٿ� ���°��� 0���� ����!
						
						
					}else { //ĳ�ÿ� ���ø��� ���°��
						totaltime+=5;
						if(cache.size()==cacheSize) {  //cache�� value���� ���� ū���� ����. �ֳ��ϸ� ���� �������� ���� �����������̱⶧��.. LRU�� �ؾ��ϹǷ�
							String removeKey=null;
							for(String key:cache.keySet()) {
								if(removeKey == null) {
									removeKey=key;
								}else {
									if(cache.get(removeKey)<cache.get(key)) {
										removeKey=key;
									}
								}
							}
							cache.remove(removeKey);
						}
						for(String key: cache.keySet()) {    //HashMap�� ����ִ� Ű���� ��ü. �� ���⼭�� �����̸���
							cache.put(key,cache.get(key)+1);
						}
						cache.put(cities[i].toLowerCase(), 0); 
					}
					
				}
			}
			System.out.println("��� : "+totaltime);
			
		
	}
	
	//ArrayList �̿�
	public static void list() {
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome","Paris","Jeju","NewYork","Rome"};
		
		int cacheSize=2;
		ArrayList<String> cache=new ArrayList<>();
		
		int totalTime=0;
		
		if(cacheSize==0) {     //�� �κ��� �߿�!!!!!!!
			totalTime=5*cities.length;
		}else {
			for(int i=0; i<cities.length; i++) {
				int searchResult=searchCache(cache, cities[i].toLowerCase());
				
				if(searchResult==-1) {   //ĳ�ÿ� ���ø��� ���°��
					totalTime+=5;
					
					if(cache.size()==cacheSize) {  //���� ĳ�ÿ� ���������� 0�� �ε��� ����
						cache.remove(0);   //ĳ�û���� 0�̶�� ���⼭ 0���� ������� ������ �����߻�! �׷��� ������ ����ó���� ���ذ�1 
					}

				}else {					//ĳ�ÿ� ���ø��� �ִ°��
					totalTime+=1;
					cache.remove(searchResult);    //�츮�� ���� �������� ������ �������� ã�⶧���� , ĳ�ÿ� ���ø��� �ִ°�� ĳ�ÿ� �ִ� �������� �����ϰ� �ڿ� �ٽ� �����ִ� �ڵ�.
			
				}
				cache.add(cities[i].toLowerCase());
			}
		}

		System.out.println("��� : "+totalTime);
	}
	private static int searchCache(ArrayList<String> cache, String city) {
		
		for(int i=0; i<cache.size(); i++) {
			if(cache.get(i).equals(city)) {
				return i;
			}
		}
		return -1;
	}

}
