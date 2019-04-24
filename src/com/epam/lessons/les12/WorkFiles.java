package com.epam.lessons.les12;

import java.io.*;

public class WorkFiles {
    private File file = new File ("test.txt");

    public void setFile(File file) { this.file = file;}


    public void writeFile(String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(text);
        } catch (IOException exp) {
            System.out.println(exp.getMessage());
        }
    }

    public String readFile() {
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) !=null) {
                result.append(line);
                result.append("\n");
            }
        } catch (FileNotFoundException exp) {
            System.out.println("File not found!");
        } catch (IOException exp) {
            System.out.println(exp.getMessage());
        }
        return new String(result);
    }


}

