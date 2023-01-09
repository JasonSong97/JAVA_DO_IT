package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
   // 멤버변수
   private HashMap<Integer, Member> hashMap;

   // 생성자
   public MemberHashMap(){
      hashMap = new HashMap<Integer, Member>();
   }

   // 메소드
   public void addMember(Member member){// hashmap에 회원을 추가하는 메소드
      hashMap.put(member.getMemberID(), member);// key - value
   }
   public boolean removeMember(int memberID){// hashmap에서 회원을 삭제하는 메소드
      if(hashMap.containsKey(memberID)){// hashmap에 매개변수로 받은 키 값인 회원 아이디가 있다면~
         hashMap.remove(memberID);// 해당 회원 삭제
         return true;
      }
      System.out.println(memberID + "가 존재하지 않습니다.");
      return false;
   }
   public void showAllMember(){// Iterator를 사용해 전체 회원을 출력하는 메소드
      Iterator<Integer> ir = hashMap.keySet().iterator();
      while(ir.hasNext()){// 다음 key가 있으면
         int key = ir.next();// key 값을 가져와서
         Member member = hashMap.get(key);// key로부터 value 가져오기
         System.out.println(member);
      }
      System.out.println( );
   }
}
