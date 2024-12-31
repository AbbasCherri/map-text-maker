package Window;

import javax.swing.*;

// JButton testButton = createButton("Test", 800, 600, 100, 100);
// frame.add(testButton);
// testButton.addActionListener(new ActionTest()); // Action Setter
// JTextField testText = createTextField("",100,100,50,50);
// frame.add(testText);


public class Frame{
    public static void startWindow(){
        JFrame frame = new JFrame();
        setFrameSettings(frame);
        
        

    }

    public static JButton createButton(String text, int x, int y, int width, int height){
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        return button;
    }
    public static JTextField createTextField(String text, int x, int y, int width, int height){
        JTextField textField = new JTextField(text);
        textField.setBounds(x, y, width, height);
        return textField;
    }

    public static void setFrameSettings(JFrame frame){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MapToText");
        frame.setSize(1000, 800);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
