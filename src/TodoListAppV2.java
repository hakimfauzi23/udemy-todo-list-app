import repository.TodoListRepository;
import repository.TodoListRepositoryImplementation;
import service.TodoListService;
import service.TodoListServiceImplementation;
import view.TodoListView;

public class TodoListAppV2 {

    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImplementation();
        TodoListService todoListService = new TodoListServiceImplementation(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();

    }
}
