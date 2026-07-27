class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int x : nums){
            if(!map.containsKey(x)){
                map.put(x,1);
            }else{
                map.put(x,map.get(x)+1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());


        Collections.sort(list,(a,b) -> b.getValue() - a.getValue());

        int[] totalfreq = new int[k];
        for(int i=0; i<k ; i++){
            totalfreq[i]= list.get(i).getKey();

        }
    return totalfreq;
    }
}
