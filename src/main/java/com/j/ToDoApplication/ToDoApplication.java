package com.j.ToDoApplication;

import com.j.ToDoApplication.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner {

	@Autowired
	ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ToDo toDoItemOne = new ToDo("Get new TV", false);
		ToDo toDoItemTwo = new ToDo("Get the cat back", false);
		ToDo toDoItemThree = new ToDo("Create installation file", true);
		ToDo toDoItemFour = new ToDo("Take a walk", false);

		toDoRepository.save(toDoItemOne);
		toDoRepository.save(toDoItemTwo);
		toDoRepository.save(toDoItemThree);
		toDoRepository.save(toDoItemFour);

		toDoRepository.findBytodoItem("Get new TV").forEach(
				val -> System.out.println(val)
		);

		toDoRepository.findBycompleted(true).forEach(
				val -> System.out.println(val)
		);

		toDoRepository.findById(2).ifPresent(
				val -> System.out.println(val)
		);

		System.out.println(toDoRepository.count());

		toDoRepository.deleteById(2);
		System.out.println(toDoRepository.count());
	}
}
