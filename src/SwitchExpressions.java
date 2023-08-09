public class SwitchExpressions{
    public static void main(String[] args) {
        String day = "WEDNESDAY"; 
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY", "THURSDAY", "SATURDAY" -> 7;
            case "WEDNESDAY" -> 9;
            default -> 0; 
        };
        System.out.println("Number of letters: " + numLetters);
    }
}
