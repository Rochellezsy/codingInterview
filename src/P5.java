public class P5 {
    public String replaceSpace(StringBuffer str) {

        if(str==null){
            return null;
        }

        int count=0;
        int orginallength=str.length();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }

        }

        int newlength=orginallength+count*2;

        str.setLength(newlength);

        int l = orginallength-1;
        int r = newlength-1;


        while(l >= 0 && r > l){
            if(str.charAt(l) == ' '){
                str.setCharAt(r--,'0');
                str.setCharAt(r--,'2');
                str.setCharAt(r--,'%');
            }
            else {
                str.setCharAt(r--,str.charAt(l));
            }
            --l;
        }



        /*
        while (l >= 0) {
            if (str.charAt(l) != ' ') {
                str.setCharAt(r, str.charAt(l));
                r--;
            } else {
                str.replace(r - 2, r + 1, "%20");
                r -= 3;
            }
            l--;
        }

         */



        return str.toString();

    }
}

/*

public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        int l = str.length() - 1;
        int r = l + count * 2;
        str.setLength(r + 1);

        while (l >= 0) {
            if (str.charAt(l) != ' ') {
                str.setCharAt(r, str.charAt(l));
                r--;
            } else {
                str.replace(r - 2, r + 1, "%20");
                r -= 3;
            }
            l--;
        }


        return str.toString();
    }
 */
