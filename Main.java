/**
 * Main.java
 * Driver program for the Student class.
 * Demonstrates object creation, method calls, and validation.
 *
 * Lab Exercise 02 — Option A
 */
public class Main {
    public static void main(String[] args) {

        // ----------------------------------------
        // 1. Create three Student objects
        // ----------------------------------------
        Student s1 = new Student("Ana Reyes", "2024-001", "BSCS",  1.25, 21);
        Student s2 = new Student("Ben Cruz",  "2024-002", "BSIT",  2.50, 18);
        Student s3 = new Student("Cara Lim",  "2024-003", "BSCS",  3.25, 12);

        // ----------------------------------------
        // 2. Display full profiles
        // ----------------------------------------
        s1.displayProfile();
        System.out.println();
        s2.displayProfile();
        System.out.println();
        s3.displayProfile();

        // ----------------------------------------
        // 3. Dean's List check
        // ----------------------------------------
        System.out.println("\n--- Dean's List Check ---");
        System.out.println(s1.getName() + ": " + s1.isDeansList());   // true  (GPA 1.25)
        System.out.println(s2.getName() + ": " + s2.isDeansList());   // false (GPA 2.50)
        System.out.println(s3.getName() + ": " + s3.isDeansList());   // false (GPA 3.25)

        // ----------------------------------------
        // 4. Full-time status check
        // ----------------------------------------
        System.out.println("\n--- Full-Time Status ---");
        System.out.println(s1.getName() + ": " + s1.isFullTime());    // true  (21 units)
        System.out.println(s2.getName() + ": " + s2.isFullTime());    // true  (18 units)
        System.out.println(s3.getName() + ": " + s3.isFullTime());    // false (12 units)

        // ----------------------------------------
        // 5. Tuition computation at P1,500/unit
        // ----------------------------------------
        System.out.println("\n--- Tuition (P1,500/unit) ---");
        System.out.printf("%s: P%.2f%n", s1.getName(), s1.getTuition(1500));  // P31,500.00
        System.out.printf("%s: P%.2f%n", s2.getName(), s2.getTuition(1500));  // P27,000.00
        System.out.printf("%s: P%.2f%n", s3.getName(), s3.getTuition(1500));  // P18,000.00

        // ----------------------------------------
        // 6. Getter demonstration
        // ----------------------------------------
        System.out.println("\n--- Getter Demo ---");
        System.out.println("s1 Name      : " + s1.getName());
        System.out.println("s1 Student ID: " + s1.getStudentId());
        System.out.println("s1 Course    : " + s1.getCourse());
        System.out.printf( "s1 GPA       : %.2f%n", s1.getGpa());
        System.out.println("s1 Units     : " + s1.getUnitsEnrolled());

        // ----------------------------------------
        // 7. Valid setter updates
        // ----------------------------------------
        System.out.println("\n--- Valid Updates ---");
        s3.setCourse("BSECE");
        s3.setGpa(2.75);
        s3.setUnitsEnrolled(15);
        System.out.println(s3.getName() + " updated course to: " + s3.getCourse());
        System.out.printf(s3.getName() + " updated GPA to: %.2f%n", s3.getGpa());
        System.out.println(s3.getName() + " updated units to: " + s3.getUnitsEnrolled());

        // ----------------------------------------
        // 8. Validation tests — invalid input
        // ----------------------------------------
        System.out.println("\n--- Validation Tests (expect error messages) ---");

        s1.setGpa(0.5);          // Error: below 1.00
        s1.setGpa(6.0);          // Error: above 5.00
        s2.setUnitsEnrolled(-3); // Error: negative units
        s2.setUnitsEnrolled(31); // Error: exceeds 30
        s3.setCourse("");        // Error: empty course string
        s3.setCourse(null);      // Error: null course string

        // ----------------------------------------
        // 9. Confirm data was NOT corrupted after invalid attempts
        // ----------------------------------------
        System.out.println("\n--- After Invalid Attempts (values must be unchanged) ---");
        s1.displayProfile();     // GPA should still be 1.25
        System.out.println();
        s2.displayProfile();     // Units should still be 18
        System.out.println();
        s3.displayProfile();     // Course should still be BSECE
    }
}