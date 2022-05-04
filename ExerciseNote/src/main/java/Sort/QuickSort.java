package Sort;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/4
 */
public class QuickSort {


    public static void main(String[] args) {
        int []nums={1,2,3,0,1,239,129,123,3,4};
        QSort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }

    private static void QSort(int[] nums, int left, int right) {

        if(left<right){
            int pivotKey = Partition(nums,left,right);
            QSort(nums,left,pivotKey-1);
            QSort(nums,pivotKey+1,right);
        }
    }

    private static int Partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        while(left<right){
            while(left<right&&nums[right]>=pivot){
                right--;
            }
            nums[left]=nums[right];
            while (left<right&&nums[left]<=pivot){
                left++;
            }
            nums[right]=nums[left];
        }
        nums[left]=pivot;
        return left;
    }


}
