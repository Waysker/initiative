package com.wykompany;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CharData charData = new CharData(br);
        while (true) {
            System.out.println("Add?(a)");
            String answer = br.readLine();
            if (answer.equals("a")) {

                charData.addCharacter();

            }
        }

    }
}
