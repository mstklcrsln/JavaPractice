package courseTasks.thirdMonth.day38.employee;

public class Employee {
    public String name, jobTitle, salaryName, companyName;
    public char gender;
    public int age;
    public long id;

    public Employee(String name, String jobTitle, String salaryName, String companyName, char gender, int age, long id) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salaryName = salaryName;
        this.companyName = companyName;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public void work(){
        System.out.println(jobTitle+ " "+ name+ " is working"  );
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryName='" + salaryName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
