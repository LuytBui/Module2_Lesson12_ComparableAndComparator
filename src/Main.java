import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list);
        System.out.println("Sắp xếp theo tên: ");
        printStudentList(list);

        System.out.println();

        Collections.sort(list, new AgeComparator());
        System.out.println("Sắp xếp theo tuổi: ");
        printStudentList(list);
    }

    public static void printStudentList(List<Student> list){
        for(Student st : list){
            System.out.println(st.toString());
        }
    }
}
