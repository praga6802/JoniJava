public class TypeCastingAll{
public static void main(String[] args){
byte a=65;
short b=97;
int c=70;
long d=40l;
float e=120.5f;
double f=97.456;
char g='a';
//Explicit type conversion
//byte
System.out.println("Explicit Type Conversion:");
System.out.println("Byte:");
byte h=(byte)b;
System.out.println("short to byte:"+h);
byte i=(byte)c;
System.out.println("int to byte:"+i);
byte j=(byte)d;
System.out.println("long to byte:"+j);
byte k=(byte)e;
System.out.println("float to byte:"+k);
byte l=(byte)f;
System.out.println("double to byte:"+l);
byte m=(byte)g;
System.out.println("char to byte:"+m);
//short
System.out.println("Short:");
short n=(short)c;
System.out.println("int to short:"+n);
short o=(short)d;
System.out.println("long to short:"+o);
short p=(short)e;
System.out.println("float to short:"+p);
short q=(short)f;
System.out.println("double to short:"+q);
short r=(short)g;
System.out.println("char to short:"+r);
//int
System.out.println("Int:");
int s=(int)d;
System.out.println("long to int:"+s);
int t=(int)e;
System.out.println("float to int:"+t);
int u=(int)f;
System.out.println("double to int:"+u);
//long
System.out.println("Long:");
long w=(long)e;
System.out.println("float to long:"+w);
long x=(long)f;
System.out.println("double to long:"+x);
//float
System.out.println("Float:");
float y=(float)f;
System.out.println("double to float:"+y);
//char
System.out.println("Char:");
char ak=(char)a;
System.out.println("byte to char:"+ak);
char al=(char)b;
System.out.println("short to char:"+al);
char z=(char)c;
System.out.println("int to char:"+z);
char aa=(char)d;
System.out.println("long to char:"+aa);
char ab=(char)e;
System.out.println("float to char:"+ab);
char ac=(char)f;
System.out.println("double to char:"+ac);
//Implicit type conversion
System.out.println("---------------------------------");
System.out.println("Implicit Type Conversion:");
System.out.println("Short:");
short ad=a;
System.out.println("byte to short:"+ad);
System.out.println("Int:");
int ae=a;
System.out.println("byte to int:"+ae);
int af=b;
System.out.println("short to int:"+af);
int ag=g;
System.out.println("char to int:"+ag);
System.out.println("Long:");
long ah=a;
System.out.println("byte to long:"+ah);
long ai=b;
System.out.println("short to long:"+ai);
long aj=c;
System.out.println("int to long:"+aj);
long ax=g;
System.out.println("char to long:"+ax);
System.out.println("Float:");
float am=a;
System.out.println("byte to float:"+am);
float an=b;
System.out.println("short to float:"+an);
float ao=c;
System.out.println("int to float:"+ao);
float ap=d;
System.out.println("long to float:"+ap);
float aq=g;
System.out.println("char to float:"+aq);
System.out.println("Double:");
double ar=a;
System.out.println("byte to double:"+ar);
double as=b;
System.out.println("short to double:"+as);
double at=c;
System.out.println("int to double:"+at);
double au=d;
System.out.println("long to double:"+au);
double av=g;
System.out.println("char to double:"+av);
double aw=e;
System.out.println("float to double:"+aw);
}
}
