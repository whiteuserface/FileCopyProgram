package a212114Quiz;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        //절대경로 구하기
        File newpath = new File(" ");
        String path =new File(" ").getAbsolutePath();
        System.out.println(path);
        
        //파일명 입력
        System.out.print("복사할 파일명 입력:");
        String filename = sc.next();
        //원본 파일 경로
        String oriFilePath = "C:\\Users\\white\\Desktop\\test\\"+filename;
        //복사될 파일경로
        String newfilename = "copy"+filename;
        String copyFilePath = "C:\\Users\\white\\Desktop\\test\\"+newfilename;
        //파일객체생성
        File oriFile = new File(oriFilePath);
        //복사파일객체생성
        File copyFile = new File(copyFilePath);
        
        //기존 파일의 내용을 2byte씩 복사하여
        
        try {
            FileInputStream fis = new FileInputStream(oriFile); //읽을 파일
            FileOutputStream fos = new FileOutputStream(copyFile); //복사할 파일
            int fileByte = 0;

            while((fileByte = fis.read()) != -1) {
                fos.write(fileByte);
                System.out.print("!!");
            }
            //지원사용종료
            fis.close();
            fos.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        //새로운 파일의 내용에 입력한다.
    }   
}
