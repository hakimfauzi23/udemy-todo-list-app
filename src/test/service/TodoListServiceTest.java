package test.service;

import entity.Todolist;
import repository.TodoListRepositoryImplementation;
import service.TodoListService;
import service.TodoListServiceImplementation;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testShowTodoList();

    }

    public static void testShowTodoList(){
        TodoListRepositoryImplementation todolistRepository = new TodoListRepositoryImplementation();
        todolistRepository.data[0] = new Todolist("Learning Java Basic");
        todolistRepository.data[1] = new Todolist("Learning Java OOP");
        todolistRepository.data[2] = new Todolist("Learning Java Standard Classes");

        TodoListService todoListService = new TodoListServiceImplementation(todolistRepository);

        todoListService.showTodoList();
    }
}
