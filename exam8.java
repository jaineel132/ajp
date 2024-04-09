import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class exam8 extends JFrame {
    exam8() {

        JFrame frame = new JFrame("JTree Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the root node
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");

        // Add child nodes to the root node
        rootNode.add(node1);
        rootNode.add(node2);

        DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("n1");
        DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("n2");

        DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("n3");
        DefaultMutableTreeNode n4 = new DefaultMutableTreeNode("n4");

        node1.add(n1);
        node1.add(n2);

        node2.add(n3);
        node2.add(n4);

        // Create a JTree with the root node
        JTree tree = new JTree(rootNode);

        // Create a scroll pane and add the JTree to it
        JScrollPane scrollPane = new JScrollPane(tree);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new exam8();
    }
}
