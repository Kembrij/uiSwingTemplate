import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textPanel;

    private ToolBar toolbar;
    //private FormPanel formPanel;

    public MainFrame() {

        super("Hello World");

        setLayout(new BorderLayout());


        toolbar = new ToolBar();

        textPanel = new TextPanel();
        //formPanel = new FormPanel();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmmited(String text) {
                textPanel.appendText(text);
            }
        });



        add(toolbar, BorderLayout.NORTH);

        //add(formPanel, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);


        setSize(1366,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
