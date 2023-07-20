import java.util.Scanner;

public class Vision {




    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        switch (number)
        {
            case 100:
                System.out.println("A");
                break;
            case 90:
                                 System.out.println("B");
                break;
            case 80:
                System.out.println("c");
                break;
            case 70:
                System.out.println("d");
                break;
            default:
                System.out.println("D");
                break;
        }

    }

}

