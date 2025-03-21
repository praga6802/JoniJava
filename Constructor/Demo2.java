public class Demo2{	
public int name(){
	String n="hello Java";
	return n;
}

public static void main(String[] args){
	Demo2 d= new Demo2();
	int s=d.name();
	System.out.println(s);
}
}