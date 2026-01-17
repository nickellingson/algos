
public class LongestTurbulentSubarray {

    public static int longTurbFunc(int [] lst){
        int l = 0;
        int r = 1;
        int res = 1;
        String prev = "";
        
        while (r < lst.length) {
            if (lst[r - 1] > lst[r] && prev != ">") {
                res = Math.max(res, r - l + 1);
                r ++;
                prev = ">";
            }
            else if (lst[r - 1] < lst[r] && prev != "<") {
                res = Math.max(res, r - l + 1);
                r += 1;
                prev = "<";
            }
            else {
                if (lst[r] == lst[r - 1]) {
                    r = r + 1;
                }
                l = r - 1;
                prev = "";
            }
        }
        return res;

    }

    public static void main(String [] args){
        int[] lst = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        System.out.println(longTurbFunc(lst));
    }
}