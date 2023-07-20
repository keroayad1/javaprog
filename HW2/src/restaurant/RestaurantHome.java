package restaurant;

public class RestaurantHome {
    public static void main(String[]args)
    {
        Staff emp1=new Staff();
        Staff emp2=new Staff();
        Staff emp3=new Staff();
        Staff emp4=new Staff();

      emp1.init();
      emp2.init();
      emp3.init();
      emp4.init();;

        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.Address);
        System.out.println(emp1.phone);
        System.out.println(emp1.Gender);
        System.out.println(emp1.isSmoker);



    }
}
