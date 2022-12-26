public class App {

    /* Create Model For To Do List Data */
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) throws Exception {
        testViewAddTodoList();
    }

    /*
     * Show ToDo List
     */
    public static void showTodoList() {
        System.out.println("TO DO LIST!");
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
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(2);
        System.out.println(result);
    }

    public static String input(String info) {
        System.out.print(info + " : ");

        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    /*
     * Show ToDo List Interface
     */
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("MENU");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("x. Exit");

            var input = input("Choose Menu");
            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Invalid Menu!");
            }

        }
    }

    public static void testViewShowTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        viewShowTodoList();
    }

    /*
     * Show Add ToDo List Interface
     */
    public static void viewAddTodoList() {
        System.out.println("ADD TO DO LIST");

        var todo = input("Todo ( Press [x] to exit)");

        if (todo.equals("x")) {

        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Tiga");

        viewAddTodoList();

        showTodoList();
    }

    /*
     * Show Removal ToDo List Interface
     */
    public static void viewRemoveTodoList() {

    }
}
