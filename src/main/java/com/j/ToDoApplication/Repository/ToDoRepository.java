package com.j.ToDoApplication.Repository;

import com.j.ToDoApplication.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

    List<ToDo> findBytodoItem(String todoItem);
    List<ToDo> findBycompleted(Boolean completed);

}
