package lesson3;
public class task1 {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 5, 3, 4, 2, 6};
        int g = nums[4];
        nums[4] = nums[1];
        nums[1] = g;
        for (int t = 0; t < nums.length; t++) {
            System.out.print(nums[t] + " ");
        }
    }
}


