package lld.day1;

public class Client {
    public static void main(String[] args) {

        Student st3 = new Student();
        st3.name = "Rajneesh";
        st3.roll_no = 99;
        st3.age = 1;
        st3.printname();
        Student st2 = new Student();
        st2.name = "Rajneesh";
        st2.roll_no = 99;
        st2.age = 1;
        st2.printname();

        System.out.println(st3);
        System.out.println(st2);
        st2 = st3;
        System.out.println(st2);
        System.out.println(st3);
    }

}
