package miniProjet;


import java.awt.Color;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Choice;



public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	
	

	public static void writeDataCSV(String csvData) {
        try {
            // Specify the file path for the CSV file
            String filePath = "data.csv";

            // Create a File object
            File file = new File(filePath);

            // Check if the file exists; if not, create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // Create a FileWriter object with append mode set to true
            FileWriter fileWriter = new FileWriter(file, true);

            // Create a BufferedWriter object
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Write data to the CSV file
            writer.write(csvData);
            writer.newLine();  // Move to the next line

            // Close the BufferedWriter
            writer.close();

            System.out.println("Data successfully written to CSV file.");
        } catch (IOException ex) {
            System.err.println("Error writing data to CSV file: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
	
	
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/image/logo.jpg")));
		
		
		
		setBounds(new Rectangle(100, 10, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1142, 645);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 247, 228));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 55, 1055, 498);
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(187, 171, 140), new Color(0, 0, 0)));
		panel.setBackground(new Color(250, 238, 209));
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrez vos informations");
		lblNewLabel.setBounds(20, 11, 253, 36);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 28));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(187, 171, 140), 3, true));
		panel_1.setBackground(new Color(222, 208, 182));
		panel_1.setBounds(27, 73, 1000, 400);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Température actuelle");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 53, 192, 31);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Climat");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 85, 192, 31);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Type de sol");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(10, 185, 192, 31);
		panel_1.add(lblNewLabel_1_3);
		
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Données météorologiques ");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 11, 274, 31);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Paramètres du sol");
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(10, 142, 274, 31);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Historique des cultures :");
		lblNewLabel_2_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(10, 237, 274, 31);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Cultures  précédemment cultivées sur le terrain");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(10, 279, 371, 41);
		panel_1.add(lblNewLabel_1_3_1);
		
		
	
		
		Choice choice = new Choice();
		choice.setFont(new Font("Edwardian Script ITC", Font.BOLD, 15));
		choice.setBackground(new Color(253, 245, 230));
		choice.setBounds(212, 194, 185, 22);
		panel_1.add(choice);
		choice.add("_");
		choice.add("argileux");
		choice.add("limoneux");
		choice.add("sableux");
		
		
		
				
		Choice choice_3_1 = new Choice();
		choice_3_1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 15));
		choice_3_1.setBackground(new Color(253, 245, 230));
		choice_3_1.setBounds(212, 118, 185, 22);
		panel_1.add(choice_3_1);
		choice_3_1.add("_");
		choice_3_1.add("été");
        choice_3_1.add("printemps");
        choice_3_1.add("hiver");
        choice_3_1.add("automne");
		


		
		Choice choice_1 = new Choice();
		choice_1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 15));
		choice_1.setBackground(new Color(253, 245, 230));
		choice_1.setBounds(390, 288, 166, 45);
		panel_1.add(choice_1);
		choice_1.add("_");
		choice_1.add("riz");
		choice_1.add("blé");
		choice_1.add("banane");
		choice_1.add("vigne");
		choice_1.add("ananas");
		choice_1.add("pommes_de_terre");
		choice_1.add("olivier");
		choice_1.add("cerisier");
		choice_1.add("pastèque");
		choice_1.add("dattier");
		choice_1.add("fraise");
		choice_1.add("carotte");
		choice_1.add("avoine");
		choice_1.add("tournesol");
		choice_1.add("vignoble");
		
		


		
		
		Choice choice_2 = new Choice();
		choice_2.setFont(new Font("Edwardian Script ITC", Font.BOLD, 15));
		choice_2.setBackground(new Color(253, 245, 230));
		choice_2.setBounds(212, 53, 185, 22);
		panel_1.add(choice_2);
		choice_2.add("_");
		choice_2.add("trésfroid");
	    choice_2.add("froid");
	    choice_2.add("tempéré");
	    choice_2.add("chaud");
	    choice_2.add("tréschaud");
	   

	    

		
		Choice choice_3 = new Choice();
		choice_3.setFont(new Font("Edwardian Script ITC", Font.BOLD, 15));
		choice_3.setBackground(new Color(253, 245, 230));
		choice_3.setBounds(212, 90, 185, 22);
		panel_1.add(choice_3);
		choice_3.add("_");
		choice_3.add("tropical");
        choice_3.add("mediterraneen");
        choice_3.add("continental");
        
        
  
		
		JButton btnNewButton = new JButton("Réinitialiser");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 
                 choice.removeAll();
                 choice_1.removeAll();
                 choice_2.removeAll();
                 choice_3.removeAll();
                 choice_3_1.removeAll();
                 
                 // Add default options
                 choice.add("_");
                 choice_1.add("_");
                 choice_2.add("_");
                 choice_3.add("_");
                 choice_3_1.add("_");
                 choice.add("argileux");
         		choice.add("limoneux");
         		choice.add("sableux");
         		choice_1.add("riz");
        		choice_1.add("blé");
        		choice_1.add("banane");
        		choice_1.add("vigne");
        		choice_1.add("ananas");
        		choice_1.add("pommes_de_terre");
        		choice_1.add("olivier");
        		choice_1.add("cerisier");
        		choice_1.add("pastèque");
        		choice_1.add("dattier");
        		choice_1.add("fraise");
        		choice_1.add("carotte");
        		choice_1.add("avoine");
        		choice_1.add("tournesol");
        		choice_1.add("vignoble");
                 choice_2.add("trésfroid");
         	     choice_2.add("froid");
         	     choice_2.add("tempéré");
         	     choice_2.add("chaud");
         	     choice_2.add("tréschaud");
         	    choice_3.add("tropical");
                choice_3.add("mediterraneen");
                choice_3.add("continental");
                choice_3_1.add("été");
                choice_3_1.add("printemps");
                choice_3_1.add("hiver");
                choice_3_1.add("automne");
                 
                 
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(187, 171, 140), 2, true));
		btnNewButton.setBackground(new Color(250, 238, 209));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 19));
		btnNewButton.setBounds(10, 331, 166, 41);
		panel_1.add(btnNewButton);
		
		
		
		
		
		
		
		
		
		JButton btnSoumettre = new JButton("soumettre");
		btnSoumettre.setBorder(new LineBorder(new Color(187, 171, 140), 2, true));
		btnSoumettre.setBackground(new Color(250, 238, 209));
		btnSoumettre.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		btnSoumettre.setBounds(212, 331, 166, 41);
		panel_1.add(btnSoumettre);
		
		
		btnSoumettre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temperature = choice_2.getSelectedItem();
		        String forecasts = choice_3.getSelectedItem();
		        String soilType = choice.getSelectedItem();
		        String previousCultures = choice_1.getSelectedItem();
		        String saison = choice_3_1.getSelectedItem();
		       

		        // Instanciez la nouvelle frame avec les données soumises
		        Result resultFrame = new Result(soilType, forecasts, temperature,saison, previousCultures);
		        
		        
		        String datacsv = temperature+";"+forecasts+";"+soilType+";"+saison+";"+previousCultures;
		        writeDataCSV(datacsv);
		        

		        // Rendez la nouvelle frame visible
		        resultFrame.setVisible(true);
		        
			}
		});
		
		
		
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Main.class.getResource("/image/design.png")));
		
		lblNewLabel_4.setBackground(new Color(255, 255, 255, 0));
		lblNewLabel_4.setBounds(622, 63, 323, 323);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("saison");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(10, 115, 192, 31);
		panel_1.add(lblNewLabel_1_1_1);
		
		

		
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/image/resultbg.jpg")));
		
		lblNewLabel_3.setBounds(0, 0, 1128, 608);
		contentPane.add(lblNewLabel_3);
		
		
		
	}
}

