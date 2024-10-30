package p140n10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int product;
        int firstNumberInFirstNumber;
        int secondNumberInFirstNumber;
        int firstNumberInSecondNumber;
        int secondNumberInSecondNumber;
        int[] nums = new int[4];
        int[] nums2 = new int[4];
        for (int i = 10; i < 100; i++) {
            firstNumberInFirstNumber = i/10;
            secondNumberInFirstNumber = i%10;
            for (int j = 10; j < 100; j++) {
                firstNumberInSecondNumber = j / 10;
                secondNumberInSecondNumber = j % 10;
                product = i * j;
                nums = new int[]{firstNumberInFirstNumber, secondNumberInFirstNumber, firstNumberInSecondNumber, secondNumberInSecondNumber};
                nums2 = new int[]{product/1000, (product/100)%10, (product%100)/10, ((product%1000)%100)%10};
                Arrays.sort(nums);
                Arrays.sort(nums2);
                for (int k = 0; k < 4; k++) {
                    if(Arrays.equals(nums,nums2)){
                        System.out.println("Число вампир = " + product);
                        System.out.println("Первое число в произведении = " + i);
                        System.out.println("Второе число в произведении = " + j);
                        System.out.println(" ");
                    }

                }

            }
        }
    }

}
