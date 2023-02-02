package test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImplementation;
import service.TodoListService;
import service.TodoListServiceImplementation;

public class TodoListServiceTest {

    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImplementation todolistRepository = new TodoListRepositoryImplementation();
        todolistRepository.data[0] = new Todolist("Learning Java Basic");
        todolistRepository.data[1] = new Todolist("Learning Java OOP");
        todolistRepository.data[2] = new Todolist("Learning Java Standard Classes");

        TodoListService todoListService = new TodoListServiceImplementation(todolistRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImplementation();

        TodoListService todoListService = new TodoListServiceImplementation(todoListRepository);

        todoListService.addTodoList("Learning Basic Java [From Add]");
        todoListService.addTodoList("Learning OOP Java [From Add]");
        todoListService.addTodoList("Learning Standard Classes Java [From Add]");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImplementation();
        TodoListService todoListService = new TodoListServiceImplementation(todoListRepository);

        todoListService.addTodoList("Learning Basic Java [From Remove Test]");
        todoListService.addTodoList("Learning OOP Java [From Remove Test]");
        todoListService.addTodoList("Learning Standard Classes Java [From Remove Test]");

        todoListService.showTodoList();

        todoListService.removeTodoList(3);
        todoListService.removeTodoList(9);
        todoListService.removeTodoList(1);

        todoListService.showTodoList();

    }
}
