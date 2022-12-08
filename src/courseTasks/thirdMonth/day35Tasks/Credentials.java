package courseTasks.thirdMonth.day35Tasks;

public class Credentials {

    private String username;
    private String password;

    public Credentials(String username, String password) {
       setUsername(username);
       setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (isStrongPassWord(password))
        this.password = password;
    }
    public  boolean isStrongPassWord(String password){
        boolean isStrongPassWord= true;
        //  1. Password MUST be at least have 8 characters long, and should not contain space
        if (password.length()<8 || password.contains(" ")){
            isStrongPassWord= false;
        }



        int letterCount=0;
        int specialCount= 0;
        int digitCount= 0;
        for (int i = 0; i <password.length() ; i++) {
            // PassWord should at least contain one letter
            if (Character.isAlphabetic(password.charAt(i))){
                letterCount++;
            }
            // Password should at least contain a digit
            if (Character.isDigit(password.charAt(i))){
                digitCount++;
            }
            // Password should at least contain one special characters
            if (Character.isLetterOrDigit(password.charAt(i))){
                specialCount++;
            }
        }
        if ((letterCount>0 && digitCount>0 && specialCount>0)){
            isStrongPassWord=true;
        }
        return isStrongPassWord;
    }
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
2. create a class named Credentials
            Variables:
                username, password
            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit
                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password
                toString():
            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */