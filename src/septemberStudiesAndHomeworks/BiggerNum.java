package septemberStudiesAndHomeworks;

public class BiggerNum {
    public static void main(String[] args) {

        int n1= 90;
        int n2= 40;
        int n3=50;

        String result = (n1 != n2 && n2!=n3 && n3!=n1)? (n1>n2 && n1>n3)? "n1 is bigger" :(n2>n1 && n2>n3)? "n2 is bigger" : "n3 is bigger" : "wrong input";

        System.out.println("result = " + result);

    }
}


//String result= "";
        //int n1 = 3, n2 = 3, n3 = 3;

       // String result = (n1 != n2 && n2 != n3 && n3 != n1)? (n1 > n2 && n1 > n3)?"n1 is bigger"
              //  :(n2 > n1 && n2 > n3)?"n2 is bigger" :"n3 is bigger" :"You must enter three different number";





//
            // (n1!= n2 && n2!=n3&& n1!=n3)?
            // (n1 != n2 && n2 != n3 && n3 != n1)?
      //  result =  (n1 != n2 && n2 != n3 && n3 != n1)?  (n1>n2 && n2>n3)? "n1 is bigger"  : (n2>n1 && n2>n3)? "n2 is bigger"  : "n3 is bigger";



      //  System.out.println("result = " + result);

