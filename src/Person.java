
import java.util.Objects;


public class Person {
 String Name;
 String Family;
 int Phone;
 String Gender;
//  public String toString(){
//      return String.format("%s %s %s %s", Name,Family,Phone,Gender);
//  }
 
 public String getName(){
     return Name;
 }
 public String setName(String Name){
     return this.Name=Name;
 }
 public String getFamily(){
     return Family;
 }
 public String setFamily(String Family){
     return this.Family=Family;
 } 
 public int getPhone(){
     return Phone;
 }
 public int setPhone(int Phone){
     return this.Phone=Phone;
 } 
 public String getGender(){
     return Gender;
 }
 public String setGender(String Gender){
    return this.Gender=Gender;
 }
  public Person() {
        this.Name =null;
        this.Family = null;
        this.Phone = 0;
        this.Gender = null;
    }

    public Person(String name, String family, int phone, String gender) {
        this.Name = name;
        this.Family = family;
        this.Phone = phone;
        this.Gender = gender;
    }

    @Override
    public String toString() {
        return Name + " " + Family+" - "+Phone;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }else{
            Person search = (Person)obj; 
        boolean result = this.hashCode()==search.hashCode();
       return result;
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Name);
        hash = 37 * hash + Objects.hashCode(this.Family);
        hash = 37 * hash + this.Phone;
        hash = 37 * hash + Objects.hashCode(this.Gender);
        return hash;
    }
 
}
