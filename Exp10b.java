import java.util.*;
import java.io.*; 
final class SI 
{ 
 	final double roi=10;  	
            int t,p; 
 	double s; 
 	final void si() 
 	{ 
 	 	Scanner sc = new Scanner(System.in);  	 	System.out.print("Enter principal amount: ");  	 	p=sc.nextInt(); 
 	 	System.out.print("Enter time: "); 
	 	t=sc.nextInt(); 
 	 	s=(p*roi*t)/100; 
 	 	System.out.println("Simple Interest = "+s); 
 	} 
} 
 
final class CI 
{ 
 	final double ro=7;  	int t1,p1;  	double c; 
 	final void ci()  	{ 
 	 	Scanner sc = new Scanner(System.in);  	 	System.out.print("Enter principal amount: ");  	 	p1=sc.nextInt(); 
 	 	System.out.print("Enter time: "); 
 	 	t1=sc.nextInt(); 
 	 	c=p1*(Math.pow(1+(ro/100),t1)); 
 	 	System.out.println("Compound Interest = "+c); 
 	} 
} 
 
class Exp10b { 
 
    public static void main(String[] args) { 
        SI s1 = new SI(); 
 	CI c1 = new CI();  	s1.si(); 
 	c1.ci(); 
    } 
} 
