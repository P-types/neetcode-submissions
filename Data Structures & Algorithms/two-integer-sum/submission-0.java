class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum=new int[2];
        int sums=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
             sums=nums[i]+nums[j];
            if(sums==target){
                sum[0]=i;
                sum[1]=j;
                break;
            }else if(sums>target){
                j--;
            }else{
                i++;
            }
            
        }
        return sum;
    }
}
