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
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)); // decaring bufferedreader object
        List<Integer> data = new ArrayList<Integer>(); // new integer list
        System.out.print("Enter the data:");
        Arrays.asList(rd.readLine().split(" ")).forEach(i->data.add(Integer.parseInt(i))); // taking input
        data.stream().filter(i->i%5==0).forEach(System.out::println); //using stream and filter interface to filter all divisibe by 5 numbers and printing using foreach and function reference passing
    }
}