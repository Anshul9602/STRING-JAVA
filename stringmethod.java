import java.util.Locale;
import java.util.Scanner;

public class stringmethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        //String st1 = sc.next();
        // System.out.println(st);
        int value1 = st.length();
        String value2 = st.toUpperCase();
        String value3 = st.toLowerCase();
        String value4 = st.trim();
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
    }
}

