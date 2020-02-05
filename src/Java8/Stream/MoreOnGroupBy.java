package Java8.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MoreOnGroupBy {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Arrays.asList(
                new Employee("Jitender Pal Singh","Developer",50000L,"Goldman Sachs","Shinil Das","Associate L2","DAS"),
                new Employee("Amit Ranjan","QA",100000L,"Goldman Sachs","Vikash Kumar Aggarwal","Senior Associate L1","GLM"),
                new Employee("Rohin Dhingra","QA",45000L,"Goldman Sachs","Shinil Das","Associate L2","DAS"),
                new Employee("Saquib Kamal","DevOps",80000L,"Goldman Sachs","Balaji","Associate L2","GLM"),
                new Employee("Ravi Awasthi","Developer",90000L,"Goldman Sachs","Bhavesh","Associate L1","GLM"),
                new Employee("Megha Gulati ","QA",50000L,"Goldman Sachs","Shinil Das","Associate L2","DAS"),
                new Employee("Deepika Metha","QA",50000L,"Goldman Sachs","Shinil Das","Senior Associate L1","DAS"),
                new Employee("Naveen Mishra","Developer",75000L,"Goldman Sachs","Dipin","Senior Associate L1","Marcus"),
                new Employee("Bhargo Dev","Developer",120000L,"Goldman Sachs","Bhavesh","Senior Associate L2","GLM"),
                new Employee("Poonam Aggarwal","Bussiness Analyst",150000L,"Goldman Sachs","Bhavesh","Manager","GLM"),
                new Employee("Rohit Nagdeo","QA",110000L,"Goldman Sachs","Vikash Kumar Aggarwal","Senior Associate L2","GLM"),
                new Employee("Prabhjot Singh","Developer",60000L,"Verizon","Sumit Pandey","Associate L2","Verizon 1"),
                new Employee("Udit","Developer",70000L,"Verizon","Sumit Pandey","Associate L2","Verizon 2"),
                new Employee("Krishna","QA",40000L,"Verizon","Sumit Pandey","Associate L1","Verizon 2")
        );


        // Convert List to map with key as ID and value as whole employee object
        Map<Integer,Employee> mapOfEmployee = listOfEmployees.stream().collect(Collectors.toMap(item -> item.getId(),item -> item));
        //System.out.println(mapOfEmployee);

        // Convert List to map with key as employee Object Hashcode and value as employee Object
        Map<Object,Employee> mapOfEmployee2 = listOfEmployees.stream().collect(Collectors.toMap(item -> item.hashCode(),Function.identity()));
        //System.out.println(mapOfEmployee2);

        // GroupBy title Developer
        Map<String,Set<Employee>> groupByTitle = listOfEmployees.stream().collect(
                Collectors.groupingBy(item -> item.getTitle(), Collectors.mapping(Function.identity(),Collectors.toSet()))
        );
        //System.out.println(groupByTitle);

        Map<String,Set<String>> groupByTitleDisplayNames = listOfEmployees.stream().collect(
                Collectors.groupingBy(item -> item.getTitle(), Collectors.mapping(Employee::getName,Collectors.toSet()))
        );
        //System.out.println(groupByTitleDisplayNames);


        // GroupBy title fetch name where salary between 65,000 to 1,00,000

        Map<String,Set<String>> groupBySalaryBetween = listOfEmployees.stream().collect(
                Collectors.groupingBy( item -> item.getTitle()
                        , Collectors.mapping( item -> {
                            if (item.getSalary()>=65000 && item.getSalary()<= 100000)
                                return item.getName();
                            return null;
                        }, Collectors.filtering( item -> item != null, Collectors.toSet()) ) ) );
        //System.out.println(groupBySalaryBetween);


        // GroupBy project and account

        Map<String,Map<String, Set<String>>> groupByProjectThenAccount = listOfEmployees.stream().collect(
          Collectors.groupingBy( item->item.getProject(),
                  Collectors.groupingBy( item -> item.getAccount(),
                          Collectors.mapping(item -> item.getName() ,Collectors.toSet())
          )));

        //System.out.println(groupByProjectThenAccount);

        // count of employees in each account

        Map<String,Long> groupByAccountCount = listOfEmployees.stream().collect( Collectors.groupingBy( item->item.getAccount(), Collectors.counting() ) ) ;

        System.out.println(groupByAccountCount);

        // count of employees under each manager

        Map<String,Long> countOfManagerInAccount = listOfEmployees.stream().collect( Collectors.groupingBy( item -> item.getManager(), Collectors.counting()));

        System.out.println(countOfManagerInAccount);

        //names of manager in each project

        Map<String,Set<String>> namesOfManager = listOfEmployees.stream().collect(
                Collectors.groupingBy(item ->item.getProject() , Collectors.mapping(item -> item.getManager(), Collectors.toSet())));

        System.out.println(namesOfManager);

        // GroupBy level
        // GroupBy title having salary between 30,000 and 1,20,000
    }
}

class Employee {
    private static int count =1;
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
        this.id = count++;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", project='" + project + '\'' +
                ", manager='" + manager + '\'' +
                ", level='" + level + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                Objects.equals(title, employee.title) &&
                Objects.equals(project, employee.project) &&
                Objects.equals(manager, employee.manager) &&
                Objects.equals(level, employee.level) &&
                Objects.equals(account, employee.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, title, salary, project, manager, level, account);
    }
}

