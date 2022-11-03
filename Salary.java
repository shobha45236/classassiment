	package javaproject;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emp_id,salary,net_salary,it,pf;
		String emp_name;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter emp id ");
		emp_id =sc.nextInt();
		
		
		
		System.out.println("enter emp_name : ");
		emp_name=sc.next();
		
		System.out.println("enter salary  : ");
		salary=sc.nextInt();
		System.out.println("enter income tax  : ");
		it=sc.nextInt();
		System.out.println("enter  pf  : ");
		pf=sc.nextInt();
		
		it=it*(salary/100);
		pf=pf*(salary/100);
		net_salary=salary-it-pf;
		System.out.println("emp_id: "+emp_id);
		System.out.println("emp_name: "+emp_name);
		System.out.println("net_salary: "+ net_salary);
		
		
		
		
		
	}

}
