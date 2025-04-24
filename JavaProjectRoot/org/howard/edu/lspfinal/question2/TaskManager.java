package org.howard.edu.lspfinal.question2;

import java.util.*;

/**
 * Manages a collection of tasks.
 */
public class TaskManager {
    private Map<String, Task> tasks = new HashMap<>();

    /**
     * Adds a new task to the system.
     * @param name Task name (must be unique).
     * @param priority Task priority.
     * @param status Initial status of the task.
     * @throws DuplicateTaskException if a task with the same name already exists.
     */
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        tasks.put(name, new Task(name, priority, status));
    }

    /**
     * Retrieves a task by its name.
     * @param name The name of the task.
     * @return The task object.
     * @throws TaskNotFoundException if no task with the given name exists.
     */
    public Task getTaskByName(String name) throws TaskNotFoundException {
        if (!tasks.containsKey(name)) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return tasks.get(name);
    }

    /**
     * Updates the status of a task.
     * @param name Name of the task.
     * @param newStatus New status to assign.
     * @throws TaskNotFoundException if the task does not exist.
     */
    public void updateStatus(String name, String newStatus) throws TaskNotFoundException {
        Task task = getTaskByName(name);
        task.setStatus(newStatus);
    }

    /**
     * Prints all tasks grouped by their status.
     */
    public void printTasksGroupedByStatus() {
        Map<String, List<Task>> grouped = new HashMap<>();
        for (Task task : tasks.values()) {
            grouped.computeIfAbsent(task.getStatus(), k -> new ArrayList<>()).add(task);
        }

        System.out.println("Tasks grouped by status:");
        for (String status : Arrays.asList("TODO", "IN_PROGRESS", "DONE")) {
            System.out.println(status + ":");
            List<Task> list = grouped.getOrDefault(status, new ArrayList<>());
            for (Task task : list) {
                System.out.println(task);
            }
        }
    }
}
