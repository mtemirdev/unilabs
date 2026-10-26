package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorWindowEvents {
    public static void main(String[] args) {
        // Создание главного окна с заголовком
        JFrame frame = new JFrame("Лабораторная №5 — Вариант 5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Текстовое поле ввода (СЕВЕР)
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 16));

        // 2. Панель кнопок (ЦЕНТР)
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        JButton[] buttons = new JButton[3];

        // =========================================================================
        // СЛУШАТЕЛЬ 1: ActionListener (обработка нажатия на кнопки "1", "2", "3")
        // =========================================================================
        ActionListener buttonClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Добавляем текст кнопки (1, 2 или 3) в конец текстового поля
                textField.setText(textField.getText() + e.getActionCommand());
            }
        };

        // =========================================================================
        // СЛУШАТЕЛЬ 2: MouseAdapter (изменение фона кнопки при наведении мыши)
        // =========================================================================
        MouseAdapter mouseHoverAdapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Подсвечиваем кнопку желтым цветом при наведении курсора
                e.getComponent().setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Возвращаем стандартный цвет при уходе курсора
                e.getComponent().setBackground(null);
            }
        };

        // Инициализация массива кнопок
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            // Подключаем слушатели к каждой кнопке
            buttons[i].addActionListener(buttonClickListener);
            buttons[i].addMouseListener(mouseHoverAdapter);
            buttonsPanel.add(buttons[i]);
        }

        // =========================================================================
        // СЛУШАТЕЛЬ 3: MouseWheelListener (регулировка размера шрифта колесиком мыши)
        // =========================================================================
        textField.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                Font currentFont = textField.getFont();
                // Если крутим от себя (e.getWheelRotation() < 0) — шрифт увеличивается, к себе — уменьшается
                int newSize = currentFont.getSize() - e.getWheelRotation() * 2;
                if (newSize >= 10 && newSize <= 36) { // Ограничение размера шрифта от 10pt до 36pt
                    textField.setFont(new Font(currentFont.getName(), currentFont.getStyle(), newSize));
                }
            }
        });

        // =========================================================================
        // СЛУШАТЕЛЬ 4 (Дополнительный): KeyAdapter (очистка поля при нажатии Escape)
        // =========================================================================
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    textField.setText(""); // Очищаем поле по клавише ESC
                }
            }
        });

        // 3. Сборка интерфейса
        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonsPanel, BorderLayout.CENTER);

        // Упаковка и отображение окна
        frame.pack();
        frame.setMinimumSize(new Dimension(320, 120));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
