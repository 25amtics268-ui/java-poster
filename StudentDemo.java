/**
 * Demonstrates passing an object to a method and returning an object.
 */
public class StudentDemo {

    /**
     * Adds 5 marks to the student and returns the same object reference.
     *
     * @param student the student whose marks will be updated
     * @return the same Student object after updating its marks
     */
    static Student process(Student student) {
        student.marks += 5;
        return student;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aman", 80);
        Student s2 = process(s1);

        System.out.println("Name: " + s2.name);
        System.out.println("Marks: " + s2.marks);
    }
}
