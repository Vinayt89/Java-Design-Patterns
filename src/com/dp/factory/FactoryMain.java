package com.dp.factory;

public class FactoryMain {

	public static void main(String[] args) {
		FactorImpl factoryImpl = new FactorImpl();
		OS os = factoryImpl.getInstance("android");
		os.showMsg();
	}
}
