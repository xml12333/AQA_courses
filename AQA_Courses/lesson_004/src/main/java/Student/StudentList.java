package Student;

public class StudentList {

    private Student[] list = new Student[100];
    private int p = 0;

    public void add(Student std) {
        list[p++] = std;
    }

    public Student detSudent(int n) {
        return list[n];
    }

    public int findStudent(String name) {
        for (int i = 0; i < p; i++) {
            if (name.equalsIgnoreCase(list[i].getName()))
                return i;
        }

        return -1;
    }
}
