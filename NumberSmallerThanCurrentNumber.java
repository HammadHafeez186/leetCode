public class NumberSmallerThanCurrentNumber {
    public static void main(String[] args) {

        int[] numbers = {8,1,2,2,3};
        int[] newArray = smallerNumbersThanCurrent(numbers);
        for (int i=0 ; i < newArray.length;i++){
            System.out.println(newArray[i]);
        }

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] array = new int[nums.length];
        for(int i=0;i < nums.length; i++){
            count=0;
            for (int j=0; j< nums.length; j++){
                if (j!=i){
                    if (nums[j]<nums[i]){
                        count++;
                        array[i] = count;
                    }
                }
            }
        }
        return array;
    }
}
