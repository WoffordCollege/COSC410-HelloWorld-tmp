package edu.wofford;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuiMain extends JFrame implements ActionListener {
    private JLabel label;
    private JCheckBox checkbox;
    private JButton button;
    private HelloWorld hw;
    
    public void actionPerformed(ActionEvent event) {
        if (checkbox.isSelected()) {
            label.setText(hw.showIt());
        } else {
            label.setText(hw.reverseIt());
        }
    }
    
    public GuiMain() {
        hw = new HelloWorld();
        setLayout(new FlowLayout());
        checkbox = new JCheckBox("forward", true);
        checkbox.setName("mycheckbox");
        add(checkbox);
        button = new JButton("Greet Me");
        button.setName("mybutton");
        button.addActionListener(this);
        add(button);
        label = new JLabel("");
        label.setName("mylabel");
        label.setPreferredSize(new Dimension(100, 50));
        add(label);
        setTitle("Hello World");
	    pack();
    }

    
	public static void main(String[] args) {
	    GuiMain window = new GuiMain();
        window.setVisible(true);
	}
}