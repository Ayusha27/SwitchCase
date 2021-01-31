package Task;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int choice;
    System.out.println("pick one : i. hi\t2. hey\t3. hello\t");
    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();
    switch(choice)
    {
    case 1 : System.out.println("You said hi");
    break;
    case 2 : System.out.println("You said hey");
    break;
    case 3 : System.out.println("You said hello");
    break;
    default : System.out.println("invalid choice");
    
    

    
    }
	}

}
