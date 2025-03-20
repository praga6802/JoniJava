public class NewSwitch3{ //switch Expression
	public static void main(String[] args){
	int day=1;
	String result=switch(day){
	case 1->"Mon";
	case 2->"Tue";
	case 3->"Wed";
	case 4->"Thur";
	case 5->"Fri";
	case 6->"Sat";
	case 7->"Sun";
	default->"Invalid";
	};
	System.out.println("Result= "+result);
}
}