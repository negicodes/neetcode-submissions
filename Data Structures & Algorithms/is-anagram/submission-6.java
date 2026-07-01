class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters from s
        for (char val : s.toCharArray()) {
            if (map.containsKey(val)) {
                int fq = map.get(val);
                int newfq = fq + 1;
                map.put(val, newfq);
            } else {
                map.put(val, 1);
            }
        }

        // Decrease frequency using t
        for (char val : t.toCharArray()) {

            if (!map.containsKey(val)) {
                return false;
            }

            int fq = map.get(val);
            int newfq = fq - 1;

            if (newfq == 0) {
                map.remove(val);
            } else {
                map.put(val, newfq);
            }
        }

        return map.isEmpty();
    }
}