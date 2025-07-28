public class ReverseString {
    public static void main(String[] args) {
        String original = "DevOps";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}


