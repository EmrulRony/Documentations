## Proxy Design Pattern

Proxy design pattern falls under structural design pattern category. In proxy design pattern a object provide substitute or place holder for another class. Let's control the access to the original class. Also let us perform tasks before or after accessing the original class.

In the below example we demonstrate how a proxy design pattern works. 

**Internet Interface**

```java
 public interface Internet {
	public void connectInternet(String domain) throws Exception;
}
```

**Implementation classes of Internet Interface**

```java
public class RealInternet implements Internet{

	@Override
	public void connectInternet(String domain) throws Exception {
		System.out.println("Connecting to "+domain);
	}

}   
```

**Proxy class**

```java
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
```

**Client Class**

```java
public class ProgyDesignPattern_client {
	public static void main(String[] args) throws Exception {
		Internet net = new ProxyInternet();
		
		net.connectInternet("abc.com");
	}
}
```

```java
Exception in thread "main" java.lang.Exception: Access denaied
```

In the above example `ProxyInternet` class act as a proxy of `RealInternet` class.