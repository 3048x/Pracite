package practice;

import java.io.*;
import java.util.*;
public class AnalysisResult {
    public static void main(String args[]) {
        File fRead=new File("C:\\Users\\DELL\\Documents\\Tencent Files\\3048333172\\FileRecv\\score.txt");
        File fWrite=new File("scoreAnalysis.txt") ;
        try{
            Writer out=new FileWriter(fWrite,true);
            BufferedWriter bufferWriter=new BufferedWriter(out);
            Reader in=new FileReader(fRead);
            BufferedReader bufferRead=new BufferedReader(in);
            String str=null;
            while((str=bufferRead.readLine())!=null){
                double totalScore=Fenxi.getTotalScore(str);
                str=str+"总分："+totalScore;
                double average=Fenxi.getTotalScore(str);
                average=totalScore/3;
                str=str+"平均成绩："+average;

                System.out.println(str);
                bufferWriter.write(str);
                bufferWriter.newLine();
            }
            bufferRead.close();
            bufferWriter.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }
}
