package com.FileIOStreams;
/*
1. Read from a file A using Buffered Reader
2. Read using readline() and the method stops while it sees null in the file
3. Write a file using FileWriter

 */

import java.io.*;

public class CopyAFile {

    public static void main(String[] args) {

        try {
            BufferedWriter writeToAFile = new BufferedWriter(new FileWriter("/Users/pboopathi/Desktop/CopyFile.txt"));
            BufferedReader ReadFromAFile = new BufferedReader(new FileReader("/Users/pboopathi/Desktop/Writetoafile.txt"));
            String FileContent;
            while ((FileContent = ReadFromAFile.readLine()) !=null)
            {
                writeToAFile.write(FileContent + "\n");
                System.out.println(FileContent);
            }
            writeToAFile.close();
            ReadFromAFile.close();
        } catch (Exception e) {
           return;
        }


    }
}
