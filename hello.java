import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hello {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        // String test=read.readLine();
        // char[] a={'t','e','s'};
        // a[2]='q';
        // int i = Integer.parseInt(rd.readLine());
        int k = 9;
        if (k > 10) {
            throw new ArithmeticException();
        }
        System.out.println("worked");
    }
}