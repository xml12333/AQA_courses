package Inharitance;

public class Teacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";

    void does() {
        System.out.println("Teaching");
    }
}

class PhysicsTeacher extends Teacher {
    String mainSubject = "Physics";

    public static void main(String args[]) {
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}

class MathTeacher extends Teacher {
    String mainSubject = "Physics";
    int age = 40;

    public static void main(String args[]) {
        Teacher obj = new MathTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        //System.out.println(obj.mainSubject);
       // MathTeacher mathTeacher = new Teacher();
        MathTeacher mathTeacher = new MathTeacher();
        System.out.println(mathTeacher.mainSubject);
        obj.does();
    }
}
