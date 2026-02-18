import java.util.ArrayList;
public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("No tasks available.");
        }

        for (int i = 0; i < tasks.size(); i++){
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }

    public void markTaskComplete(int index){
        if (index >=0 && index < tasks.size()){
            tasks.get(index).markComplete();
        }
    }

    public void deleteTask(int index) {
        if (index >=0 && index < tasks.size()){
            tasks.remove(index);
        }
    }
}