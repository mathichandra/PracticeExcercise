package com.practice.samples;

public class AngularBracket<AnyType> {

	private AnyType i;
	public AnyType getI() {
		return i;
	}
	public void setI(AnyType i) {
		this.i = i;
	}
	public static void main(String[] args) {
		AngularBracket<String> ang = new AngularBracket<String>();
		ang.setI("10");
		System.out.println(ang.getI());
	}

}
