class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int size = nums.size();int t=0;
        vector<int> arr;
        for(int i=0;i<size-1;i++){
            
            for(int j=i+1;j<size;j++){
                if(nums[i]+nums[j]==target){
                  arr.push_back(i);
                    arr.push_back(j);
                    t=1;break;
                }
            }
            if(t==1)break;
        }
     return arr;
    }
};