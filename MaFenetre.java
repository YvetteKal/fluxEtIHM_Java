import javax.swing.*;
import java.awt.*;

public class MaFenetre {
    public static void main(String[] args) {

        // Create the main window
        JFrame frame = new JFrame();
        frame.setTitle("Ma fenetre");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        // Set GridLayout for the content pane (2x2 grid)
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(2, 2, 5, 5)); // 2 rows, 2 columns, with gaps

        // --- Top-left panel (GridLayout inside) ---
        JPanel topLeftPanel = new JPanel();
        topLeftPanel.setLayout(new GridLayout(2, 2, 5, 5)); // Grid with 2 rows, 2 cols
        //topLeftPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));

        // Add buttons to the top-left panel
        JButton btn1 = new JButton("un");
        JButton btn2 = new JButton("deux");
        JButton btn3 = new JButton("trois");
        JButton btn4 = new JButton("quatre");
        topLeftPanel.add(btn1);
        topLeftPanel.add(btn2);
        topLeftPanel.add(btn3);
        topLeftPanel.add(btn4);

        // --- Top-right panel (green background) ---
        JPanel topRightPanel = new JPanel();
        topRightPanel.setBackground(Color.GREEN);

        // --- Bottom-left panel (red background) ---
        JPanel bottomLeftPanel = new JPanel();
        bottomLeftPanel.setBackground(Color.RED);

        // --- Bottom-right panel (BorderLayout with buttons) ---
        JPanel bottomRightPanel = new JPanel(new BorderLayout());

        // Add buttons to the bottom-right panel
        JButton btnNord = new JButton("Nord");
        JButton btnSud = new JButton("Sud");
        JButton btnEst = new JButton("Est");
        JButton btnOuest = new JButton("Ouest");
        JButton btnCentre = new JButton("Centre");

        // Add buttons to specific regions
        bottomRightPanel.add(btnNord, BorderLayout.NORTH);
        bottomRightPanel.add(btnSud, BorderLayout.SOUTH);
        bottomRightPanel.add(btnEst, BorderLayout.EAST);
        bottomRightPanel.add(btnOuest, BorderLayout.WEST);
        bottomRightPanel.add(btnCentre, BorderLayout.CENTER);

        // Add the four panels to the main content pane
        contentPane.add(topLeftPanel);
        contentPane.add(topRightPanel);
        contentPane.add(bottomLeftPanel);
        contentPane.add(bottomRightPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
