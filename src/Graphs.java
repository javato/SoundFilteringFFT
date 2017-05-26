/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ValueAxis;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Javier Roldan
 */

public class Graphs extends JFrame{
    public Graphs(final String title, ArrayList<Double> lags, String x, String y, String name) {

    super(title);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    final XYSeries series = new XYSeries(name);
    for (int i = 0; i < lags.size(); i++) {
        series.add(i, lags.get(i));
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
