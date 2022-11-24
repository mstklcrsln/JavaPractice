package octoberTasks.day19_Tasks;

public class FirstUnique {
    public static void main(String[] args) {

        String str = "abbbccdeee";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {
                char eachch = str.charAt(j);
                if(ch==eachch){
                    count++;
                }
            }
            if(count==2){
                result+=ch;
            //    break;
            }
        }
        System.out.println(str.indexOf(result));



    }
}
/*
4. Write a program that can return the index number of the first unique character.
 */