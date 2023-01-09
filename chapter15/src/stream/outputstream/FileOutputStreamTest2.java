package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamTest2 {
   public static void main(String[] args) {
      //FileOutputStream fos = new FileOutputStream("output2.txt");// 자바 9 부터 제공하는 향상된 try - with - resource
      try(FileOutputStream fos = new FileOutputStream("output2.txt");){// fos 라고만 적으면 됨!
         byte[] bs = new byte[26];
         byte data = 65;// 'A'의 아스키 값
         for (int i = 0; i < bs.length; i++) {// A 부터 Z 까지 배열에 넣기
            bs[i] =  data;
            data++;
         }
         fos.write(bs);// 배열을 한꺼번에 출력
      }catch (IOException e){
         e.printStackTrace();
      }
      System.out.println("출력이 완료 되었습니다.");
   }
}
