class Teacher{
}
//newInstance method is used to create a object at run time, only we dont know to create a object for what class
class Student{
}

public class NewInstance{
	public static void main(String[] args) throws Exception{
	Object o= Class.forName(args[0]).newInstance();
	System.out.println("Object created for: "+o.getClass().getName());
}
}