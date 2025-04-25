package l12_JavaCollectionFramework;

//
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SuDungHashMapLinkedHashMapTreeMapELuuDanhSachSinhVienTheoOTuoi {

    public static void displayMap(Map<String, Integer> map, String mapType) {
        System.out.println("\nDanh sach sinh vien trong " + mapType + ":");
        if (map.isEmpty()) {
            System.out.println("-> Khong co sinh vien nao.");
            return;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String studentName = entry.getKey();
            Integer studentAge = entry.getValue();
            System.out.println("-> Ten: " + studentName + ", Tuoi: " + studentAge);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> studentHashMap = new HashMap<>();

        studentHashMap.put("Nguyen Van An", 20);
        studentHashMap.put("Tran Thi Binh", 22);
        studentHashMap.put("Le Van Cuong", 19);
        studentHashMap.put("Pham Thi Dung", 22);
        studentHashMap.put("Hoang Van Em", 21);

        displayMap(studentHashMap, "HashMap (thu tu khong dam bao)");

        Map<String, Integer> studentTreeMap = new TreeMap<>(studentHashMap);

        displayMap(studentTreeMap, "TreeMap (sap xep theo ten tang dan)");

        Map<String, Integer> studentLinkedHashMap = new LinkedHashMap<>();

        studentLinkedHashMap.put("Nguyen Van An", 20);
        studentLinkedHashMap.put("Tran Thi Binh", 22);
        studentLinkedHashMap.put("Le Van Cuong", 19);
        studentLinkedHashMap.put("Pham Thi Dung", 22);
        studentLinkedHashMap.put("Hoang Van Em", 21);

        displayMap(studentLinkedHashMap, "LinkedHashMap (theo thu tu them vao)");
    }
}
