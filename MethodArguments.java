public class MethodArguments{


public void add(int a,int b){ //parameters
	System.out.println(a+b);
}

public static void sub(int a,int b){ //parameters
	System.out.println(a-b);
}

public void greet(String name, int age){
	System.out.println("I am "+name+" My age is "+age);
}

public static void main(String[] args){
	MethodArguments ma=new MethodArguments();
	ma.add(10,4); //arguments
	sub(10,0); //arguments
	//ma.greet(20,"praga"); //invalid because order of argument is important: incompatible type error
	}
}