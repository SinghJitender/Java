package CoreJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Objects;

public class MoreMaps {
  public static void main(String[] args) {

    PhoneNumber number1 = new PhoneNumber(91,9716944473L);
    PhoneNumber number2 = new PhoneNumber(91,9582924581L);

    HashMap<PhoneNumber,String> hashMap = new HashMap<>();
    hashMap.put(number1,"Jitu");
    hashMap.put(number2,"Sukhmani");

    System.out.println(hashMap.get(number1));  // Output - Jitu

    Hashtable<PhoneNumber,String> hashtable = new Hashtable<>();
    hashtable.put(number1,"Jitender");
    hashtable.put(number2,"Sukhi");

    System.out.println(hashtable.get(number2));

    hashtable.put(new PhoneNumber(91,9582616027L),"Prachi");
    hashMap.put(new PhoneNumber(91,9582616027L),"Prachi");

    System.out.println(hashtable.get(new PhoneNumber(91,9582616027L)));
    System.out.println(hashMap.get(new PhoneNumber(91,9582616027L)));


  }
}

class PhoneNumber {
  private int countryCode;
  private long phoneNumber;

  public PhoneNumber(int countryCode, long phoneNumber) {
    this.countryCode = countryCode;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof PhoneNumber)) return false;
    PhoneNumber number = (PhoneNumber) o;
    return countryCode == number.countryCode &&
      phoneNumber == number.phoneNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, phoneNumber);
  }
}