public class TaskManagementTest {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(101, "Design UI", "Pending");
        taskList.addTask(102, "Write Code", "In Progress");
        taskList.addTask(103, "Testing", "Completed");

        System.out.println("Task List:");
        taskList.displayTasks();

        System.out.println("\nSearching Task:");
        Task task = taskList.searchTask(102);

        if (task != null) {
            task.display();
        } else {
            System.out.println("Task Not Found");
        }

        System.out.println("\nDeleting Task:");
        taskList.deleteTask(102);

        System.out.println("\nUpdated Task List:");
        taskList.displayTasks();
    }
}