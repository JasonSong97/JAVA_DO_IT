package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
   //멤버변수
   private HashSet<Member> hashSet;// HashSet 선언

   // 생성자
   public MemberHashSet(){// HashSet 생성
      hashSet = new HashSet<Member>();
   }

   // 메소드
   public void addMember(Member member){// HashSet 에 멤버 추가
      hashSet.add(member);
   }
   public boolean removeMember(int memberID){// 매개변수로 받은 회원 아이디에 해당하는 회원 삭제
      Iterator<Member> ir = hashSet.iterator();// iterator 를 활용해 순회함!!!!!!

      while (ir.hasNext()){
         Member member = ir.next();// 회원을 하나씩 가져와서
         int tempID = member.getMemberID();// 아이디 비교
         if(tempID == memberID){// 같은 아이디인 경우
            hashSet.remove(member);// 회원 삭제
            return true;
         }
      }
      System.out.println(memberID + "가 존재하지 않습니다.");
      return false;
   }
   public void showAllMember(){// 모든 회원 출력
      for(Member member: hashSet){
         System.out.println(member);
      }
      System.out.println( );
   }
}
