import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hello {
    public static void main(String[] args) throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        System.out.println("worked:"+n);
    }
}