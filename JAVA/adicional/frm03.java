package JAVA.adicional;

import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame{
    JTextField txtKilometros, txtPies, txtMillas;
    JTextField txtMetros, txtYardas;

    public static void main(String[] args) {
        frm03 frame = new frm03();
        frame.setVisible(true);
    }

    public frm03() {
        setBounds(0, 0, 350, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblKilometros = new JLabel("Kilometros : ");
        lblKilometros.setBounds(50, 50, 100, 30);
        getContentPane().add(lblKilometros);

        JLabel lblPies = new JLabel("Pies : ");
        lblPies.setBounds(50, 100, 100, 30);
        getContentPane().add(lblPies);

        JLabel lblMillas = new JLabel("Millas : ");
        lblMillas.setBounds(50, 150, 100, 30);
        getContentPane().add(lblMillas);

        JLabel lblMetros = new JLabel("Metros : ");
        lblMetros.setBounds(50, 200, 100, 30);
        getContentPane().add(lblMetros);

        JLabel lblYardas = new JLabel("Yardas : ");
        lblYardas.setBounds(50, 250, 100, 30);
        getContentPane().add(lblYardas);

        txtKilometros = new JTextField();
        txtKilometros.setBounds(160, 50, 80, 30);
        txtKilometros.setHorizontalAlignment( SwingConstants.RIGHT );
        getContentPane().add(txtKilometros);

        txtPies = new JTextField();
        txtPies.setBounds(160, 100, 80, 30);
        txtPies.setHorizontalAlignment( SwingConstants.RIGHT );
        getContentPane().add(txtPies);

        txtMillas = new JTextField();
        txtMillas.setBounds(160, 150, 80, 30);
        txtMillas.setHorizontalAlignment( SwingConstants.RIGHT );
        getContentPane().add(txtMillas);

        txtMetros = new JTextField();
        txtMetros.setBounds(160, 200, 80, 30);
        txtMetros.setHorizontalAlignment( SwingConstants.RIGHT );
        txtMetros.setFocusable(false);
        getContentPane().add(txtMetros);

        txtYardas = new JTextField();
        txtYardas.setBounds(160, 250, 80, 30);
        txtYardas.setHorizontalAlignment( SwingConstants.RIGHT );
        txtYardas.setFocusable(false);
        getContentPane().add(txtYardas);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds( 120, 320, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener( e -> btnCalcular_Click() );
    }

    private void btnCalcular_Click() {
        int kilometros = Integer.parseInt( txtKilometros.getText() );
        int pies = Integer.parseInt( txtPies.getText() );
        int millas = Integer.parseInt( txtMillas.getText() );
        
        double metros = kilometros * 1000.0 + millas * 1609;
        double yardas = 1.0;

        DecimalFormat df = new DecimalFormat("##.##");
        txtMetros.setText( df.format( metros ) );
        txtYardas.setText( df.format( yardas ) );
    }

}


