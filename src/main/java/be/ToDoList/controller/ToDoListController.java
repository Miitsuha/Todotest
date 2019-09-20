package be.ToDoList.controller;

import be.ToDoList.model.ToDoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${spring.data.rest.base-path}/ToDoList")
public class ToDoListController {

    @Autowired
    private ToDoList toDoList;


}
