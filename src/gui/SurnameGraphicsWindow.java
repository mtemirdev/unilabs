package gui;

import java.awt.*;
import javax.swing.*;

/**
 * Лабораторная работа №6. Индивидуальное задание.
 * Нарисовать свою фамилию линиями разной толщины, цвета и стиля с помощью Graphics2D.
 * Вариант: Фамилия "ТЕМИРБАЕВ"
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

            // 2. РИСОВАНИЕ БУКВ ФАМИЛИИ "Т Е М И Р Б А Е В" ЛИНИЯМИ

            // --- БУКВА "Т" (Красная линия, толщина 8) ---
            g.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setColor(new Color(220, 20, 60)); // Crimson
            g.drawLine(40, 60, 75, 60);   // Верхняя перекладина
            g.drawLine(57, 60, 57, 120);  // Центральная стойка

            // --- БУКВА "Е" (Оранжево-красный градиент с пунктиром, толщина 7) ---
            float[] dashE = {10, 5};
            g.setStroke(new BasicStroke(7, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 10, dashE, 0));
            g.setPaint(new GradientPaint(90, 60, Color.ORANGE, 120, 120, Color.RED));
            g.drawLine(90, 60, 90, 120);  // Вертикальная стойка
            g.drawLine(90, 60, 120, 60);  // Верхняя перекладина
            g.drawLine(90, 90, 115, 90);  // Средняя перекладина
            g.drawLine(90, 120, 120, 120); // Нижняя перекладина

            // --- БУКВА "М" (Изумрудно-зеленая линия, толщина 7) ---
            g.setStroke(new BasicStroke(7, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setColor(new Color(46, 139, 87)); // SeaGreen
            g.drawLine(135, 120, 135, 60); // Левая стойка
            g.drawLine(135, 60, 153, 95);  // Левая диагональ
            g.drawLine(153, 95, 171, 60);  // Правая диагональ
            g.drawLine(171, 60, 171, 120); // Правая стойка

            // --- БУКВА "И" (Ярко-синяя линия, толщина 8) ---
            g.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setColor(new Color(30, 144, 255)); // DodgerBlue
            g.drawLine(186, 120, 186, 60); // Левая стойка
            g.drawLine(186, 120, 221, 60); // Диагональ
            g.drawLine(221, 120, 221, 60); // Правая стойка

            // --- БУКВА "Р" (Фиолетовая штриховая с полукругом, толщина 6) ---
            float[] dashR = {8, 4};
            g.setStroke(new BasicStroke(6, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashR, 0));
            g.setColor(new Color(138, 43, 226)); // BlueViolet
            g.drawLine(236, 120, 236, 60); // Вертикальная стойка
            g.drawArc(236, 60, 32, 32, 90, -180); // Верхний полукруг

            // --- БУКВА "Б" (Бордовая с верхней перекладиной и окружностью, толщина 7) ---
            g.setStroke(new BasicStroke(7, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setColor(new Color(178, 34, 34)); // FireBrick
            g.drawLine(283, 120, 283, 60); // Вертикальная стойка
            g.drawLine(283, 60, 311, 60);  // Верхний хвостик
            g.drawArc(283, 88, 32, 32, 90, -180); // Нижний полукруг

            // --- БУКВА "А" (Золотисто-желтая линия, толщина 8) ---
            g.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setColor(new Color(218, 165, 32)); // GoldenRod
            g.drawLine(330, 120, 346, 60); // Левый контур
            g.drawLine(362, 120, 346, 60); // Правый контур
            g.setStroke(new BasicStroke(5)); // Перемычка тоньше
            g.drawLine(338, 95, 354, 95);  // Горизонтальная перемычка

            // --- БУКВА "Е" (Пурпурно-синий градиент, толщина 7) ---
            g.setStroke(new BasicStroke(7, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g.setPaint(new GradientPaint(377, 60, Color.MAGENTA, 405, 120, Color.BLUE));
            g.drawLine(377, 60, 377, 120); // Вертикальная стойка
            g.drawLine(377, 60, 405, 60);  // Верхняя перекладина
            g.drawLine(377, 90, 400, 90);  // Средняя перекладина
            g.drawLine(377, 120, 405, 120); // Нижняя перекладина

            // --- БУКВА "В" (Тёмно-бирюзовая штриховая линия, толщина 6) ---
            float[] dashV = {6, 3};
            g.setStroke(new BasicStroke(6, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashV, 0));
            g.setColor(new Color(0, 139, 139)); // DarkCyan
            g.drawLine(422, 120, 422, 60); // Вертикальная стойка
            g.drawArc(422, 60, 28, 30, 90, -180);  // Верхний полукруг
            g.drawArc(422, 90, 32, 30, 90, -180);  // Нижний полукруг

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
        super("Лабораторная №6 — Индивидуальное задание (Фамилия Темирбаев)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new SurnamePanel());

        setSize(540, 230);
        setMinimumSize(new Dimension(520, 220));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SurnameGraphicsWindow::new);
    }
}
