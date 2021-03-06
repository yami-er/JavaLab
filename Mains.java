import java.util.Scanner;
import java.util.Random;

public class Mains {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner userInput = new Scanner(System.in);
        System.out.print("please enter your name: ");
        String name = userInput.nextLine().toLowerCase();
        System.out.print("hello " + name + "! ");
        System.out.print("Would you like to continue? please enter yes or y: ");
        String play = userInput.nextLine().toLowerCase();
        if (play.equals("y") || play.equals("yes")) {
            String ans = "NO";
            do {
                while (true) {
                    System.out.print("Do you have a red car? yes or no? ");
                    String car = userInput.nextLine().toLowerCase();
                    if (car.equals("yes") || car.equals("no")) {
                        break;
                    } else {
                        System.out.print("Please provide a correct input");
                    }
                }
                int age = 0; 
                while(true){
                    System.out.print("What is your pet's age: ");
                    age = Integer.parseInt(userInput.nextLine());
                    if (age < 30 && age > 0) {
                        break;
                    } else {
                        System.out.print("Please provide a correct input");
                    }
                }

                System.out.print("What is your pet's name? ");
                String petN = userInput.nextLine().toLowerCase();
                System.out.print("What is your lucky number? ");
                int lucky = Integer.parseInt(userInput.nextLine());
                String quarter = " ";
                while(true){
                    System.out.print("Do you have a favorate quarter back? ");
                    quarter = userInput.nextLine().toLowerCase();
                    if (quarter.equals("yes") || quarter.equals("no")) {
                        break;
                    } else {
                        System.out.print("Please provide a correct input");
                    }
                }
                int quarterNumber = 0;
                if (quarter.equals("yes")) {
                    System.out.print("What is his number? ");
                    quarterNumber = Integer.parseInt(userInput.nextLine());
                }
                System.out.print("What is the two digit model of your car? ");
                int model = Integer.parseInt(userInput.nextLine());
                System.out.print("What is the first name of your favorite actor or actress? ");
                String actor = userInput.nextLine().toLowerCase();
                int rnd = 0;
                while(true){
                    System.out.print("Please enter any random number between 1 and 50: ");
                    rnd = Integer.parseInt(userInput.nextLine());
                    if ((rnd < 50) || (rnd > 0)) {
                        break;
                    } else {
                        System.out.print("Please provide a correct input");
                    }
                }
                Random rand = new Random();

                // Generate random integers in range 0 to 999
                int rand_int1 = rand.nextInt(rnd);
                int rand_int2 = rand.nextInt(rnd);
                int rand_int3 = rand.nextInt(rnd);
                int magicBall = rand_int1 * lucky;
                while (magicBall > 75) {
                    magicBall -= 75;
                }
                // System.out.println("magicBall number is " + magicBall ) ;

                // Use the random number between 1 and 50, subtracting one of the generated
                // random numbers.
                int x = rnd - (rand_int1);
                while (x > 65) {
                    x -= 65;
                }
                // System.out.println("random number is " + x ) ;

                // Use the two digit model year of their car and add their lucky number to it.
                int y = model + lucky;
                while (y > 65) {
                    y -= 65;
                }
                // System.out.println("The two digit number " + y ) ;
                // Favorite quarterback number + age of pet + lucky number.
                int z = quarterNumber + age + lucky;
                while (z > 65) {
                    z -= 65;
                }
                // Use the value 42.
                // int s = 42;
                // Use the age of their favorite pet + their car model year.
                int k = age + model;
                while (k > 65) {
                    k -= 65;
                }
                // System.out.println("Age of pet is " + k ) ;
                // Find the 3rd letter of their favorite pet. Convert that character value to an
                // integer value.
                char ch = actor.toCharArray()[0];
                int num = ch;
                while (num > 65) {
                    num -= 65;
                }
                // System.out.println("ASCII value of char "+ch+ " is: "+num);
                // Convert the first letter of their favorite actor/actress to an integer and
                // use that value
                char petName = petN.toCharArray()[2];
                int numb = ch;
                while (numb > 65) {
                    numb -= 65;
                }
                // System.out.println("ASCII value of char "+petName+ " is: "+numb);
                System.out.println(magicBall + "," + x + "," + y + "," + z + "," + k + "," + num + "," + numb);

                System.out.println("Would you like to play again? ");
                ans = userInput.nextLine().toLowerCase();
            } while (ans.equals("yes"));
            System.out.print("Thank you for playing");

        }

        else {
            System.out.print("Please come back later to continue the survey");
        }
    }

}
