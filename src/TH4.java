import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0 ){
            System.out.println("Menu");
            System.out.println("1.vẽ tam giac");
            System.out.println("2.vẽ hình vuông ");
            System.out.println("3.vẽ hình chữ nhật ");
            System.out.println("0.nut thoat");
            System.out.println("nhập lựa chọn đi :");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("vẽ hình tam giac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Vẽ hình vuông ");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3 :
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0 :
                    System.exit( 0);
                default:
                    System.out.println("Không có kqua ");
            }
        }
    }
}
