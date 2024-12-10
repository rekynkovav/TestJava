package visualСomponent;

import javax.swing.*;
import java.awt.*;

class Window extends JFrame {

    private Window window;
    private JButton jButtonAddTask;
    private JPanel panel;
    private JLabel jLabelTask;
    private JLabel jLabelTitle;
    private JLabel jLabelDescription;
    private JLabel jLabelTaskAuthor;
    private JLabel jLabelTaskPerformer;
    private JLabel jLabelPriority;
    private JTextField jTextTitle;
    private JTextField jTextDescription;
    private JTextField jTextTaskAuthor;
    private JTextField jTextTaskPerformer;
    private JTextField jTextTaskPriority;
    private GridBagConstraints constraints;
    private GridBagLayout layout;
    private Font font;

    void go() {

        window = new Window();
        window.setTitle("Список задач");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(400, 100, 600, 600);

        layout = new GridBagLayout();
        constraints = new GridBagConstraints();
        font = new Font("Times New Roman", Font.PLAIN,22);

        panel = new JPanel();
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.setPreferredSize(new Dimension(600, 600));
        panel.setVisible(true);
        panel.setLayout(layout);
        window.getContentPane().add(panel);

        constraints.gridwidth = 2;
        jLabelTask = new JLabel("Добавьте задачу:");
        jLabelTask.setFont(font);
        layout.setConstraints(jLabelTask,constraints);
        panel.add(jLabelTask, constraints);

        constraints.gridwidth = 1;
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.CENTER;
        jLabelTitle = new JLabel("Название задачи");
        jLabelTitle.setFont(font);
        jTextTitle = new JTextField(20);
        panel.add(jLabelTitle, constraints);
        constraints.gridy = 1;
        constraints.gridx = 1;
        panel.add(jTextTitle, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.CENTER;
        jLabelDescription = new JLabel("Описание задачи");
        jLabelDescription.setFont(font);
        jTextDescription = new JTextField(20);/////
        panel.add(jLabelDescription, constraints);
        constraints.gridy = 2;
        constraints.gridx = 1;
        panel.add(jTextDescription, constraints);

        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.CENTER;
        jLabelTaskAuthor = new JLabel("Автор задачи");
        jLabelTaskAuthor.setFont(font);
        jTextTaskAuthor = new JTextField(20);
        panel.add(jLabelTaskAuthor, constraints);
        constraints.gridy = 3;
        constraints.gridx = 1;
        panel.add(jTextTaskAuthor, constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.CENTER;
        jLabelTaskPerformer = new JLabel("Исполнитель задачи");
        jLabelTaskPerformer.setFont(font);
        jTextTaskPerformer = new JTextField(20);
        panel.add(jLabelTaskPerformer, constraints);
        constraints.gridy = 4;
        constraints.gridx = 1;
        panel.add(jTextTaskPerformer, constraints);

        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.CENTER;
        jLabelPriority = new JLabel("Приоритет от 1 до 3");
        jLabelPriority.setFont(font);
        jTextTaskPriority = new JTextField(20);
        panel.add(jLabelPriority, constraints);
        constraints.gridy = 5;
        constraints.gridx = 1;
        panel.add(jTextTaskPriority, constraints);

        jButtonAddTask = new JButton("Добавить");
        constraints.gridy = 6;
        constraints.fill = GridBagConstraints.CENTER;
        panel.add(jButtonAddTask, constraints);

        window.pack();
        window.setVisible(true);
    }
}
