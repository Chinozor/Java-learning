package questions;

public class Maain {
    public static void main(String[] args) {
        Birds papug = new Birds(12,"Name");
        papug.print();

    }
}
class Birds{
    int age;
    String name;
    public Birds(int age1, String name1){
        age = age1 +1;
        name = name1;
    }
    void print(){
        System.out.println(age);
    }
}
