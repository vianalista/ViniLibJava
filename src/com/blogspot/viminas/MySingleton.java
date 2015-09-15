package com.blogspot.viminas;

public class MySingleton {
	private static MySingleton i = null;

	protected MySingleton() {
		
	}
	
	public static MySingleton getI(){
		if(i == null){
			i = new MySingleton();
		}
		return i;
	}
	
}
