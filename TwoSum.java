class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int[] returnType = new int [2];
        int size =  nums.length;
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if ((nums[j] + nums[i]) == target){
                    return new int[]{i, j}; 
                }               
            }
                        
        }
        return null;
    }
    
   
}