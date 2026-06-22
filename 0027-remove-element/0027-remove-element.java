class Solution {
    public int removeElement(int[] nums, int val) {
         int count=0;
        // Arrays.sort(nums);
        int s=0,e=nums.length-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) count++;     
        }
        while(s<e){
            if(nums[s]==val && nums[e]!=val){
                // int temp = nums[s];
                nums[s]=nums[s]^nums[e];
                nums[e]=nums[s]^nums[e];
                nums[s]=nums[s]^nums[e];
                s++;e--;
            }
            else if(nums[s]!=val) {
                s++;
            }
            else {
                e--;
            }
        }
        return nums.length-count;
        
    }
}