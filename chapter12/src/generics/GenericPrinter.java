package generics;

public class GenericPrinter<T extends Material> {//<T extends Material> 컴파일 시 T는 Object가 아닌 Material로(따라서 Material 메소드 사용가능!)
   // 멤버 변수
   private T material;// T 자료형으로 선언한 변수

   // 메소드
   public void setMaterial(T material){
      this.material = material;
   }
   public T getMaterial(){// T 자료형 변수 material 을 반환하는 제네릭 메소드
      return material;
   }
   @Override
   public String toString(){
      return material.toString();
   }
   public void printing(){// 상위 클래스 Material 의 메소드 호출
      material.doPrinting();
   }
}
