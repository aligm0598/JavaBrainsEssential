public class ForEach {
    public static void main(String[] args) {
        int someNumbers[] = { 25, 42, 36, 75, 91 };
        int total = 0;
        for (var element : someNumbers)
            total = total + element;

        System.out.println("Total: " + total);
    }
}