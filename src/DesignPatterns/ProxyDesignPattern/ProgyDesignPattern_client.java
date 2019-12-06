package DesignPatterns.ProxyDesignPattern;

public class ProgyDesignPattern_client {
	public static void main(String[] args) throws Exception {
		Internet net = new ProxyInternet();
		
		net.connectInternet("abc.com");
	}
}
