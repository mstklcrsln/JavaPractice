package septemberStudiesAndHomeworks;

public class CydeoBatches {
    public static void main(String[] args) {

            String batch ="US evening";
            String classTime = "";

            switch (batch){

                case ("US morning"):
                    classTime = "Class times are 10-5 EST. M, T, Th, F.";
                    break;

                case ("US evening"):
                    classTime = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;

                case ("EU"):
                    classTime= "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
                default:
                    classTime = "Invalid Batch";
            }

        System.out.println("classTime = " + classTime);
    }
}
