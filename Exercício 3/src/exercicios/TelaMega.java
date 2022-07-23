package exercicios;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaMega extends javax.swing.JFrame {

    public TelaMega() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
        int[] apostaMegaSena = new int[6];
         for(int i=0; i<6; i++)
         {
             apostaMegaSena[i] = 1+(int)(Math.random()*60); 
         }
          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfPalpite = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btSimulacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exercicios/mega.PNG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Digite abaixo seus números da sorte, separados por vírgula. Em seguida, clique em SIMULAR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("e aguarde. (OBS: dependendo de sua sorte, irá aguardar muito, muito mesmo...)");

        tfPalpite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPalpiteKeyTyped(evt);
            }
        });

        jLabel4.setText("Palpite:");

        jLabel5.setText("Ex: 6,50,3,8,10,26");

        btSimulacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exercicios/botao_simulacao.png"))); // NOI18N
        btSimulacao.setBorderPainted(false);
        btSimulacao.setContentAreaFilled(false);
        btSimulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimulacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(btSimulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addComponent(btSimulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSimulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimulacaoActionPerformed
    int qntVirgula = 0;
        for(int i=0; i< tfPalpite.getText().length(); i++)
        {
            System.out.println(tfPalpite.getText().charAt(i));
        }
        
    if (tfPalpite.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(rootPane, "O campo PALPITE não foi preenchido", "Prog1",0);
    }
    else
    {
      for(int i=0; i < tfPalpite.getText().length(); i++)
      {
          if (tfPalpite.getText().charAt(i) == ',')
          {
              qntVirgula++;
          }
         }
      if(qntVirgula != 5)
        {
            JOptionPane.showMessageDialog(rootPane, "Foram digitados quantidade de palpites incorretos", "ERRO - MEGA SENA", 2);
        }
      int posicoes;
      for(int i=0; i<tfPalpite.getText().length(); i++)   
               {
                   posicoes = tfPalpite.getText().indexOf(",");
                   System.out.println(posicoes);
               }
      
    }          
    
    
    }//GEN-LAST:event_btSimulacaoActionPerformed

    private void tfPalpiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPalpiteKeyTyped
        String valoresPermitidos = "0123456789,";
        System.out.println(evt.getKeyChar());
        
        if(!valoresPermitidos.contains(evt.getKeyChar()+""))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tfPalpiteKeyTyped

   
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaMega().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSimulacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfPalpite;
    // End of variables declaration//GEN-END:variables
}
