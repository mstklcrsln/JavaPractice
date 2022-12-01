package replitTasks.December;

public class CountHi {

    public static void main(String[] args) {

        String str= "abc hi nowhi, and hi npw";


        int numberOfHi=0;

        for (int i = 0; i <str.length()-1 ; i++) {
          String str2= str.substring(i,i+2);
            if (str2.contains("hi")) {
                numberOfHi++;
                str2.replace("hi","");
            }
        }
        System.out.println(numberOfHi);
    }
}
/*
### Use a `loop` to count how many times the characters `hi` are found in the given String `str`.
Only consider the lowercase characters for `hi`.
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements
```
Ex:
  Input:
    abc hi how
  Output:
    1
```
```
Ex:
  Input:
    hihi bye
  Output:
    2
```
```
Ex:
  Input:
    apple
  Output:
    0
```
 */