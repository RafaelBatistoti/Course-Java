package com.Singleton;

public class Config {

	private static Config instance;

	private Config() {

	}

	public static Config getInstance() {
		
		if(instance == null) {
			synchronized (Config.class) {
				if(instance == null) {
					instance = new Config();
				}
				
			}
		}
		
		return null;

	}

}
