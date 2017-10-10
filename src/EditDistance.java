/*
* Given two strings str1 and str2 and below operations that can performed on str1.
* Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.
a.Insert
b.Remove
c.Replace
All of the above operations are of equal cost.
*/

/*
* Algo :
* 1.Start comparing two string from back side. Let their lengths be m and n resp.
* if(m == 0)
* return n;
* else if(n == 0)
* return m;
* else if(str1.charAt(m-1) == str1.charAt(n-1))
* return EditDistance(str1,str2,m-1,n-1);
* else
* return (1 + min(EditDistance(str1,str2,m-1,n),EditDistance(str1,str2,m,n-1), EditDistance(str1,str2,m-1,n-1)));
*
*
*
* */

public class EditDistance {
    static int min(int x, int y, int z) {
        if(x<y && x<z)
            return x;
        if(y<x && y<z)
            return y;
        else
            return z;
    }
    static int editDist(String str1, String str2, int m, int n) {
        if(m == 0)
            return n;
        else if(n == 0)
            return m;
        else if(str1.charAt(m-1) == str2.charAt(n-1))
            return editDist(str1, str2,m-1,n-1);
        else
            return (1 + min(editDist(str1,str2,m-1,n),editDist(str1,str2,m,n-1), editDist(str1,str2,m-1,n-1)));
    }

    public static void main (String args[]) {
        String s1 = "ABC";
        String s2 = "CDA";
        int min = editDist(s1, s2, s1.length(),s2.length());
        System.out.println("min = "+min);
    }
}
