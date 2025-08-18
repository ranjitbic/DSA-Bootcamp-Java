
import java.util.Arrays;

public class ChangeValue{
    public int Hello(int arr[]){
        return arr[0]=10;

    }
    public static void main(String args[]){
        int mainArr []={1,2,3,4,5,6};
        ChangeValue hc=new ChangeValue();
        hc.Hello(mainArr);
        System.out.println(Arrays.toString(mainArr));
    }
}