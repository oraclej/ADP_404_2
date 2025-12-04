package edu.iaun.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("df");
            fr.read();
        }catch (IOException e){

        }
    }
}
