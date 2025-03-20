public class ReturnKeyword{
public int sum(){
	int m1=75;
	int m2=80;	
	int total=m1+m2;
	return total;
}

//or 
//public void sum1(int a,int b){
	// return a+b;
}

public void avg(){
	int total=sum();
	float avg=total/2;
	System.out.println("Average in avg method:"+avg);
}

public static void main(String[] args){
	ReturnKeyword r= new ReturnKeyword();
	int total=r.sum();
	//int total=r.sum1(75,80);
	int avg=total/2;
	System.out.println("Average in main method:"+avg);
	r.avg();
}
}