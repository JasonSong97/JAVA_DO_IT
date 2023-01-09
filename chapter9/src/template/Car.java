package template;

public abstract class Car {
   // 추상 메소드
   public abstract void drive();
   public abstract void stop();

   // 구현된 메소드
   public void startCar(){
      System.out.println("시동을 켭니다.");
   }
   public void turnOff(){
      System.out.println("시동을 끕니다.");
   }

   // 템플릿 메소드
   final public void run(){
      startCar();
      drive();
      stop();
      turnOff();
   }
}
