package com.j.ToDoApplication.Controller;


import com.j.ToDoApplication.Repository.ToDoRepository;
import com.j.ToDoApplication.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/todo")
public class ToDoController {


    @Autowired
    private ToDoRepository toDoRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewTodo (@RequestParam String todoItem,
                                            @RequestParam boolean completed) {

        ToDo n = new ToDo();
        n.setTodoItem(todoItem);
        n.setCompleted(completed);
        toDoRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<ToDo> getAllTodos() {
        return toDoRepository.findAll();
    }

}
