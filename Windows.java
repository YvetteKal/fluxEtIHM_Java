import javax.swing.JFrame;

public class Windows extends JFrame {

    //constructeur
    public Windows(){

        this.setTitle("Ma premiere fenetre");
        this.setVisible(true);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
