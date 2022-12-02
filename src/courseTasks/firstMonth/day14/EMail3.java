package courseTasks.firstMonth.day14;

public class EMail3 {
    public static void main(String[] args) {
        String email = "mesut_kilicarslan@gmail.com";

        String firstName= email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
       String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

        firstName= (""+firstName.charAt(0) ).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName = ("" + lastName.charAt(0)).toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println("First name : "+ firstName+ "\n" + "Last name : "+ lastName+ "\n"+ "Domain : " + domain);
    }
}
//mesut_kilic@gmail.com