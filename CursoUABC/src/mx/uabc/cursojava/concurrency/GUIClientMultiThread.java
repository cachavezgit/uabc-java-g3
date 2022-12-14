package mx.uabc.cursojava.concurrency;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GUIClientMultiThread {

    private static ExecutorService executor = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo application");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        placeComponents(frame);
        frame.setVisible(true);
    }

    private static void placeComponents(JFrame frame) {
        frame.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        frame.add(passwordText);

        JButton loginButton = new JButton("Thread");
        loginButton.setBounds(10, 80, 80, 25);
        frame.add(loginButton);

        JButton registerButton = new JButton("Executor");
        registerButton.setBounds(180, 80, 80, 25);
        frame.add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runnable tarea = new MyRunnable(10000000L);

                Thread thread = new Thread(tarea);
                thread.start();
            }
        });

        registerButton.addActionListener((e) -> {
            Runnable tarea = new MyRunnable(10000000L);
            executor.execute(tarea);
        });

    };
}

