package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImplementation implements TodoListService {

    private TodoListRepository todolistRepository;

    public TodoListServiceImplementation(TodoListRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodoList() {
        System.out.println("TO DO LIST!");

        Todolist[] model = todolistRepository.getAll();

        for (var i = 0; i < model.length; i++) {
            var todolist = model[i];
            var number = i + 1;

            if (todolist != null) {
                System.out.println(number + ". " + todolist.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {

    }

    @Override
    public void removeTodoList(Integer number) {

    }
}