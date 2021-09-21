import java.util.List;

class Student {
    private List<Double> grades;

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverage() {
        if( grades.size() == 0)
            return 0;
        return grades.stream().mapToDouble(e->e).sum()/ grades.size();
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

}
