package l12_JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXepVoiComparableVaComparator {
    //
    public static void main(String[] args) {
        // Tao danh sach de chua cac doi tuong Student2
        List<Student2> studentList = new ArrayList<>();

        // Them sinh vien vao danh sach
        studentList.add(new Student2("Nguyen Van Binh", 22, "Da Nang"));
        studentList.add(new Student2("Le Thi An", 20, "Ha Noi"));
        studentList.add(new Student2("Nguyen Van Binh", 19, "TP Ho Chi Minh")); // Trung ten, khac tuoi
        studentList.add(new Student2("Tran Van Cuong", 21, "Hai Phong"));
        studentList.add(new Student2("Le Thi An", 21, "Ha Noi")); // Trung ten, khac tuoi

        // Hien thi danh sach truoc khi sap xep
        System.out.println("--- Danh sach sinh vien truoc khi sap xep ---");
        for (Student2 student : studentList) {
            System.out.println(student.toString()); // toString da duoc dinh nghia trong Student2
        }

        // Sap xep danh sach su dung Collections.sort
        // Vi Student2 da implement Comparable, Java se tu dong dung phuong thuc
        // compareTo
        Collections.sort(studentList);

        // Hien thi danh sach sau khi sap xep
        System.out.println("\n--- Danh sach sinh vien sau khi sap xep (theo Ten, roi den Tuoi) ---");
        for (Student2 student : studentList) {
            System.out.println(student.toString());
        }
    }
}
