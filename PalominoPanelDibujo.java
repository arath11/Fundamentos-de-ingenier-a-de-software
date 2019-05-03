import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

public class PalominoPanelDibujo  extends JPanel {
    String s[]= {"dato1", "dato2","dato3","dato4","dato1", "dato2","dato3","dato4","dato1","dato2"};

    int ancho, alto;

    private DataPalomino p= new DataPalomino();

    public PalominoPanelDibujo() {
        ancho=alto=700;
        this.setBackground(Color.white);
        setPreferredSize(new Dimension(ancho, alto));

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.lightGray);
        g.fillRect(6,50,340, 340);




        g.setColor(Color.lightGray);
        g.fillRect(354,50,340, 340);


        p.pintaCurvaRoc(g);
        g.setColor(Color.black);
        p.pintaResumenEstadistico(g);
        p.pintaRanking(g);
    }



}