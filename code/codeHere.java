import java.util.Scanner;

public class codeHere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int fav = InputHelper.getInt(scan, "Input your favorite integer.");
      double favorite = InputHelper.getDouble(scan, "Input your favorite double.");
        System.out.println("Your favorite int is " + fav + " and your favorite double is " + favorite);
    }
}