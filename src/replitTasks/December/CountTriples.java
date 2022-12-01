package replitTasks.December;

public class CountTriples {

    public static void main(String[] args) {

        String str = "abcXXXabcfffddgghjlıtrrr";
        int count = 0;
        int lengtWord= str.length();
        for (int i = 0; i <= lengtWord-3; i++) {
            if (str.charAt(i)== str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)) {
                count++;
            }
        }
        System.out.println("count = " + count); //3 there are 3 Tripes in the String
    }
}
/*
### Use a `loop` to count the number of triples in the given `str`. A triple is when the same character appears three times in a row.
So if there is a specific character that is repeated three times,
that will be counted as one triple.
Print the total number of triples found in the String. The triples may overlap.
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements
```
Ex:
  Input:
    abcXXXabc
  Output:
    1
```
```
Ex:
  Input:
    xxxabyyyycd
  Output:
    3

  -> the triples found are xxx yyy and another yyy
```
```
Ex:
  Input:
    java
  Output:
    0
```
 */
