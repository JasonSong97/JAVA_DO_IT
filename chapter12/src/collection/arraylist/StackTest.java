package collection.arraylist;

import java.util.ArrayList;

class MyStack{
   // 멤버변수
   private ArrayList<String> arrayStack = new ArrayList<String>();

   // 메소드
   public void push(String data){// 스택의 맨 뒤에 요소를 추가
      arrayStack.add(data);
   }
   public String pop(){// 스택 맨 뒤에서 요소 꺼냄
      int len = arrayStack.size();// arraylist 에 저장된 유효한 자료의 개수
      if(len == 0){
         System.out.println("스택이 비었습니다.");
         return null;
      }
      return (arrayStack.remove(len - 1));// 맨 뒤에 있는 자료 반환 하고 배열에서 제거
   }
}
public class StackTest {
   public static void main(String[] args) {
      MyStack stack = new MyStack();
      stack.push("A");
      stack.push("B");
      stack.push("C");

      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
   }
}
