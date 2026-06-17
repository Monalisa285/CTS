public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student(
                "Monalisa",
                "101",
                "A"
        );

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(student, view);

        // Display initial details
        System.out.println("Initial Student Data:");
        controller.updateView();

        // Update student details through controller
        controller.setStudentName("Monalisa T");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Student Data:");
        controller.updateView();
    }
}