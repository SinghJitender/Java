package ConceptsCheck;

public class Enum {
  public static void main(String[] args) {
    Digits digits = Digits.ONE;
    System.out.println(digits.getValue());

    System.out.println(Digits.FOUR.getValue());

    int result = Operation.PLUS.apply(1,2);
    System.out.println(result);

    for(Operation operation : Operation.values()){
      System.out.println("1 "+operation+ " 2 = "+operation.apply(1,2) );
    }
  }
}

enum Digits {
  ONE(1),
  TWO(2),
  THREE(3),
  FOUR(4);

  private int value;

  Digits(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}

enum Operation {
  PLUS {
    public int apply(int a, int b) {
      return a + b;
    }
  },
  MINUS {
    public int apply(int a, int b) {
      return a - b;
    }
  },
  TIMES {
    public int apply(int a, int b) {
      return a * b;
    }
  },
  DIVIDE {
    public int apply(int a, int b) {
      return a / b;
    }
  };

  public abstract int apply(int a, int b);
}
