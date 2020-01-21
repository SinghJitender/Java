package ConceptsCheck;

public class ObjectReference {
    public static void main(String[] args) {

        Test a = new Test(10,"Jitu");
        Test b = a;

        System.out.println(b);
        b.setId(20);
        System.out.println(b);
        System.out.println(a);
        
    }
}

class Test {
    private int id;
    private String name;

    public Test(int id, String age) {
        this.id = id;
        this.name = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String age) {
        this.name = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", age='" + name + '\'' +
                '}';
    }
}
