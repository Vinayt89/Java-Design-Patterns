package com.dp.builder;

public class PhoneBuilder {

	private String os;
	private String ram;
	private String processor;
	private double screenSize;
	private int size;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setSize(int size) {
		this.size = size;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(os, ram, processor, screenSize, size);
	}
}
