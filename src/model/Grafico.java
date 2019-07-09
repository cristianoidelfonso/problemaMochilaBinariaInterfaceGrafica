/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Idelfonso
 */
public class Grafico extends ApplicationFrame{
    
    private List<Individuo> melhoresCromossomos = new ArrayList<>();

    public Grafico(String titleJanela, String titleGrafico, List melhores) {
        super(titleJanela);
        this.melhoresCromossomos = melhores;
        JFreeChart graficoLinha = ChartFactory.createLineChart( titleGrafico, "Geração", 
                "Valor ",carregarDados(),
                PlotOrientation.VERTICAL, 
                true, 
                true, 
                false);
        ChartPanel janelaGrafico = new ChartPanel(graficoLinha);
        janelaGrafico.setPreferredSize(new java.awt.Dimension(1200, 600));
        setContentPane(janelaGrafico);
    }
    
    private DefaultCategoryDataset carregarDados(){
        DefaultCategoryDataset dados = new DefaultCategoryDataset();
        for (int i = 0; i < melhoresCromossomos.size(); i++) {
            dados.addValue(melhoresCromossomos.get(i).getNotaAvaliacao(), "Melhor solução ", " Geração " + i);
        }
        return dados;
    }
    
}
