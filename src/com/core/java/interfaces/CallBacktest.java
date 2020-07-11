package com.core.java.interfaces;

public class CallBacktest {

	public static void main(String[] args) {
		boolean isRemoteCase = true;
		Remote callBack = remoteFactory(isRemoteCase);
		startDevices(callBack);
	}

	// factory pattern
	private static Remote remoteFactory(boolean isRemoteCase) {
		Remote callBack;
		if (isRemoteCase) {
			callBack = new TvRemote();
		} else {
			callBack = new CromeCastRemote();
		}
		return callBack;
	}

	public static void startDevices(Remote callBack) {
		callBack.startDevice(1);
	}

}
