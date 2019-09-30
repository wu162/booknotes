public class JohnsonTrotter {

    public static void perm(int n) {
        int[] p   = new int[n];     // permutation
        int[] pi  = new int[n];     // inverse permutation
        int[] dir = new int[n];     // direction = +1 or -1
        for (int i = 0; i < n; i++) {
            dir[i] = -1;
            p[i]  = i;
            pi[i] = i;
        }
        perm(0, p, pi, dir);
        StdOut.printf("   (0 1)\n");
    }

    public static void perm(int n, int[] p, int[] pi, int[] dir) { 

        // base case - print out permutation
        if (n >= p.length) {
            for (int i = 0; i < p.length; i++)
                StdOut.print(p[i]);
            return;
        }

        perm(n+1, p, pi, dir);
        for (int i = 0; i <= n-1; i++) {

            // swap 
            StdOut.printf("   (%d %d)\n", pi[n], pi[n] + dir[n]);
            int z = p[pi[n] + dir[n]];
            p[pi[n]] = z;
            p[pi[n] + dir[n]] = n;
            pi[z] = pi[n];
            pi[n] = pi[n] + dir[n];  

            perm(n+1, p, pi, dir); 
        }
        dir[n] = -dir[n];
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        perm(n);
    }
}