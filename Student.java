public class Student {

    private String name;
    private String studentId;
    private String course;
    private double gpa;          
    private int unitsEnrolled;  

     */
    public Student(String name, String studentId, String course,
                   double gpa, int unitsEnrolled) {

        this.name = name;
        this.studentId = studentId;

        setCourse(course);
        setGpa(gpa);
        setUnitsEnrolled(unitsEnrolled);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    public int getUnitsEnrolled() {
        return unitsEnrolled;
    }


    public void setCourse(String course) {
        if (course == null || course.trim().isEmpty()) {
            System.out.println("Error: Course cannot be empty. Value not updated.");
            return;
        }
        this.course = course.trim();
    }

    public void setGpa(double gpa) {
        if (gpa < 1.00 || gpa > 5.00) {
            System.out.printf("Error: GPA %.2f is out of range (1.00 – 5.00). Value not updated.%n", gpa);
            return;
        }
        this.gpa = gpa;
    }

    public void setUnitsEnrolled(int unitsEnrolled) {
        if (unitsEnrolled < 1 || unitsEnrolled > 30) {
            System.out.println("Error: Units enrolled " + unitsEnrolled
                    + " is out of range (1 – 30). Value not updated.");
            return;
        }
        this.unitsEnrolled = unitsEnrolled;
    }

    public boolean isDeansList() {
        return gpa <= 1.75;
    }

    public boolean isFullTime() {
        return unitsEnrolled >= 18;
    }

    public double getTuition(double ratePerUnit) {
        return unitsEnrolled * ratePerUnit;
    }
  
    public void displayProfile() {
        System.out.println("========================================");
        System.out.println("           STUDENT PROFILE              ");
        System.out.println("========================================");
        System.out.println("Name          : " + name);
        System.out.println("Student ID    : " + studentId);
        System.out.println("Course        : " + course);
        System.out.printf( "GPA           : %.2f%n", gpa);
        System.out.println("Units Enrolled: " + unitsEnrolled);
        System.out.println("Dean's List   : " + (isDeansList() ? "Yes" : "No"));
        System.out.println("Full-Time     : " + (isFullTime()  ? "Yes" : "No"));
        System.out.println("========================================");
    }
}