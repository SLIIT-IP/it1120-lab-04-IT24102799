import java.util.Scanner;
public class IT24102799Lab4Q3 {
    public static void main (String [] args ) {
       Scanner scanner = new Scanner (System.in);

       System.out.print("Enter a number :");
       double number = scanner.nextDouble();

       String result = (number > 0) ? "Positive" : (number < 0)?"Negative" : "Zero" ;
       
       System.out.println("This number is "+ result);
       scanner.close();
    }
}
