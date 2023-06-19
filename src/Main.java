import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    static JFrame frame;
    static JTextField result;
    public static void main(String[] args) {

        frame = new JFrame("Calculator");
        result = new JTextField(20);
        result.setEditable(false);
        result.setText("test infi");

        ArrayList<JButton> btns = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(Integer.toString(i));
            btns.add(button);
        }

        List<String> operators = Arrays.asList("+", "-", "/", "*", "=");
        JPanel buttons = new JPanel();
        btns.forEach(buttons::add);
        operators.forEach(it -> {
            JButton jTmpButton = new JButton(it);
            buttons.add(jTmpButton);
        });

        frame.add(result);
        frame.add(buttons);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
}