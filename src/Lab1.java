import java.util.Scanner;
public class Lab1 {

		public static void main(String[] args) {
			int date = 2015;
			int age= 0;
			Scanner Input = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = Input.nextLine();
			System.out.println("What is your birth year?");
			int Birthyear = Input.nextInt();
		age = date-Birthyear;
		System.out.printf("Hello, %s, you're age is %d", name, age);

	}

}
