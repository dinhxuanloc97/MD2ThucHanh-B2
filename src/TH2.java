import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1 ;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi");
        money = input.nextDouble();
        System.out.println("Nhập số tháng muốn gửi");
        month = input.nextInt();
        System.out.println("Nhập số lãi %");
        interestRate = input.nextDouble();
        double tongLai = 0;
        for (int i= 0 ; i < month ; i++){
            tongLai += money *(interestRate/100)/12*month;
        }
        System.out.println("số tiền lãi là "+ tongLai);
    }
}
