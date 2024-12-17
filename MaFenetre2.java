import javax.swing.*;
import java.awt.*;

public class MaFenetre2{

    public static void main(String[] args) {
        
        Windows myWindow = new Windows();

        //setting the main container with layouts organized in grids
        Container myContainer = myWindow.getContentPane();
        myContainer.setLayout(new GridLayout(2,2,5,5)); //a two by two matrix


        //create the left-top JPanel as a gridLayout of buttons
        JPanel topLeftPanel = new JPanel(new GridLayout(2,2,5,5));

        JButton btnUn = new JButton("Un");
        JButton btnDeux = new JButton("Deux");
        JButton btnTrois = new JButton("Trois");
        JButton btnQuatre = new JButton("Quatre");

        topLeftPanel.add(btnUn);
        topLeftPanel.add(btnDeux);
        topLeftPanel.add(btnTrois);
        topLeftPanel.add(btnQuatre);

        //create the top right JPanel
        JPanel topRightPanel = new JPanel();
        topRightPanel.setBackground(Color.GREEN);

        //create the bottom left JPanel
        JPanel bottomLeftPanel = new JPanel();
        bottomLeftPanel.setBackground(Color.RED);

        //create the bottom right JPanel
        JPanel bottomRightPanel = new JPanel(new BorderLayout());

        JButton btnCenter = new JButton("Center");
        JButton btnEst = new JButton("Est");
        JButton btnOuest = new JButton("Ouest");
        JButton btnNord = new JButton("nord");
        JButton btnSud = new JButton("Sud");

        bottomRightPanel.add(btnCenter, BorderLayout.CENTER);
        bottomRightPanel.add(btnSud, BorderLayout.SOUTH);
        bottomRightPanel.add(btnNord, BorderLayout.NORTH);
        bottomRightPanel.add(btnEst, BorderLayout.EAST);
        bottomRightPanel.add(btnOuest, BorderLayout.WEST);

        myContainer.add(topLeftPanel);
        myContainer.add(topRightPanel);
        myContainer.add(bottomLeftPanel);
        myContainer.add(bottomRightPanel);



    }


}
