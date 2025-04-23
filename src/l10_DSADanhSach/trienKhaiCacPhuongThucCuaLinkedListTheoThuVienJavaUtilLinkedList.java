package l10_DSADanhSach;

public class trienKhaiCacPhuongThucCuaLinkedListTheoThuVienJavaUtilLinkedList {

    public static void main(String[] args) {
        System.out.println("--- Demo MyLinkedList2 ---");

        MyLinkedList2<Integer> numberList = new MyLinkedList2<>();

        numberList.addFirst(10);
        numberList.addLast(30);
        numberList.addFirst(5);
        numberList.add(2, 20);
        numberList.add(45);

        System.out.println("Danh sach sau khi them: " + numberList.toString());
        System.out.println("Kich thuoc: " + numberList.size());

        System.out.println("Phan tu dau tien: " + numberList.getFirst());
        System.out.println("Phan tu cuoi cung: " + numberList.getLast());
        System.out.println("Phan tu tai index 2: " + numberList.get(2));

        System.out.println("Danh sach co chua so 30 khong? " + numberList.contains(30));
        System.out.println("Danh sach co chua so 99 khong? " + numberList.contains(99));
        System.out.println("Vi tri cua so 10: " + numberList.indexOf(10));
        System.out.println("Vi tri cua so 99: " + numberList.indexOf(99));

        int removedValue = numberList.remove(1);
        System.out.println("Da xoa phan tu tai index 1: " + removedValue);
        System.out.println("Danh sach sau khi xoa index 1: " + numberList);

        boolean isRemoved = numberList.remove(Integer.valueOf(30));
        System.out.println("Ket qua xoa gia tri 30: " + isRemoved);
        System.out.println("Danh sach sau khi xoa gia tri 30: " + numberList);
        System.out.println("Kich thuoc moi: " + numberList.size());

        MyLinkedList2<Integer> clonedList = (MyLinkedList2<Integer>) numberList.clone();
        System.out.println("Danh sach ban sao: " + clonedList);
        clonedList.addFirst(100);
        System.out.println("Ban sao sau khi them 100 vao dau: " + clonedList);
        System.out.println("Danh sach goc khong doi: " + numberList);

        numberList.clear();
        System.out.println("Danh sach goc sau khi clear: " + numberList);
        System.out.println("Danh sach goc co rong khong? " + numberList.isEmpty());
        System.out.println("Kich thuoc danh sach goc: " + numberList.size());

        System.out.println("--- Ket thuc Demo ---");
    }
}