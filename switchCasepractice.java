package FirstCode;

import java.util.Scanner;

public class switchCasepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
			Scanner sc = new Scanner(System.in);
				int marks  = sc.nextInt();
				
				switch (marks) {
				case 90 :
					System.out.println("grade a ");
					break;
				case 80:
					System.out.println("grade b");
					break;
				case 70:
					System.out.println("grade c");
					break;
                default:
                	System.out.println("marks<70");
                	break;
			}

		}


	}


