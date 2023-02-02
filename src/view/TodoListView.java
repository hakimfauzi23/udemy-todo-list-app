package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList(){
        while (true) {
            todoListService.showTodoList();

            System.out.println("MENU");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("x. Exit");

            var input = InputUtil.input("Choose Menu");
            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Invalid Menu!");
            }

        }

    }

    public void addTodoList(){
        System.out.println("ADD TO DO LIST");

        var todo = InputUtil.input("Todo ( Press [x] to exit)");

        if (todo.equals("x") ) {

        } else {
            todoListService.addTodoList(todo);
        }
    }

    public void  removeTodoList(){

    }
}
