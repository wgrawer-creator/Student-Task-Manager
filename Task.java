public class Task {
    private String title;
    private boolean completed;

    public Task(String title){
        this.title = title;
        this.completed = false;
    }

    public void markComplete(){
        completed = true;
    }

    public String toString(){
        return title + (completed ? " (Completed)" : " (Pending)");
    }
}
