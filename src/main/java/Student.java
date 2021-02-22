import java.util.ArrayList;

public class Student {
    String name;
    long id = 0;
    ArrayList<Integer> grades = new ArrayList<>();

    Student(String name) {
        name = this.name;
        id++;
    }

    Student() {
        id++;
    }

    public long getID() {
        return this.id;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public long getGradeAverage() {
        long sum = 0;
        for (int i = 0; i<this.grades.size(); i++) {
            sum += (long)this.grades.get(i);
        }
        return sum / this.grades.size();
    }

    public static void makeTed() {
        Student ted = new Student("Ted");
        ted.addGrade(91);
        ted.addGrade(92);
        ted.addGrade(93);
    }
}
