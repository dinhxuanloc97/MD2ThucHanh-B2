import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào số :");
        int so = sr.nextInt();
        if (so <2 ){
            System.out.println(so + "khong phải so nguyen to");
        }else {
            int i = 2;
            boolean check = true ;
            while (i < so  ){
                if (so % 1 == 0  ){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(so + "la so thuc ");
            else
                System.out.println(so + "khong phai nguyên  tố ");
        }
    }
}
