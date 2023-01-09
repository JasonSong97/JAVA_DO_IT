package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
   // 멤버변수
   private int memberID;
   private String memberName;

   // 생성자
   public Member2(int memberID, String memberName){
      this.memberID = memberID;
      this.memberName = memberName;
   }

   // 메소드
   @Override
   public int hashCode(){
      return memberID;// hashCode() 메소드가 회원 아이디를 반환하도록 재정의
   }
   @Override
   public boolean equals(Object obj){
      if(obj instanceof Member){
         Member member = (Member) obj;
         if(this.memberID == member.getMemberID()){// 매개변수로 받은 회원 아읻가 자신의 회원 아이디와 같아면 true 반환
            return true;
         }else{
            return false;
         }
      }
      return false;
   }
   @Override
   public int compare(Member2 mem1, Member2 mem2){// compare()메소드 재정의, 전달받은 두 매개변수를 비교함
      return mem1.getMemberID() - mem2.getMemberID();
   }
   public int getMemberID(){
      return memberID;
   }
   public void setMemberID(int memberID){
      this.memberID = memberID;
   }
   public String getMemberName(){
      return memberName;
   }
   public void setMemberName(String memberName){
      this.memberName = memberName;
   }
   @Override
   public String toString(){
      return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
   }
}
