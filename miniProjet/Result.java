package miniProjet;



import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.List;

public class Result extends JFrame {

	private static final long serialVersionUID = 1L;

	public Result(String soilType,String forecasts,String temperatureF,String saison,String previousCultures) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Result.class.getResource("/image/logo.jpg")));
		
		getContentPane().setBackground(new Color(253, 247, 228));
		getContentPane().setBounds(new Rectangle(0, 0, 900, 450));
		setBounds(new Rectangle(100, 100, 1120, 615));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(187, 171, 140), 4, true));
		panel.setBackground(new Color(222, 208, 182,170));
		panel.setBounds(115, 75, 883, 463);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Recommandations de cultures : ");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 26));
		lblNewLabel_1.setBounds(40, 30, 314, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("vide");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblNewLabel_2.setBounds(130, 100, 600, 75);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Result.class.getResource("/image/resultbg.jpg")));
		
		lblNewLabel.setBounds(0, 0, 1120, 615);
		getContentPane().add(lblNewLabel);
//		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_1_1, lblNewLabel_2_1, lblNewLabel_1_1_1, lblNewLabel_2_1_1}));
		
		
		
		recomandation recommendation = new recomandation(soilType, forecasts, temperatureF, saison, previousCultures);
		//recomandation recommendation = new recomandation("argileux","mediterraneen","tempéré","été","olivier");
		
		recommendation.runPrologQuery();
		List<String> culture = recommendation.getCulture();

		// Assuming lblNewLabel_2 is a JLabel
		StringBuilder recommendationText = new StringBuilder();

		for (String cultureElement : culture) {
		    recommendationText.append(cultureElement).append(", ");
		    recommendationText.toString();
		}
		if (recommendationText.length() > 0) {
		    recommendationText.delete(recommendationText.length() - 2, recommendationText.length());
		}
		
		
		

		lblNewLabel_2.setText(recommendationText.toString());


		
		
	}
}

