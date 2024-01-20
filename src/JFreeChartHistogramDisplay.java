import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;

import javax.swing.*;

public class JFreeChartHistogramDisplay extends JPanel implements HistogramDisplay {
    @Override
    public void show(String xAxisName, String yAxisName, double[] data, int bin) {
        JFreeChart histogram = ChartFactory.createHistogram(
                "People weight",
                xAxisName,
                yAxisName,
                createDataset(data, bin),
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );
        add(new ChartPanel(histogram));
    }

    private HistogramDataset createDataset(double[] data, int bin){
        HistogramDataset dataset = new HistogramDataset();

        if(data != null && data.length > 0){
            dataset.addSeries("s", data, bin);
        } else {
            System.out.println("Error: Longitud = 0");
        }
        return dataset;
    }
}
