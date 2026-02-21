package Exercises.javase015;

public class Task {
    private String id;
    private String description;
    private String priority;
    private boolean completed;

    public Task(String id, String description, String priority, boolean completed){
        setDescription(description);
        setId(id);
        setPriority(priority);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    

}
