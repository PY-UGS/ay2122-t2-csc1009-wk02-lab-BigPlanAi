import java.util.Scanner;

public class Q2_average{

  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three numbers (x y z): ");
      String user_input  = input.nextLine();
      
      String[] space_no = user_input.trim().split("\\s+");
      String[] three_No = new String[3];
      if (space_no.length < 3){
        three_No[0] = space_no[0];
        three_No[1] = input.nextLine();
        three_No[2] = input.nextLine();
      }
      else{
        three_No = space_no;
      }
      float avg = 0;


      for (int i = 0 ; i< 3; i++){
        avg += Float.parseFloat(three_No[i]);

      }

      avg /= 3.0 ;

      System.out.printf("The average for %s %s %s is %f", three_No[0],three_No[1],three_No[2], avg);
  }
}