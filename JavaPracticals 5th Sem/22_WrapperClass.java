import java.util.*;
class Wrapper1
{
public static void main(String ar[])
{
int i=50;
char c='a';
Integer iobj=i; //autoboxing

Character cobj=c; //autoboxing
System.out.println("Integer object "+iobj);
System.out.println("Character object "+cobj);
int ivalue=iobj; //unboxing
char cvalue=cobj;
System.out.println("Int Value "+ivalue);
System.out.println("Char Value "+cvalue);
}
}