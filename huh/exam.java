import java.awt.*;

public class exam {

    exam() {
        Frame fr = new Frame();
        fr.setSize(1000, 1000);
        fr.setVisible(true);

        FlowLayout f1 = new FlowLayout();
        fr.setLayout(f1);

        Label tf = new Label("WElcom to java");
        fr.add(tf);

    }

    public static void main(String args[]) {
        new exam();
    }
}
