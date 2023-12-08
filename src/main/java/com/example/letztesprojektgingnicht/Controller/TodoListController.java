package com.example.letztesprojektgingnicht.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController()
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TodoListController {


    TodoListService todoListService = new TodoListService();

    @PostMapping("/api/todo")
    public Todo addTodo(@RequestBody String todoName ) {
        return todoListService.addTodo(todoName);
    }

    @GetMapping("/api/todos")
    public HashMap<Long,Todo> getAllTodos(){
        return todoListService.getAllTodos();
    }
    @DeleteMapping("/api/todo/{id}")
    public Todo deleteTodo(@PathVariable Long id){
        return todoListService.deleteTodo(id);
    }

    @PutMapping("api/todo/{id}")
    public Todo completeTodo(@PathVariable Long id){
        return todoListService.changeTodoStatus(id);
    }
}
