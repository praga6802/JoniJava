public class InstanceOf{
	public static void main(String[] args)throws Exception{
	String t=new String();
	System.out.println(Class.forName(args[0]).isInstance(t));
}
}