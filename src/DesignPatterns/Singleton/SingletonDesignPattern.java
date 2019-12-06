package DesignPatterns.Singleton;

 class SingletonClass {
	private static SingletonClass obj;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance(){
		if(obj!=null)
			return obj;
		else
			obj=new SingletonClass();
		return obj;
	}
}

class SingletonDesignPattern{
	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.getInstance();
		SingletonClass obj1 = SingletonClass.getInstance();
		
		System.out.println(obj==obj1); // Output: true
	}
}
