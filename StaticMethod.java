public class StaticMethod{

static void m1(){
	System.out.println("I am static method");
}


public static void main(String[] args){
	StaticMethod.m1();// ClassName.methodName();
	m1(); //methodName();
	
	
}


}
