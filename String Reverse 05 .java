public class Solution {
    public static void main(String[] args) {

        String s = "vijaykumar";
        String rev = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            rev =rev+s.charAt(i);
        }
        s=rev;
        System.out.println(s);
    }
}
