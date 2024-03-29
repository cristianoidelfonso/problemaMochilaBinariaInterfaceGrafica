/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.AlgoritmoGenetico;
import java.awt.HeadlessException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Grafico;
import model.Individuo;
import model.Objeto;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Idelfonso
 */
public class ProblemaMochilaMain extends javax.swing.JFrame {
    
    private DefaultListModel<String> listModel; 
    private final Random rd = new Random();
    private String valorObj[];
    private String pesoObj[];
    List<Objeto> listaObjetos;
    List<Individuo> populacao;
    AlgoritmoGenetico ag;
    List pesos = new ArrayList<>();
    List valores = new ArrayList<>();
    private Individuo melhorSolucao;
    private final List<Individuo> melhoresCromossomos = new ArrayList<>();
    
    double taxaMutacao = 0.01;
    int contador = 0;
    
        
    /**
     * Creates new form Problema_da_mochila
     */
    public ProblemaMochilaMain() {
        initComponents();
        
        jSpinnerCapacidadeMochila.setValue(878);
        jSpinnerQtdIndividuos.setValue(20);
        jSpinnerGeracoes.setValue(50);
        listaObjetos = new ArrayList<>();
        
        btnIniciar.setEnabled(false);
        btnCriarLstaObjetos.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextValor = new javax.swing.JTextField();
        btnCriarLstaObjetos = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListObjetos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerGeracoes = new javax.swing.JSpinner();
        jSpinnerQtdIndividuos = new javax.swing.JSpinner();
        jSpinnerCapacidadeMochila = new javax.swing.JSpinner();
        cbGrafico = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Problema da Mochila Binária");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextPeso.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Digite os PESOS, separados por vírgula*");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Digite os VALORES, separados por vírgula*");

        jTextValor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        btnCriarLstaObjetos.setText("CRIAR LISTA DE OBJETOS");
        btnCriarLstaObjetos.setPreferredSize(new java.awt.Dimension(180, 25));
        btnCriarLstaObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarLstaObjetosActionPerformed(evt);
            }
        });

        btnIniciar.setText("INICIAR ALGORITMO");
        btnIniciar.setPreferredSize(new java.awt.Dimension(180, 25));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListObjetos);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Numero de gerações: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Quantidade de individuos:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Capacidade da mochila:");

        jSpinnerGeracoes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jSpinnerQtdIndividuos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jSpinnerCapacidadeMochila.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        cbGrafico.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbGrafico.setSelected(true);
        cbGrafico.setText("Gerar gráfico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextValor)
                            .addComponent(jTextPeso)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerCapacidadeMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerQtdIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCriarLstaObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbGrafico))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinnerGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGrafico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerQtdIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerCapacidadeMochila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarLstaObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1016, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarLstaObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarLstaObjetosActionPerformed
        // TODO add your handling code here:
        try {
            listaObjetos.clear();
            if( !preencherPesosValores() ){
                console.append("Error");
                //btnGerar.setEnabled(true);
            }else{
                listModel = new DefaultListModel<>();
                listModel.addElement("====== LISTA DE OBJETOS ======\n");
                for (Objeto obj : listaObjetos) {
                    //String aux = obj.toString();
                    //listModel.addElement(aux);
                    listModel.addElement("Objeto "+obj.getId()+"  --> Valor: " +obj.getValor()+"  --> Peso: "+obj.getPeso()+"\n");
                }
                jListObjetos.setModel(listModel);
                
                btnCriarLstaObjetos.setEnabled(false);
                btnIniciar.setEnabled(true);
            }
        } catch ( HeadlessException e ) {
            console.append("Error : " + e.getMessage() +"\n"+ Arrays.toString(e.getStackTrace()));
        }           
    }//GEN-LAST:event_btnCriarLstaObjetosActionPerformed

    public boolean preencherPesosValores(){
        //----------------------------------------------------------------------
        valorObj = jTextValor.getText().trim().replaceAll("\\s","").split(",");
        pesoObj = jTextPeso.getText().trim().replaceAll("\\s","").split(",");
        //----------------------------------------------------------------------
        if (valorObj.length != pesoObj.length) {
            if (valorObj.length > pesoObj.length) {
                JOptionPane.showMessageDialog(this, 
                    "Quantidade de valores : " + valorObj.length + "\n\n" +
                    "ERRO: A quantidade de valores é maior que a quatidade de pesos digitados.\nConfira por favor!" );
                jTextPeso.requestFocus();
            }else{
                JOptionPane.showMessageDialog(this, 
                    "Quantidade de pesos : " + pesoObj.length + "\n\n" + 
                    "ERRO: A quantidade de pesos é maior que a quatidade de valores digitados.\nConfira por favor!" );
                jTextValor.requestFocus();
            } 
            return false;
        }else{
            System.out.println("A quantidade de pesos e valores são iguais!");
            Object[] options = { "Confirmar", "Cancelar" };
            
            int opcao = JOptionPane.showOptionDialog(this, 
                    "Confirme a criação da lista de objetos.", "Confirmação", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                    null, options, options[0]
            );
            if (opcao == 0) {
                for (int i = 0; i < valorObj.length; i++) {
                    listaObjetos.add( new Objeto (i+1, Float.parseFloat(valorObj[i]),Float.parseFloat(pesoObj[i]) ));
                }
                //----------------------------------------------------------------------
                //pesos :   44,46,90,72,91,40,75,35,8,54,78,40,77,15,61,17,75,29,75,63
                //valores : 92,4,43,83,84,68,92,82,6,44,32,18,56,83,25,96,70,48,14,58
                for (Objeto objeto : listaObjetos) {
                    pesos.add(objeto.getPeso());
                    valores.add(objeto.getValor());
                }
                //console.append(valores.toString());
                //console.append(pesos.toString());
            }
            return true;
        }
    }
    
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
       
        List resultado = resolver();
        
        gerarGrafico();
    }//GEN-LAST:event_btnIniciarActionPerformed

    //--------------------------------------------------------------------------
    public void inicializaPopulacao(){
        this.populacao = new ArrayList<>();
        for (int i = 0; i < (int)jSpinnerQtdIndividuos.getValue(); i++) {
            System.out.println(this.pesos);
            System.out.println(this.valores);
            this.populacao.add( new Individuo( this.pesos, this.valores, (double)(int)jSpinnerCapacidadeMochila.getValue()));
        }
        this.melhorSolucao = this.populacao.get(0);
    }
    //--------------------------------------------------------------------------
    public void ordenaPopulacao(){
        Collections.sort(this.populacao);
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
    public List resolver(){        
        //pesos :   44,46,90,72,91,40,75,35,8,54,78,40,77,15,61,17,75,29,75,63
        //valores : 92,4,43,83,84,68,92,82,6,44,32,18,56,83,25,96,70,48,14,58
        
        this.inicializaPopulacao();
        this.ordenaPopulacao();
        console.setText("");
        console.append("\n====== População inicial ======\n");
        for (Individuo idv : this.populacao) {
            idv.avaliacao();
            String bin = idv.getCromossomo().toString();
            console.append("[ "+bin+" ]   |   Aptidão: "+idv.getNotaAvaliacao() + "   |  Peso: "+idv.getPesoIndividuo()+"\n");
        }
        this.vizualizaGeracao();
        
        //for (int ger = 0; ger < numeroGeracao; ger++) {
        int ger = 0;
        while ( this.melhorSolucao.getNotaAvaliacao() <= (double)(int)jSpinnerCapacidadeMochila.getValue() || contador < 50 ) {
            
            Double somaAvaliacao = this.somaAvaliacoes();
            List<Individuo> novaPopulacao = new ArrayList<>();
            
            for (int i = 0; i < ( this.populacao.size() /2 ); i++) {
                int pai1 = this.selecionaPai( somaAvaliacao );
                int pai2 = this.selecionaPai( somaAvaliacao );
                
                List<Individuo> filhos = this.populacao.get(pai1).crossover(this.populacao.get(pai2));
                novaPopulacao.add(filhos.get(0).mutacao(taxaMutacao));
                novaPopulacao.add(filhos.get(1).mutacao(taxaMutacao));
            }
            
            this.populacao = novaPopulacao;
            this.ordenaPopulacao();
            console.append("\n====== Geração "+ ger+" ======\n");
            for (Individuo idv : this.populacao) {
                idv.avaliacao();
                String bin = idv.getCromossomo().toString();
                console.append("[ "+bin+" ]   |   Aptidão: "+idv.getNotaAvaliacao() + "   |  Peso: "+idv.getPesoIndividuo()+"\n");
            }
            
            this.vizualizaGeracao();
            Individuo melhor = this.populacao.get(0);
            this.melhorIndividuo( melhor );
            contador++;
            ger++;
           
        }
        System.out.println("Melhor solução --> Geração " + this.melhorSolucao.getGeracao() +
                " Cromossomo: [ " + this.melhorSolucao.getCromossomo()+" ] "+
                " Valor: " + this.melhorSolucao.getNotaAvaliacao() + 
                " Peso: " + this.melhorSolucao.getPesoIndividuo() );
        
        console.append("\n\nMelhor solução "+
                "\nGeração " + this.melhorSolucao.getGeracao() +
                "\nCromossomo: [ " + this.melhorSolucao.getCromossomo()+" ] "+
                "\nValor: " + this.melhorSolucao.getNotaAvaliacao() + 
                "\nPeso: " + this.melhorSolucao.getPesoIndividuo()+"\n\n");
        
        
        return this.melhorSolucao.getCromossomo();
    }
    
    public void gerarGrafico(){
        if (cbGrafico.isSelected()) {
            Grafico g = new Grafico("Algoritmo Genético", "Evolução das soluções", this.melhoresCromossomos);
            g.pack();
            RefineryUtilities.centerFrameOnScreen(g);
            g.setVisible(true);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProblemaMochilaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProblemaMochilaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProblemaMochilaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProblemaMochilaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProblemaMochilaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarLstaObjetos;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JCheckBox cbGrafico;
    private javax.swing.JTextArea console;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListObjetos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinnerCapacidadeMochila;
    private javax.swing.JSpinner jSpinnerGeracoes;
    private javax.swing.JSpinner jSpinnerQtdIndividuos;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
