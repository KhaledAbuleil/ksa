package Request_GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class RequestFill extends JPanel {
	
   String[] A={"Retire","Join"};
   String[] day={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
   String[] month={"1","2","3","4","5","6","7","8","9","10","11","12"};
   String[] year={"2015"};
   private JTextField textField;
   private JTextField textField_1;
   public JTextField textgroup;
   public JComboBox type;
   public  JComboBox days ;
   public  JComboBox months;
   public  JComboBox years;
   
	public RequestFill() {
		setLayout(null);
		
		JLabel lblRequest = new JLabel("Request");
		lblRequest.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRequest.setBounds(283, 26, 110, 42);
		add(lblRequest);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblType.setBounds(71, 115, 46, 30);
		add(lblType);
		
		JLabel lblGroup = new JLabel("Group");
		lblGroup.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGroup.setBounds(71, 168, 46, 53);
		add(lblGroup);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDate.setBounds(71, 244, 46, 14);
		add(lblDate);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(283, 360, 89, 23);
		add(btnSend);
		
		textgroup = new JTextField();
		textgroup.setBounds(151, 186, 86, 20);
		add(textgroup);
		textgroup.setColumns(10);
		
		JComboBox type = new JComboBox(A);
		type.setSelectedIndex(2);
		type.setBounds(151, 120, 86, 25);
		add(type);
        type.addActionListener(type);
        
        JComboBox days = new JComboBox(day);
        days.setSelectedIndex(31);
        days.setBounds(127, 243, 37, 20);
        add(days);
        days.addActionListener(days);

        
        JComboBox months = new JComboBox(month);
        months.setSelectedIndex(12);
        months.setBounds(168, 243, 37, 20);
        add(months);
        months.addActionListener(months);

        
        JComboBox years = new JComboBox(year);
        years.setSelectedIndex(1);
        years.setBounds(208, 244, 56, 19);
        add(years);
        years.addActionListener(years);

		
		

	}
}