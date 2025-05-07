package l17_BinaryFileVaSerialization.DOcVaGhiDanhSachSinhVienRaFileNhiPhan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vu Kieu Anh", "Ha Noi"));
        students.add(new Student(2, "Nguyen Minh Quan", "Ha Noi"));
        students.add(new Student(3, "Dang Huy Hoa", "Da Nang"));
        students.add(new Student(4, "Nguyen Khanh Tung", "Ha Noi"));
        students.add(new Student(5, "Nguyen Khac Nhat", "Ha Noi"));

        String filePath = "student.txt";

        writeDataToFile(filePath, students);

        List<Student> studentDataFromFile = readDataFromFile(filePath);
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}