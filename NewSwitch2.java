public class NewSwitch2{
	public static void main(String[] args){
	int day=1;
	String result="";
	switch(day){
	case 1->result="Mon";
	case 2->result="Tue";
	case 3->result="Wed";
	case 4->result="Thur";
	case 5->result="Fri";
	case 6->result="Sat";
	case 7->result="Sun";
	default->result="Invalid";
	}
	System.out.println("Result= "+result);
}
}