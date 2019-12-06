package DesignPatterns.ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	Internet internet = new RealInternet();
	static List<String> restrictList;
	
	static {
		restrictList=new ArrayList<String>();
		restrictList.add("abc.com");
		restrictList.add("def.com");
		restrictList.add("efg.com");
	}
	
	@Override
	public void connectInternet(String domain) throws Exception {
		if(restrictList.contains(domain.toLowerCase())) {
			throw new Exception("Access denaied");
		}
		internet.connectInternet(domain);
	}
}
