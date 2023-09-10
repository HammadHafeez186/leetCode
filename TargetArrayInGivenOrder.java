import javax.swing.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] arr = createTargetArray(nums,index);
        for (int i: arr){
            System.out.println(i);
        }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] target = new int[nums.length];
        for(int i = 0; i < nums.length; i++){

            arr.add(index[i],nums[i]);
        }

        for(int i = 0; i < arr.size(); i++){
            target[i] = arr.get(i);
        }

        return target;
    }
}
