package bookshelf;

import java.util.ArrayList;

public class Shelf {
   // 멤버변수
   protected ArrayList<String> shelf;// 자료를 순서대로 저장할 ArrayList 선언

   // 생성자
   public Shelf(){// 디폴트 생성자로 Shelf 클래스를 생성하면 ArrayList도 생성됨
      shelf = new ArrayList<String>();
   }

   // 메소드
   public ArrayList<String> getShelf(){
      return shelf;
   }
   public int getCount(){
      return shelf.size();
   }
}
