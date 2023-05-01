package com.edubridge;

/*
Problem Statement : Array CRUD Operation
1. As a user I should be able to add the task into an array
2. As a user I should be able to update the task in the array
3. As a user I should be able to delete the task in the array
4. As a user I should be able to search a task from an array 
*/

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		String[] tasks;//array name

		int ch = 0;
		int cnt = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of tasks you want to store...");//5
		int size = scanner.nextInt();
		tasks = new String[size];

		String task =" ";
		do {
			System.out.println("1. Insert new Task");
			System.out.println("2. Delete a Task");
			System.out.println("3. Update a Task");
			System.out.println("4. Search for a Task");
			System.out.println("5. Display All the Tasks");
			System.out.println("0. Exit");

			System.out.print("Enter your choice : ");
			ch = scanner.nextInt();
			scanner.nextLine(); // to clear the buffer
			//cnt is array size
			switch (ch) {
			case 1:
				if (cnt == tasks.length)
					System.out.println("Tasks array is overflow!!! you can not insert any more task...");
				else {
					System.out.println("Enter task you want to insert ... ");
					task = scanner.nextLine();

					tasks[cnt] = task;
					cnt++;
					System.out.println("Task is Successfully inserted...");
				}
				break;
			case 2:
				if (cnt == 0)//5
					System.out.println("There are no more Tasks in array...");
				else {
					System.out.println("Enter task you want to remove... ");
					//read,write,push,pop
					task = scanner.nextLine();
					int index = -1;
					for (int i = 0; i < cnt; i++) {
						
						if (tasks[i].equals(task)) {
							index = i;
							break;
						}
					}

					if (index == -1) {
						System.out.println("Task not found!!!");
					} else {
						for (int i = index; i < cnt - 1; i++) {
							tasks[i] = tasks[i + 1];
						}
						cnt--;
						System.out.println("Task is deleted...");
					}
				}
				break;
			case 3:

				if (cnt == 0)
					System.out.println("There are no more Tasks in array...");
				else {
					System.out.println("Enter task you want to udpate... ");
					task = scanner.nextLine();

					int index = -1;
					for (int i = 0; i < cnt; i++) {
						if (tasks[i].equals(task)) {
							index = i;//read

							System.out.println("Enter new task ... ");
							String newTask = scanner.nextLine();
							tasks[index] = newTask;
							System.out.println("Task updated successfully...");
							break;
						}
					}

					if (index == -1) {
						System.out.println("Task not found!!!");
					} 
				}
				break;
			case 4:
				if (cnt == 0)
					System.out.println("There are no more Tasks in array...");
				else {
					System.out.println("Enter task you want to search... ");
					task = scanner.nextLine();

					int index = -1;
					for (int i = 0; i < cnt; i++) {
						if (tasks[i].equals(task)) {
							index = i;
							break;
						}
					}
					if (index == -1)
						System.out.println("Task not found");
					else
						System.out.println("Your task is on position : " + (index + 1));
				}
				break;
			case 5:
				if (cnt == 0)
					System.out.println("There are no more Tasks in array...");
				else {
					for (int i = 0; i < cnt; i++) {
						System.out.println(tasks[i]);
					}
				}
				break;
			case 0:
				System.out.println("Good bye!!!");
				break;
			default:
				System.out.println("please check your input your choice does not exists!!!");
			}
		} while (ch != 0);
	}
}