public class Source_bill {
    protected String user_name;
    protected  int id;

        public Source_bill(String user_name , int id){
             this.user_name = user_name;
             this.id = id;
        }
        public void DisplayInfo(){
            System.out.println("Name: " + user_name);
            System.out.println("ID: " + id);

        }
}
