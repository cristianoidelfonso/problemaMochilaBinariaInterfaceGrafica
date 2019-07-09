/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Individuo;

/**
 *
 * @author Idelfonso
 */
public class AlgoritmoGenetico {
    private int tamanhoPopulacao;
    private List<Individuo> populacao;
    private int geracao;
    private Individuo melhorSolucao;
    private List<Individuo> melhoresCromossomos = new ArrayList<>();
    private double limitePeso;
    
    int contador = 0;
    
    //--------------------------------------------------------------------------
    public AlgoritmoGenetico( int tamanhoPopulacao) {
        this.populacao = new ArrayList<>();
        this.tamanhoPopulacao = tamanhoPopulacao;
    }
    //--------------------------------------------------------------------------
    public List<Individuo> inicializaPopulacao( List pesos, List valores, double limitePeso ){
        for (int i = 0; i < this.tamanhoPopulacao; i++) {
            this.populacao.add( new Individuo( pesos, valores, limitePeso));
        }
        this.melhorSolucao = this.populacao.get(0);
        this.limitePeso = limitePeso;
        
        return populacao;
    }
    //--------------------------------------------------------------------------
    public void ordenaPopulacao(){
        Collections.sort(this.populacao);
    }
    public void ordenaPopulacao(List populacao){
        Collections.sort(populacao);
    }
    //--------------------------------------------------------------------------
    public void melhorIndividuo( Individuo idv ){
        if ( idv.getNotaAvaliacao() > this.melhorSolucao.getNotaAvaliacao() ) {
            this.melhorSolucao = idv;
            contador = 0;
        }
    }
    //--------------------------------------------------------------------------
    public Double somaAvaliacoes(){
        Double soma = 0.0;
        for (Individuo individuo : this.populacao) {
            soma += individuo.getNotaAvaliacao();
        }
        return soma;
    }
    //--------------------------------------------------------------------------
    public int selecionaPai(Double somaAvaliacao){
        int pai = -1;
        Double valorSorteado = Math.random() * somaAvaliacao;
        Double soma = 0.0;
        int i = 0;
        while( i < this.populacao.size() && soma < valorSorteado){
            soma += this.populacao.get(i).getNotaAvaliacao();
            pai += 1;
            i += 1;
        }
        return pai;
    }
    //--------------------------------------------------------------------------
    public void vizualizaGeracao(){
        Individuo melhor = this.populacao.get(0);
        DecimalFormat df = new DecimalFormat("0.00000");
        this.melhoresCromossomos.add(melhor);
        
        System.out.println("G: " + melhor.getGeracao() + 
                "  |  Nota: " + df.format(melhor.getNotaAvaliacao()) + 
                "  |  Peso: " + df.format(melhor.getPesoIndividuo()) + 
                "  |  Cromossomo: " + melhor.getCromossomo());
    }
    //--------------------------------------------------------------------------
    public List resolver(Double taxaMutacao, int numeroGeracao, List pesos, List valores, 
            Double limitePeso, List<Individuo> populacao ){        
        //this.inicializaPopulacao(pesos, valores, limitePeso);
        this.populacao = populacao;
        
        for (Individuo individuo : this.populacao) {
            individuo.avaliacao();
        }
        this.ordenaPopulacao();
        this.vizualizaGeracao();
        
        //for (int ger = 0; ger < numeroGeracao; ger++) {
        
        while ( this.melhorSolucao.getNotaAvaliacao() <= limitePeso || contador < 50 ) {
            
            Double somaAvaliacao = this.somaAvaliacoes();
            List<Individuo> novaPopulacao = new ArrayList<>();
            
            for (int i = 0; i < ( this.populacao.size() /2 ); i++) {
                int pai1 = this.selecionaPai( somaAvaliacao );
                int pai2 = this.selecionaPai( somaAvaliacao );
                
                List<Individuo> filhos = this.getPopulacao().get(pai1).crossover(this.getPopulacao().get(pai2));
                novaPopulacao.add(filhos.get(0).mutacao(taxaMutacao));
                novaPopulacao.add(filhos.get(1).mutacao(taxaMutacao));
            }
            
            this.setPopulacao(novaPopulacao);
            
            for (Individuo individuo : this.getPopulacao()) {
                individuo.avaliacao();
            }
            
            this.ordenaPopulacao();
            this.vizualizaGeracao();
            Individuo melhor = this.populacao.get(0);
            this.melhorIndividuo( melhor );
            contador++; 
        }
        System.out.println("Melhor solução --> Geração " + this.melhorSolucao.getGeracao() +
                " Cromossomo: [ " + this.melhorSolucao.getCromossomo()+" ] "+
                " Valor: " + this.melhorSolucao.getNotaAvaliacao() + 
                " Peso: " + this.melhorSolucao.getPesoIndividuo() );
        
        return this.melhorSolucao.getCromossomo();
        
    }
    //==========================================================================
    
    public int getTamanhoPopulacao() {
        return tamanhoPopulacao;
    }

    public void setTamanhoPopulacao(int tamanhoPopulacao) {
        this.tamanhoPopulacao = tamanhoPopulacao;
    }

    public List<Individuo> getPopulacao() {
        return populacao;
    }

    public void setPopulacao(List<Individuo> populacao) {
        this.populacao = populacao;
    }

    public int getGeracao() {
        return geracao;
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
    }

    public Individuo getMelhorSolucao() {
        return melhorSolucao;
    }

    public void setMelhorSolucao(Individuo melhorSolucao) {
        this.melhorSolucao = melhorSolucao;
    }

    public List<Individuo> getMelhoresCromossomos() {
        return melhoresCromossomos;
    }

    public void setMelhoresCromossomos(List<Individuo> melhoresCromossomos) {
        this.melhoresCromossomos = melhoresCromossomos;
    } 
}
