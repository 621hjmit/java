package a0711;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = { 100, 95, 80, 70, 60 };
        char[] chArr = { 'a', 'b', 'c', 'd' };

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1; // 1~10까지 숫자를 순서대로 배열에 넣는다.
        }
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1;
        }
        //
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
        // char[] 배열은 특별하게 처리 , 배열의 각 문자를 연속된 문자열처럼 처리
    }
}
