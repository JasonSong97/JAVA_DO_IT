package gamelevel;

public abstract class PlayerLevel{
   // 추상 메소드
   public abstract void run();
   public abstract void jump();
   public abstract void turn();
   public abstract void showLevelMessage();

   // 구현된 템플릿 메소드
   final public void go(int count){// 재정의되면 안 되므로 final 선언!
      run();
      for (int i = 0; i < count; i++) {
         jump();
      }
      turn();
   }
}
