/**
 * Student.java
 * Represents a university student with encapsulated fields,
 * validated setters, and state-driven behavior methods.
 *
 * Lab Exercise 02 — Option A
 */
public class Student {

    // -------------------------
    // Private instance variables
    // -------------------------
    private String name;
    private String studentId;
    private String course;
    private double gpa;          // Valid range: 1.00 – 5.00
    private int unitsEnrolled;   // Valid range: 1 – 30


    // -------------------------
    // Constructor
    // -------------------------

    /**
     * Initializes a Student object with all required fields.
     * Delegates to setters so validation runs on construction.
     *
     * @param name           Full name of the student
     * @param studentId      Unique student ID
     * @param course         Degree program (e.g., BSCS)
     * @param gpa            Grade Point Average (1.00 – 5.00)
     * @param unitsEnrolled  Number of enrolled units (1 – 30)
     */
    public Student(String name, String studentId, String course,
                   double gpa, int unitsEnrolled) {
        // Name and studentId are set directly (no mutable setter exposed)
        this.name = name;
        this.studentId = studentId;

        // Use validated setters for the remaining fields
        setCourse(course);
        setGpa(gpa);
        setUnitsEnrolled(unitsEnrolled);
    }


    // -------------------------
    // Getters (all fields)
    // -------------------------

    /** Returns the student's full name. */
    public String getName() {
        return name;
    }

    /** Returns the student ID. */
    public String getStudentId() {
        return studentId;
    }

    /** Returns the degree program. */
    public String getCourse() {
        return course;
    }

    /** Returns the current GPA. */
    public double getGpa() {
        return gpa;
    }

    /** Returns the number of units currently enrolled. */
    public int getUnitsEnrolled() {
        return unitsEnrolled;
    }


    // -------------------------
    // Setters (with validation)
    // -------------------------

    /**
     * Updates the student's degree program.
     * Rejects null or blank course strings.
     *
     * @param course New course/program name
     */
    public void setCourse(String course) {
        if (course == null || course.trim().isEmpty()) {
            System.out.println("Error: Course cannot be empty. Value not updated.");
            return;
        }
        this.course = course.trim();
    }

    /**
     * Updates the student's GPA.
     * Valid range: 1.00 to 5.00 (inclusive).
     *
     * @param gpa New GPA value
     */
    public void setGpa(double gpa) {
        if (gpa < 1.00 || gpa > 5.00) {
            System.out.printf("Error: GPA %.2f is out of range (1.00 – 5.00). Value not updated.%n", gpa);
            return;
        }
        this.gpa = gpa;
    }

    /**
     * Updates the number of enrolled units.
     * Valid range: 1 to 30 (inclusive).
     *
     * @param unitsEnrolled New unit count
     */
    public void setUnitsEnrolled(int unitsEnrolled) {
        if (unitsEnrolled < 1 || unitsEnrolled > 30) {
            System.out.println("Error: Units enrolled " + unitsEnrolled
                    + " is out of range (1 – 30). Value not updated.");
            return;
        }
        this.unitsEnrolled = unitsEnrolled;
    }


    // -------------------------
    // Instance / Behavior Methods
    // -------------------------

    /**
     * Checks whether the student qualifies for the Dean's List.
     * A student is on the Dean's List if their GPA is 1.75 or below.
     *
     * @return true if GPA <= 1.75, false otherwise
     */
    public boolean isDeansList() {
        return gpa <= 1.75;
    }

    /**
     * Checks whether the student is enrolled full-time.
     * Full-time status requires at least 18 units.
     *
     * @return true if unitsEnrolled >= 18, false otherwise
     */
    public boolean isFullTime() {
        return unitsEnrolled >= 18;
    }

    /**
     * Calculates the total tuition fee based on a per-unit rate.
     *
     * @param ratePerUnit  Cost per unit in Philippine Peso
     * @return Total tuition fee (unitsEnrolled × ratePerUnit)
     */
    public double getTuition(double ratePerUnit) {
        return unitsEnrolled * ratePerUnit;
    }

    /**
     * Prints a complete profile summary of the student to the console.
     */
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