package UserPageGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RequestFill extends JPanel {
	
   String[] A={"Retire","Join"};
   String[] day={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
   String[] month={"1","2","3","4","5","6","7","8","9","10","11","12"};
   String[] year={"2015"};
   private JTextField textField;
   private JTextField textField_1;
   public JComboBox type;
   public  JComboBox days ;
   public  JComboBox months;
   public  JComboBox years;
  public JButton btnSendR;
  public JTextField GroupTxt;
   
	public RequestFill() {
		setLayout(null);
		
		JLabel lblRequest = new JLabel("Request");
		lblRequest.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRequest.setBounds(71, 22, 110, 42);
		add(lblRequest);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblType.setBounds(71, 115, 46, 30);
		add(lblType);
		
		JLabel lblGroup = new JLabel("Group");
		lblGroup.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGroup.setBounds(71, 168, 46, 53);
		add(lblGroup);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(283, 360, 89, 23);
		add(btnSend);
		
		JComboBox type = new JComboBox(A);
		type.setBounds(151, 120, 86, 25);
		add(type);
        type.addActionListener(type);
        
         btnSendR = new JButton("Send");
        btnSendR.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnSendR.setBounds(130, 286, 89, 23);
        add(btnSendR);
        
        GroupTxt = new JTextField();
        GroupTxt.setBounds(151, 186, 86, 20);
        add(GroupTxt);
        GroupTxt.setColumns(10);
	}
	public  void addController(ActionListener controller) {
		System.out.print("request fill");
		btnSendR.addActionListener(controller);
	}
	}