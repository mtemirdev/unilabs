package gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

/**
 * Лабораторная работа №6. Обязательное задание.
 * Окно с графикой Graphics2D, в котором выбор рисуемой фигуры
 * осуществляется через меню (JMenuBar / JMenu / JMenuItem).
 */
public class MenuGraphicsWindow extends JFrame implements ActionListener {

    // Вложенная панель для рисования
    public static class JMyPanel extends JPanel {
        public enum Figure { LINE, OVAL, RECT, ROUNDRECT, CLEAR }
        private Figure vibor = Figure.CLEAR;

        public JMyPanel() {
            setBackground(Color.WHITE);
        }

        public void ris(String figureName) {
            try {
                vibor = Figure.valueOf(figureName);
            } catch (IllegalArgumentException e) {
                vibor = Figure.CLEAR;
            }
            repaint();
        }

        @Override
        protected void paintComponent(Graphics gr) {
            super.paintComponent(gr);
            Graphics2D g = (Graphics2D) gr;

            // Включаем сглаживание (антиалиасинг)
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            BasicStroke pen;

            switch (vibor) {
                case LINE:
                    // Прямая линия с толстым закругленным пером
                    pen = new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
                    g.setStroke(pen);
                    g.setColor(Color.BLUE);
                    g.drawLine(30, 30, 180, 180);
                    break;

                case OVAL:
                    // Залитый овал с градиентом
                    g.setPaint(new GradientPaint(30, 30, Color.RED, 80, 80, Color.GREEN, true));
                    g.fill(new Ellipse2D.Double(30, 30, 150, 150));
                    break;

                case RECT:
                    // Пунктирный прямоугольник
                    float[] dashRect = {20, 20};
                    pen = new BasicStroke(5, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL, 1, dashRect, 0);
                    g.setStroke(pen);
                    g.setColor(Color.MAGENTA);
                    g.drawRect(30, 30, 150, 150);
                    break;

                case ROUNDRECT:
                    // Штрихпунктирный закругленный прямоугольник
                    float[] dashRoundRect = {20, 20, 2, 20, 2, 20};
                    pen = new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL, 1, dashRoundRect, 0);
                    g.setStroke(pen);
                    g.setColor(Color.ORANGE);
                    g.drawRoundRect(30, 30, 150, 150, 60, 60);
                    break;

                case CLEAR:
                default:
                    g.clearRect(0, 0, getWidth(), getHeight());
                    break;
            }
        }
    }

    private final JMyPanel myPanel = new JMyPanel();

    public MenuGraphicsWindow() {
        super("Лабораторная №6 — Обязательное задание (Графика и Меню)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // --- СОЗДАНИЕ МЕНЮ ---
        JMenuBar menuBar = new JMenuBar();
        JMenu figureMenu = new JMenu("Фигуры");

        // Пункты меню для выбора фигуры
        JMenuItem itemLine = new JMenuItem("LINE");
        JMenuItem itemOval = new JMenuItem("OVAL");
        JMenuItem itemRect = new JMenuItem("RECT");
        JMenuItem itemRoundRect = new JMenuItem("ROUNDRECT");
        JMenuItem itemClear = new JMenuItem("CLEAR");

        // Регистрируем обработчик событий для каждого пункта меню
        itemLine.addActionListener(this);
        itemOval.addActionListener(this);
        itemRect.addActionListener(this);
        itemRoundRect.addActionListener(this);
        itemClear.addActionListener(this);

        // Добавляем элементы в меню
        figureMenu.add(itemLine);
        figureMenu.add(itemOval);
        figureMenu.add(itemRect);
        figureMenu.add(itemRoundRect);
        figureMenu.addSeparator(); // Разделительная линия
        figureMenu.add(itemClear);

        menuBar.add(figureMenu);
        setJMenuBar(menuBar);

        // Размещение панели рисования в центре окна
        add(myPanel, BorderLayout.CENTER);

        // Настройка размера и отображения
        setSize(400, 350);
        setMinimumSize(new Dimension(300, 250));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // При выборе пункта меню передаем название команды в метод ris панели
        myPanel.ris(e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuGraphicsWindow::new);
    }
}
