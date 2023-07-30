import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyClass obj1 = new MyClass("Tolgon", "Tekebaev",
                26, "Yssyk-Kol", 183);

        System.out.println("First constructor: \n" +
                "User first name: " + obj1.firstName +
                "\n User last name: " + obj1.lastName +
                "\n User age: " + obj1.age +
                "\n User region: " + obj1.region +
                "\n User height: " + obj1.height + "\n");

        MyClass obj2 = new MyClass("Tologon", "Tekebaev",
                26, "Yssyk-Kol", new String[]{"Java", "English", "Soft Skills", "Tech talk"});

        System.out.println("Second constructor: \n" +
                "User first name: " + obj2.firstName +
                "\n User last name: " + obj2.lastName +
                "\n User age: " + obj2.age +
                "\n User region: " + obj2.region +
                "\n User lessons: " + Arrays.toString(obj2.myLessons));

    }
}