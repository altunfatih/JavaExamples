import java.util.*;

public class Students {
    private int id;
    private int grade;
    Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();

    public Students() {
    }

    public Students(int id, int grade) {
        this.id = id;
        this.grade = grade;
    }

    public Integer gradeAdd(int id, int grade) {
        return numbers.put(id,grade);
    }

    public String print() {
        return numbers.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
