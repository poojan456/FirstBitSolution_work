import java.awt.*;
import java.awt.event.*;

public class checkbox2 {
    // constructor to initialize
    checkbox2() {
        Frame f = new Frame("Checkbox Example");
        // creation the label
        final Label label = new Label();
        // size of Label
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        // creting the checkboxes
        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100, 100, 50, 50);
        Checkbox checkbox2 = new Checkbox("Java");
        checkbox2.setBounds(100, 150, 50, 50);
        // adding the checkbox to frame
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label);

        // adding event to the checkboxs
        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ checkbox :" + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("java Checkbox:" + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        // setting size
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new checkbox2();
    }
}
