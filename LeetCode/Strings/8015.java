class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int farthestPoint = 0;
        int left = 0;
        int right = 0;
        int space = 0;
        int diff = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
            
                right++;
            } else if (moves.charAt(i) == 'L') {
                
                left++;
            } else if (moves.charAt(i) == '_') {
                space++;
            }
        }

        diff = left-right;

       

        return Math.abs(diff)+space;
    }
}
