package swing;

import java.awt.*;
import javax.swing.*;

public class PhoneFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 350);

        setCenter(frame);
        setSouth(frame);

        frame.setMinimumSize(new Dimension(200, 350));
        frame.setVisible(true);
    }

    // Центр: текстовая область
    public static void setCenter(JFrame fr) {
        JTextArea area = new JTextArea("TextArea");
        area.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        fr.add(area, BorderLayout.CENTER);
    }

    // Низ: ряд из трёх кнопок + клавиатура 4x3
    public static void setSouth(JFrame fr) {
        JPanel south = new JPanel(new BorderLayout());
        south.add(createSoftKeys(), BorderLayout.NORTH);
        south.add(createKeypad(), BorderLayout.CENTER);
        south.setPreferredSize(new Dimension(200, 220));
        fr.add(south, BorderLayout.SOUTH);
    }

    // Ряд кнопок "Кнопка 1", "Меню", "Кнопка 2"
    private static JPanel createSoftKeys() {
        JPanel p = new JPanel(new GridLayout(1, 3, 3, 0));
        p.setBorder(BorderFactory.createEmptyBorder(5, 3, 5, 3));
        Font f = new Font("SansSerif", Font.BOLD, 10);
        for (String s : new String[]{"Кнопка 1", "Меню", "Кнопка 2"}) {
            JButton b = new JButton(s);
            b.setFont(f);
            p.add(b);
        }
        return p;
    }

    // Цифровая клавиатура телефона
    private static JPanel createKeypad() {
        JPanel p = new JPanel(new GridLayout(4, 3));
        String[] keys = {
                "1", "2 ABC", "3 DEF",
                "4 GHI", "5 JKL", "6 MNO",
                "7 PQRS", "8 TUV", "9 WXYZ",
                "*", "0", "#"
        };
        for (String k : keys) {
            JButton b = new JButton(k);
            b.setFont(new Font("SansSerif", Font.PLAIN, 11));
            p.add(b);
        }
        return p;
    }
}