package com.FileIOStreams;

import java.io.BufferedReader;
import java.io.FileReader;

/*
1. Loop through each line from the file and print it out
2. readLine() reads line from a file. Terminates when it gets null
 */


public class ReadFromAFile {
    private static String FilePath = "/Users/pboopathi/Desktop/Writetoafile.txt";
    private static String  str;
    public static void main(String[] args) {

        try{

            BufferedReader ReadFromAfile = new BufferedReader(new FileReader(FilePath));
            str = "";
            while((str = ReadFromAfile.readLine()) != null )
            {
                System.out.println(str);
            }

            ReadFromAfile.close();
        }catch (Exception e){
            return;
        }

    }
}
