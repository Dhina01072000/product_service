package lld.accessmodifier.package1;

public class Student {
    private int roll_no;
    protected String name;
    int age;
    public double psp;
//
//    Student(int roll_no, String name, int age, double psp) {
//        this.roll_no = roll_no;
//        this.name = name;
//        this.age = age;
//        this.psp = psp;
//        System.out.println(this.name + " " + this.age + " " + this.psp+" "+this.roll_no);
//    }
    void doSomething(){
        roll_no = 1;
        psp = 90;
        name = "ABC";
        age = 20;
    }
}
