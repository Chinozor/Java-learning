package p134n6;

import static p134n6.Main.IfElse2.test;

public class Main {
    public static void main(String[] args) {
        System.out.println(test(10,5,0,11));
        System.out.println(test(15,5,11,13));
        System.out.println(test(5,5,5,5));

    }
    public class IfElse2{
        static int test(int testival, int target, int begin, int end){
            if (testival > target && (testival <= end && testival >= begin))
                return +1;
            else if (testival < target || (testival > end || testival < begin))
                return -1;
            else
                return 0;
        }
    }
}
