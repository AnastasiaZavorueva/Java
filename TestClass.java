package mypackage;

import java.util.Locale;

//String methods
public class TestClass {
    public static void main(String[] args) {

        String s = "Hello, World!";
        String s2 = "hEllO, wORlD!";
//comparison
        System.out.println(s.equals("Hello, World!"));
        System.out.println(s.equals("Hello!"));
        System.out.println(s.equals(s2));
//comparison with ignoring case
        System.out.println(s.equalsIgnoreCase(s2));
//case reduction
        String s3 = "tExT";
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
        //search by symbol
        System.out.println(s3.charAt(1));
        //find out the index
        System.out.println(s3.indexOf("xT"));
        //does the string contains smth
        System.out.println(s3.contains("Ex"));
        //length of the string
        System.out.println(s3.length());
//the start and the end of the string
        System.out.println(s3.startsWith("t"));
        System.out.println(s3.endsWith("T"));
//split the string
        s = "hello, world";
        String[] array = s.split(",");
        System.out.println(array[0] + array[1]);

        //format the string
        String str = "My name is %s! I'm %d years old";
        int age = 42;
        String name = "Nasty";

        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Tonya", 23));

//method of the int class to convert string into int
        String age2 = "42";
        int a = Integer.parseInt(age2);
        System.out.println(a* 3);

        //to get a part of the string
        s = "Hello, world";
        System.out.println(s.substring(1, 5));

        //concatenation of strings
        String a4 = "Hello";
        String a5 = "world";
        String a6 = "!";
        String res;

        res = a4 + a5 + a6;
        System.out.println(res);

        res = a4.concat((a5).concat(a6));
        System.out.println(res);




    }
}