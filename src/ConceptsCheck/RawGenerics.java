package ConceptsCheck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawGenerics {

  public static void main(String[] args) {

    List list = new ArrayList<>();
    list.add(new Test("Jitu",24));
    list.add(new Test("Sukhmani",24));
    list.add(new Test("Prachi",22));
    list.add(new Employee("Prachi",22));

    printString(list);

    //System.out.println(list);


    //System.out.println(list);
  }

  public static void printString(List<?> list){
    Iterator it = list.iterator();
    while(it.hasNext()) {
      Test i = (Test) it.next();
      System.out.println(i.toString());
    }
  }

}

class Employee {
  private final String name;
  private final int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}

class Test {
  private final String name;
  private final int age;

  public Test(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Test{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}



