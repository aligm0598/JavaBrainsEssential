import java.util.Scanner;
public class SwitchExpressions{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please input a week day: ");
        String day = in.nextLine();
        in.close();
        
        int numLetters = switch (day) {
            case "SUNDAY" -> 0;
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            case "WEDNESDAY" -> 3;
            case "THURSDAY" -> 4;
            case "FRIDAY" -> 5;
            case "SATURDAY" -> 6;
            default -> -1; 
        };
        System.out.println(day + " Number of letters: " + numLetters);
    }
}
