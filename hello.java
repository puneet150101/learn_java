import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class test
{
    int a,b;
    test(int a, int b)
    {
        this.a=a;
        this.b=b;
        System.out.print("Value a:"+a+"\n"+"Value b:"+b);
    }
    public int sum()
    {
        return a+b;
    }
}
public class hello {
    public static void main(String[] args)  throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        test a= new test(2,3);
        int n = a.sum();
        System.out.println("\nworked:"+n);
    }
}