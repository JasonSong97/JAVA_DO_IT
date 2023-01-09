package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import collection.Member;

public class MemberTreeSet {
   // 멤버변수
   private TreeSet<Member> treeSet;

   // 생성자
   public MemberTreeSet(){
      treeSet = new TreeSet<Member>();
   }

   // 메소드
   public void addMember(Member member){// treeset에 회원을 추가하는 메소드
      treeSet.add(member);
   }
   public boolean removeMember(int memberID){// treeset 에서 회원을 삭제하는 메소드
      Iterator<Member> ir = treeSet.iterator();

      while (ir.hasNext()){
         Member member = ir.next();
         int tempID = member.getMemberID();
         if(tempID == memberID){
            treeSet.remove(member);
            return true;
         }
      }
      System.out.println(memberID + "가 존재하지 않습니다.");
      return false;
   }
   public void showAllMember(){
      for(Member member: treeSet){
         System.out.println(member);
      }
      System.out.println();
   }
}
