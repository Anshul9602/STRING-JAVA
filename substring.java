
import java.util.Scanner;

public class substring {
    public static void main(String[] args){
        //input the string..
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        // substring( int start)..
        System.out.println(st.substring(2));
        //substring(int start,int end)....
        System.out.println(st.substring(1,3));

    }
}
