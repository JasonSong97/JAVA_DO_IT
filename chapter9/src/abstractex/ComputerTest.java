package abstractex;

public class ComputerTest {
   public static void main(String[] args) {
      //Computer c1 = new Computer(); 추상 클래스는 인스턴스 생성 불가!
      Computer c2 = new DeskTop();// 추상 클래스는 형변환은 가능!
      //Computer c3 = new NoteBook(); 추상 클래스는 인스턴스 생성 불가!
      Computer c4 = new MyNoteBook();// 추상 클래스는 형변환은 가능!
   }
}
