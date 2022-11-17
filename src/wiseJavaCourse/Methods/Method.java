package wiseJavaCourse.Methods;

public class Method {
    public static void main(String[] args) {

    String input= "Java ne kadar guzel";
        int firstIndex=5;
        int lastIndex=7;

        ownMethod(input, firstIndex,lastIndex); //ne from first string
        ownMethod("mesut",2 ,4); //su from mesut
    }
public static void ownMethod (String input, int firstIndex, int lastIndex) {
        if (firstIndex> lastIndex) {
            System.out.println("First index can not be bigger than last index");
        } else if (lastIndex>=input.length()) {
            System.out.println("last index is out of String");
        } else
            for (int i =firstIndex; i < lastIndex; i++) {
                System.out.print(input.charAt(i));
            }
    System.out.println();
    }
}
