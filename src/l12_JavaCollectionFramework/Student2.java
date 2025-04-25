package l12_JavaCollectionFramework;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private String address;

    public Student2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Ten: " + name + ", Tuoi: " + age + ", Dia chi: " + address;
    }

    @Override
    public int compareTo(Student2 otherStudent) {
        int nameComparison = this.name.compareTo(otherStudent.getName());

        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.age, otherStudent.getAge());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student2 student2 = (Student2) o;
        return age == student2.age &&
                java.util.Objects.equals(name, student2.name) &&
                java.util.Objects.equals(address, student2.address);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age, address);
    }
}
