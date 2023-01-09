package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
   public static void main(String[] args) {
      try(FileInputStream fis = new FileInputStream("input.txt")){
         byte[] bs = new byte[10];
         int i;
         while((i = fis.read(bs)) != -1){
            for(byte b: bs){// 남아 있는 자료까지 출력
               System.out.println((char) b);
            }
            /* 남아있는 자료 없애는 코드
            for (int j = 0; j < i; j++) {
               System.out.println((char) bs[j]);
            }
            */
            System.out.println(": " + i + "바이트 읽기");
         }
      }catch (IOException e){
         e.printStackTrace();
      }
      System.out.println("end");
   }
}
