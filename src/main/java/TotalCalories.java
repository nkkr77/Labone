import java.util.Scanner;

public class TotalCalories

{

	public static void main(String[] args) 

	{

		Scanner keyboard = new Scanner(System.in);

                //cookies and Calories
		double noofcookiesEaten, calories;

		System.out.println("Enter Number of Cookies Eaten: ");

		noofcookiesEaten = keyboard.nextDouble();

		calories = noofcookiesEaten * 30;

		System.out.println("Total Number of Calories Consumed: " + calories);

        }

}