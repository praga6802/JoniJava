public class TypeConversion{
public static void main(String[] args){
byte b=10;
short s=b;
System.out.println("Byte to short:"+s);
int i=10;
float f=i;
System.out.println("int to float:"+f);
double d=f;
System.out.println("float to double:"+d);
char ch='a';
int a=ch;
System.out.println("char to int:"+a);
/*double e=12.0; possibly lossy conversion: from double to float
float g=e;
System.out.println(g);*/
long l=23L;
float h=l;
System.out.println("long to float:"+h);
int j=23;
float m=j;
System.out.println("int to float:"+m);
}
}
