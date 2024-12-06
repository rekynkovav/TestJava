package visualСomponent;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

        private Window window;
        private JPanel panel;
        private JButton buttonAddTask;


    protected void go() {
        window = new Window();
        window.setTitle("Список задач");
        window.setSize(815, 838);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(815,838));
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());
        panel.setVisible(true);
        window.getContentPane().add(panel);

        buttonAddTask = new JButton("+");
        buttonAddTask.setVisible(true);
        buttonAddTask.setLayout(null);
        buttonAddTask.setBounds(40,40, 200,200);
        panel.add(buttonAddTask);

        window.pack();
        window.setVisible(true);


    }
}
