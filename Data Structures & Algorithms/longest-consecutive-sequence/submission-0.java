class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxLen = 0;  

            
        for( int x : set){
            if(!set.contains( x -1 )){
                int curr = x ;
                int currlen = 1;

                while(set.contains(curr + 1)){
                    curr ++;
                    currlen++;
                }
            maxLen = Math.max(maxLen , currlen);
            }
        }
        return maxLen;
    }
}
