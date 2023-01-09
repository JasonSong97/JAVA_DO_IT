package map.treemap;

import java.util.TreeMap;
import java.util.Iterator;

import collection.Member;

public class MemberTreeMap {
   // 멤버변수
   private TreeMap<Integer, Member> treeMap;

   // 생성자
   public MemberTreeMap(){
      treeMap = new TreeMap<Integer, Member>();
   }

   // 메소드
   public void addMember(Member member){
      treeMap.put(member.getMemberID(), member);// key-value 쌍으로 추가
   }
   public boolean removeMember(int memberID){
      if(treeMap.containsKey(memberID)){
         treeMap.remove(memberID);
         return true;
      }
      System.out.println(memberID + "가 존재하지 않습니다.");
      return false;
   }
   public void showAllMember(){
      Iterator<Integer> ir = treeMap.keySet().iterator();
      while(ir.hasNext()){
         int key = ir.next();
         Member member = treeMap.get(key);
         System.out.println(member);
      }
      System.out.println( );
   }
}
