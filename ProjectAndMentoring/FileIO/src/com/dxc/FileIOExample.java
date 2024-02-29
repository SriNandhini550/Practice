package com.dxc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {

    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Writing to a file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("Hello, this is a Srinandhini.\n");
            writer.write("Writing some text to demonstrate file I/O in Java.\n");
            writer.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
        // Reading from a file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Reading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
