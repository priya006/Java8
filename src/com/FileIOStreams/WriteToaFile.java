package com.FileIOStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
1. Create Object for BufferedWriter
2. Pass in a File writter Object to it
3. File Writer constructor expects a path where the file to be created

Note: Every timeyou run the program it overwrites the file
 */
public class WriteToaFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writeToAFile  = new BufferedWriter(new FileWriter("/Users/pboopathi/Desktop/Writetoafile.txt"));
            writeToAFile.write("write\n");
            writeToAFile.write("to\n");
            writeToAFile.write("a\n");
            writeToAFile.write("File\n");
            writeToAFile.close();
        } catch (IOException e) {
            return;
        }

    }
}
