package kalender;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KalenderView extends JFrame {

	
	private KalenderModel kalenderDatum;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalenderModel kalenderDatum = new KalenderModel();
					kalenderDatum.setDatum(2020,11,12);
					KalenderView frame = new KalenderView(kalenderDatum);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KalenderView(KalenderModel kalenderDatum) {
		this.kalenderDatum = kalenderDatum;
		String[] tagBezeichnung = new String[43];
		String[] wocheBezeichnung = new String[7];
		for (int i = 1; i < kalenderDatum.getStarttag(); i++) {
			tagBezeichnung[i] = "";
		}
		for (int i = kalenderDatum.getStarttag(); i < kalenderDatum.getStarttag() + kalenderDatum.getAnzahlTage() + 1; i++) {
			tagBezeichnung[i] = Integer.toString(i - kalenderDatum.getStarttag() + 1);
		}
		for (int i = kalenderDatum.getStarttag() + kalenderDatum.getAnzahlTage() + 1; i < 43; i++) {
			tagBezeichnung[i] = "";
		}
		
		for (int i = 1; i <= kalenderDatum.getAnzahlWochen(); i++) {
			wocheBezeichnung[i] = Integer.toString(kalenderDatum.getKalenderwoche1() + i - 1);
			System.out.println("Kw " + Integer.toString(i) + " => " + Integer.toString(kalenderDatum.getKalenderwoche1() + i - 1));
		}
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btn_kw1 = new JButton(wocheBezeichnung[1]);
		GridBagConstraints gbc_btn_kw1 = new GridBagConstraints();
		gbc_btn_kw1.insets = new Insets(0, 0, 5, 5);
		gbc_btn_kw1.gridx = 0;
		gbc_btn_kw1.gridy = 2;
		contentPane.add(btn_kw1, gbc_btn_kw1);
		
		JButton btn_1 = new JButton(tagBezeichnung[1]);
		GridBagConstraints gbc_btn_1 = new GridBagConstraints();
		gbc_btn_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn_1.gridx = 1;
		gbc_btn_1.gridy = 2;
		contentPane.add(btn_1, gbc_btn_1);
		
		JButton btn_2 = new JButton(tagBezeichnung[2]);
		GridBagConstraints gbc_btn_2 = new GridBagConstraints();
		gbc_btn_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn_2.gridx = 2;
		gbc_btn_2.gridy = 2;
		contentPane.add(btn_2, gbc_btn_2);
		
		JButton btn_3 = new JButton(tagBezeichnung[3]);
		GridBagConstraints gbc_btn_3 = new GridBagConstraints();
		gbc_btn_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn_3.gridx = 3;
		gbc_btn_3.gridy = 2;
		contentPane.add(btn_3, gbc_btn_3);
		
		JButton btn_4 = new JButton(tagBezeichnung[4]);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btn_4, gbc_btnNewButton);
		
		JButton btn_5 = new JButton(tagBezeichnung[5]);
		GridBagConstraints gbc_btn_5 = new GridBagConstraints();
		gbc_btn_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn_5.gridx = 5;
		gbc_btn_5.gridy = 2;
		contentPane.add(btn_5, gbc_btn_5);
		
		JButton btn_6 = new JButton(tagBezeichnung[6]);
		GridBagConstraints gbc_btn_6 = new GridBagConstraints();
		gbc_btn_6.insets = new Insets(0, 0, 5, 0);
		gbc_btn_6.gridx = 6;
		gbc_btn_6.gridy = 2;
		contentPane.add(btn_6, gbc_btn_6);
		
		JButton btn_7 = new JButton(tagBezeichnung[7]);
		GridBagConstraints gbc_btn_7 = new GridBagConstraints();
		gbc_btn_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn_7.gridx = 7;
		gbc_btn_7.gridy = 2;
		contentPane.add(btn_7, gbc_btn_7);
		
		JButton btn_kw2 = new JButton(wocheBezeichnung[2]);
		GridBagConstraints gbc_btn_kw2 = new GridBagConstraints();
		gbc_btn_kw2.insets = new Insets(0, 0, 5, 5);
		gbc_btn_kw2.gridx = 0;
		gbc_btn_kw2.gridy = 3;
		contentPane.add(btn_kw2, gbc_btn_kw2);
		
		JButton btn_8 = new JButton(tagBezeichnung[8]);
		GridBagConstraints gbc_btn_8 = new GridBagConstraints();
		gbc_btn_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn_8.gridx = 1;
		gbc_btn_8.gridy = 3;
		contentPane.add(btn_8, gbc_btn_8);
		
		JButton btn_9 = new JButton(tagBezeichnung[9]);
		GridBagConstraints gbc_btn_9 = new GridBagConstraints();
		gbc_btn_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn_9.gridx = 2;
		gbc_btn_9.gridy = 3;
		contentPane.add(btn_9, gbc_btn_9);
		
		JButton btn_10 = new JButton(tagBezeichnung[10]);
		GridBagConstraints gbc_btn_10 = new GridBagConstraints();
		gbc_btn_10.insets = new Insets(0, 0, 5, 5);
		gbc_btn_10.gridx = 3;
		gbc_btn_10.gridy = 3;
		contentPane.add(btn_10, gbc_btn_10);
		
		JButton btn_11 = new JButton(tagBezeichnung[11]);
		GridBagConstraints gbc_btn_11 = new GridBagConstraints();
		gbc_btn_11.insets = new Insets(0, 0, 5, 5);
		gbc_btn_11.gridx = 4;
		gbc_btn_11.gridy = 3;
		contentPane.add(btn_11, gbc_btn_11);
		
		JButton btn_12 = new JButton(tagBezeichnung[12]);
		GridBagConstraints gbc_btn_12 = new GridBagConstraints();
		gbc_btn_12.insets = new Insets(0, 0, 5, 5);
		gbc_btn_12.gridx = 5;
		gbc_btn_12.gridy = 3;
		contentPane.add(btn_12, gbc_btn_12);
		
		JButton btn_13 = new JButton(tagBezeichnung[13]);
		GridBagConstraints gbc_btn_13 = new GridBagConstraints();
		gbc_btn_13.insets = new Insets(0, 0, 5, 5);
		gbc_btn_13.gridx = 6;
		gbc_btn_13.gridy = 3;
		contentPane.add(btn_13, gbc_btn_13);
		
		JButton btn_14 = new JButton(tagBezeichnung[14]);
		GridBagConstraints gbc_btn_14 = new GridBagConstraints();
		gbc_btn_14.insets = new Insets(0, 0, 5, 0);
		gbc_btn_14.gridx = 7;
		gbc_btn_14.gridy = 3;
		contentPane.add(btn_14, gbc_btn_14);
		
		JButton btn_kw3 = new JButton(wocheBezeichnung[3]);
		GridBagConstraints gbc_btn_kw3 = new GridBagConstraints();
		gbc_btn_kw3.insets = new Insets(0, 0, 5, 5);
		gbc_btn_kw3.gridx = 0;
		gbc_btn_kw3.gridy = 4;
		contentPane.add(btn_kw3, gbc_btn_kw3);

		JButton btn_15 = new JButton(tagBezeichnung[15]);
		GridBagConstraints gbc_btn_15 = new GridBagConstraints();
		gbc_btn_15.insets = new Insets(0, 0, 5, 5);
		gbc_btn_15.gridx = 1;
		gbc_btn_15.gridy = 4;
		contentPane.add(btn_15, gbc_btn_15);
		
		JButton btn_16 = new JButton(tagBezeichnung[16]);
		GridBagConstraints gbc_btn_16 = new GridBagConstraints();
		gbc_btn_16.insets = new Insets(0, 0, 5, 5);
		gbc_btn_16.gridx = 2;
		gbc_btn_16.gridy = 4;
		contentPane.add(btn_16, gbc_btn_16);
		
		JButton btn_17 = new JButton(tagBezeichnung[17]);
		GridBagConstraints gbc_btn_17 = new GridBagConstraints();
		gbc_btn_17.insets = new Insets(0, 0, 5, 5);
		gbc_btn_17.gridx = 3;
		gbc_btn_17.gridy = 4;
		contentPane.add(btn_17, gbc_btn_17);
		
		JButton btn_18 = new JButton(tagBezeichnung[18]);
		GridBagConstraints gbc_btn_18 = new GridBagConstraints();
		gbc_btn_18.insets = new Insets(0, 0, 5, 5);
		gbc_btn_18.gridx = 4;
		gbc_btn_18.gridy = 4;
		contentPane.add(btn_18, gbc_btn_18);
		
		JButton btn_19 = new JButton(tagBezeichnung[19]);
		GridBagConstraints gbc_btn_19 = new GridBagConstraints();
		gbc_btn_19.insets = new Insets(0, 0, 5, 5);
		gbc_btn_19.gridx = 5;
		gbc_btn_19.gridy = 4;
		contentPane.add(btn_19, gbc_btn_19);
		
		JButton btn_20 = new JButton(tagBezeichnung[20]);
		GridBagConstraints gbc_btn_20 = new GridBagConstraints();
		gbc_btn_20.insets = new Insets(0, 0, 5, 5);
		gbc_btn_20.gridx = 6;
		gbc_btn_20.gridy = 4;
		contentPane.add(btn_20, gbc_btn_20);
		
		JButton btn_21 = new JButton(tagBezeichnung[21]);
		GridBagConstraints gbc_btn_21 = new GridBagConstraints();
		gbc_btn_21.insets = new Insets(0, 0, 5, 5);
		gbc_btn_21.gridx = 7;
		gbc_btn_21.gridy = 4;
		contentPane.add(btn_21, gbc_btn_21);
		
		JButton btn_kw4 = new JButton(wocheBezeichnung[4]);
		GridBagConstraints gbc_btn_kw4 = new GridBagConstraints();
		gbc_btn_kw4.insets = new Insets(0, 0, 5, 0);
		gbc_btn_kw4.gridx = 0;
		gbc_btn_kw4.gridy = 5;
		contentPane.add(btn_kw4, gbc_btn_kw4);

		JButton btn_22 = new JButton(tagBezeichnung[22]);
		GridBagConstraints gbc_btn_22 = new GridBagConstraints();
		gbc_btn_22.insets = new Insets(0, 0, 5, 0);
		gbc_btn_22.gridx = 1;
		gbc_btn_22.gridy = 5;
		contentPane.add(btn_22, gbc_btn_22);
		
		JButton btn_23 = new JButton(tagBezeichnung[23]);
		GridBagConstraints gbc_btn_23 = new GridBagConstraints();
		gbc_btn_23.insets = new Insets(0, 0, 5, 5);
		gbc_btn_23.gridx = 2;
		gbc_btn_23.gridy = 5;
		contentPane.add(btn_23, gbc_btn_23);
		
		JButton btn_24 = new JButton(tagBezeichnung[24]);
		GridBagConstraints gbc_btn_24 = new GridBagConstraints();
		gbc_btn_24.insets = new Insets(0, 0, 5, 5);
		gbc_btn_24.gridx = 3;
		gbc_btn_24.gridy = 5;
		contentPane.add(btn_24, gbc_btn_24);
		
		JButton btn_25 = new JButton(tagBezeichnung[25]);
		GridBagConstraints gbc_btn_25 = new GridBagConstraints();
		gbc_btn_25.insets = new Insets(0, 0, 5, 5);
		gbc_btn_25.gridx = 4;
		gbc_btn_25.gridy = 5;
		contentPane.add(btn_25, gbc_btn_25);
		
		JButton btn_26 = new JButton(tagBezeichnung[26]);
		GridBagConstraints gbc_btn_26 = new GridBagConstraints();
		gbc_btn_26.insets = new Insets(0, 0, 5, 5);
		gbc_btn_26.gridx = 5;
		gbc_btn_26.gridy = 5;
		contentPane.add(btn_26, gbc_btn_26);
		
		JButton btn_27 = new JButton(tagBezeichnung[27]);
		GridBagConstraints gbc_btn_27 = new GridBagConstraints();
		gbc_btn_27.insets = new Insets(0, 0, 5, 5);
		gbc_btn_27.gridx = 6;
		gbc_btn_27.gridy = 5;
		contentPane.add(btn_27, gbc_btn_27);
		
		JButton btn_28 = new JButton(tagBezeichnung[28]);
		GridBagConstraints gbc_btn_28 = new GridBagConstraints();
		gbc_btn_28.insets = new Insets(0, 0, 5, 5);
		gbc_btn_28.gridx = 7;
		gbc_btn_28.gridy = 5;
		contentPane.add(btn_28, gbc_btn_28);
		
		JButton btn_kw5 = new JButton(wocheBezeichnung[5]);
		GridBagConstraints gbc_btn_kw5 = new GridBagConstraints();
		gbc_btn_kw5.insets = new Insets(0, 0, 5, 5);
		gbc_btn_kw5.gridx = 0;
		gbc_btn_kw5.gridy = 6;
		contentPane.add(btn_kw5, gbc_btn_kw5);

		JButton btn_29 = new JButton(tagBezeichnung[29]);
		GridBagConstraints gbc_btn_29 = new GridBagConstraints();
		gbc_btn_29.insets = new Insets(0, 0, 5, 5);
		gbc_btn_29.gridx = 1;
		gbc_btn_29.gridy = 6;
		contentPane.add(btn_29, gbc_btn_29);
		
		JButton btn_30 = new JButton(tagBezeichnung[31]);
		GridBagConstraints gbc_btn_30 = new GridBagConstraints();
		gbc_btn_30.insets = new Insets(0, 0, 5, 0);
		gbc_btn_30.gridx = 2;
		gbc_btn_30.gridy = 6;
		contentPane.add(btn_30, gbc_btn_30);
		
		JButton btn_31 = new JButton(tagBezeichnung[31]);
		GridBagConstraints gbc_btn_31 = new GridBagConstraints();
		gbc_btn_31.insets = new Insets(0, 0, 5, 5);
		gbc_btn_31.gridx = 3;
		gbc_btn_31.gridy = 6;
		contentPane.add(btn_31, gbc_btn_31);
		
		JButton btn_32 = new JButton(tagBezeichnung[32]);
		GridBagConstraints gbc_btn_32 = new GridBagConstraints();
		gbc_btn_32.insets = new Insets(0, 0, 5, 5);
		gbc_btn_32.gridx = 4;
		gbc_btn_32.gridy = 6;
		contentPane.add(btn_32, gbc_btn_32);
		
		JButton btn_33 = new JButton(tagBezeichnung[33]);
		GridBagConstraints gbc_btn_33 = new GridBagConstraints();
		gbc_btn_33.insets = new Insets(0, 0, 5, 5);
		gbc_btn_33.gridx = 5;
		gbc_btn_33.gridy = 6;
		contentPane.add(btn_33, gbc_btn_33);
		
		JButton btn_34 = new JButton(tagBezeichnung[34]);
		GridBagConstraints gbc_btn_34 = new GridBagConstraints();
		gbc_btn_34.insets = new Insets(0, 0, 5, 5);
		gbc_btn_34.gridx = 6;
		gbc_btn_34.gridy = 6;
		contentPane.add(btn_34, gbc_btn_34);
		
		JButton btn_35 = new JButton(tagBezeichnung[35]);
		GridBagConstraints gbc_btn_35 = new GridBagConstraints();
		gbc_btn_35.insets = new Insets(0, 0, 5, 5);
		gbc_btn_35.gridx = 7;
		gbc_btn_35.gridy = 6;
		contentPane.add(btn_35, gbc_btn_35);
		
		JButton btn_kw6 = new JButton(wocheBezeichnung[6]);
		GridBagConstraints gbc_btn_kw6 = new GridBagConstraints();
		gbc_btn_kw6.insets = new Insets(0, 0, 5, 5);
		gbc_btn_kw6.gridx = 0;
		gbc_btn_kw6.gridy = 7;
		contentPane.add(btn_kw6, gbc_btn_kw6);
		
		JButton btn_36 = new JButton(tagBezeichnung[36]);
		GridBagConstraints gbc_btn_36 = new GridBagConstraints();
		gbc_btn_36.insets = new Insets(0, 0, 5, 5);
		gbc_btn_36.gridx = 1;
		gbc_btn_36.gridy = 7;
		contentPane.add(btn_36, gbc_btn_36);
		
		JButton btn_37 = new JButton(tagBezeichnung[37]);
		GridBagConstraints gbc_btn_37 = new GridBagConstraints();
		gbc_btn_37.insets = new Insets(0, 0, 5, 5);
		gbc_btn_37.gridx = 2;
		gbc_btn_37.gridy = 7;
		contentPane.add(btn_37, gbc_btn_37);
		
		JButton btn_38 = new JButton(tagBezeichnung[38]);
		GridBagConstraints gbc_btn_38 = new GridBagConstraints();
		gbc_btn_38.insets = new Insets(0, 0, 5, 0);
		gbc_btn_38.gridx = 3;
		gbc_btn_38.gridy = 7;
		contentPane.add(btn_38, gbc_btn_38);
		
		JButton btn_39 = new JButton(tagBezeichnung[39]);
		GridBagConstraints gbc_btn_39 = new GridBagConstraints();
		gbc_btn_39.insets = new Insets(0, 0, 0, 5);
		gbc_btn_39.gridx = 4;
		gbc_btn_39.gridy = 7;
		contentPane.add(btn_39, gbc_btn_39);
		
		JButton btn_40 = new JButton(tagBezeichnung[40]);
		GridBagConstraints gbc_btn_40 = new GridBagConstraints();
		gbc_btn_40.insets = new Insets(0, 0, 0, 5);
		gbc_btn_40.gridx = 5;
		gbc_btn_40.gridy = 7;
		contentPane.add(btn_40, gbc_btn_40);
		
		JButton btn_41 = new JButton(tagBezeichnung[41]);
		GridBagConstraints gbc_btn_41 = new GridBagConstraints();
		gbc_btn_41.insets = new Insets(0, 0, 0, 5);
		gbc_btn_41.gridx = 6;
		gbc_btn_41.gridy = 7;
		contentPane.add(btn_41, gbc_btn_41);
		
		JButton btn_42 = new JButton(tagBezeichnung[42]);
		GridBagConstraints gbc_btn_42 = new GridBagConstraints();
		gbc_btn_42.insets = new Insets(0, 0, 0, 5);
		gbc_btn_42.gridx = 7;
		gbc_btn_42.gridy = 7;
		contentPane.add(btn_42, gbc_btn_42);
		
			}

}
