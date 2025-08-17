import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        while(number>0){
            int reverse=number%10;
            System.out.print(reverse);
            number=number/10;
        }
    }
}
