import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private List<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public List<Integer> getGrades(){
        return this.grades;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int numInput){
        this.grades.add(numInput);
    }

    public double getGradeAverage(){
        int total = 0;
        for(int grade : grades){
            total += grade;
        }
        return (double)total / grades.size();
    }

    public void updateGrade(int index, int newGrade){
        this.getGrades().set(index, newGrade);
    }

    public void deleteGrade(int index){
        this.getGrades().remove(index);
    }

    public String gradesToString(){
        return this.grades.toString();
    }
}