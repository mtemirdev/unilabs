package swing;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Вызов отдельного метода для каждого региона BorderLayout
        setNorth(frame);
        setWest(frame);
        setEast(frame);
        setCenter(frame);
        setSouth(frame);

        frame.setVisible(true);
        frame.pack();
        frame.setMinimumSize(frame.getSize());
    }

    // Метод для заполнения верхней области (NORTH)
    public static void setNorth(JFrame fr) {
        JPanel myPanel1 = new JPanel(new FlowLayout());
        myPanel1.add(new JButton("Кнопка 1"));
        myPanel1.add(Box.createHorizontalStrut(40));
        myPanel1.add(new JButton("<html><b><font color=\"red\" size=14>Кнопка 2</font></b></html>"));
        fr.add(myPanel1, BorderLayout.NORTH);
    }

    // Метод для заполнения левой области (WEST)
    public static void setWest(JFrame fr) {
        Box myBox1 = new Box(BoxLayout.Y_AXIS);
        myBox1.add(Box.createVerticalStrut(20));
        myBox1.add(new JLabel("Метка1"));
        myBox1.add(Box.createVerticalGlue());
        myBox1.add(new JLabel("Метка2"));
        myBox1.add(Box.createVerticalGlue());
        myBox1.add(new JCheckBox("Выбор"));
        myBox1.add(Box.createVerticalStrut(20));
        fr.add(myBox1, BorderLayout.WEST);
    }

    // Метод для заполнения правой области (EAST)
    public static void setEast(JFrame fr) {
        ButtonGroup myGroup = new ButtonGroup();
        JPanel myPanel2 = new JPanel(new GridLayout(3, 2));
        ArrayList<JRadioButton> masRB = new ArrayList<JRadioButton>();

        for (int i = 0; i < 6; i++) {
            masRB.add(new JRadioButton("Выбор " + i));
            myGroup.add(masRB.get(i));
            myPanel2.add(masRB.get(i));
        }
        masRB.get(0).setSelected(true);
        fr.add(myPanel2, BorderLayout.EAST);
    }

    // Метод для заполнения центральной области (CENTER)
    public static void setCenter(JFrame fr) {
        fr.add(new JTextArea(), BorderLayout.CENTER);
    }

    // Метод для заполнения нижней области (SOUTH)
    public static void setSouth(JFrame fr) {
        fr.add(new JTextField(), BorderLayout.SOUTH);
    }
}
