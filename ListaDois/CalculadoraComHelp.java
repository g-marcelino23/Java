
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraComHelp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Texto Qualquer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Qual é o seu nome?");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Qual é sua idade?");
        JTextField ageField = new JTextField();

        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        JButton submitButton = new JButton("Enviar");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String result = "Nome: " + name + "\nIdade: " + age;
                resultArea.setText(result);
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(submitButton);
        panel.add(resultArea);

        frame.setVisible(true);
    }
}
