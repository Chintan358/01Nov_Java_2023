package collection;

import java.util.Stack;

public class C008_Stack {
	public static void main(String[] args) {
		
		
		Stack<String> st = new Stack<String>();
		st.push("java");
		st.push("php");
		st.push("Android");
		st.push("ios");
	
		//System.out.println(st.pop());
		//st.pop();
		System.out.println(st.peek());
		
		for(String s : st)
		{
			System.out.println(s);
		}
		
		
		
	}
}
