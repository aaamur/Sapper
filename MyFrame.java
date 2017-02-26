package ru.cft.fs.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Student on 19/02/17.
 */
public class MyFrame extends JFrame {

  public MyFrame() throws HeadlessException {
    super("Sapper");
    setJMenuBar(getMyMenuBar());
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    GridBagLayout layout
      = new GridBagLayout();
    setLayout(layout);

    GridBagConstraints c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 0;


    JLabel lebel1 = new JLabel("First text");
    JLabel lebel2 = new JLabel("Second text");
    add(lebel1, c);
    c.gridy = 1;
    add(lebel2, c);

    JButton button = new JButton("Click me!!");
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        lebel1.setText("NEW very useful text");
      }
    });
    c.gridx = 1;
    add(button, c);

  }

  private JMenuBar getMyMenuBar() {
    Font font = new Font("Verdana", Font.PLAIN, 20);
    JMenuBar menuBar = new JMenuBar();
    menuBar.setFont(font);
    JMenu jmenu = new JMenu("File");
    jmenu.setFont(font);
    menuBar.add(jmenu);
    setJMenuBar(menuBar);

    jmenu.add(new JMenuItem("open"));
    jmenu.addSeparator();
    JMenuItem exit = new JMenuItem("exit");
    exit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    jmenu.add(exit);
    return menuBar;
  }

  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame();
    myFrame.setVisible(true);
    myFrame.setSize(500, 500);
  }
}
