package com.dp.factory;

public class FactorImpl {

	public OS getInstance(String os) {

		if (os.equals("windows")) {
			return new Windows();
		} else if (os.equals("ios")) {
			return new IOS();
		} else {
			return new Android();
		}
	}
}
