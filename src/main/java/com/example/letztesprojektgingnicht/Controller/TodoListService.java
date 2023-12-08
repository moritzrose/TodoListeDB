package com.example.letztesprojektgingnicht.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TodoListService {

    TodoListRepository todoListRepository;

    @Autowired
    TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }


    HashMap<Long,Todo> todos;
    Long id;

    public TodoListService() {
        this.todos = new HashMap<>();
        this.id = 0L;
        DataLoader("Putzen");
        DataLoader("Kochen");
        DataLoader("Aufräumen");
    }

    public void DataLoader(String name){
        todos.put(id,new Todo(id, name, false));
        id++;
    }


    public Todo addTodo(String name){
        Todo todo = new Todo(id, name, false);
        todos.put(id, todo);
        id++;
        return todo;
    }

    public HashMap<Long, Todo> getAllTodos() {
        return todos;
    }

    public Todo deleteTodo(Long id) {
        return todos.remove(id);
    }

    public Todo changeTodoStatus(Long id) {
        Boolean statusChange = !todos.get(id).getCompleted();
        todos.get(id).setCompleted(statusChange);;
        return todos.get(id);
    }
}
