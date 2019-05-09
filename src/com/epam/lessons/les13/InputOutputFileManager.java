package com.epam.lessons.les13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutputFileManager {
    private static final String FILE_NAME = "./resourses/dataSource.ser";

    public static void writeFile(List<Person> people) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            os.writeObject(people);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Person> readFile() {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return ((List<Person>)is.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("File for reading not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

}
