import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    private static String kurz;
    private MyFrame frame;
    private Todo todo;
    private ArrayList<String> todoList = new ArrayList<>();
    private static Main mainInstanz;
    private String todoText;
    private TodoList actuallist;
    private String todoString;


    public static void main(String[] args) {
        mainInstanz = new Main();
        kurz = JOptionPane.showInputDialog("Welcome to your personal to-do List!\n Please enter your to-do.");

        mainInstanz.frame = new MyFrame();
        mainInstanz.frame.createAll();
        mainInstanz.frame.addButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainInstanz.frame.setValues();

                if(mainInstanz.frame.isButtonPressed()) {
                    mainInstanz.addTodoToList();
                    mainInstanz.frame.setVisible(false);
                    mainInstanz.actuallist = new TodoList(mainInstanz);
                }
            }
        });

    }

    public void addTodoToList(){
        addTodo();
        System.out.println(todo);
        todoString = todo.toString();
        todoList.add(todoString);
    }

    public void addTodo(){
        todo = new Todo(kurz, frame.getRank(), frame.getZeiti(), frame.getQuickiNote(), false);
    }

    public String getTodoString(){
        return todoString;
    }

}






