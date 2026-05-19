
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ana Reyes", "2024-001", "BSCS",  1.25, 21);
        Student s2 = new Student("Ben Cruz",  "2024-002", "BSIT",  2.50, 18);
        Student s3 = new Student("Cara Lim",  "2024-003", "BSCS",  3.25, 12);

        s1.displayProfile();
        System.out.println();
        s2.displayProfile();
        System.out.println();
        s3.displayProfile();

        System.out.println("\n--- Dean's List Check ---");
        System.out.println(s1.getName() + ": " + s1.isDeansList());   
        System.out.println(s2.getName() + ": " + s2.isDeansList()); 
        System.out.println(s3.getName() + ": " + s3.isDeansList());   


        System.out.println("\n--- Full-Time Status ---");
        System.out.println(s1.getName() + ": " + s1.isFullTime());
        System.out.println(s2.getName() + ": " + s2.isFullTime());
        System.out.println(s3.getName() + ": " + s3.isFullTime());

        System.out.println("\n--- Tuition (P1,500/unit) ---");
        System.out.printf("%s: P%.2f%n", s1.getName(), s1.getTuition(1500));
        System.out.printf("%s: P%.2f%n", s2.getName(), s2.getTuition(1500));
        System.out.printf("%s: P%.2f%n", s3.getName(), s3.getTuition(1500));

        System.out.println("\n--- Getter Demo ---");
        System.out.println("s1 Name      : " + s1.getName());
        System.out.println("s1 Student ID: " + s1.getStudentId());
        System.out.println("s1 Course    : " + s1.getCourse());
        System.out.printf( "s1 GPA       : %.2f%n", s1.getGpa());
        System.out.println("s1 Units     : " + s1.getUnitsEnrolled());

        System.out.println("\n--- Valid Updates ---");
        s3.setCourse("BSECE");
        s3.setGpa(2.75);
        s3.setUnitsEnrolled(15);
        System.out.println(s3.getName() + " updated course to: " + s3.getCourse());
        System.out.printf(s3.getName() + " updated GPA to: %.2f%n", s3.getGpa());
        System.out.println(s3.getName() + " updated units to: " + s3.getUnitsEnrolled());

        System.out.println("\n--- Validation Tests (expect error messages) ---");

        s1.setGpa(0.5);          
        s1.setGpa(6.0);          
        s2.setUnitsEnrolled(-3);
        s2.setUnitsEnrolled(31);
        s3.setCourse("");        
        s3.setCourse(null);     

        System.out.println("\n--- After Invalid Attempts (values must be unchanged) ---");
        s1.displayProfile();    
        System.out.println();
        s2.displayProfile();    
        System.out.println();
        s3.displayProfile();
    }
}