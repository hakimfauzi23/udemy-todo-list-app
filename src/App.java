public class App {

    /* Create Model For To Do List Data */
    public static String[] model = new String[10];

    public static void main(String[] args) throws Exception {
    }

    /*
     * Show ToDo List
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var number = i + 1;

            if (todo != null) {
                System.out.println(number + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Learn New Programming Lang";
        model[1] = "Build To Do List App";

        showTodoList();
    }

    /*
     * Add ToDo List
     */
    public static void addTodoList() {

    }

    /*
     * Remove ToDo List
     */
    public static void removeTodoList() {

    }

    /*
     * Show ToDo List Interface
     */
    public static void viewShowTodoList() {

    }

    /*
     * Show Add ToDo List Interface
     */
    public static void viewAddTodoList() {

    }

    /*
     * Show Removal ToDo List Interface
     */
    public static void viewRemoveTodoList() {

    }
}
