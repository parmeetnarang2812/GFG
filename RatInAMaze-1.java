/* class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> path = new ArrayList<>();
        if(m[0][0]==0 || m[n-1][n-1]==0) {
            return path;
        }
        findPathHelper(m,n,0,0,"",path);
        return path;
    }
    
    public static void findPathHelper(int[][] m, int n, int sr, int sc, String psf, ArrayList<String> path) {
        if(sr==n-1 && sc==n-1) {
            path.add(psf);
            return;
        }
        
        if(sr<0 || sc<0 || sr>n-1 || sc>n-1 || m[sr][sc]==0) {
            return;
        }
        
        m[sr][sc] = 0;
        int[][] dir = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        String[] dirS = {"R", "L", "D", "U"};
        
        for(int d=0; d<dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            findPathHelper(m,n,r,c,psf+dirS[d],path);
        }
        m[sr][sc] = 1;
    }
    
} 
*/