package ConceptsCheck;

public class Class {
  int a ;
 // private Class(){ }
  private Class(int a){
    this.a = a;
  }
  //protected Class() { }
}
//cannot extend class if it only contains private costructor and not public/protected constructor is there.

/*class B extends Class {
public int x;
}*/
