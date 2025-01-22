public class Student {
    private String name;
    private int id;
    private double grade;
    private double newGrade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getters
    public String getName() { return name; }

    public int getId() { return id; }

    public double getGrade() { return grade; }

    // Setters
    public void setName(String name) { this.name = name; }

    public void setId(int id) { this.id = id; }

    public void setGrade(double grade) { this.grade = grade; }

    // Utilities
    public String getGradeCategory() {
        String gradeCatergory = "";
        if (grade >= 50) {
            gradeCatergory = "Pass";
        } else {
            gradeCatergory = "Fail";
        }
        return gradeCatergory;
    }

    public void displayInfo() {
        String gradeCategory = getGradeCategory();
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Grade: " + getGrade());
        System.out.println("Grade Category: " + gradeCategory);
    }
}
