/**This problem was asked by Amazon.

Given an array and a number k that's smaller than the length of the array, rotate the array to the right k elements in-place.**/

public class Main
{
    public static void rotate(int[] arr, int k){ //in-place, O(n) solution
        int i = 0;
        while (k>0){ 
            int temp = arr[arr.length-1];
            for (i = arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            k--;
        }
    }
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 2, 6, 10};
		rotate(nums, 5);
		for (int i=0; i<nums.length; i++){
		    System.out.print(nums[i]+" ");
		}
		
	}
}
