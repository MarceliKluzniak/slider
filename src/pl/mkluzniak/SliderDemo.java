package pl.mkluzniak;
import java.awt.*; //add imports to slider work
import javax.swing.*; //add imports to slider work
import javax.swing.event.*; //add imports to slider work

public class SliderDemo implements ChangeListener{  //add implements for slider chages show what happening in slider

    JFrame frame; //declare frame
    JPanel panel; //declare panel
    JLabel label; //declare label
    JSlider slider; //declare slider

    SliderDemo(){
        frame = new JFrame("Slider Demo"); //declare frame, panel label and slider
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50); //makeing value on slider (min, max and where will it be at start)

        slider.setPreferredSize(new Dimension(400,200)); //dimension of slider

        slider.setPaintTicks(true); //adding to slider scale
        slider.setMinorTickSpacing(10); //setting for slider to to scale be in 10 from max


        slider.setPaintTrack(true); //adding to slider bigger scale
        slider.setMajorTickSpacing(25); //every 25 there is bigger scale




        slider.setPaintLabels(true); //adding numbers for scale
        slider.setFont(new Font("MV Boli",Font.PLAIN,15)); //setting for slider font and size
        label.setFont(new Font("MV Boli",Font.PLAIN,25)); //setting for label font and size

        slider.setOrientation(SwingConstants.VERTICAL); //changing orientation to vertical

        label.setText("°C= "+ slider.getValue()); //adding °C and declare value on slider

        slider.addChangeListener(this); //this line trigger stateChange to work!!

        panel.add(slider); //adding to panel slider
        panel.add(label); //adding to panel label
        frame.add(panel); //adding to frame panel
        frame.setSize(420,420); //adding to frame size of frame
        frame.setVisible(true);

    }

public void stateChanged(ChangeEvent e){

    label.setText("°C= "+ slider.getValue()); //when slider is moved this line will change value on label and show rigt slidet set


}
}
