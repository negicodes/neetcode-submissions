class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            char[] arr = str.toCharArray();

            Arrays.sort(arr);
            
            String arr1 = new String(arr);



            if(!map.containsKey(arr1)){
                ArrayList<String> list = new ArrayList<>();
                map.put(arr1 , list);

            }
        map.get(arr1).add(str);


        }
    return new ArrayList<>(map.values());
    }
}
