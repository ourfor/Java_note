import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.util.*;
import java.io.*;

public class Main {
    private static XMLUtil xmlUtil = new XMLUtil();

    public static void main(String args[]){

        System.out.printf("Nice to meet you!\n");
        System.out.println(""+xmlUtil.getByName("playname")+xmlUtil.getByName("game"));
        System.out.println("Hello World");
        File dealFile = new File("/Users/sagit/Desktop/JavaTest/test.txt");
        System.out.println(""+dealFile.getName());
        File test = new File("/Users/sagit/Desktop/JavaTest/Output");
        if(test.mkdir()) System.out.println("Directory create successful");
        try {
            FileInputStream TestInput = new FileInputStream("/Users/sagit/Desktop/JavaTest/test.txt");
            Scanner sc = new Scanner(TestInput);
            int i=0;
            for(;i<=9;i++)
            System.out.println(sc.nextLine());
            try {
                File fileOutput = new File("/Users/sagit/Desktop/JavaTest/Output/testDeal.txt");
                fileOutput.createNewFile();
                FileOutputStream testDeal = new FileOutputStream(fileOutput);
                RandomAccessFile readFile = new RandomAccessFile(dealFile,"rw");
                RandomAccessFile writeFile = new RandomAccessFile(fileOutput,"rw");
                System.out.println("文件长度为："+readFile.length());
                String readString = "";
                for(;readFile.readLine()!="";i++){
                    writeFile.writeBytes(readFile.readLine()+"\n");
                }
                System.out.println("Successful");

            }
            catch(IOException e){
                System.out.println("File create fail "+e);
            }
        }
        catch(IOException e) {
            System.out.println("File read error "+e);

        }


    }
}


