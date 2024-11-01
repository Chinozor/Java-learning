package p182n19;

public class Main {
    public static void main(String[] args) {
        Print.printArray("N", "M", "B");
        Print.printArray((String[])new String[]{"NMB", "NMB", "NMB"});
    }
}
class Print{
    static void printArray(String... strings){
        for(String s : strings){
            System.out.println(s + " ");
        }
    }
}
