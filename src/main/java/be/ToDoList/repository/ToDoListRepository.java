package be.ToDoList.repository;

import be.ToDoList.model.ToDoList;

import java.util.List;

public interface ToDoListRepository {

    List<ToDoList> findByQuote(String quote);
    List<ToDoList> findAll();
    ToDoList findById();
    ToDoList save(ToDoList toDoList);
}
