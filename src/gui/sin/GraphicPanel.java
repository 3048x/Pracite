package gui.sin;
import javax.swing.*;
        import java.awt.*;
public class GraphicPanel extends JPanel{
    public Integer xoffset;
    int range=60;
    int grain=10;
    int freq=2;
    //int height=this.getHeight();
    // int width=this.getWidth();
    @Override
    protected void paintComponent(Graphics g){
        g.drawRect(0,0,100,50);
        int height=this.getHeight();
        int width=this.getWidth();
        g.setColor(Color.BLUE);
        g.clearRect(0,0,width,height);
        // g.fillRect(200,100,50,60);
        // g.drawLine(0,0,200,100);
        //画一条中间坐标线
        g.drawLine(0,height/2,width,height/2);
        int center=height/2;
        int x1=0,y1=center,x2,y2;
        for(int i=0;i<=width;i+=grain){
            x2=i;
            y2=(int) (100*Math.sin(Math.toRadians(x2*freq))+center);
            g.drawLine(x1,y1,x2,y2)  ;
            x1=x2;
            y1=y2;

        }
    };
}
