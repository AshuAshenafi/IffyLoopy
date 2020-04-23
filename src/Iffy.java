import java.util.Scanner;

public class Iffy {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean redEyes;
        String input;

        System.out.print("Are your eyes red? ");
        input = keyboard.nextLine();

        redEyes = (input.equalsIgnoreCase("y")) || input.equalsIgnoreCase("yes");

        if(redEyes){
            System.out.println("Get some sleep!");
        }
        else{
            System.out.println("You look great!");
        }
        keyboard.close();
    }
}
