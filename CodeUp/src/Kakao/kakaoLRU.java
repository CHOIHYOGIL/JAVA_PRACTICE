package Kakao;

import java.util.ArrayList;
import java.util.HashMap;
 
public class kakaoLRU {

	public static void main(String[] args) {
		
		
		list();
		
	}
	
	//HashMap 이용
	public static void map() {
		
			String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome","Paris","Jeju","NewYork","Rome"};
			
			int cacheSize=2;
			int totaltime=0;
			HashMap<String, Integer> cache=new HashMap<String,Integer>();
			if(cacheSize==0) {
				totaltime=5*cities.length;
			}else {
				for(int i=0; i<cities.length; i++) {
					
					if(cache.containsKey(cities[i].toLowerCase())) {   //캐시에 도시명이 있는경우
						
						totaltime+=1;
						
						for(String key: cache.keySet()) {    //HashMap에 들어있는 키값들 전체. 즉 여기서는 도시이름들
							cache.put(key,cache.get(key)+1);
						}
						cache.put(cities[i].toLowerCase(), 0);   //위에 전체 1씩 증가싴키고 제일 최근에 들어가는것을 0으로 세팅!
						
						
					}else { //캐시에 도시명이 없는경우
						totaltime+=5;
						if(cache.size()==cacheSize) {  //cache의 value값이 가장 큰수를 삭제. 왜냐하면 제일 오랫동안 참조 되지않은것이기때문.. LRU로 해야하므로
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
						for(String key: cache.keySet()) {    //HashMap에 들어있는 키값들 전체. 즉 여기서는 도시이름들
							cache.put(key,cache.get(key)+1);
						}
						cache.put(cities[i].toLowerCase(), 0); 
					}
					
				}
			}
			System.out.println("결과 : "+totaltime);
			
		
	}
	
	//ArrayList 이용
	public static void list() {
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome","Paris","Jeju","NewYork","Rome"};
		
		int cacheSize=2;
		ArrayList<String> cache=new ArrayList<>();
		
		int totalTime=0;
		
		if(cacheSize==0) {     //이 부분이 중요!!!!!!!
			totalTime=5*cities.length;
		}else {
			for(int i=0; i<cities.length; i++) {
				int searchResult=searchCache(cache, cities[i].toLowerCase());
				
				if(searchResult==-1) {   //캐시에 도시명이 없는경우
					totalTime+=5;
					
					if(cache.size()==cacheSize) {  //현재 캐시에 꽉차있으면 0번 인덱스 삭제
						cache.remove(0);   //캐시사이즈가 0이라면 여기서 0번을 못지우기 때문에 에러발생! 그래서 위에서 예외처리를 해준것1 
					}

				}else {					//캐시에 도시명이 있는경우
					totalTime+=1;
					cache.remove(searchResult);    //우리는 가장 오래전에 참조한 페이지를 찾기때문에 , 캐시에 도시명이 있는경우 캐시에 있는 페이지를 삭제하고 뒤에 다시 더해주는 코드.
			
				}
				cache.add(cities[i].toLowerCase());
			}
		}

		System.out.println("결과 : "+totalTime);
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
