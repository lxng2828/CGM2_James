package l10_DSADanhSach;

public class TrienKhaiLopArrayListDonGian {
    public static void main(String[] args) {
        // Test constructor mac dinh
        MyArrayList<Integer> list1 = new MyArrayList<>();
        System.out.println("--- Test constructor mac dinh ---");
        System.out.println("Kich thuoc ban dau cua list1: " + list1.size());

        list1.add(0, 1);
        list1.add(1, 2);
        list1.add(2, 3);
        System.out.println("Cac phan tu trong list1 sau khi them:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        System.out.println("Kich thuoc hien tai cua list1: " + list1.size());

        // Test constructor voi capacity
        MyArrayList<String> list2 = new MyArrayList<>(5);
        System.out.println("\n--- Test constructor voi capacity ---");
        System.out.println("Kich thuoc ban dau cua list2: " + list2.size());
        list2.add("A");
        list2.add("B");
        list2.add("C");
        System.out.println("Cac phan tu trong list2 sau khi them:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
        System.out.println("Kich thuoc hien tai cua list2: " + list2.size());

        // Test phuong thuc add(index, element)
        System.out.println("\n--- Test phuong thuc add(index, element) ---");
        list2.add(1, "X");
        System.out.println("Cac phan tu trong list2 sau khi them 'X' vao index 1:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
        System.out.println("Kich thuoc hien tai cua list2: " + list2.size());

        // Test phuong thuc remove(index)
        System.out.println("\n--- Test phuong thuc remove(index) ---");
        String removedElement = list2.remove(2);
        System.out.println("Phan tu da xoa tai index 2: " + removedElement);
        System.out.println("Cac phan tu trong list2 sau khi xoa:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
        System.out.println("Kich thuoc hien tai cua list2: " + list2.size());

        // Test phuong thuc size()
        System.out.println("\n--- Test phuong thuc size() ---");
        System.out.println("Kich thuoc hien tai cua list2: " + list2.size());

        // Test phuong thuc clone()
        System.out.println("\n--- Test phuong thuc clone() ---");
        try {
            MyArrayList<String> clonedList = list2.clone();
            System.out.println("Cac phan tu trong clonedList:");
            for (int i = 0; i < clonedList.size(); i++) {
                System.out.print(clonedList.get(i) + " ");
            }
            System.out.println();
            System.out.println("Kich thuoc cua clonedList: " + clonedList.size());
            clonedList.add("Y");
            System.out.println("Cac phan tu trong clonedList sau khi them 'Y':");
            for (int i = 0; i < clonedList.size(); i++) {
                System.out.print(clonedList.get(i) + " ");
            }
            System.out.println();
            System.out.println("Cac phan tu trong list2 (ban goc):");
            for (int i = 0; i < list2.size(); i++) {
                System.out.print(list2.get(i) + " ");
            }
            System.out.println();
        } catch (CloneNotSupportedException e) {
            System.err.println("Loi: Khong the clone danh sach.");
        }

        // Test phuong thuc contains()
        System.out.println("\n--- Test phuong thuc contains() ---");
        System.out.println("list2 co chua 'B'? " + list2.contains("B"));
        System.out.println("list2 co chua 'Z'? " + list2.contains("Z"));

        // Test phuong thuc indexOf()
        System.out.println("\n--- Test phuong thuc indexOf() ---");
        System.out.println("Vi tri cua 'A' trong list2: " + list2.indexOf("A"));
        System.out.println("Vi tri cua 'C' trong list2: " + list2.indexOf("C"));
        System.out.println("Vi tri cua 'Z' trong list2: " + list2.indexOf("Z"));

        // Test phuong thuc add(E e)
        System.out.println("\n--- Test phuong thuc add(E e) ---");
        list2.add("D");
        System.out.println("Cac phan tu trong list2 sau khi them 'D':");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
        System.out.println("Kich thuoc hien tai cua list2: " + list2.size());

        // Test phuong thuc ensureCapacity() (ngam dinh khi add)

        // Test phuong thuc get(int i)
        System.out.println("\n--- Test phuong thuc get(int i) ---");
        System.out.println("Phan tu tai index 0 cua list2: " + list2.get(0));
        try {
            System.out.println("Phan tu tai index -1 cua list2: " + list2.get(-1));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Loi: " + e.getMessage());
        }

        // Test phuong thuc clear()
        System.out.println("\n--- Test phuong thuc clear() ---");
        list2.clear();
        System.out.println("Kich thuoc cua list2 sau khi clear(): " + list2.size());
        System.out.println("list2 co rong khong? " + (list2.size() == 0));
    }
}