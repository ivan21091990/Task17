package com.itProger;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            System.out.println("Конец ввода данных -  строка 'stop'");

            try (   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    FileWriter fw =  new FileWriter("aplana.txt")){
                String text;
                System.out.println("Введите строку:");
                while(!(text=br.readLine()).equals("stop")){
                    {
                        System.out.println("Введите строку:");
                        fw.write(text + "\n");
                        fw.flush();
                    }
                }
            }catch (IOException ex){
                System.out.println("Error" + ex);
            }
    }
}