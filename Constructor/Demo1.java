public class Demo1{	
public String name(){
	//String n="hello Java";
	return "hello java";
}

public static void main(String[] args){
	Demo1 d= new Demo1();
	String s=d.name();
	System.out.println(s);
	System.out.println(d.name());
}
}
	
	