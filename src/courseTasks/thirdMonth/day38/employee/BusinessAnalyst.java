package courseTasks.thirdMonth.day38.employee;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, String jobTitle, String salaryName, String companyName, char gender, int age, long id) {
        super(name, jobTitle, salaryName, companyName, gender, age, id);
    }
    public void work(){
        System.out.println(jobTitle+ " "+ name+ " is working today");
    }
}
