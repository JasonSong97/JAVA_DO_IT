package stream;

public class TravelCustomer {
   // 멤버변수
   private String name;
   private int age;
   private int price;

   // 생성자
   public TravelCustomer(String name, int age, int price){
      this.name = name;
      this.age = age;
      this.price = price;
   }

   // 메소드
   public String getName(){
      return name;
   }
   public int getAge(){
      return age;
   }
   public int getPrice(){
      return price;
   }
   @Override
   public String toString(){
      return "name: " + name + "age: " + age + "price: " + price;
   }
}
