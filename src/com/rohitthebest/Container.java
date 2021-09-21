package com.rohitthebest;

// Generic class
public class Container<T1, T2> {

	T1 var1;
	T2 var2;

	public Container(T1 var1, T2 var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public T1 getVar1() {
		return var1;
	}

	public void setVar1(T1 var1) {
		this.var1 = var1;
	}

	public T2 getVar2() {
		return var2;
	}

	public void setVar2(T2 var2) {
		this.var2 = var2;
	}
	
	public void printValues() {
		
		System.out.println("Variable 1 : " + this.var1);
		System.out.println("Variable 2 : " + this.var2);
	}

}
