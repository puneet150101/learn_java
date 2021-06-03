import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class test {
    int a, b;

    test(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.print("Value a:" + a + "\n" + "Value b:" + b);
    }

    public int sum() {
        return a + b;
    }
}

public class hello {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList();
        for (String i : rd.readLine().split(" "))
            al.add(Integer.parseInt(i));
        for (Integer i : al)
            System.out.println(i);
    }
}