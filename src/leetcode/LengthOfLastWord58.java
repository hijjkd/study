package leetcode;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        lengthOfLastWord("a ");
    }
    public static int lengthOfLastWord(String s) {
        int count=0;
        int length = s.length();
        if(length ==0 || s == null)
            return count;
        StringBuilder stringBuilder = new StringBuilder(s);
        for(int i=length-1;i>=0;i--){
            if (stringBuilder.substring(i,i+1).equals(" ")){
                return count;
            }else
                count++;
        }
        return count;

    }
}
