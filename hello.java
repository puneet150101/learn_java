import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class test {
    int age;
    String name;

    test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    test(String name) {
        this.name = name;
        this.age = 25;
    }

    test() {
        this.name = new String("default");
        this.age = 25;
    }

    public String toString() {
        return "Name:" + this.name + " Age:" + this.age;
    }
}

class sortbyname implements Comparator<test> {
    public int compare(test a, test b) {
        return a.name.compareTo(b.name);
    }
}

interface work {
    public void test(int i, String b);
}

public class hello {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));   //decaring bufferedreader object 
        work obj = (i, j) -> System.out.println("testing " + i + j);    //using lambda function with a functional interface
        obj.test(2, " worked");                                 //calling interface object method
        System.out.print("Enter the number of entries:");   
        int n = Integer.parseInt(rd.readLine());                //taking input with the help of buffered reader
        ArrayList<test> data = new ArrayList<test>();           //declaring array list of object test
        while (n-- > 0) {   
            System.out.print("Enter name and age:");
            String[] tmp = rd.readLine().split(" ");            // taking input and breaking into strings
            try {                                               //try and catch method for arrayoutofbounds exception
                data.add(new test(tmp[0], Integer.parseInt(tmp[1])));   
            } catch (ArrayIndexOutOfBoundsException e) {    
                if (tmp[0].length() > 0) {                          // custom call for exception

                    data.add(new test(tmp[0]));
                } else {
                    data.add(new test());
                }
            }
        }
        Collections.sort(data, new sortbyname());                   //custom sort with the help of comaprator class
        for (test i : data)                                         //for each loop to print data
            System.out.println(i.toString());
    }
}