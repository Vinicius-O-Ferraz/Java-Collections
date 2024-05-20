import java.util.ArrayList;
import java.util.List;

public class TasksList {
    
    private List<Task> taskList;

    public TasksList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description){
        taskList.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task> taskstoRemove  = new ArrayList<>();
        for (Task t: taskList){
            if (t.getDescription().equalsIgnoreCase(description)){
                taskstoRemove.add(t);
            }
        }
        taskList.removeAll(taskstoRemove);
    }

    public int getNumberOfTasks(){
        return taskList.size();
    }

    public void getDescriptionOfTasks(){
        System.out.println(taskList);
    }


    public static void main(String[] args) {
        TasksList t = new TasksList();

        System.out.println();
        System.out.println(t.getNumberOfTasks());
        t.addTask("get this working right");
        t.addTask("get this working right");
        System.out.println(t.getNumberOfTasks());
        t.removeTask("get this working right");
        System.out.println(t.getNumberOfTasks());



    }
}
