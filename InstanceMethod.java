public class InstanceMethod{
	int a=10;
	int b=20;

void m1(){
	System.out.println(a+b);
}

void add(){
	m1();
}

public static void main(String[] args){
	InstanceMethod i= new InstanceMethod(); //creating object
	i.add(); // method calling or method invoking
}
}