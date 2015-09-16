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
/*	For Call to Test add the block below
	public static void main(String[] args) {
		MySingleton teste = new MySingleton();
		teste.getI();
		
		teste.getI();
	}
	*/
}
