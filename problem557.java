public class P557{
/* Good morning! Here's your coding interview problem for today.

This problem was asked by Apple.

Suppose you have a multiplication table that is N by N. That is, a 2D array where the value at the i-th row and j-th column is (i + 1) * (j + 1) (if 0-indexed) or i * j (if 1-indexed).

Given integers N and X, write a function that returns the number of times X appears as a value in an N by N multiplication table.

For example, given N = 6 and X = 12, you should return 4, since the multiplication table looks like this:

| 1 | 2 | 3 | 4 | 5 | 6 |

| 2 | 4 | 6 | 8 | 10 | 12 |

| 3 | 6 | 9 | 12 | 15 | 18 |

| 4 | 8 | 12 | 16 | 20 | 24 |

| 5 | 10 | 15 | 20 | 25 | 30 |

| 6 | 12 | 18 | 24 | 30 | 36 |

And there are 4 12's in the table.

*/
    
    public static int p557(int n, int x){
        int count = 0; //keep track of times x appears in n x n table
        if (n*n < x){ return 0;} //if max product is less than x than x never appears
        
        for (int i=1; i<=n; i++){
            if (x%i == 0 && x/i <= n){ count++;}  //x only appears in the i-th row if i divides x AND the dividend of x and i is in the bounds of the nxn table
        }
        return count; //O(n) runtime, O(1) extra space
    }

     public static void main(String []args){
        System.out.println(p557(6, 12)); //return 4
        System.out.println(p557(12, 12)); //return 6
        System.out.println(p557(10, 15)); //return 2
     }
}
