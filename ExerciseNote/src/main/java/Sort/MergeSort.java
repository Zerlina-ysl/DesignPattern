package Sort;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/4
 */
public class MergeSort {
    static int []tmp;
    public static void main(String[] args) {

        int []nums = {12,3,1,0,88,801,22};

        tmp = new int[nums.length];
        mergeSort(nums,0,nums.length-1);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    private static void mergeSort(int[] nums, int left, int right) {

        if(right<=left){
            return ;
        }
        int mid = (left+right)/2;
        int i=left;int j=mid+1;int cnt=0;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        while(i<=mid&&j<=right){
            if(nums[i]<=nums[j]){
                tmp[cnt++]=nums[i++];
            }else{
                tmp[cnt++]=nums[j++];
            }
        }
        while(i<=mid){
            tmp[cnt++]=nums[i++];
        }while(j<=right){
            tmp[cnt++]=nums[j++];
        }
        for(int k=0;k<right-left+1;k++){
            nums[left+k]=tmp[k];
        }


    }


}
