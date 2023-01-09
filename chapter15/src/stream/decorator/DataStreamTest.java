package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DataStreamTest {
   public static void main(String[] args) {
      try(FileOutputStream fos = new FileOutputStream("data.txt");
      DataOutputStream dos = new DataOutputStream(fos)){
         dos.writeByte(100);// 각 자료형에 맞게 자료를 씀
         dos.writeChar('A');// 각 자료형에 맞게 자료를 씀
         dos.writeInt(10);// 각 자료형에 맞게 자료를 씀
         dos.writeFloat(3.14f);// 각 자료형에 맞게 자료를 씀
         dos.writeUTF("Test");// 각 자료형에 맞게 자료를 씀
      }catch (IOException e){
         e.printStackTrace();
      }
      try(FileInputStream fis = new FileInputStream("data.txt");
      DataInputStream dis = new DataInputStream(fis)){
         System.out.println(dis.readByte());// 자료형에 맞게 자료를 읽어 출력, 파일에 쓴 순서와 같은 순서, 같은 메소드로 읽어야함
         System.out.println(dis.readChar());// 자료형에 맞게 자료를 읽어 출력, 파일에 쓴 순서와 같은 순서, 같은 메소드로 읽어야함
         System.out.println(dis.readInt());// 자료형에 맞게 자료를 읽어 출력, 파일에 쓴 순서와 같은 순서, 같은 메소드로 읽어야함
         System.out.println(dis.readFloat());// 자료형에 맞게 자료를 읽어 출력, 파일에 쓴 순서와 같은 순서, 같은 메소드로 읽어야함
         System.out.println(dis.readUTF());// 자료형에 맞게 자료를 읽어 출력, 파일에 쓴 순서와 같은 순서, 같은 메소드로 읽어야함
      }catch (IOException e){
         e.printStackTrace();
      }
   }
}
