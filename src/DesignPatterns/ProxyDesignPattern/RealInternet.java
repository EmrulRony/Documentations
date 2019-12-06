package DesignPatterns.ProxyDesignPattern;

public class RealInternet implements Internet{

	@Override
	public void connectInternet(String domain) throws Exception {
		System.out.println("Connecting to "+domain);
	}

}
