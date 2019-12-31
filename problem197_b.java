/* Given an array, rotate the array to the right by k steps, where k is non-negative.
    An alternative solution to problem 197 - k does not have to be less than the array length so more edge cases
    Also solution does not have to be in-place
 */
public class Main {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1){
            return;
        }
        if (k>nums.length){
            k = k % nums.length;
        }
        int[] numsCopy = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            numsCopy[i] = nums[i];
        }
        for (int j=k; j<nums.length; j++){
            nums[j] = numsCopy[j-k];
        }
        for (int i=0; i<k; i++){
            nums[i] = numsCopy[numsCopy.length-k+i];
        }
    }
}
