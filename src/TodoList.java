import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TodoList extends MyFrame{
    private JLabel todolabel;
    private Main instance;
    private String regex = "rank=(\\d+)";
    private String ranknumber;
    private String result;


    public TodoList(Main mainInstance){
        super();
        this.instance = mainInstance; //in order to let 'getTodo()' not be null, I had to use the same main Instance which has the inserted values. If I had used a new Main instance to use 'getTodo()' (as I did :P), I always would have getTodo() to be null ._.
        setTitle("To-do List");
        createString();
        cleanString();
        insertString();
    }

    public void createString(){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(instance.getTodoString());
        matcher.find();
        ranknumber = matcher.group(1);
        result = "chicken";

    }

    public void cleanString(){
        String removeregex = "rank=\\d+,?\\s*";
        result = instance.getTodoString().replaceAll(removeregex, "");
        System.out.println(result);
    }

    public void insertString(){
        todolabel = new JLabel(ranknumber +" " + result);

        todolabel.setBounds(10,20,550,25);
        this.add(todolabel);
        this.setVisible(true);
    }

}
