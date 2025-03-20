public class InstanceStaticAccess{
	int x=10;
	static int y=20;

void m1(){
	System.out.println("Instance variable in instance method:"+x); //we can access directly instance variable in instance method
	System.out.println("Static variable in instance method:"+y);  //we can access directly static variable in instance method
	m3(); //we can access directly instance method in instance method
	m4(); //we can access directly static method in instance method

}

static void m2(){
	InstanceStaticAccess ia= new InstanceStaticAccess();//creating object to access instance variable and methods
	System.out.println("Instance Variable in static method:"+ia.x); // we can access instance variable in static method via object
	System.out.println("Static Variable in static method: "+y);
	ia.m1();// we can access instance method in static method via object
	m4();//we can directly access static method in static method
	
}

void m3(){
	System.out.println("I am instance method");
}

static void m4(){
	System.out.println("I am static method");
}
	
public static void main(String[] args){
	InstanceStaticAccess i =new InstanceStaticAccess();//creating object to access instance method and instance variable
	System.out.println("-----INSTANCE METHOD ACCESSING----");
	i.m1();//invoking instance method via object
	System.out.println("-----STATIC METHOD ACCESSING directly----");
	m2(); //invoking static method directly
	System.out.println("-----STATIC METHOD ACCESSING by classname----");
	InstanceStaticAccess.m2(); //invoking static method by classname
}

}


	