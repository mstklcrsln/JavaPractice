package NovemberStudiesAndTasks.day22.day23_Tasks;

public class Day23_MethodTasks1 {
    public static void main(String[] args) {

        oddNumbers(); //1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99
        System.out.println();
        evenNumbers(); //2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98
        System.out.println();
        eligibleForAlcohol(8); //NOT eligible for alcohol
        System.out.println();
        eligibleToVote(25);//Eligible for vote
        System.out.println();
        gradeDegree(55); //Your grade is "F"
        System.out.println();
        areaOfCircle(2); //Area of circle is 12.56
        System.out.println();
        areaOfSquare(5); //Area of square is : 25
        System.out.println();
        dollarToEuro(52); //52.0 dollar is 54.6 euro
        System.out.println();
        dollarToTl(25); //25.0 dollar is 464.49999999999994 TL
        System.out.println();
        kgToLibre(12); //12.0 kg is 5.4431084400000005 libre
        System.out.println();
        isNegativeOrPositive(0); //0 is zero
    }
        public static void oddNumbers () {
            for (int i = 1; i < 100; i+=2) {
                System.out.print(i+ " ");
            }
        }
        public static void evenNumbers () {
            for (int i =2; i < 100; i+=2) {
                System.out.print(i + " ");
            }
        }
        public static void eligibleForAlcohol (int age) {
            if (age>18) {
                System.out.println("Eligible for alcohol");
            }else { System.out.println("NOT eligible for alcohol");
    }}
        public static void eligibleToVote (int age) {
            if (age>18) {
                System.out.println("Eligible for vote");
            }else { System.out.println("NOT eligible for vote");
        }
    }
        public static void gradeDegree (int grade){
            if (grade<=100&&grade>=90){
                System.out.println("Your grade is \"A\" ");
            } else if (grade<90&&grade>=80) {
                System.out.println("Your grade is \"B\" ");
            } else if (grade<80&&grade>=70) {
                System.out.println("Your grade is \"C\" ");
            } else if (grade<70&&grade>=60) {
                System.out.println("Your grade is \"D\" ");
            } else if (grade<60) {
                System.out.println("Your grade is \"F\" ");
            }else {
                System.out.println("wrong input");

        }







    }
        public static void areaOfCircle (double radius ) {
            System.out.println("Area of circle is "+ (radius*radius*3.14));
        }
        public static void areaOfSquare (int oneSide ) {
            System.out.println("Area of square is : "+ oneSide*oneSide);
        }
        public static void dollarToEuro (double dollar) {
        double euro= dollar*1.05;
        System.out.println(dollar+ " dollar is " + euro+ " euro" );
        }
        public static void dollarToTl (double dollar1) {
        double lira =  dollar1*18.58;
            System.out.println(dollar1 + " dollar is "+ lira + " TL");
        }
        public static void kgToLibre (double kg){
        double libre = kg *0.45359237;
            System.out.println(kg+ " kg is "+ libre + " libre");
        }
        public static void isNegativeOrPositive (int number) {
        if (number<0) {
            System.out.println( number + " is a negative number");
        } else if (number>0) { System.out.println( number + " is a positive number");
        } else { System.out.println( number + " is zero");
        }
        }

        }





