package com.ritesh.ds;

public class Singleton {

	private static Singleton instance = null;

	private void Sigleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			return new Singleton();
		}
		return instance;
	}

}
