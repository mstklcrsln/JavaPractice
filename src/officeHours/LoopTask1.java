package officeHours;

public class LoopTask1 {
    public static void main(String[] args) {


    practice();
    /*
             1
            222
          33333
        4444444
      555555555
     */

    }

    public static void practice (){
        for (int i = 0; i <5; i++) {
                               //this is for spaces      this part is for numbers
            System.out.println(" ".repeat(9-i*2+1)+ String.valueOf(i+1).repeat(i*2+1)); //this is for spaces
        }
    }
}
/*
                1   ==> 8 spaces
              222   ==> 5 spaces
            33333   ==> 3 spaces
          4444444   ==> 1 spaces
         55555555   ==> 0 spaces
 */