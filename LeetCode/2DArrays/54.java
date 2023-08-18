class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        // if (matrix.length == 0) {
        //     return list;
        // }

        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;

        while (l <= r && t <= b) {
            // Top wall
            for (int i = l; i <= r; i++) {
                list.add(matrix[t][i]);
            }
            t++;

            // Right wall
            for (int i = t; i <= b; i++) {
                list.add(matrix[i][r]);
            }
            r--;

            
            if (t <= b) {
                // Bottom wall
                for (int i = r; i >= l; i--) {
                    list.add(matrix[b][i]);
                }
                b--;
            }

            
            if (l <= r) {
                // Left wall
                for (int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }

        return list;
    }
}
