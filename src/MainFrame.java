import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private HistogramDisplay histogramDisplay;

    public MainFrame() throws HeadlessException{
        this.setTitle("Histogram");
        this.setSize(700,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(createHistogramDisplay());
    }

    private Component createHistogramDisplay(){
        JFreeChartHistogramDisplay display = new JFreeChartHistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }

    public HistogramDisplay getHistogramDisplay(){
        return histogramDisplay;
    }
}
