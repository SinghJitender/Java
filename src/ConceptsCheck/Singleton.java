package ConceptsCheck;

public class Singleton {

  public static void main(String[] args) {

    SingletonImpl singleton = SingletonImpl.INSTANCE;
    singleton.print();
    singleton.byDefault();

    SingletonImpl2 singletonImpl2 = SingletonImpl2.INSTANCE;
    singletonImpl2.print();
    singletonImpl2.byDefault();

    SingletonImpl3 singletonImpl3 = SingletonImpl3.getInstace();
    singletonImpl3.print();

    //NonInstantiable nonInstantiable = new NonInstantiable();
  }

}

enum SingletonImpl implements ImplementMe {
  INSTANCE;

  @Override
  public void print() {
    System.out.println("Singleton Created by ENUM method.");
  }
}

class SingletonImpl2 implements ImplementMe {
  public static final SingletonImpl2 INSTANCE = new SingletonImpl2();

  private SingletonImpl2() { }

  public void print() {
    System.out.println("Singleton Created by Class method 1.");
  }
}

class SingletonImpl3 {
  private static final SingletonImpl3 INSTANCE = new SingletonImpl3();

  private SingletonImpl3() { }

  public static SingletonImpl3 getInstace() {
    return INSTANCE;
  }

  public void print() {
    System.out.println("Singleton Created by Class method 2.");
  }
}

interface ImplementMe {
  void print();
  default void byDefault(){
    System.out.println("Oh Yeah! I'm by default here execute by : " + getClass().getSimpleName());
  }
}

abstract class NonInstantiable {
  public NonInstantiable(){
    System.out.println("Constructor");
  }
  public static void print(){
    System.out.println("Hey! I'm printing");
  }

}

