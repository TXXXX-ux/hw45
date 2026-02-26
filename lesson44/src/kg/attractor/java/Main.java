package kg.attractor.java;

import kg.attractor.java.lesson44.Lesson44Server;
import kg.attractor.java.lesson44.Lesson45;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Lesson45("localhost", 8080).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
