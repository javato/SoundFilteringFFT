import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Javier Roldan
 */

public class uinterface extends javax.swing.JFrame {
    public static FastFourierTransform fft = new FastFourierTransform();
    public static FastFourierTransform ifft = new FastFourierTransform();
    public static ArrayList<Complex> fftResul;
    public static ArrayList<Complex> filtered;
    public static ArrayList<Double> ifftResul;
    public static ArrayList<Double> original;
    public static ArrayList<Double> input;
    

    public uinterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldX = new javax.swing.JTextField();
        signalsLoadedGraphButton = new javax.swing.JButton();
        fftButton = new javax.swing.JButton();
        ifftButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsText = new javax.swing.JTextArea();
        LoadButton = new javax.swing.JButton();
        SpectrumButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        fieldFrom = new javax.swing.JTextField();
        jLabelFrom = new javax.swing.JLabel();
        jLabelTo = new javax.swing.JLabel();
        fieldTo = new javax.swing.JTextField();
        ifftToFileButton = new javax.swing.JButton();
        fftToFileButton = new javax.swing.JButton();
        filteredSpectrumButton = new javax.swing.JButton();
        originalField = new javax.swing.JTextField();
        errorButton = new javax.swing.JButton();
        loadErrorButton = new javax.swing.JButton();
        originalGraphButton = new javax.swing.JButton();
        filteredSoundGraphButton = new javax.swing.JButton();
        filterHzButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldXActionPerformed(evt);
            }
        });

        signalsLoadedGraphButton.setText("Loaded Signal Graph");
        signalsLoadedGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signalsLoadedGraphButtonActionPerformed(evt);
            }
        });

        fftButton.setText("Fast Fourier Transform");
        fftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fftButtonActionPerformed(evt);
            }
        });

        ifftButton.setText("Inverse FFT");
        ifftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifftButtonActionPerformed(evt);
            }
        });

        resultsText.setColumns(20);
        resultsText.setRows(5);
        jScrollPane1.setViewportView(resultsText);

        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        SpectrumButton.setText("Spectrum");
        SpectrumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpectrumButtonActionPerformed(evt);
            }
        });

        filterButton.setText("Apply Filter");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        fieldFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFromActionPerformed(evt);
            }
        });

        jLabelFrom.setText("From");

        jLabelTo.setText("To");

        fieldTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldToActionPerformed(evt);
            }
        });

        ifftToFileButton.setText("IFFT to File");
        ifftToFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifftToFileButtonActionPerformed(evt);
            }
        });

        fftToFileButton.setText("FFT to File");
        fftToFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fftToFileButtonActionPerformed(evt);
            }
        });

        filteredSpectrumButton.setText("Filtered Spectrum");
        filteredSpectrumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filteredSpectrumButtonActionPerformed(evt);
            }
        });

        originalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originalFieldActionPerformed(evt);
            }
        });

        errorButton.setText("Relative Error");
        errorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorButtonActionPerformed(evt);
            }
        });

        loadErrorButton.setText("Load");
        loadErrorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadErrorButtonActionPerformed(evt);
            }
        });

        originalGraphButton.setText("Loaded Signal Graph");
        originalGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originalGraphButtonActionPerformed(evt);
            }
        });

        filteredSoundGraphButton.setText("Filtered Sound Graph");
        filteredSoundGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filteredSoundGraphButtonActionPerformed(evt);
            }
        });

        filterHzButton.setText("Apply by Hz");
        filterHzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterHzButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(originalField)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signalsLoadedGraphButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadErrorButton)
                        .addGap(2, 2, 2)
                        .addComponent(errorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(originalGraphButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fftButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filterHzButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelFrom)
                                        .addComponent(jLabelTo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldTo)
                                        .addComponent(fieldFrom)))
                                .addComponent(filterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(ifftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ifftToFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fftToFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SpectrumButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filteredSpectrumButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filteredSoundGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadButton)
                    .addComponent(signalsLoadedGraphButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFrom)
                    .addComponent(fieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpectrumButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTo)
                    .addComponent(fieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fftToFileButton)
                    .addComponent(filteredSpectrumButton))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fftButton)
                    .addComponent(filterButton)
                    .addComponent(ifftButton)
                    .addComponent(ifftToFileButton)
                    .addComponent(filteredSoundGraphButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterHzButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(originalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorButton)
                    .addComponent(loadErrorButton)
                    .addComponent(originalGraphButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Plots the input
    private void signalsLoadedGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signalsLoadedGraphButtonActionPerformed
        final Graphs graphSignal1 = new Graphs("Input Sound", stringToDoubleArrayList(this.fieldX.getText()), "Time", "Fj", "Input Sound");
        graphSignal1.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal1);
        graphSignal1.setVisible(true);
        
    }//GEN-LAST:event_signalsLoadedGraphButtonActionPerformed

    //Compute FFT
    private void fftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fftButtonActionPerformed
        fftResul = new ArrayList<Complex>(fft.fft());
        filtered = new ArrayList<Complex>(fftResul);
        
        //debug
        /*System.out.println("---FFT Results:---");
        for (int i = 0; i < fftResul.size(); i++) {
            System.out.println(fftResul.get(i).re + " , " + fftResul.get(i).im);
        }*/
        
        this.resultsText.setText("FFT has been computed!");
    }//GEN-LAST:event_fftButtonActionPerformed

    //Compute IFFT
    private void ifftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifftButtonActionPerformed
        FastFourierTransform fastFourier = new FastFourierTransform();
        fastFourier.putArrayList(filtered);
        ifftResul = new ArrayList<Double>(fastFourier.ifft());
        
        //debug
        /*
        System.out.println("---IFFT Results:---");
        for (int i = 0; i < ifftResul.size(); i++) {
            System.out.println(ifftResul.get(i));
        }*/
        this.resultsText.setText("Inverse FFT has been computed!");
    }//GEN-LAST:event_ifftButtonActionPerformed

    //Load the data arrays
    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        if(this.fieldX.getText().isEmpty()) this.resultsText.setText("You must to specify the signal before!!");
        else{
            input = new ArrayList<Double>(stringToDoubleArrayList(this.fieldX.getText()));
            //System.out.println("Size before padding: " + input.size());
            ArrayList<Complex> cinput = new ArrayList<Complex>();
            
            for (int i = 0; i < input.size(); i++){
                cinput.add(new Complex(input.get(i), 0.0));
            }
            // if the input is not a power of 2, it pads with zeros
            while(Integer.highestOneBit(cinput.size()) != cinput.size()){
                cinput.add(new Complex(0.0, 0.0));
                System.out.println("Padding");
            }
            
            //debug
            /*
            System.out.println("INPUT AFTER padding: " + cinput);
            System.out.println("Number of values: " + cinput.size());
            */
            
            fft.putArrayList(cinput);
            this.resultsText.setText("Data Loaded!");
        }   
    }//GEN-LAST:event_LoadButtonActionPerformed

   
    private void SpectrumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpectrumButtonActionPerformed
        int n = fftResul.size();
        ArrayList<Complex> spectrum = new ArrayList<Complex>(fftResul.subList(0, n/2));
        ArrayList<Double> spectrumDouble = new ArrayList<Double>();
        
        //Plotting n/2
        for (int i = 0; i < n/2; i++) {
            spectrumDouble.add(spectrum.get(i).abs());
        }
        
        final Graphs graphSignal1 = new Graphs("Spectrum", spectrumDouble, "Frequency", "|Ck|", "Spectrum");        
        graphSignal1.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal1);
        graphSignal1.setVisible(true);
    }//GEN-LAST:event_SpectrumButtonActionPerformed

    private void fieldXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldXActionPerformed

    // Apply filter from ui fields
    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        //filtered = new ArrayList<Complex>(fftResul);
        int from, to;
        from = Integer.parseInt(this.fieldFrom.getText().toString());
        to = Integer.parseInt(this.fieldTo.getText().toString());
        int n = filtered.size();
        int counter = 0;
       
        //debug
        /*System.out.println("From: " + this.fieldFrom.getText());
        System.out.println("To: " + this.fieldTo.getText());
        System.out.println("From: " + from);
        System.out.println("To: " + to);*/

        if(from > to){
            System.out.println("'From' should be lower than 'To'");
        }
        else{
            for (int i = from - 1; i < to; i++) {
                filtered.set(i, new Complex(0.0, 0.0));
                filtered.set(n - from - counter, new Complex(0.0, 0.0));
                counter++;
            }
            this.resultsText.setText("FFT data was filtered!");
            
            // Debug
            /*System.out.println("---After Filtering Results:---");
            for (int i = 0; i < filtered.size(); i++) {
                System.out.println(" -> " + filtered.get(i).re + " , " + filtered.get(i).im);
            }*/
        }
        
    }//GEN-LAST:event_filterButtonActionPerformed

    private void fieldFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFromActionPerformed

    private void fieldToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldToActionPerformed

    //Create a file with the Inverse FFT data output
    private void ifftToFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifftToFileButtonActionPerformed
        try{
            PrintWriter writer = new PrintWriter("ifftOutput.txt", "UTF-8");
            for (int i = 0; i < ifftResul.size(); i++) {
                writer.print(ifftResul.get(i) + " ");
                this.resultsText.setText("IFFT output file created as 'ifftOutput.txt'");
            }
            writer.close();
        } catch (IOException e) {
            this.resultsText.setText("Error creating the output file");
        }
    }//GEN-LAST:event_ifftToFileButtonActionPerformed

    //Create a file with the FFT data output
    private void fftToFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fftToFileButtonActionPerformed
        try{
            PrintWriter writer = new PrintWriter("fftOutput.txt", "UTF-8");
            for (int i = 0; i < filtered.size(); i++) {
                writer.print(filtered.get(i).re + " + " + filtered.get(i).im + "i ");
            }
            writer.close();
            this.resultsText.setText("FFT output file created as 'fftOutput.txt'");
        } catch (IOException e) {
            this.resultsText.setText("Error creating the output file");
        }
    }//GEN-LAST:event_fftToFileButtonActionPerformed

    // Plots Spectrum after filtering
    private void filteredSpectrumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filteredSpectrumButtonActionPerformed
        int n = filtered.size();
        ArrayList<Complex> spectrum = new ArrayList<Complex>(filtered.subList(0, n/2));
        ArrayList<Double> spectrumDouble = new ArrayList<Double>();
        for (int i = 0; i < n/2; i++) {
            spectrumDouble.add(spectrum.get(i).abs());
        }
        
        final Graphs graphSignal1 = new Graphs("Filtered Spectrum", spectrumDouble, "Frequency", "|Ck|", "Filtered Spectrum");       
        graphSignal1.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal1);
        graphSignal1.setVisible(true);
    }//GEN-LAST:event_filteredSpectrumButtonActionPerformed

    private void originalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originalFieldActionPerformed

    // Loads the original sound
    private void loadErrorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadErrorButtonActionPerformed
        original = new ArrayList<Double>(stringToDoubleArrayList(this.originalField.getText()));
        this.resultsText.setText("Original Sound Loaded!");
    }//GEN-LAST:event_loadErrorButtonActionPerformed

    // Calculate the relative error between the filtered sound and the original one
    private void errorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorButtonActionPerformed
        ArrayList<Double> error = new ArrayList<Double>();
        double mean = 0;
        
        for (int i = 0; i < original.size(); i++) {
            if(original.get(i) == 0.0){
                continue;
                //error.add(((Math.abs(ifftResul.get(i) - 0.00001)) / Math.abs(0.00001)));
            }
            error.add(((Math.abs(ifftResul.get(i) - original.get(i))) / Math.abs(original.get(i))));
            //error.add(((Math.abs(ifftResul.get(i) - original.get(i))) / Math.abs(input.get(i))));
        }
        System.out.println("--- Relative Error ---");
        System.out.println(error.toString());
        
        for (int i = 0; i < error.size(); i++) {
            mean = mean + error.get(i);
        }
        mean = mean / (double)error.size();
        this.resultsText.setText("Relative Error = " + mean);
    }//GEN-LAST:event_errorButtonActionPerformed

    private void originalGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originalGraphButtonActionPerformed
        final Graphs graphSignal1 = new Graphs("Sound to Compare", stringToDoubleArrayList(this.originalField.getText()), "Time", "Fj", "Sound to Compare");
        graphSignal1.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal1);
        graphSignal1.setVisible(true);
    }//GEN-LAST:event_originalGraphButtonActionPerformed

    private void filteredSoundGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filteredSoundGraphButtonActionPerformed
        final Graphs graphSignal1 = new Graphs("Filtered Sound", ifftResul, "Time", "Fj", "Filtered Sound");
        graphSignal1.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal1);
        graphSignal1.setVisible(true);
    }//GEN-LAST:event_filteredSoundGraphButtonActionPerformed

    private void filterHzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterHzButtonActionPerformed
        //filtered = new ArrayList<Complex>(fftResul);
        long from, to;
        from = Integer.parseInt(this.fieldFrom.getText().toString());
        to = Integer.parseInt(this.fieldTo.getText().toString());
        long n = filtered.size();
        long counter = 0;
        
        from = (from * n) / 44100;
        to = (to * n) / 44100;
       
        //debug
        /*System.out.println("From: " + this.fieldFrom.getText());
        System.out.println("To: " + this.fieldTo.getText());
        System.out.println("From: " + from);
        System.out.println("To: " + to);*/

        if(from > to){
            System.out.println("'From' should be lower than 'To'");
        }
        else{
            for (long i = from - 1; i < to; i++) {
                filtered.set((int)i, new Complex(0.0, 0.0));
                filtered.set((int)(n - from - counter), new Complex(0.0, 0.0));
                counter++;
            }
            this.resultsText.setText("FFT data was filtered by Hz!");
            
            // Debug
            /*System.out.println("---After Filtering Results:---");
            for (int i = 0; i < filtered.size(); i++) {
                System.out.println(" -> " + filtered.get(i).re + " , " + filtered.get(i).im);
            }*/
        }
    }//GEN-LAST:event_filterHzButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(uinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uinterface().setVisible(true);
            }
        });
    }
    
    public ArrayList<Double> stringToDoubleArrayList(String str){
        StringTokenizer strTokenizer = new StringTokenizer(str, " ");
        ArrayList<Double> arrayList = new ArrayList<Double>();
        
        while (strTokenizer.hasMoreTokens()) {
            arrayList.add(Double.valueOf(strTokenizer.nextToken()));
        }
        //System.out.println(arrayList);
        return arrayList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton SpectrumButton;
    private javax.swing.JButton errorButton;
    private javax.swing.JButton fftButton;
    private javax.swing.JButton fftToFileButton;
    private javax.swing.JTextField fieldFrom;
    private javax.swing.JTextField fieldTo;
    private javax.swing.JTextField fieldX;
    private javax.swing.JButton filterButton;
    private javax.swing.JButton filterHzButton;
    private javax.swing.JButton filteredSoundGraphButton;
    private javax.swing.JButton filteredSpectrumButton;
    private javax.swing.JButton ifftButton;
    private javax.swing.JButton ifftToFileButton;
    private javax.swing.JLabel jLabelFrom;
    private javax.swing.JLabel jLabelTo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadErrorButton;
    private javax.swing.JTextField originalField;
    private javax.swing.JButton originalGraphButton;
    private javax.swing.JTextArea resultsText;
    private javax.swing.JButton signalsLoadedGraphButton;
    // End of variables declaration//GEN-END:variables
}
