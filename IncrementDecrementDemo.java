public class IncrementDecrementDemo{
	public static void main(String[] args){
	int x=10;
    x=x++; // same varible we are incrementing means it will not increment the original value
    int y=x;
    System.out.println(x); //10
    
    int a=++x;
    System.out.println(x); //11
    
    int b=--x;
    System.out.println(x); //10
    
    int c=x--;
    System.out.println(c); //10
    System.out.println(x); //9
}
}