package $0TrialAndError;


import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static int id;
    public static String breed;

    public static void test2(){

    }

    public String name;
    public String color;
    public int age;

    public static double PI = 3.14;

    public Test(String name, String col){
        this.name = name;
        color = col;
    }

    public Test(){
        this("name","color");
    }

    public Test(String name, String color, int age){
        this(name,color);
        this.age = age;
    }

    public void setInfo(String name){
        System.out.println(name);
    }


    public static void main(String[] args) {

        String color;



        for (int i = 0; i < 2; i++) {
            color = "";
        }

        color = "";


        ArrayList<String> list = new ArrayList<>();
        String[] arr = new String[2];


        list.addAll(Arrays.asList("1","2","3","1","2","3","1","2","3"));

        ArrayList<String> list2 = new ArrayList<>(list);

        System.out.println(list);

        //list.addAll(Arrays.asList(arr));

        list.removeAll(Arrays.asList("1","2","3"));

        System.out.println(list);

        System.out.println(list2);

        list2.retainAll(Arrays.asList("1","2"));

        System.out.println(list2);

        System.out.println(list2.containsAll(Arrays.asList("1","2","3")));

        list2.removeIf(each -> each.equals("2"));

        System.out.println(list2);

    }


}

class TestConstructor{

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.name);
    }

}

class A {

    static class B {

    }

}