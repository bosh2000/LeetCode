package glupak.m;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {


    public static void main(String[] args) {
        // write your code here
        for (int value : Solution(new int[]{2, 7, 11, 15}, 9)) {
            System.out.println(value);
        }
    }

    private static int[] Solution(int[] nums, int arg) {
        int[] result = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (flag) {
                break;
            }
            result[0] = i;
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[i] + nums[y] == arg) {
                    result[1] = y;
                    flag=true;
                }
            }
        }
        return result;
    }
}
