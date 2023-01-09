package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
   // 멤버변수
   private ArrayList<Member> arrayList;// arraylist 선언

   // 생성자
   public MemberArrayList(){
      arrayList = new ArrayList<Member>();// member 형을 선언된 arraylist 생성
   }

   // 메소드
   public void addMember(Member member){// arraylist에 회원을 추가하는 메소드
      arrayList.add(member);
   }
   public boolean removeMember(int memberID){// 해당 아이디를 가진 회원을 arraylist 에서 찾아 제거함!
      for (int i = 0; i < arrayList.size(); i++) {
         Member member = arrayList.get(i);// get() 메소드로 회원을 순차적으로 가져옴
         int tempID = member.getMemberID();
         if(tempID == memberID){// 회원 아이디가 매개변수화 일치하면
            arrayList.remove(i);// 해당 회원을 삭제
            return true;
         }
      }
      System.out.println(memberID + "가 존재하지 않습니다.");// 반복문이 끝날 때까지 해당 아이디를 찾지 못한 경우
      return false;
   }
   public void showAllMember(){
      for(Member member: arrayList){
         System.out.println(member);
      }
      System.out.println( );
   }
}
