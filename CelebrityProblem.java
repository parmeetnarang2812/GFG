/*  my gfg soln
class Solution {
    // Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n) {
        // code here
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int i = st.pop();
            int j = st.pop();

            if (M[i][j] == 1) {
                st.push(j);
            } else {
                st.push(i);
            }
        }

        int pot = st.pop();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (i != pot) {
                if (M[i][pot] == 0 || M[pot][i] == 1) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            return pot;
        } else {
            return -1;
        }
    }
}
*/