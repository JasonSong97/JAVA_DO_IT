package stream.other;

import java.io.File;
import java.io.IOException;

public class FileTest {
   public static void main(String[] args) throws IOException{
      File file = new File("C:\\Users\\82105\\IdeaProjects\\DoItJava\\JavaJdk\\chapter15\\newFile.txt");// 해당 경로에 File 클래스 생성. 아직 실제 파일이 생성된 것은 아님
      file.createNewFile();// 실제 파일 생성

      System.out.println(file.isFile());// 파일의 속성을 살펴보는 메소드 호출하여 출력
      System.out.println(file.isDirectory());// 파일의 속성을 살펴보는 메소드 호출하여 출력
      System.out.println(file.getName());// 파일의 속성을 살펴보는 메소드 호출하여 출력
      System.out.println(file.getAbsolutePath());// 파일의 속성을 살펴보는 메소드 호출하여 출력
      System.out.println(file.getPath());// 파일의 속성을 살펴보는 메소드 호출하여 출력
      System.out.println(file.canRead());// 파일의 속성을 살펴보는 메소드 호출하여 출력
      System.out.println(file.canWrite());// 파일의 속성을 살펴보는 메소드 호출하여 출력

      file.delete();// 파일 삭제
   }
}
