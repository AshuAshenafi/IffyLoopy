import java.util.Scanner;

public class Loopy {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String str = "";
        String temp;

        for(int i = 0; i < 5; i++){

            System.out.printf("Enter (%d/5): ", (i+1));
            temp = str;
            str = temp + " " + keyboard.nextLine();
        }
        System.out.println(str);
        keyboard.close();
    }
}
