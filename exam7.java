import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class exam7 extends JFrame {

    exam7() {
        Container ct = getContentPane();
        ct.setLayout(null);

        JLabel jl = new JLabel("Select contry:");

        JComboBox jc = new JComboBox<>();
        jc.addItem("Mumbai");
        jc.addItem("delhi");
        jc.addItem("cheenai");
        jc.addItem("kolkata");
        jc.addItem("Goa");

        ct.add(jl);
        ct.add(jc);

        jl.setBounds(30, 50, 100, 30);
        jc.setBounds(150, 50, 100, 30);

    }

    public static void main(String args[]) {

        exam7 fr1 = new exam7();
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setVisible(true);
        fr1.setSize(300, 400);

    }
}
