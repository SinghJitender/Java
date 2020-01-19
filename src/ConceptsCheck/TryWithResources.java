package ConceptsCheck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
  public static void main(String[] args) throws IOException {
    A obj = new A();
    obj.readFile("./resources/SampleText.txt");
  }
}

class A implements AutoCloseable {

  public void readFile(String path) throws IOException {
    try(BufferedReader br = new BufferedReader(
      new FileReader(path)) ){
      while(br.read()!=-1)
      System.out.println(br.readLine());
    }
  }

  @Override
  public void close() throws Exception {
   // System.out.println("Object Closed");
    // this.close();
  }

}

