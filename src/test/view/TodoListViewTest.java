package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImplementation;
import service.TodoListService;
import service.TodoListServiceImplementation;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
//        testShowTodoList();
        testAddTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImplementation();
        TodoListService todoListService = new TodoListServiceImplementation(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Learning Basic Java");
        todoListService.addTodoList("Learning OOP Java");
        todoListService.addTodoList("Learning Standard Classes Java");

        todoListView.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImplementation();
        TodoListService todoListService = new TodoListServiceImplementation(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListService.showTodoList();
        todoListView.addTodoList();
        todoListService.showTodoList();
    }


}
