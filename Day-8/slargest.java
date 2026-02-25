import java.util.*;

public class slargest {
    public static void main(String[] args) {

        int[] nums = {98,32,72,94,75,73,92,36,28,34};

        Arrays.sort(nums);

        System.out.println("Second largest: " + nums[nums.length - 2]);
    }
}
