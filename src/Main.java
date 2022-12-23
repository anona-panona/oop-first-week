import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                        Hello! My name is AssistantBot
                        I was created in 2020.
                        Please, remind me your name.
                """);

        String username = sc.nextLine();

        System.out.println("What a great name you have, " + username + "!");

        System.out.println("""
                       Let me guess your age
                       Say me remainders of dividing your age by 3, 5 and 7
                """);

        int rem3 = sc.nextInt();
        int rem5 = sc.nextInt();
        int rem7 = sc.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming! \n Now I will prove to you that I can count to any number you want.");

        int number = sc.nextInt();

        for (int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }

        System.out.println("""
                Let's test your programming knowledge.
                 Why do we use methods?
                 1. To repeat a statement multiple times.
                 2. To decompose a program into several small subroutines.
                 3. To determine the execution time of a program.
                 4. To interrupt the execution of a program.
                                
                """);

        int ans = sc.nextInt();

        if (ans == 2){
            System.out.println("Congratulations, have a nice day!");
        } else {
            System.out.println("lox");
        }
    }
}