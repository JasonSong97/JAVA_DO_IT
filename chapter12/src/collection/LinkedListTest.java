package collection;

import java.util.LinkedList;

public class LinkedListTest {
   public static void main(String[] args) {
      LinkedList<String> myList = new LinkedList<String>();

      myList.add("A");
      myList.add("B");
      myList.add("C");

      System.out.println(myList);// 리스트 전체 출력

      myList.add(1, "D");// 첫번쨰 인덱스 D 추가
      System.out.println(myList);

      myList.addFirst("O");// 연결 리스트의 맨 앞에 O 추가
      System.out.println(myList);

      System.out.println(myList.removeLast());
      System.out.println(myList);
   }
}
