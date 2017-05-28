import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Javier Roldan
 */

public class Graphs extends JFrame{
    public Graphs(final String title, ArrayList<Double> input, String x, String y, String name) {

    
    super(title);
    
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    final XYSeries series = new XYSeries(name);
    for (int i = 0; i < input.size(); i++) {
        series.add(i, input.get(i));
    }
        
    final XYSeriesCollection data = new XYSeriesCollection(series);
    //final JFreeChart chart = ChartFactory.createXYLineChart(
    final JFreeChart chart = ChartFactory.createXYLineChart(
        title,
        x, 
        y, 
        data,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
    );
    

    XYPlot plot = chart.getXYPlot();
    //chart.setDefaul
    //ValueAxis axis = plot.getDomainAxis();
    //final NumberAxis xAxis = (NumberAxis) plot.getDomainAxis();

    final ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
    setContentPane(chartPanel);
    
    }

}
