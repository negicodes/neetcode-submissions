class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // Create Hashset for rows , col, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // iitialize all hashset

        for(int i =0; i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        //traverse the suduko board
        for(int i =0; i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }

                //current digit
                char ch = board[i][j];

                int box = (i/3)*3+ (j/3);

                //cheack for duplicate

                if(rows[i].contains(ch) ||
                 cols[j].contains(ch) || 
                 boxes[box].contains(ch)){
                    return false;

                 }
                 //store the digit
                 rows[i].add(ch);
                 cols[j].add(ch);
                 boxes[box].add(ch);

            }

        }

        //if no duplicate found

        return true;


        



    }
}
