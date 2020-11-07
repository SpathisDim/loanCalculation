
package calculate;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nhytu
 */
public class YpologismosDaneiou extends javax.swing.JFrame {

    /**
     * Creates new form YpologismosDaneiou
     */
    public YpologismosDaneiou() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        arxikoKefalaio = new javax.swing.JTextField();
        epitokio = new javax.swing.JTextField();
        twentyfourM = new javax.swing.JButton();
        sixM = new javax.swing.JButton();
        thirtysixM = new javax.swing.JButton();
        twelveM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        test = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 179, 16));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Στοιχέια Δανέιου", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Αρχικό Κεφάλαιο Δανείου:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Επιτόκιο:");

        arxikoKefalaio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        arxikoKefalaio.setToolTipText("");

        epitokio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        epitokio.setToolTipText("");
        epitokio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        epitokio.setName(""); // NOI18N
        epitokio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epitokioActionPerformed(evt);
            }
        });

        twentyfourM.setBackground(new java.awt.Color(51, 51, 51));
        twentyfourM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        twentyfourM.setForeground(new java.awt.Color(255, 255, 255));
        twentyfourM.setText("3. Για διαρκεια 24 μηνων");
        twentyfourM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentyfourMActionPerformed(evt);
            }
        });

        sixM.setBackground(new java.awt.Color(51, 51, 51));
        sixM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sixM.setForeground(new java.awt.Color(255, 255, 255));
        sixM.setText("1. Για διαρκεια 6 μηνων");
        sixM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixMActionPerformed(evt);
            }
        });

        thirtysixM.setBackground(new java.awt.Color(51, 51, 51));
        thirtysixM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        thirtysixM.setForeground(new java.awt.Color(255, 255, 255));
        thirtysixM.setText("4. Για διαρκεια 36 μηνων");
        thirtysixM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtysixMActionPerformed(evt);
            }
        });

        twelveM.setBackground(new java.awt.Color(51, 51, 51));
        twelveM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        twelveM.setForeground(new java.awt.Color(255, 255, 255));
        twelveM.setText("2. Για διαρκεια 12 μηνων");
        twelveM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twelveMActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Επιλέξτε Διάρκεια Αποπληρωμής");

        Table.setForeground(new java.awt.Color(51, 51, 51));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Μήνας", "Υπόλοιπο Κεφαλαίου", "Μηνίαια Δόση"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        test.setBackground(new java.awt.Color(153, 153, 153));
        test.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        test.setForeground(new java.awt.Color(153, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("%");

        Clear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Clear.setText("Εκκαθάριση Πίνακα");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(thirtysixM, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(arxikoKefalaio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(epitokio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(sixM, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(twelveM, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(twentyfourM, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(391, 391, 391))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clear)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(arxikoKefalaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(epitokio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twelveM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(twentyfourM)
                        .addComponent(thirtysixM)
                        .addComponent(sixM)))
                .addGap(34, 34, 34)
                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_2.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void twelveMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twelveMActionPerformed
     int Months=12;
     DefaultTableModel model=(DefaultTableModel)Table.getModel();
     model.setRowCount(0); //καθαρισμος πινακα
     test.setText(""); //clear text message
     if(!(arxikoKefalaio.getText().trim().equals("") || epitokio.getText().trim().equals(""))) {
        double[] ypoloipoKefalaiou =new double[500];        
        double mDosh; //miniaia dosh mazi me tokous
        for(int i=1; i<13; i++){ 
            
            
           double arxKefalaio=Double.parseDouble(arxikoKefalaio.getText()); //metatropi apo JTextField se double
           double epitokioC=Double.parseDouble(epitokio.getText());        //metatropi apo JTextField se double
 

           if(i==1){                
               mDosh=(arxKefalaio/Months+((arxKefalaio*epitokioC/100)/Months));
               ypoloipoKefalaiou[i]=arxKefalaio;
               model.addRow(new Object[]{i,ypoloipoKefalaiou[i] ,mDosh});
            }
           else{
                ypoloipoKefalaiou[i]=ypoloipoKefalaiou[i-1]-arxKefalaio/Months;
                mDosh=(arxKefalaio/Months+((ypoloipoKefalaiou[i]*epitokioC/100))/Months);            
                model.addRow(new Object[]{i, ypoloipoKefalaiou[i] ,mDosh });
            }
        }
     }
     else{
         test.setText("WARNING: Κάποιο από τα παραπάνω πεδία είναι κενό,παρακαλώ συμπληρώστε τα!");              
        }
    }//GEN-LAST:event_twelveMActionPerformed

    private void twentyfourMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentyfourMActionPerformed
     int Months=24;
     DefaultTableModel model=(DefaultTableModel)Table.getModel();
     model.setRowCount(0); //καθαρισμος πινακα
     test.setText(""); //clear text message
     if(!(arxikoKefalaio.getText().trim().equals("") || epitokio.getText().trim().equals(""))) {//αν ΔΕΕΕΕΝ ειναι κενο το textfield 
        model.setRowCount(0);
        double[] ypoloipoKefalaiou =new double[500];        
        double mDosh; //miniaia dosh mazi me tokous
        for(int i=1; i<25; i++){ 
            
            
           double arxKefalaio=Double.parseDouble(arxikoKefalaio.getText()); //metatropi apo JTextField se double
           double epitokioC=Double.parseDouble(epitokio.getText());        //metatropi apo JTextField se double
 

           if(i==1){                
               mDosh=(arxKefalaio/Months+((arxKefalaio*epitokioC/100)/Months));
               ypoloipoKefalaiou[i]=arxKefalaio;
               model.addRow(new Object[]{i,ypoloipoKefalaiou[i] ,mDosh});
            }
           else{
                ypoloipoKefalaiou[i]=ypoloipoKefalaiou[i-1]-arxKefalaio/Months;
                mDosh=(arxKefalaio/Months+((ypoloipoKefalaiou[i]*epitokioC/100))/Months);            
                model.addRow(new Object[]{i, ypoloipoKefalaiou[i] ,mDosh });
            }
        }
     }else{
         test.setText("WARNING: Κάποιο από τα παραπάνω πεδία είναι κενό,παρακαλώ συμπληρώστε τα!");              
        }
    }//GEN-LAST:event_twentyfourMActionPerformed

    
            
    //GIA 6 MHNES
    private void sixMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixMActionPerformed
     int Months=6;
     DefaultTableModel model=(DefaultTableModel)Table.getModel();
     model.setRowCount(0); //καθαρισμος πινακα
     test.setText(""); //clear text message
     if(!(arxikoKefalaio.getText().trim().equals("") || epitokio.getText().trim().equals(""))) {
        
        double[] ypoloipoKefalaiou =new double[500];        
        double mDosh; //miniaia dosh mazi me tokous
        for(int i=1; i<7; i++){ 
            
            
           double arxKefalaio=Double.parseDouble(arxikoKefalaio.getText()); //metatropi apo JTextField se double
           double epitokioC=Double.parseDouble(epitokio.getText());        //metatropi apo JTextField se double
 
           
           if(i==1){                
               mDosh=(arxKefalaio/Months+((arxKefalaio*epitokioC/100)/Months));
               ypoloipoKefalaiou[i]=arxKefalaio;
               model.addRow(new Object[]{i,ypoloipoKefalaiou[i] ,mDosh});
            }
           else{
                ypoloipoKefalaiou[i]=ypoloipoKefalaiou[i-1]-arxKefalaio/Months;
                mDosh=(arxKefalaio/Months+((ypoloipoKefalaiou[i]*epitokioC/100))/Months);            
                model.addRow(new Object[]{i, ypoloipoKefalaiou[i] ,mDosh });
            }
    }

        }else{
         test.setText("WARNING: Κάποιο από τα παραπάνω πεδία είναι κενό,παρακαλώ συμπληρώστε τα!");              
        }
             
    
    
       /* test.setText(""); //clear text message
        DefaultTableModel model=(DefaultTableModel)Table.getModel();
         if(!(arxikoKefalaio.getText().trim().equals("") || epitokio.getText().trim().equals(""))){
             model.addRow(new Object[]{arxikoKefalaio.getText(),epitokio.getText()});
         }else{
             test.setText(" WARNING: Καποιο πεδιο ειναι κενο!");
         }*/
        
        
        
        
    }//GEN-LAST:event_sixMActionPerformed

    
    
    private void thirtysixMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtysixMActionPerformed
     int Months=36;
     DefaultTableModel model=(DefaultTableModel)Table.getModel();
     model.setRowCount(0); //καθαρισμος πινακα
     test.setText(""); //clear text message
     if(!(arxikoKefalaio.getText().trim().equals("") || epitokio.getText().trim().equals(""))) {
        double[] ypoloipoKefalaiou =new double[500];        
        double mDosh; //miniaia dosh mazi me tokous
        for(int i=1; i<37; i++){ 
            
            
           double arxKefalaio=Double.parseDouble(arxikoKefalaio.getText()); //metatropi apo JTextField se double
           double epitokioC=Double.parseDouble(epitokio.getText());        //metatropi apo JTextField se double
 

           if(i==1){                
               mDosh=(arxKefalaio/Months+((arxKefalaio*epitokioC/100)/Months));
               ypoloipoKefalaiou[i]=arxKefalaio;
               model.addRow(new Object[]{i,ypoloipoKefalaiou[i] ,mDosh});
            }
           else{
                ypoloipoKefalaiou[i]=ypoloipoKefalaiou[i-1]-arxKefalaio/Months;
                mDosh=(arxKefalaio/Months+((ypoloipoKefalaiou[i]*epitokioC/100))/Months);            
                model.addRow(new Object[]{i, ypoloipoKefalaiou[i] ,mDosh });
            }
        }
     }else{
         test.setText("WARNING: Κάποιο από τα παραπάνω πεδία είναι κενό,παρακαλώ συμπληρώστε τα!");              
        }
    }//GEN-LAST:event_thirtysixMActionPerformed

    
    
    
    
    private void epitokioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epitokioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epitokioActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        DefaultTableModel model=(DefaultTableModel)Table.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(YpologismosDaneiou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YpologismosDaneiou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YpologismosDaneiou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YpologismosDaneiou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YpologismosDaneiou().setVisible(true);
                JScrollPane scroll = new JScrollPane(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTable Table;
    private javax.swing.JTextField arxikoKefalaio;
    private javax.swing.JTextField epitokio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sixM;
    private javax.swing.JLabel test;
    private javax.swing.JButton thirtysixM;
    private javax.swing.JButton twelveM;
    private javax.swing.JButton twentyfourM;
    // End of variables declaration//GEN-END:variables
}
