package l10_DSADanhSach;

public class TrienKhaiLopListDonGian {
    public static void main(String[] args) {
        MyArrayList<Integer> integerList = new MyArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        System.out.println("Phan tu tai chi so 0: " + integerList.get(0));
        System.out.println("Phan tu tai chi so 2: " + integerList.get(2));
        System.out.println("Phan tu tai chi so 4: " + integerList.get(4));

        MyArrayList<String> stringList = new MyArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        System.out.println("Phan tu tai chi so 0 (chuoi): " + stringList.get(0));
        System.out.println("Phan tu tai chi so 1 (chuoi): " + stringList.get(1));
        System.out.println("Phan tu tai chi so 2 (chuoi): " + stringList.get(2));
    }
}
