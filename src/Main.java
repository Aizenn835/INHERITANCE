  import javax.xml.transform.Source;
  import java.util.Scanner;
 public class Main{
          public static void main(String[] args){
               Scanner scanner = new Scanner(System.in);

              System.out.print("Enter numbers of bill to calculate: ");
              int n = scanner.nextInt();
               scanner.nextLine();
                  Source_bill[] source = new Source_bill[n];

                  for(int i = 0; i < n; i++){

                      System.out.print("Enter what bill to calculate: ");
                      String bill_calcu = scanner.nextLine().trim().toLowerCase();

                      System.out.print("Please enter your full name: ");
                      String name = scanner.nextLine();

                      System.out.print("Enter bill ID: ");
                      int bill_id = scanner.nextInt();

                       scanner.nextLine();

                      if(bill_calcu.equals("electrical bill")){
                          System.out.print("Enter electricty usage: ");
                          Double kwh_used = scanner.nextDouble();
                          source[i] = new electric_bill(bill_id , name , kwh_used);
                      }
                      else if (bill_calcu.equals("employee paybill")){
                          System.out.print("Enter hourly rate: ");
                          int hourly_rate = scanner.nextInt();
                          System.out.print("Enter hours worked: ");
                          int hours_worked = scanner.nextInt();

                          source[i] = new hours_worked(name , bill_id , hourly_rate , hours_worked );
                      }else{
                          System.out.println("Invalid choice pls try again:");
                          i--;
                      }
                  }
                   for(Source_bill Source : source){
                       Source.DisplayInfo();
                   }
          }
 }