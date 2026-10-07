void main(String[] args) {
	String task1 = "Buy milk";
	String task2 = "Walk the dog";
	boolean task1Removed = false;
	boolean task2Removed = true;
	
	String[] taskList = {task1, task2};
	
	taskList = AddToList(taskList, "Go home");

	System.out.println("My tasks:");
	if (!task1Removed) {
		System.out.println("1. " + task1);
	}

	if (!task2Removed) {
		System.out.println("2. " + task2);
	}
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
