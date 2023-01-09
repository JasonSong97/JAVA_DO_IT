package cooperation;

public class Subway {
   // 멤버 변수
   String lineNumber;
   int passengerCount;
   int money;

   // 생성자
   public Subway(String lineNumber){// 지하철 노선 번호를 매개변수로 받는 생성자
      this.lineNumber = lineNumber;
   }

   // 메소드
   public void take(int money){// 승객이 자하철에 탄 경우를 구현한 메소드
      this.money += money;// 수입증가
      passengerCount++;// 승객 증가
   }
   public void showInfo(){// 지하철 정보 출력하는 메소드
      System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
   }
}
