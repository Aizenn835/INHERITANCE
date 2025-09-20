public class hours_worked extends Source_bill {
      private double hourly_rate , Hours_work;

      public hours_worked(String name , int id , double hourly_rate , double Hours_work){
            super(name , id );
            this.hourly_rate = hourly_rate;
            this.Hours_work = Hours_work;
      }
       public void DisplayInfo(){
               Double salary;
                 if(Hours_work >= 40){
                      salary = (40 * hourly_rate) + ((Hours_work - 40 ) * hourly_rate * 1.5);
                 }
                  else{
                      salary = hourly_rate * Hours_work;
                 }
                 super.DisplayInfo();
                 System.out.print("Total salary: " + salary);
       }
}