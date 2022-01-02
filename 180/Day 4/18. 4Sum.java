Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
  
  
  
  
  
  
  class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      Arrays.sort(nums);
      ArrayList<List<Integer>> result=new ArrayList<>();
        
        int low,high;
        for(int i=0;i<nums.length-3;i++){
          if(i!=0&&nums[i]==nums[i-1]) continue;
            
            for(int j=i+1;j<nums.length-2;j++){
               if(j!=i+1&&nums[j]==nums[j-1]) continue;
                
                low=j+1;
                high=nums.length-1;
                while(low<high){
                    
                    int sum=nums[i]+nums[j]+nums[low]+nums[high];
                    
                    if(sum>target)
                        high--;
                    else if(sum<target)
                        low++;
                    else{
                        ArrayList<Integer> t=new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[low]);
                        t.add(nums[high]);
                        result.add(t);
                        low++;
                       while(low<high&&nums[low]==nums[low-1])
                           low++;
                        high--;
                        while(low<high&&nums[high]==nums[high+1])
                            high--;
                    }
                }
            }
        }
        
        return result;
        
        
        
        
    }
}
