package com.dp.builder;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setOs("Android").setProcessor("MediaTek").setRam("2 GB").getPhone();
		System.out.println(phone);
	}
}
