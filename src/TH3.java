import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập số a vào :");
        a = sr.nextInt();
        System.out.println("Nhập số b vào :");
        b = sr.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Không có số chung lớn nhất ");
        }
        while (a != b){
            if (a >b ){
                a = a -b ;
                System.out.println("a= "+a);
            }else {
                b = b+a;
                System.out.println("b = " + b );
            }
        }
        System.out.println("Số chung lớn nhất "+ a );
    }
}
