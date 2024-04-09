// Border layout
//import java.awt.*;

//public class exam3 {
//exam3() {

// Frame fr = new Frame();
// fr.setVisible(true);
// fr.setSize(500, 500);

// BorderLayout bl = new BorderLayout();

// fr.setLayout(b1);

// Button b1 = new Button("ONeeee");
// Button b2 = new Button("Twooooo");
// Button b3 = new Button("Threeee");
// Button b4 = new Button("Fourrr");
// Button b5 = new Button("Fiveeee");

// fr.add(b1, BorderLayout.EAST);
// fr.add(b2, BorderLayout.WEST);
// fr.add(b3, BorderLayout.NORTH);
// fr.add(b4, BorderLayout.SOUTH);
// fr.add(b5, BorderLayout.CENTER);

//}

//public static void main(String args[]) {
//    new exam3();
//  }
//}

//   Card Layout
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class exam3 {

//     private JFrame frame;
//     private JPanel cards;

//     public exam3() {
//         frame = new JFrame("Card Layout Demo");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         cards = new JPanel(new CardLayout());

//         // Panel 1
//         JPanel card1 = new JPanel();
//         card1.add(new JLabel("Card 1 Content"));
//         JButton nextButton1 = new JButton("Next");
//         nextButton1.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 CardLayout cardLayout = (CardLayout) cards.getLayout();
//                 cardLayout.next(cards);
//             }
//         });
//         card1.add(nextButton1);

//         // Panel 2
//         JPanel card2 = new JPanel();
//         card2.add(new JLabel("Card 2 Content"));
//         JButton nextButton2 = new JButton("Next");
//         nextButton2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 CardLayout cardLayout = (CardLayout) cards.getLayout();
//                 cardLayout.next(cards);
//             }
//         });
//         card2.add(nextButton2);

//         // Panel 3
//         JPanel card3 = new JPanel();
//         card3.add(new JLabel("Card 3 Content"));
//         JButton firstButton = new JButton("First");
//         firstButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 CardLayout cardLayout = (CardLayout) cards.getLayout();
//                 cardLayout.first(cards);
//             }
//         });
//         card3.add(firstButton);

//         // Adding cards to the main panel
//         cards.add(card1, "Card 1");
//         cards.add(card2, "Card 2");
//         cards.add(card3, "Card 3");

//         frame.getContentPane().add(cards, BorderLayout.CENTER);

//         frame.setSize(300, 200);
//         frame.setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new exam3();
//             }
//         });
//     }
// }
//Grid layout 
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class exam3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");

        // Set layout to grid layout with 3 rows and 3 columns
        frame.setLayout(new GridLayout(3, 3));

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        // Set the frame visible
        frame.setVisible(true);
    }
}
