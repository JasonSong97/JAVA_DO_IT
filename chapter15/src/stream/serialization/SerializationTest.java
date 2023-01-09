package stream.serialization;

import java.io.*;

class Person implements Serializable {
   private static final long serialVersionUID = -1503252402544036183L;
   String name;
   transient String job;

   public Person(){}
   public Person(String name, String job){
      this.name = name;
      this.job = job;
   }
   public String toString(){
      return name + "," + job;
   }
}
public class SerializationTest{
   public static void main(String[] args) throws ClassNotFoundException{
      Person personAhn = new Person("안재용 ", "대표이사");
      Person personKim = new Person("김정수" ,"상무이사");

      try(FileOutputStream fos = new FileOutputStream("serial.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos)){
         oos.writeObject(personAhn);// personAhn 과 personKim 의 값을 파일에 씀(직렬화)
         oos.writeObject(personKim);// personAhn 과 personKim 의 값을 파일에 씀(직렬화)
      }catch (IOException e){
         e.printStackTrace();
      }
      try(FileInputStream fis = new FileInputStream("serial.txt");
      ObjectInputStream ois = new ObjectInputStream(fis)){
         Person p1 = (Person) ois.readObject();// personAhn 과 personKim 의 값을 파일에서읽어 들임(역직렬화)
         Person p2 = (Person) ois.readObject();
         System.out.println(p1);
         System.out.println(p2);
      }catch (IOException e){
         e.printStackTrace();
      }
   }
}
