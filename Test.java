给定一个未排序的整数数组，找出最长连续序列的长度。

要求算法的时间复杂度为 O(n)。
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int maxLen=1;
        for(int num:nums){
            int count=1;
            int left=num-1;
            while(set.contains(left)){
                count++;
                left--;
            }
            int right=num+1;
            while(set.contains(right)){
                count++;
                right++;
            }
            maxLen=Math.max(maxLen,count);
        }
        return maxLen;
    }
}
