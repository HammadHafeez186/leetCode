public class ConcatinatioOfArray {

    public static void main(String[] args) {

        int[] numArray = {1, 2, 3, 4, 5};
        int[] concat = getConcatenation(numArray);
        for(int i=0;i<concat.length;i++){
            System.out.print(concat[i]+" ");
        }
    }


    public static int[] getConcatenation(int[] nums) {
        int i=0,n;
        n = 2*nums.length;
        int[] concat = new int[n];
        for(int j=0;j<n;j++){
            if(i<nums.length){
                concat[j] = nums[i];
                i++;
            }else{
                i=0;
                concat[j] = nums[i];
                i++;
            }
        }
        return concat;
    }
}
