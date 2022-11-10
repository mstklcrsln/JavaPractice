package NovemberStudiesAndTasks.day22.day22_Tasks;

public class Task3_Cydeo {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

       // 2. declare an array variable named batch25Groups with the length of three
        String [][]batch25Groups = new String[3][];
        batch25Groups[0]= batch25Group1;
        batch25Groups[1]= batch25Group2;
        batch25Groups[2]= batch25Group3;


        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        //4. declare an array variable named batch24Groups with the length of
        String [][]batch24Groups = new String[3][];
        batch24Groups[0]= batch24Group1;
        batch24Groups[1]= batch24Group2;
        batch24Groups[2]= batch25Group3;
       // 5. declare an array variable named CydeoStudents and assign batch24Groups & batch25Groups to the indexes of CydeoStudents
        String [][][] cydeoStudents = {batch24Groups,batch25Groups};
        for (String[][] third : cydeoStudents) {
            for (String[] second : third) {
                for (String first : second) {
                    System.out.print(first+ "\t");
                }
                System.out.println();
            }

        }
    }
}
/*
		5. declare an array variable named CydeoStudents and assign batch24Groups & batch25Groups to the indexes of CydeoStudents

		6. Print the names of each students

 */