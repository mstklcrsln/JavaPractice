package replitTasks.December;

public class CatAndDog {
    public static void main(String[] args) {

        String str= "catdog";

        int catNum=0;
        int dogNum=0;


        for (int i = 0; i <=str.length()-3 ; i++) {
            String str2= str.substring(i, i+3);
            if (str2.contains("cat")){
                catNum++;
                str2.replace("cat","");
            }
            if (str2.contains("dog")){
                dogNum++;
                str2.replace("dog","");
                }
            }
        System.out.println(catNum==dogNum);
    }
}
/*
### Use a `loop` to count how many times the characters `cat` and `dog` are found
in the given String `str`. Output `true` if `cat` and `dog` appear the same number of times,
otherwise output `false`
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements
```
Ex:
  Input:
    catdog
  Output:
    true
```
```
Ex:
  Input:
    catcat
  Output:
    false
```
```
Ex:
  Input:
    cat-cheetah-dog-cat
  Output:
    false
```
 */