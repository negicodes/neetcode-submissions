class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);

        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i<str.length()){
            //read the length
            int start = i;
            while(Character.isDigit(str.charAt(i))){
                i++;
            }
            int len = Integer.parseInt(str.substring(start,i));

             //skip #
             i++;

             //read the word
             String word = str.substring(i , i+len);

             ans.add(word);

             i=i+len;


        }
        return ans;

    }
}
