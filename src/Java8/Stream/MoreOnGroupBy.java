package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MoreOnGroupBy {
    public static void main(String[] args) {
        List<Employee> liftOfEmployees = Arrays.asList(
                new Employee("Jitender Pal Singh","Developer",50000L,"Goldman Sachs","Shinil Das","Associate L2","DAS"),
                new Employee("Amit Ranjan","QA",100000L,"Goldman Sachs","Vikash Kumar Aggarwal","Senior Associate L1","GLM"),
                new Employee("Rohin Dhingra","QA",45000L,"Goldman Sachs","Shinil Das","Associate L2","GLM"),
                new Employee("Saquib Kamal","DevOps",80000L,"Goldman Sachs","Balaji","Associate L2","GLM"),
                new Employee("Ravi Awasthi","Developer",90000L,"Goldman Sachs","Bhavesh Kumar","Associate L1","GLM"),
                new Employee("Megha Gulati ","QA",50000L,"Goldman Sachs","Shinil Das","Associate L2","DAS"),
                new Employee("Deepika Metha","QA",50000L,"Goldman Sachs","Shinil Das","Senior Associate L1","DAS"),
                new Employee("Naveen Mishra","Developer",75000L,"Goldman Sachs","Dipin","Senior Associate L1","Marcus"),
                new Employee("Bhargo Dev","Developer",120000L,"Goldman Sachs","Bhavesh","Senior Associate L2","GLM"),
                new Employee("Poonam Aggarwal","Bussiness Analyst",150000L,"Goldman Sachs","Bhavesh","Manager","GLM"),
                new Employee("Rohit Nagdeo","QA",110000L,"Goldman Sachs","Vikash Kumar Aggarwal","Senior Associate L2","GLM")
        );


        // Convert List to map with key as ID and value as whole employee object
        // GroupBy title Developer
        // GroupBy salary between 65,000 to 1,00,000
        // GroupBy project and account
        // count of employees in each account
        // count of managers in each account
        // GroupBy level
        // GroupBy title having salary between 30,000 and 1,20,000
    }
}

class Employee {
    private int id;
    private String name;
    private String title;
    private long salary;
    private String project;
    private String manager;
    private String level;
    private String account;

    public Employee(String name, String title, long salary, String project, String manager, String level, String account) {
        this.name = name;
        this.title = title;
        this.salary = salary;
        this.project = project;
        this.manager = manager;
        this.level = level;
        this.account = account;
        this.id = (int)(Math.random() * 50 + 1);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
