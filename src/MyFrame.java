import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton enterbutton;
    //private JButton button;

    private JLabel rankLabel;
    private JLabel quickNote;
    private JLabel zeit;

    private JTextField rank_text;
    private JTextField zeittext;
    private JTextField quickNote_text;


    private int rank;
    private String quickiNote;
    private String zeiti;
    private boolean buttonPressed = false;




    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,300);

        createPanel();

        createLabelsText1();
        createLabelsText2();
        createLabelsText3();
        createEnterButton();

        this.setVisible(true);

    };

    public void createPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    public void createLabelsText1(){
        rankLabel = new JLabel("Beginning from #1, what rank should it have?");
        rankLabel.setBounds(10,20,300,25);
        this.add(rankLabel);

        rank_text = new JTextField();
        rank_text.setBounds(5,40, 300,25);
        this.add(rank_text);


    }
    public void createLabelsText2(){
        quickNote = new JLabel("Enter a quick Note about this to-do.");
        quickNote.setBounds(10,65,300,25);
        this.add(quickNote);

        quickNote_text = new JTextField();
        quickNote_text.setBounds(5,85, 300,25);
        this.add(quickNote_text);
    }

    public void createLabelsText3(){
        zeit = new JLabel("Should this to-do be done by today/tomorrow/later?");
        zeit.setBounds(10,105,400,25);
        this.add(zeit);

        zeittext = new JTextField();
        zeittext.setBounds(5,125, 300,25);
        this.add(zeittext);
    }

    public void createEnterButton(){
        enterbutton = new JButton("Enter");
        enterbutton.setBounds(0,160,80,25);
        this.add(enterbutton);
    }

    //public void checkedButton(){
   //     button = new JButton();
   //     button.setBounds(150,200,50,30);
   //     this.add(button);

    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==enterbutton) {
            rank = Integer.parseInt(rank_text.getText());
            quickiNote = quickNote_text.getText();
            zeiti = zeittext.getText();
            buttonPressed = true;
        }
    }

    public void addButtonActionListener(ActionListener listener) {
        enterbutton.addActionListener(listener);
    }

    public int getRank(){
        return rank;
    }
    public String getQuickiNote(){
        return quickiNote;
    }
    public String getZeiti(){
        return zeiti;
    }

    public boolean isButtonPressed(){
        return buttonPressed;
    }
}
