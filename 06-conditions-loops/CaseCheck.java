import java.util.Scanner;
public class CaseCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a chatrachter:-");
        char ch=sc.next().trim().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("Lowercase Character");
        }
        else if(ch>='A'&& ch<='Z'){
            System.out.println("Uppercase Character");
        }
        else{
            System.out.println("Invalid Character");
        }
    }    
}
