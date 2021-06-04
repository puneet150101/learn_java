import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class test implements Comparable<test> {
    int age;
    String name;

    test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(test a) {
        return this.name.compareTo(a.name);
    }

    public String toString() {
        return "Name:" + this.name + " Age:" + this.age;
    }
}

public class hello {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of entries:");
        int n = Integer.parseInt(rd.readLine());
        ArrayList<test> data = new ArrayList<test>();
        while (n-- > 0) {
            System.out.print("Enter name and age:");
            String[] tmp = rd.readLine().split(" ");
            data.add(new test(tmp[0], Integer.parseInt(tmp[1])));
        }
        Collections.sort(data);
        for (test i : data)
            System.out.println(i.toString());
    }
}