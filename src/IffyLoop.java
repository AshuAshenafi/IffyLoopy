import java.util.Scanner;

public class IffyLoop {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean redEyes = true;
        String input;


        while(redEyes == true){
            System.out.print("\nAre your eyes red? ");
            input = keyboard.nextLine();

            redEyes = (input.equalsIgnoreCase("y")) || input.equalsIgnoreCase("yes");

                if(redEyes){
                    System.out.println("Get some sleep!");
                }
                else{
                    System.out.println("You look great!");
                }

            System.out.print("\n[Press n to EXIT.]\n Do you want to try again? ");

            input = keyboard.nextLine();
            redEyes = !(input.equalsIgnoreCase("n"));

        }
    }
}
