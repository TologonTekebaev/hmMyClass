public class MyClass {
    String firstName;
    String lastName;
    int age;
    String region;
    float height;
    String[] myLessons;


    public MyClass(){

    }
    public MyClass (String firstName, String lastName,
                   int age, String region, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.region = region;
        this.height = height;
    }

    public MyClass(String firstName, String lastName,
                   int age, String region, String[] myLessons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.region = region;
        this.myLessons = myLessons;
    }
}
