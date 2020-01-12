package ConceptsCheck;

public class BuilderDesignPattern {

  public static void main(String[] args) {

    Human human = new Human.Builder("Jitu").gender(Gender.MALE).age(25).build();
    System.out.println(human);

    Human human2 = new Human.Builder("Sukhmani").gender(Gender.FEMALE).age(20).build();
    System.out.println(human2);

    Human human3 = new Human.Builder("Jitu").gender(Gender.MALE).gender(Gender.FEMALE).gender(null).age(0).build();
    System.out.println(human3);

  }
}

final class Human {
  private final Gender gender;
  private final int age;
  private final String name;

  private Human(Builder build) {
    gender = build.gender;
    age = build.age;
    name = build.name;
  }

  public Gender getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Human{" +
      "gender=" + gender +
      ", age=" + age +
      ", name='" + name + '\'' +
      '}';
  }

  public static class Builder{
    private final String name;
    private Gender gender = Gender.MALE;
    private int age =0;

    public Builder(String name) {
      this.name = name;
    }
    public Builder gender(Gender val){
      gender = val;
      return this;
    }
    public Builder age(int val){
      age = val;
      return this;
    }
    public Human build(){
     return new Human(this);
    }
  }
}

enum Gender {
  MALE,
  FEMALE
}
