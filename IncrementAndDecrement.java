public class IncrementAndDecrement {

  public void postIncrement(){
    int x=10,y=10;
    System.out.println("POST INCREMENT");
    System.out.println(x); //10
    System.out.println(y); //10
    
    int a=x++; //(a=x, x=x+1); 
	int b=y++; //b=y, y=y+1);
    System.out.println(a); //10
	System.out.println(b);//10
	System.out.println(x); //11
    System.out.println(y); //11
    
    int c=x++; //(c=x; x=x+1);
    int d=y++; //(d=y; y=y+1);
    System.out.println(c); //11
    System.out.println(d); //11
	System.out.println(x);//12
	System.out.println(y); //12
    
  }
  public void preIncrement(){
	int x=10,y=10;
    System.out.println("PRE INCREMENT");
    System.out.println(x); //10
    System.out.println(y); //10
    
    int a=++x; //(a=x+1; x=x+1);
	int b=++y; //(b=y+1; y=y+1);
    System.out.println(a); //11
    System.out.println(b); //11
	System.out.println(x); //11
    System.out.println(y); //11
    
    int c=++x; //(c=x+1; x=x+1);
    int d=++y; //(d=y+1; y=y+1);
    System.out.println(c); //12
    System.out.println(d); //12
	System.out.println(x); //12
    System.out.println(y); //12
    
  }
  public void postDecrement(){
	int x=10,y=10;
    System.out.println("POST DECREMENT");
    System.out.println(x); //10
    System.out.println(y); //10
    
    int a=x--; //(a=x; x=x-1);
	int b=y--; //(b=y; y=y-1);
	System.out.println(a); //10
	System.out.println(b); //10
    System.out.println(x); //9
	System.out.println(y);//9
	
    
    int c=x--; //(c=x; x=x-1);
    int d=y--; //(d=y; y=y-1);
    System.out.println(c); //9
    System.out.println(d); //9
    System.out.println(x); //8
    System.out.println(y); //8

  }
  public void preDecrement(){
	int x=10,y=10;
    System.out.println("PRE DECREMENT");
    System.out.println(x); //10
    System.out.println(y); //10
    
    int a=--x; //(a=x-1; x=x-1);
	int b=--y; //(b=y-1; y=y-1);
	System.out.println(a); //9 
	System.out.println(b);//9
    System.out.println(x); //9 
    System.out.println(y); //9

	int e=--x; //(e=x-1; x=x-1);
    int f=--y; //(f=y-1; y=y-1);
    System.out.println(e); //8
    System.out.println(f); //8
	System.out.println(x); //8
    System.out.println(y); //8
    
  }
  public static void main(String[] args) {
	IncrementAndDecrement id = new IncrementAndDecrement();
	id.postIncrement();
	id.preIncrement();
	id.postDecrement();
	id.preDecrement();
  }
}