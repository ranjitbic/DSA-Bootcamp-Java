
public class Loops {
    public static void main(String args[]){
        // print 1 to 10 number using each loop 

        System.out.println("For Loop");
        for(int i=1;i<=10;i++){
            System.out.print(i);
        }
        System.out.println();
        System.out.println("While Loop");
        int i=1;
        while(i<=10){
            System.out.print(i);
            i++;
        }
        System.out.println();
        System.out.println("Do While Loop");
        int j=1;
        do { 
            System.out.print(j);
            j++;
        } while (j<=10);


    }
}
