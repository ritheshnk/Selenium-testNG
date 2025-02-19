package org.example;

//import org.bytedeco.tesseract.Tesseract;

import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class ReadingTextImage {

    public static void main(String agrs[]){

        try {
            Tesseract tesseract=new Tesseract();

            tesseract.setDatapath("C:\\Users\\nkrit\\OneDrive\\Desktop\\java_Tessaract\\Tess4J\\tessdata");

            String text=tesseract.doOCR(new File("C:\\Users\\nkrit\\OneDrive\\Desktop\\Java JDBC\\images\\northernTrust.png"));
            System.out.println(text);
            String cleanedText = text.replaceAll("[^a-zA-Z ]", "").trim(); //removes all non alpabetical characters
//            System.out.println(cleanedText);

            String[] words=cleanedText.toLowerCase().split("\\s+"); // if i give \\s it will ignore no matter hwo many space is there between characters
            String finalText="";

            for(String word:words){
                if(word.contains("northern")){
                    finalText+="Northern ";
                } else if (word.contains("trust")) {
                    finalText+="Trust";
                }
            }

            System.out.println(finalText);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
