package courseTasks.firstMonth.day16_Rewiew;

public class CatAndDog {
    public static void main(String[] args) {
        
        String str= "caT dog dogG cAt dogG cAt cAt cAtcAtcAt dogG ";
       int numberOfCat= 0;
       int numberOfDog =0;

        for (int i = 0; i <=str.length()-3 ; i++) {
            String str1= str.substring(i,i+3);
            if (str1.equalsIgnoreCase("cat")) {
                numberOfCat++;
            } else if (str1.equalsIgnoreCase("dog")) {
                numberOfDog++;
            }
        }
        boolean isEqual= numberOfDog==numberOfCat;
        System.out.println(isEqual);
    }
}
/*
for (int i=0;i<=sentence.length()-3;i++){
            String str1=sentence.substring(i,i+3);
            if (str1.equalsIgnoreCase("dog")){
                numberOfDog++;
            }else if (str1.equalsIgnoreCase("cat")){
                numberOfCat++;
            }
        }boolean isTheSameNumber=(numberOfDog==numberOfCat);
        System.out.println(isTheSameNumber);
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence
	        Ex:
	            sentence = "caT dog dogG cAt"
	            output:
	                true
 */