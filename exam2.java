import java.awt.*;

public class exam2 {

    exam2() {

        Frame fr = new Frame();
        fr.setVisible(true);
        fr.setSize(500, 500);

        FlowLayout f1 = new FlowLayout();

        fr.setLayout(f1);

        Choice c = new Choice();

        c.add("Maharashtra");
        c.add("Gujarat");
        c.add("Bemgal");
        c.add("Meghalaya");
        c.add("Assam");

        fr.add(c);

        List l1 = new List(2);
        l1.add("gujarat");
        l1.add("hmmmm");
        l1.add("nuhhhh");
        l1.add("bemgal");
        l1.add("assam");

        fr.add(l1);

    }

    public static void main(String args[]) {
        new exam2();
    }
}
