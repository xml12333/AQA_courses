package Student;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        studentList.add(new Student("Roma", "Ivanov2", new Date(1909, 10, 10)));
        studentList.add(new Student("Ara", "Ivanov3", new Date(1909, 2, 2)));

        int i = studentList.findStudent("Roma");
        System.out.println(studentList.detSudent(i).getBirth());
    }
}
