import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class DataPalomino implements ImageObserver {

    private String[] ranking ={"","Semanas 2", "Escuela Desconocido","Municipio Jesus Maria","Municipio Desconocido","Genero Tutor Femenino","Genero Tutor Desconocido", "Genero Alumno Masculino","Paquete Normal"};

    private String[] resumenEstadistico={"Coef.       Std Err       z          P>|z|        [0.025      0.95]","-0.7         0.8          -0.8            0.4         -2.4          1.02", "-0.4         0.8           0.5            0.5         -1.2          2.08",
            "-0.7         0.8          -0.8            0.4         -2.4          1.02"
            ,"10.4         292          .03            0.9         -562          583"
            ,"0.5         0.7           0.8            0.4          -0.8           2.16"
            , "-3.3         0.8          -4.0            0.0         -4.9          -1.7"
            ,"0.2          0.4           0.5            0.5         -0.5          1.20"
            ,"0.5          0.4           1.2            0.2         -0.3          1.53"};

    private Image curvaRoc= new ImageIcon("CurvaRoc.jpg").getImage();

    public DataPalomino() {
        curvaRoc = new ImageIcon("CurvaRoc.jpg").getImage();
    }


    public void setRanking(String[] ranking) {
        this.ranking=ranking;

    }


    public void setResumenEstadistico(String[] resumenEstadistico) {
        this.resumenEstadistico=resumenEstadistico;
    }


    public void pintaRanking(Graphics g) {
        g.drawString("Ranking", 110, 80);
        for(int i =0;i<ranking.length;i++) {
            g.drawString(ranking[i], 20, 110+i*30);
        }

    }

    public void pintaResumenEstadistico(Graphics g) {
        g.drawString("Resumen Estadistico", 500, 80);
        for(int i =0;i<resumenEstadistico.length;i++) {
            g.drawString(resumenEstadistico[i], 370, 110+i*30);
        }

    }

    public void pintaCurvaRoc(Graphics g){
        g.drawImage(this.curvaRoc, 10, 410, 680, 280, this);
        //g.drawRect(10, 410, 680, 280);
    }


    @Override
    public boolean imageUpdate(Image img, int infloflags, int x, int y, int width, int height){
        return false;
    }
}

