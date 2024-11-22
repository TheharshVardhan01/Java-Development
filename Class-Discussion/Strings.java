

public class Strings {
    public static void main(String[] args) {
        String yname = "Harsh";
        System.out.println(yname.toUpperCase());
        System.out.println(yname.toLowerCase());

        String nonTrimmedString = "   harsh   ";
        System.out.println(nonTrimmedString.trim());
        System.out.println(nonTrimmedString);
        System.out.println(yname.substring(1,3));
        System.out.println(yname.replace('s','h'));
        System.out.println(yname.replace("ha","rsH"));
        System.out.println(yname.charAt(0));
    }
    
}
