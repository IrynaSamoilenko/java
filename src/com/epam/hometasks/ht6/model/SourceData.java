package com.epam.hometasks.ht6.model;

import java.io.*;

public class SourceData {
    private String parthnameName;
    private static final String parthnameFormat = ".txt";

    public SourceData() {
        this.parthnameName = "buffer";
    }

    public SourceData(String parthnameName) {
        this.parthnameName = parthnameName;
    }

    private File file = new File (this.parthnameName+parthnameFormat);

    public void setFile(File file) { this.file = file;}

// ArrayList <Book>
    public void writeFile(Books lib) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(lib.toString());
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
            System.out.println("Library not found!");
        } catch (IOException exp) {
            System.out.println(exp.getMessage());
        }
        return new String(result);
    }



}
