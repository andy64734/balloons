import java.util.Scanner;
public class InputTest{
    public static void main(String[] args) {
        Scanner theScan = new Scanner(System.in);
        int x = theScan.nextInt();
        String line = theScan.nextLine();
        System.out.println("Int is "+x);
        System.out.println("Line is "+line);
    }
}