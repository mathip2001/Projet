import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);

    public String getUserChoice() {
        try {
            return scanner.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error";
        }
    }

    public int getIndexValue(int arraySize) {
        String choice;
        while (true) {
            choice = getUserChoice();
            if (isValid(choice, 0, arraySize - 1)) {
                break;
            }
            System.out.println("Please enter a valid number");
        }
        return Integer.parseInt(choice);
    }


    private boolean isValid(String input, int i, int j) {
        try {
            return i <= Integer.parseInt(input) && Integer.parseInt(input) <= j;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


}
