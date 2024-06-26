/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
//import com.mycompany.calculadora.Calculadora;

import com.mycompany.calculadora.Calculadora;
import java.util.StringTokenizer;

/**
 *Calculadora IP
 * Samano Resendiz Jesua Issac
 * Venegas Mariano Karla 
 */
public class Pantalla extends javax.swing.JFrame {
    private Calculadora calculadora;

    /**
     * Creates new form Pantalla
     */
    public Pantalla(Calculadora calculadora) {
        initComponents();
        this.calculadora = calculadora;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dir = new javax.swing.JTextField();
        netmask = new javax.swing.JTextField();
        sub = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        boton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(232, 232, 252));

        jLabel1.setBackground(new java.awt.Color(204, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Calculadora de IP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Dirección");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Netmask");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Subneteo (opcional)");

        dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirActionPerformed(evt);
            }
        });

        netmask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netmaskActionPerformed(evt);
            }
        });

        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        boton.setText("Calcular");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLabel5.setText("/");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(boton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(netmask, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(netmask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        String address = dir.getText(); //Obtenemos el valor del campo de direccion
        String mascara = netmask.getText();
        String maskSubneteo = sub.getText();
        StringBuilder mensajes = new StringBuilder(); //Para que muestre todos los msj en el area
       
        
        boolean direcValid = Calculadora.validarDireccionIP(address);
        boolean mascaraValid = Calculadora.validarMascaraSubred(mascara);
        
        
        if (!direcValid) {
            mensajes.append("La dirección IP NO es válida.\n");
        }
    
        if (!mascaraValid) {
            mensajes.append("Máscara incorrecta.\n");
        }

        if (direcValid) {
            String[] octetos = address.split("\\.");
            String clase = Calculadora.determinarClaseDireccionIP(octetos);
            //mensajes.append(clase).append("\n");
     
            //Para la dirección IP
            String binaryNumber1 = Calculadora.decABinario(Integer.parseInt(octetos[0]));
            String binaryNumber2 = Calculadora.decABinario(Integer.parseInt(octetos[1]));
            String binaryNumber3 = Calculadora.decABinario(Integer.parseInt(octetos[2]));
            String binaryNumber4 = Calculadora.decABinario(Integer.parseInt(octetos[3]));
            mensajes.append("Address: "+address+"\t\t"+binaryNumber1+"."+binaryNumber2+"."+binaryNumber3+"."+binaryNumber4+"\n");
            
            //Para la mascara de la dir IP
            String mascaraSubred = Calculadora.crearMascara(Integer.parseInt(mascara));
            String maskDecimal = Calculadora.binADec(mascaraSubred);
            
            mensajes.append("Netmask: ").append(maskDecimal).append("  ="+mascara+"\t\t").append(mascaraSubred).append("\n");
            
            //Para la wildcard
            String maskCompl = "255.255.255.255";
            String wildcard = Calculadora.restarOctetos(maskCompl,maskDecimal);
            String[] octWild = wildcard.split("\\.");
            String binaryWild1 = Calculadora.decABinario(Integer.parseInt(octWild[0]));
            String binaryWild2 = Calculadora.decABinario(Integer.parseInt(octWild[1]));
            String binaryWild3 = Calculadora.decABinario(Integer.parseInt(octWild[2]));
            String binaryWild4 = Calculadora.decABinario(Integer.parseInt(octWild[3]));
            
            mensajes.append("Wildcard: "+wildcard+"\t\t"+binaryWild1+"."+binaryWild2+"."+binaryWild3+"."+binaryWild4+"\n");
            
            
           
            // Operación AND para la Dir de Red
            String resultadoAnd = String.format("%8s.%8s.%8s.%8s",
                Integer.toBinaryString(Integer.parseInt(binaryNumber1, 2) & Integer.parseInt(mascaraSubred.split("\\.")[0], 2)),
                Integer.toBinaryString(Integer.parseInt(binaryNumber2, 2) & Integer.parseInt(mascaraSubred.split("\\.")[1], 2)),
                Integer.toBinaryString(Integer.parseInt(binaryNumber3, 2) & Integer.parseInt(mascaraSubred.split("\\.")[2], 2)),
                Integer.toBinaryString(Integer.parseInt(binaryNumber4, 2) & Integer.parseInt(mascaraSubred.split("\\.")[3], 2)) );

            resultadoAnd = resultadoAnd.replace(" ", "0"); // Eliminar espacios adicionales de cada octeto binario
            mensajes.append("\n\n");
            
            String network = Calculadora.binADec(resultadoAnd);
            mensajes.append("Network: " +network+"  /"+mascara+"\t\t"+resultadoAnd+"\n");
            
           
            //Obtener el Host Min
            String[] octetosAnd = network.split("\\."); // Contiene los octetos en decimal, no binario
            String[] octetosAndBin = new String[4];
            
            for (int i = 0; i < 4; i++) {
                octetosAndBin[i] = String.format("%8s", Integer.toBinaryString(Integer.parseInt(octetosAnd[i]))).replace(" ", "0");
            }

                // Incrementar el último octeto en binario
            int ultOct = Integer.parseInt(octetosAndBin[3], 2) + 1;
            String octFinal = String.format("%8s", Integer.toBinaryString(ultOct)).replace(" ", "0");
            String hostMinBin = octetosAndBin[0] + "." + octetosAndBin[1] + "." + octetosAndBin[2] + "." + octFinal;

            // Convertir cada octeto binario a decimal
            String[] octetosHostMinBin = hostMinBin.split("\\.");
            StringBuilder hostMinDec = new StringBuilder();
            for (String octeto : octetosHostMinBin) {
                int decimal = Integer.parseInt(octeto, 2);
                if (hostMinDec.length() > 0) {
                    hostMinDec.append(".");
                }
                hostMinDec.append(decimal);
            }
            mensajes.append("HostMin: " +hostMinDec+"\t\t"+hostMinBin.toString()+"\n");

            
            //Operación OR para la Dir Broadcast
            
            String invertMask = Calculadora.invertirMascara(mascaraSubred);
            StringTokenizer octMaskInv = new StringTokenizer(invertMask,".");
            String octInv1 = octMaskInv.nextToken();
            String octInv2 = octMaskInv.nextToken();
            String octInv3 = octMaskInv.nextToken();
            String octInv4 = octMaskInv.nextToken();
            
            StringTokenizer dirRedOct = new StringTokenizer(resultadoAnd,".");
            String octNet1 = dirRedOct.nextToken();
            String octNet2 = dirRedOct.nextToken();
            String octNet3 = dirRedOct.nextToken();
            String octNet4 = dirRedOct.nextToken();
            
            
            String resultadoOr = String.format("%8s.%8s.%8s.%8s",
                Integer.toBinaryString(Integer.parseInt(octInv1, 2) | Integer.parseInt(octNet1, 2)),
                Integer.toBinaryString(Integer.parseInt(octInv2, 2) | Integer.parseInt(octNet2, 2)),
                Integer.toBinaryString(Integer.parseInt(octInv3, 2) | Integer.parseInt(octNet3, 2)),
                Integer.toBinaryString(Integer.parseInt(octInv4, 2) | Integer.parseInt(octNet4, 2)) );
            
            resultadoOr = resultadoOr.replace(" ", "0");
            String broadcast = Calculadora.binADec(resultadoOr);
            //mensajes.append("Broadcast: "+broadcast+"\t\t"+ resultadoOr+"\n");
            
            //Obtener el Host Max
            String[] octetosOR = broadcast.split("\\."); // Contiene los octetos en decimal, no binario
            String[] octetosORBin = new String[4];
            
            for (int i = 0; i < 4; i++) {
                octetosORBin[i] = String.format("%8s", Integer.toBinaryString(Integer.parseInt(octetosOR[i]))).replace(" ", "0");
            }

                // Incrementar el último octeto en binario
            int ultOctMax = Integer.parseInt(octetosORBin[3], 2) - 1;
            String octFinalMax = String.format("%8s", Integer.toBinaryString(ultOctMax)).replace(" ", "0");
            String hostMaxBin = octetosORBin[0] + "." + octetosORBin[1] + "." + octetosORBin[2] + "." + octFinalMax;

            // Convertir cada octeto binario a decimal
            String[] octetosHostMaxBin = hostMaxBin.split("\\.");
            StringBuilder hostMaxDec = new StringBuilder();
            for (String oct : octetosHostMaxBin) {
                int decimal = Integer.parseInt(oct, 2);
                if (hostMaxDec.length() > 0) {
                    hostMaxDec.append(".");
                }
                hostMaxDec.append(decimal);
            }
            mensajes.append("HostMax: " +hostMaxDec+"\t\t"+hostMaxBin.toString()+"\n");
            mensajes.append("Broadcast: "+broadcast+"\t\t"+ resultadoOr+"\n");
            
            
            
            //Obtener Host/Net
            int hostNet = Calculadora.contarBitsCero(mascaraSubred);
            int numeroHosts = (int) Math.pow(2, hostNet) - 2;
            mensajes.append("Hosts/Net: "+numeroHosts+"\t\t").append(clase).append("\n");
            
            
            //Obtener todas las subredes si se elige el subneteo
            if (!maskSubneteo.isEmpty()) {
                int maskNueva = Integer.parseInt(maskSubneteo);
                int maskVieja = Integer.parseInt(mascara);
                int subnetCount = (int) Math.pow(2, maskNueva - maskVieja);
                int increment = (int) Math.pow(2, 32 - maskNueva);
                int limite = 1000;
                int hostCount = increment - 2;  // No de hosts

                mensajes.append("\nSubneteo después de la transición /").append(maskVieja).append(" a /").append(maskNueva).append("\n\n");

                // Nueva netmask
                String netmaskNueva = Calculadora.crearMascara(Integer.parseInt(maskSubneteo));
                String netmaskNuevaDec = Calculadora.binADec(netmaskNueva);
                mensajes.append("Netmask: " + netmaskNuevaDec + " = " + maskSubneteo + "\t\t" + netmaskNueva + "\n");

                // Nueva Wildcard
                String wildcardNueva = Calculadora.restarOctetos(maskCompl, netmaskNuevaDec);
                String[] octWildNuevo = wildcardNueva.split("\\.");
                String binWildNew1 = Calculadora.decABinario(Integer.parseInt(octWildNuevo[0]));
                String binWildNew2 = Calculadora.decABinario(Integer.parseInt(octWildNuevo[1]));
                String binWildNew3 = Calculadora.decABinario(Integer.parseInt(octWildNuevo[2]));
                String binWildNew4 = Calculadora.decABinario(Integer.parseInt(octWildNuevo[3]));

                mensajes.append("Wildcard: " + wildcardNueva + "\t\t" + binWildNew1 + "." + binWildNew2 + "." + binWildNew3 + "." + binWildNew4 + "\n\n");

                // Convertir la dirección IP base a un entero para manipulación fácil
                String[] addressOctets = address.split("\\.");
                int baseAddress = ((Integer.parseInt(addressOctets[0]) << 24)
                                 | (Integer.parseInt(addressOctets[1]) << 16)
                                 | (Integer.parseInt(addressOctets[2]) << 8)
                                 | Integer.parseInt(addressOctets[3]))
                                 & ~((1 << (32 - maskVieja)) - 1);  // Esto establece la baseAddress a la red inicial

                for (int i = 0; i < subnetCount; i++) {
                    // Ponemos un límite de subredes mostradas para evitar bucles infinitos (aunque si los calcula)
                    if (i >= limite) {
                        mensajes.append("Límite de redes alcanzado");
                        break;
                    }
                    // Calcular dirección de red para la subred actual
                    int networkAddressInt = baseAddress + (i * increment);
                    String networkAddress = ((networkAddressInt >> 24) & 0xFF) + "." + ((networkAddressInt >> 16) & 0xFF) + "." 
                            + ((networkAddressInt >> 8) & 0xFF) + "." + (networkAddressInt & 0xFF);
                    String networkAddressBin = String.format("%8s", Integer.toBinaryString((networkAddressInt >> 24) & 0xFF)).replace(' ', '0') + "."
                                             + String.format("%8s", Integer.toBinaryString((networkAddressInt >> 16) & 0xFF)).replace(' ', '0') + "."
                                             + String.format("%8s", Integer.toBinaryString((networkAddressInt >> 8) & 0xFF)).replace(' ', '0') + "."
                                             + String.format("%8s", Integer.toBinaryString(networkAddressInt & 0xFF)).replace(' ', '0');

                    // Calcular la dirección de broadcast
                    int broadcastAddressInt = networkAddressInt + increment - 1;
                    String broadcastAddress = ((broadcastAddressInt >> 24) & 0xFF) + "." + ((broadcastAddressInt >> 16) & 0xFF) + "." 
                            + ((broadcastAddressInt >> 8) & 0xFF) + "." + (broadcastAddressInt & 0xFF);
                    String broadcastAddressBin = String.format("%8s", Integer.toBinaryString((broadcastAddressInt >> 24) & 0xFF)).replace(' ', '0') + "."
                                               + String.format("%8s", Integer.toBinaryString((broadcastAddressInt >> 16) & 0xFF)).replace(' ', '0') + "."
                                               + String.format("%8s", Integer.toBinaryString((broadcastAddressInt >> 8) & 0xFF)).replace(' ', '0') + "."
                                               + String.format("%8s", Integer.toBinaryString(broadcastAddressInt & 0xFF)).replace(' ', '0');

                    // Calcular host mínimo (dirección de red + 1)
                    int hostMinInt = networkAddressInt + 1;
                    String hostMin = ((hostMinInt >> 24) & 0xFF) + "." + ((hostMinInt >> 16) & 0xFF) + "." 
                            + ((hostMinInt >> 8) & 0xFF) + "." + (hostMinInt & 0xFF);
                    String hostMinBinNuevo = String.format("%8s", Integer.toBinaryString((hostMinInt >> 24) & 0xFF)).replace(' ', '0') + "."
                                           + String.format("%8s", Integer.toBinaryString((hostMinInt >> 16) & 0xFF)).replace(' ', '0') + "."
                                           + String.format("%8s", Integer.toBinaryString((hostMinInt >> 8) & 0xFF)).replace(' ', '0') + "."
                                           + String.format("%8s", Integer.toBinaryString(hostMinInt & 0xFF)).replace(' ', '0');

                    // Calcular host máximo (dirección de broadcast - 1)
                    int hostMaxInt = broadcastAddressInt - 1;
                    String hostMax = ((hostMaxInt >> 24) & 0xFF) + "." + ((hostMaxInt >> 16) & 0xFF) + "." 
                            + ((hostMaxInt >> 8) & 0xFF) + "." + (hostMaxInt & 0xFF);
                    String hostMaxBinNuevo = String.format("%8s", Integer.toBinaryString((hostMaxInt >> 24) & 0xFF)).replace(' ', '0') + "."
                                           + String.format("%8s", Integer.toBinaryString((hostMaxInt >> 16) & 0xFF)).replace(' ', '0') + "."
                                           + String.format("%8s", Integer.toBinaryString((hostMaxInt >> 8) & 0xFF)).replace(' ', '0') + "."
                                           + String.format("%8s", Integer.toBinaryString(hostMaxInt & 0xFF)).replace(' ', '0');

                    mensajes.append("Network: ").append(networkAddress).append("/").append(maskNueva).append("\t\t").append(networkAddressBin).append("\n");
                    mensajes.append("HostMin: ").append(hostMin).append("\t\t").append(hostMinBinNuevo).append("\n");
                    mensajes.append("HostMax: ").append(hostMax).append("\t\t").append(hostMaxBinNuevo).append("\n");
                    mensajes.append("Broadcast: ").append(broadcastAddress).append("\t\t").append(broadcastAddressBin).append("\n");
                    mensajes.append("Hosts/Net: ").append(hostCount).append("\n\n");
                }
                int hostTotal = subnetCount * hostCount;
                mensajes.append("Subredes: ").append(subnetCount).append("\n");
                mensajes.append("Host: ").append(hostTotal).append("\n");
            }

           
            
            
        }
        
         
        area.setText(mensajes.toString());
        
        
        
        // TODO add your handling code here:q
        
    }//GEN-LAST:event_botonActionPerformed

    
    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    private void netmaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netmaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netmaskActionPerformed
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton boton;
    private javax.swing.JTextField dir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField netmask;
    private javax.swing.JTextField sub;
    // End of variables declaration//GEN-END:variables
}
