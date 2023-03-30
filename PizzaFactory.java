package Pizzafactory;

import java.util.ArrayList;
import java.util.Scanner;




public class PizzaFactory {
public void addpizza()
{
	Scanner sc=new Scanner(System.in);
	ArrayList al=new ArrayList();
Pizza p;
System.out.println("enter pizza name");
String pizza=sc.next();
System.out.println("enter price ");
double price=sc.nextDouble();
System.out.println("enter size");
int  size=sc.nextInt();
System.out.println("enter crusttype");
String crusttype=sc.next();
System.out.println("enter size of array");
String [] topping=new String [sc.nextInt()];
for(int i=0;i<topping.length;i++)
{
	System.out.println("enter crust name");
	topping[i]=sc.next();
}

p=new Pizza(pizza,price,size,crusttype, topping);
al.add(p);
System.out.println("data add successfull");
}
}