package org.howard.edu.lspfinal.question2;

/**
 * Represents a task with a name, priority, and status.
 */
public class Task {
    private String name;
    private int priority;
    private String status;

    /**
     * Constructs a new Task.
     * @param name Task name.
     * @param priority Task priority (lower number = higher priority).
     * @param status Task status: "TODO", "IN_PROGRESS", or "DONE".
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}
