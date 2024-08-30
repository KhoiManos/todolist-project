import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TodoList extends MyFrame{
    private Main instance = new Main();
    private JTextArea textArea;
    private JScrollPane scrollPane = new JScrollPane(textArea);


    public TodoList(){
        super();
        setLocationRelativeTo(null);
        setTitle("To-do List");
        this.add(scrollPane);
        this.setVisible(true);
    }


    public void fillWholeList(){
        textArea = new JTextArea(instance.todoText());
    }
}
