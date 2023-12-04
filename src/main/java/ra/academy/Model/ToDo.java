package ra.academy.Model;


public class ToDo {
    // khai báo đối tượng
    private int id;
    private String task;
    private boolean status;

    public ToDo() {
    }

    public ToDo(int id, String task, boolean status) {
        this.id = id;
        this.task = task;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}