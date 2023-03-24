package b123.Maryna;

public class FillThePalindrome {

    public static void main(String[] args) {

        //String input="abb?";
       String input="bab??a";
        String tempReverse="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tempReverse+=input.charAt(i);
        }
        String result="";
        for (int i=0;i<input.length();i++){
            char in =input.charAt(i);
            char tmpRe=tempReverse.charAt(i);
            if (in==tmpRe){ result+=in;}
            else if (in=='?'&&tmpRe=='?') {result+='z';}
            else if (tmpRe!='?'&&in=='?') {result+=tmpRe;}
            else if (tmpRe=='?'&&in!='?') {result+=in;}
            else {result="NO";break;}

        }
        System.out.println(result);

    }

}
