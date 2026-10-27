package gui;

import java.awt.*;
import javax.swing.*;

/**
 * Лабораторная работа №6. Индивидуальное задание.
 * Нарисовать свою фамилию линиями разной толщины, цвета и стиля с помощью Graphics2D.
 */
public class SurnameGraphicsWindow extends JFrame {

    public static class SurnamePanel extends JPanel {

        public SurnamePanel() {
            setBackground(new Color(245, 247, 250)); // Светлый стильный фон
        }

        @Override
        protected void paintComponent(Graphics gr) {
            super.paintComponent(gr);
            Graphics2D g = (Graphics2D) gr;

            // Включаем сглаживание линий и текста
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            // 1. ДЕКОРАТИВНАЯ РАМКА С ГРАДИЕНТОМ И ПУНКТИРОМ
            float[] frameDash = {15, 10};
            BasicStroke frameStroke = new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, frameDash, 0);
            g.setStroke(frameStroke);
            g.setPaint(new GradientPaint(0, 0, Color.BLUE, getWidth(), getHeight(), Color.MAGENTA));
            g.drawRoundRect(15, 15, getWidth() - 30, getHeight() - 30, 25, 25);

            // 2. РИСОВАНИЕ БУКВ ФАМИЛИИ ЛИНИЯМИ (Пример: "И В А Н О В")
            // Каждая буква рисуется отдельным стилем, толщиной и цветом пера.

            // --- БУКВА "И" (Сплошная синяя линия, толщина 8) ---
            g.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setColor(new Color(30, 144, 255)); // DodgerBlue
            g.drawLine(40, 120, 40, 60);   // Левая стойка
            g.drawLine(40, 120, 80, 60);   // Диагональ
            g.drawLine(80, 120, 80, 60);   // Правая стойка

            // --- БУКВА "В" (Штрихпунктирный красная градиентная линия, толщина 6) ---
            float[] dashV = {8, 4};
            g.setStroke(new BasicStroke(6, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 10, dashV, 0));
            g.setPaint(new GradientPaint(100, 60, Color.RED, 140, 120, Color.ORANGE));
            g.drawLine(100, 120, 100, 60); // Вертикаль
            g.drawArc(100, 60, 35, 30, 90, -180);  // Верхний полукруг
            g.drawArc(100, 90, 40, 30, 90, -180);  // Нижний полукруг

            // --- БУКВА "А" (Зеленая линия, толщина 10) ---
            g.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setColor(new Color(46, 139, 87)); // SeaGreen
            g.drawLine(160, 120, 180, 60);  // Левый контур
            g.drawLine(200, 120, 180, 60);  // Правый контур
            g.setStroke(new BasicStroke(5)); // Перемычка тоньше
            g.drawLine(170, 95, 190, 95);   // Горизонтальная перемычка

            // --- БУКВА "Н" (Фиолетовая двойная штриховая линия, толщина 7) ---
            float[] dashN = {12, 6};
            g.setStroke(new BasicStroke(7, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10, dashN, 0));
            g.setColor(new Color(138, 43, 226)); // BlueViolet
            g.drawLine(220, 120, 220, 60);  // Левая стойка
            g.drawLine(255, 120, 255, 60);  // Правая стойка
            g.setStroke(new BasicStroke(7)); // Сплошная перемычка
            g.drawLine(220, 90, 255, 90);   // Перемычка

            // --- БУКВА "О" (Овал с закругленным толстым пером, градиент) ---
            g.setStroke(new BasicStroke(9, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setPaint(new GradientPaint(275, 60, Color.MAGENTA, 315, 120, Color.CYAN));
            g.drawOval(275, 60, 45, 60);

            // --- БУКВА "В" (Тёмно-вишневое перо, толщина 6) ---
            g.setStroke(new BasicStroke(6, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setColor(new Color(128, 0, 32)); // Burgundy
            g.drawLine(340, 120, 340, 60);
            g.drawArc(340, 60, 35, 30, 90, -180);
            g.drawArc(340, 90, 40, 30, 90, -180);

            // 3. ПОДПИСЬ/ДЕКОРАТИВНЫЙ ПОДЧЕРК С ТОЧКАМИ
            float[] dotted = {3, 9};
            g.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dotted, 0));
            g.setColor(Color.DARK_GRAY);
            g.drawLine(35, 145, getWidth() - 35, 145);

            // Аннотация снизу
            g.setFont(new Font("SansSerif", Font.ITALIC, 13));
            g.setColor(new Color(100, 100, 100));
            g.drawString("Графика выполнена с использованием различных стилей BasicStroke и GradientPaint", 35, 175);
        }
    }

    public SurnameGraphicsWindow() {
        super("Лабораторная №6 — Индивидуальное задание (Рисование фамилии)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new SurnamePanel());

        setSize(520, 230);
        setMinimumSize(new Dimension(500, 220));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SurnameGraphicsWindow::new);
    }
}
