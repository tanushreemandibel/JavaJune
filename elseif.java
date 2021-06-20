package FirstCode;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks  = sc.nextInt();
		if (marks <=80)
		{
			System.out.println("grade a ");
			
		}else if  (marks <80 && marks >=60)
		{
			System.out.println("grade b");
			
		}else {
			System.out.println("grade c");
		}
		
		

	}

}
