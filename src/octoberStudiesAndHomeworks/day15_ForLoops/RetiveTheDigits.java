package octoberStudiesAndHomeworks.day15_ForLoops;

public class RetiveTheDigits {
    public static void main(String[] args) {
        String str = "sfergdgvrt  gbf gr123435t4c5gfxg#£#$#$½{ gftgtrhtht41461464gdfgfdgf";
        String letters= "";
        String numbers= "";
        String specialChar= "";

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);

            if (ch>='a' && ch<='z' || ch>='Z' && ch<='A') {
                letters+= ch;
            } else if ( ch>='0' && ch<= '9') {
                numbers+=ch;
            } else {
                if (ch != ' ') {
                    specialChar += ch;
                }
            }
        }
        System.out.println("specialChar = " + specialChar);
        System.out.println("numbers = " + numbers);
        System.out.println("letters = " + letters);

    }
}
