
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppWindow extends Frame {
    public AppWindow(){
        addWindowListener(new MyWindowAdapter());
    }

    public  static  void main (String[] args){ //точка входа
        final int w = 80;
        final  int h = 30;

        AppWindow appWindow = new AppWindow();
        appWindow.setSize(400,300);
        appWindow.setTitle("UnlockedButton"); // название окна
        appWindow.setVisible(true); //установить видимость

        Button button = new Button("Нажми");
        button.setBounds(50,100, w, h);

        button.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent mouseEvent) {

            }

            public void mouseMoved(MouseEvent mouseEvent) {
                int x = appWindow.getBounds().width - w ;
                int y = appWindow.getBounds().height - h ;
                button.setBounds(x, y, w, h);
            }
        });

        appWindow.add(button);
        appWindow.setLayout(null);
    }

    class MyWindowAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}

