public class ReplaceSpace {

    public static void main(String[] args) {
        String s =replaceSpace(new StringBuffer("aa nn nn"));
        System.out.print(s);
    }


    public static String replaceSpace(StringBuffer str){
        char[] chars = str.toString().toCharArray();
        StringBuffer result=new StringBuffer();
        for (int i = chars.length-1;i>=0 ;i--){
            if ( chars[i] == ' ') {
                result.append("02%");
            }else
                result.append(chars[i]);
        }



        return result.reverse().toString();
    }
}
