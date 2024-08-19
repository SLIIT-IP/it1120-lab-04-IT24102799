import java.util.Scanner;

public class IT24102799Lab4Q2 {
    public static void main(String [] args ) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Please enter exam marks : ");
        double exammarks = scanner.nextDouble ();
        if (exammarks > 100 || exammarks < 0 ) {
           System.out.println("Invalid input for exam marks . Terminating program."); return ;
        }

        System.out.print("Please enter lab submission marks : ");
        double labmarks = scanner.nextDouble ();
        if (labmarks > 100 || labmarks < 0) {
           System.out.println("Invalid input for lab submission marks . Terminating program ."); return ;
       }

        System.out.print("Please enter the percentage given for the exam : ");
        double examper = scanner.nextDouble ();

        System.out.print("please enter the percentage given for the lab submission : ");
        double labper = scanner.nextDouble ();

        if ( examper + labper != 100 ) {
           System.out.println("Invalid input for exam marks. Terminating program. "); return ;
        }

        double finalmark =( exammarks * examper / 100 ) + (labmarks * labper /100 );
        System.out.println ( " Final Exam Mark is :" + finalmark );
        scanner.close();
   }
}