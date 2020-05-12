import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class SlideShow {
    private String name;

    private JFrame frame;
    private JTextArea textLabel;
    private Images canvas;

    private Slide[] slides;
    private static int slide_index;

    public SlideShow(String name, Slide[] slides){
        this.name = name;
        this.slides = slides;
        slide_index = 0;

        this.frame = new JFrame(name);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //determines size of on screen text
        this.textLabel = new JTextArea("");
        Font labelFont = new Font(Font.SERIF, Font.PLAIN, 60);
        textLabel.setFont(labelFont);
        this.textLabel.setEditable(false);
        this.textLabel.setLineWrap(true);
        this.frame.getContentPane().add(textLabel, BorderLayout.SOUTH);

        this.canvas = new Images("");
        this.frame.getContentPane().add(canvas, BorderLayout.CENTER);

        Action nextSlide = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slide_index++;

                if (slide_index >= slides.length){
                    frame.dispose();
                    slide_index = 0;
                    return;
                }
                draw();
            }
        };

        Action prevSlide = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(slide_index > 0){
                    slide_index--;
                }

                draw();
            }
        };

        final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
        this.textLabel.getInputMap(IFW).put(KeyStroke.getKeyStroke("RIGHT"), "next slide");
        this.textLabel.getInputMap(IFW).put(KeyStroke.getKeyStroke("LEFT"), "prev slide");

        this.textLabel.getActionMap().put("next slide", nextSlide);
        this.textLabel.getActionMap().put("prev slide", prevSlide);

        this.frame.setLocationRelativeTo(null);
        this.frame.pack();
        this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void draw(){
        this.textLabel.setText(slides[this.slide_index].getText());
        this.canvas.setFilename(slides[this.slide_index].getImagePath());
    }

    public void open(){
        this.textLabel.setText(slides[0].getText());
        this.canvas.setFilename(slides[0].getImagePath());
        this.frame.setVisible(true);
        this.frame.requestFocus();
    }

    public String getName(){
        return name;
    }
}
