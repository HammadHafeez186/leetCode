public class SuffleTheArray2 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] shuffle = shuffle(nums, 3);
        for (int i : shuffle) {
            System.out.println(i);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }
}
