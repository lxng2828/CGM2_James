package l12_JavaCollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhanBietGiuaHashMapVaHashSet {
    //
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van An", 20, "Ha Noi");
        Student student2 = new Student("Tran Thi Binh", 22, "Da Nang");
        Student student3 = new Student("Le Van Cuong", 19, "TP Ho Chi Minh");
        Student student4 = new Student("Nguyen Van An", 20, "Ha Noi");
        Student student5 = new Student("Pham Thi Dung", 21, "Hai Phong");

        Map<Integer, Student> studentMap = new HashMap<>();
        System.out.println("Them sinh vien vao HashMap...");
        studentMap.put(101, student1);
        studentMap.put(102, student2);
        studentMap.put(103, student3);
        studentMap.put(104, student5);
        studentMap.put(105, student1);

        System.out.println("\n--- Danh sach sinh vien trong HashMap ---");
        if (studentMap.isEmpty()) {
            System.out.println("HashMap rong.");
        } else {
            for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
                Integer studentId = entry.getKey();
                Student student = entry.getValue();
                System.out.println("Ma SV: " + studentId + " -> Thong tin: Ten=" + student.getName() +
                        ", Tuoi=" + student.getAge() + ", Dia chi=" + student.getAddress());
            }
        }

        Set<Student> studentSet = new HashSet<>();
        System.out.println("\nThem sinh vien vao HashSet...");
        boolean add1 = studentSet.add(student1);
        boolean add2 = studentSet.add(student2);
        boolean add3 = studentSet.add(student3);
        boolean add4 = studentSet.add(student4);
        boolean add5 = studentSet.add(student5);

        System.out.println("Ket qua them vao HashSet:");
        System.out.println("-> Them student1 thanh cong: " + add1);
        System.out.println("-> Them student2 thanh cong: " + add2);
        System.out.println("-> Them student3 thanh cong: " + add3);
        System.out.println("-> Them student4 (trung student1) thanh cong: " + add4);
        System.out.println("-> Them student5 thanh cong: " + add5);

        System.out.println("\n--- Danh sach sinh vien trong HashSet ---");
        if (studentSet.isEmpty()) {
            System.out.println("HashSet rong.");
        } else {
            int count = 1;
            for (Student student : studentSet) {
                System.out.println(count + ". Thong tin: Ten=" + student.getName() +
                        ", Tuoi=" + student.getAge() + ", Dia chi=" + student.getAddress());
                count++;
            }
            System.out.println("-> Tong so sinh vien (duy nhat) trong Set: " + studentSet.size());
        }
    }
}
