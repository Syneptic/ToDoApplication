package com.j.ToDoApplication;

import javax.persistence.*;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String todoItem;

    private Boolean completed;

    public ToDo() {
    }


    public ToDo(String todoItem, Boolean completed) {
        this.todoItem = todoItem;
        this.completed = completed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(String todoItem) {
        this.todoItem = todoItem;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", todoItem='" + todoItem + '\'' +
                ", completed=" + completed +
                '}';
    }
}
