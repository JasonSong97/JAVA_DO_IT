package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
   public static void main(String[] args) {
      long miilisecond = 0;
      try(FileInputStream fis = new FileInputStream("a.zip");
      FileOutputStream fos = new FileOutputStream("copy.zip");
      BufferedInputStream bis = new BufferedInputStream(fis);
      BufferedOutputStream bos = new BufferedOutputStream(fos)){
         miilisecond = System.currentTimeMillis();
         int i;
         while((i = bis.read()) != -1){
            bos.write(i);
         }
         miilisecond = System.currentTimeMillis() - miilisecond;
      }catch (IOException e){
         e.printStackTrace();
      }
      System.out.println("파일을 복사하는 데" + miilisecond + " milliseconds 소요 되었습니다.");
   }
}
