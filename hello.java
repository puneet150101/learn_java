import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class test  {
    int age;
    String name;

    test(String name, int age) {
        this.name = name;
        this.age = age;
    }
    test(String name)
    {
        this.name=name;
        this.age=25;
    }
    test()
    {
        this.name=new String("default");
        this.age=25;
    }
    public String toString() {
        return "Name:" + this.name + " Age:" + this.age;
    }
}
class sortbyname implements Comparator<test>
{
    public int compare(test a,test b)
    {
        return a.name.compareTo(b.name);
    }
}
public class hello {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of entries:");
        int n = Integer.parseInt(rd.readLine());
        ArrayList<test> data = new ArrayList<test>();
        while (n-- > 0) {
            System.out.print("Enter name and age:");
            String[] tmp = rd.readLine().split(" ");
            try{
                data.add(new test(tmp[0], Integer.parseInt(tmp[1])));
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                if(tmp[0].length()>0)
                {
                    
                    data.add(new test(tmp[0]));
                }
                else 
                {
                    data.add(new test());
                }
            }
        }
        Collections.sort(data,new sortbyname());
        for (test i : data)
            System.out.println(i.toString());
    }
}