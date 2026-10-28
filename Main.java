void main(String[] args) {
        String task1 = "Buy milk";
        String task2 = "Walk the dog";
        boolean task1Removed = false;
        boolean task2Removed = false;
        boolean task1Done = true;
        boolean task2Done = false;

        String status1 = "[ ]";
        if (task1Done) {
            status1 = "[x]";
        }
        String status2 = "[ ]";
        if (task2Done) {
            status2 = "[x]";
        }

        System.out.println("My tasks:");

// Bonus
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();

        if (!task1Removed) {
            System.out.println("1. " + status1 + " " + task1);
        }

        if (!task2Removed) {
            System.out.println("2. " + status2 + " " + task2);
        }

//  String[] taskList = {task1, task2};
//	PrintList(taskList);
    }

    void PrintList(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + ". " + list[i]);
        }
    }

    String[] AddToList(String[] list, String itemToAppend) {
        String[] newList = new String[list.length + 1];

        System.arraycopy(list, 0, newList, 0, list.length);
        newList[newList.length - 1] = itemToAppend;

        return newList;
    }

    public static void countTasks(List<Task> tasks) {
        int total = tasks.size();
        int done = 0;
        for (Task t : tasks) {
            if (t.done) {
                done++;
            }
        }
        System.out.println(done + "/" + total + " tasks complete");
    }

public static void addTask(String taskName) {
    addTask(taskName, "normal");
}

public static void addTask(String taskName, String priority) {
    tasks.add(new Task(taskName));
    System.out.println("Added task: " + taskName + " (priority: " + priority + ")");
}
