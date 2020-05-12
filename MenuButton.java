import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuButton extends JButton {
    private SlideShow slideshow;

    public MenuButton(SlideShow slideshow){
        super(slideshow.getName());

        this.slideshow = slideshow;
        this.addActionListener(actions);
    }

    private ActionListener actions = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            slideshow.open();
        }
    };
}
