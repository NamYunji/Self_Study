package _0102.array.oddNum;


import java.util.Arrays;
import java.util.Scanner;

public class OddNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 정수 하나 입력 : ");
        
        int[] arr = new int[sc.nextInt()];
        
        //방법1
        for (int i = 0; i < arr.length; i++) {
            if(i<(arr.length/2))
                arr[i]=i+1;
            else
                arr[i]=arr.length-i;
        }        
        System.out.println(Arrays.toString(arr));
    }
}