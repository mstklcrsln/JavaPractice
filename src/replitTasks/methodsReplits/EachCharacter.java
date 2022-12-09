/* import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                char ch = str.charAt(k);
                if (ch == eachChar) {
                    count++;
                }
                result += count;
                result += eachChar;
            }
            return result;
        }
    }


       /*
        secon solutionint count = 0;



        String res = "";
        String yes = str;

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < yes.length(); j++) {
                if (str.charAt(i) == yes.charAt(j)) {
                    count++;
                }
                if (!res.contains(str.charAt(i) + "")) {
                    res += str.charAt(i);
                }
            }yes = yes.replace("" + str.charAt(i), "");
            if (count == 0) {
                continue;
            }res = res+count;
        }
        String[] arr=res.split("");
        for (int i = 0; i < arr.length; i=i+2) {
            String temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        res="";
        for (String s : arr) {
            res+=s;

        }return res;

    }}
    }

/*
### Finish the method called `countLetters()` that will take a `String` argument `str` and returns a `String`.
Find the frequency of each character in `str` and concatenate the frequency number with the character.
Return the concatenated String with all the frequencies.
 The `countLetters()` method is already called in the main method with an argument.
#### This is a `return` method with a `String` parameter
Concatenated String should be in this format:
> frequency number + letter
Main topics: methods, Scanner, String, loops
Example:
```
	countLetters("aaabbcccc");
output:
	3a2b4c
```
Example:
```
	countLetters("appleeess");
output:
	1a2p1l3e2s
```
 */