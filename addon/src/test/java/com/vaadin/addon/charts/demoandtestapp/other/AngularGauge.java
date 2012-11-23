package com.vaadin.addon.charts.demoandtestapp.other;

import java.util.Random;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.demoandtestapp.AbstractVaadinChartExample;
import com.vaadin.addon.charts.demoandtestapp.dynamic.Refresher;
import com.vaadin.addon.charts.model.Background;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.Configuration;
import com.vaadin.addon.charts.model.ListSeries;
import com.vaadin.addon.charts.model.PlotBand;
import com.vaadin.addon.charts.model.Title;
import com.vaadin.addon.charts.model.YAxis;
import com.vaadin.addon.charts.model.style.GradientColor;
import com.vaadin.addon.charts.model.style.SolidColor;
import com.vaadin.ui.Component;

public class AngularGauge extends AbstractVaadinChartExample {

    @Override
    public String getDescription() {
        return "Angular Gauge";
    }

    @Override
    protected Component getChart() {
        final Chart chart = new Chart();
        chart.setWidth("500px");

        Refresher refresher = new Refresher();
        addComponent(refresher);

        final Configuration configuration = new Configuration();
        configuration.getChart().setType(ChartType.GAUGE);
        configuration.getChart().setPlotBackgroundColor(null);
        configuration.getChart().setPlotBackgroundImage(null);
        configuration.getChart().setPlotBorderWidth(0);
        configuration.getChart().setPlotShadow(false);
        configuration.setTitle("Speedometer");

        GradientColor gradient1 = GradientColor.createLinear(0, 0, 0, 1);
        gradient1.addColorStop(0, new SolidColor("#FFF"));
        gradient1.addColorStop(1, new SolidColor("#333"));

        GradientColor gradient2 = GradientColor.createLinear(0, 0, 0, 1);
        gradient2.addColorStop(0, new SolidColor("#333"));
        gradient2.addColorStop(1, new SolidColor("#FFF"));

        Background[] background = new Background[3];
        background[0] = new Background();
        background[0].setBackgroundColor(gradient1);
        background[0].setBorderWidth(0);
        background[0].setOuterRadius("109%");

        background[1] = new Background();
        background[1].setBackgroundColor(gradient2);
        background[1].setBorderWidth(1);
        background[1].setOuterRadius("107%");

        background[2] = new Background();
        background[2].setBackgroundColor(new SolidColor("#DDD"));
        background[2].setBorderWidth(0);
        background[2].setInnerRadius("103%");
        background[2].setOuterRadius("105%");

        configuration.getPane().setStartAngle(-150);
        configuration.getPane().setEndAngle(150);
        configuration.getPane().setBackground(background);

        YAxis yAxis = configuration.getyAxis();
        yAxis.setTitle(new Title("km/h"));
        yAxis.setMin(0);
        yAxis.setMax(200);
        yAxis.setMinorTickInterval("auto");
        yAxis.setMinorTickWidth(1);
        yAxis.setMinorTickLength(10);
        yAxis.setMinorTickPosition("inside");
        yAxis.setMinorTickColor(new SolidColor("#666"));

        yAxis.setTickPixelInterval(30);
        yAxis.setTickWidth(2);
        yAxis.setTickPosition("inside");
        yAxis.setTickLength(10);
        yAxis.setTickColor(new SolidColor("#666"));

        yAxis.getLabels().setStep(2);
        yAxis.getLabels().setRotation("auto");

        PlotBand[] plotBands = new PlotBand[3];
        plotBands[0] = new PlotBand(0, 120, new SolidColor("#55BF3B"));
        plotBands[1] = new PlotBand(120, 160, new SolidColor("#DDDF0D"));
        plotBands[2] = new PlotBand(160, 200, new SolidColor("#DF5353"));
        yAxis.setPlotBands(plotBands);

        final ListSeries series = new ListSeries("Speed", 80);
        series.getTooltip().setValueSuffix(" km/h");
        configuration.setSeries(series);

        Thread generator = new Thread() {
            @Override
            public void run() {
                // Extra sleep in the beginning to make TB tests more reliable
                try {
                    sleep(8000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                Random r = new Random(0);
                while (isConnectorEnabled()) {
                    try {
                        sleep(3000);
                        Integer oldValue = series.getData()[0].intValue();
                        Integer newValue = (int) (oldValue + (r.nextDouble() - 0.5) * 20.0);
                        getSession().lock();
                        try {
                            series.updatePoint(0, newValue);
                        } finally {
                            getSession().unlock();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        generator.start();

        chart.drawChart(configuration);
        return chart;
    }
}