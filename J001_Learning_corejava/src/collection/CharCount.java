package collection;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
		
		String str = "success";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		char words[] = str.toCharArray();
		
		for(int i=0;i<words.length;i++)
		{
			if(map.get(words[i])==null)
			{
				map.put(words[i], 1);
			}
			else
			{
				int k = map.get(words[i]);
				k++;
				map.put(words[i], k);
			}
		}
		
		System.out.println(map);
		
		
		
		
		
		
	}
}
