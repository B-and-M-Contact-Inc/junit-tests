import java.util.ArrayList;

public class Student {
    private long id;
    private String name;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    private ArrayList<Integer> grades;

    //constructor
    public Student(String name, long id){
        this.name = name;
        this.id = id;
        grades = new ArrayList<Integer>();
    }
    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeAccumulator = 0;

        for (Integer grade : grades) {
            gradeAccumulator += grade;
        }
        double output = gradeAccumulator/grades.size();
        System.out.println("output = " + output);
        return output;
    }

}
