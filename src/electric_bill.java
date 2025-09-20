public class electric_bill extends Source_bill{
     private final Double kwh_used;

        public electric_bill(int id , String name , Double kwh_used){
             super(name , id );
             this.kwh_used  = kwh_used;
         }
         public void DisplayInfo(){
             Double rate = 10.0 , extra_charge = 2.0 , bill;
               if(kwh_used >= 500){
                    bill = (500 * rate) + ((kwh_used - 500) * (rate + extra_charge ));
               }else{
                    bill = kwh_used * rate;
               }
             super.DisplayInfo();
             System.out.println("Total electricty bill: " + "PHP " + bill);
         }
}
