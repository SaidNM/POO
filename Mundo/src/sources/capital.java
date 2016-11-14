
package sources;


public class capital extends javax.swing.JFrame { 
String[]AmericanCountries;
String[] AsiaCountries;
String[]EuropeCountries;
String[]AfricaCountries;
String[] capital;
    
    public capital() {
        this.AmericanCountries = new String[]{"Mexico", "USA", "Argentina", "Colombia", "Chile"};
        this.AsiaCountries = new String[]{"China","Japon","Bangladesh","Arabia","Corea"};
        this.AfricaCountries = new String[]{"Angola","Camerun","Argelia","Burundi","Benin"};
        this.EuropeCountries = new String[]{"Italia","Francia","España","Suiza","Holanda"};
        initComponents();
        
   }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBoxContinent = new javax.swing.JComboBox<>();
        jComboBoxCountry = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBoxContinent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "America", "Asia", "Europe", "Africa" }));
        jComboBoxContinent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxContinentActionPerformed(evt);
            }
        });

        jLabel1.setText("Continent");

        jLabel2.setText("Country");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mundo");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxContinent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButtonSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxContinent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSearch)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        
        
        
        for (String cap : capital) {
            System.out.println(cap);
        }
    
        
 

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jComboBoxContinentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxContinentActionPerformed
        
  if(jComboBoxContinent.getSelectedItem().equals("America")){
  jComboBoxCountry.removeAllItems();
      for (String AmericanCountry : AmericanCountries) {
          jComboBoxCountry.addItem(AmericanCountry);
      }
  }
  else if(jComboBoxContinent.getSelectedItem().equals("Asia")){
      jComboBoxCountry.removeAllItems();
      for (String AsiaCountry : AsiaCountries) {
          jComboBoxCountry.addItem(AsiaCountry);
      }
  }
  else if(jComboBoxContinent.getSelectedItem().equals("Europe")){
          jComboBoxCountry.removeAllItems();
      for (String EuropeCountry : EuropeCountries) {
          jComboBoxCountry.addItem(EuropeCountry);
      }
          }
  else if(jComboBoxContinent.getSelectedItem().equals("Africa")){
  jComboBoxCountry.removeAllItems();
      for (String AfricaCountry : AfricaCountries) {
          jComboBoxCountry.addItem(AfricaCountry);
      }
  }
        
        
        
        
    }//GEN-LAST:event_jComboBoxContinentActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capital().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxContinent;
    private javax.swing.JComboBox<String> jComboBoxCountry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
