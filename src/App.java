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
    public static void addTodoList(String todo) {

        // Check if model is full, if it's full resize the array.
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var temp = model;

            // If The Array is resized, then all the element is gone!
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // Add to Null Array Element
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Cpntoh to do Ke. " + i);
        }
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
