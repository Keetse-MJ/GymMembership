/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;



public class GymMembershipFrame extends JFrame{
  
 //panels
private JPanel headingPnl;
 private JPanel clientPnl;
 private JPanel namePnl;
 private JPanel surnamePnl;
 private JPanel idNoPnl;
 private JPanel genderPnl;
 private JPanel contractPnl;
 private JPanel personalTrainerOptionPnl;
 private JPanel membershipPnl;
 private JPanel commentsPnl;
 private JPanel btnsPnl;
 private JPanel headingClientCombinedPnl;
 private JPanel membershipCommentsCombinedPnl;
 private JPanel mainPnl;
 
//labels
private JLabel headingLb1;
private JLabel nameLb1;
private JLabel surnameLbl;
private JLabel idNoLbl;
private JLabel genderLbl;
private JLabel personalTrainerLbl;
private JLabel contractTypeLb1;

//textfields
private JTextField nameTxtFld;
private JTextField surnameTxtFld;
private JTextField idNoTxtFld;

//combobox
private JComboBox genderComboBox;

//radio buttons
private JRadioButton monthtoMonthRadBtn;
private JRadioButton sixMonthsRadBtn;
private JRadioButton annualRadBtn;

//checkbox
private JCheckBox personalTrainerChkBox;

//buttongroup
private ButtonGroup btnGrp;

//txtarea
private JTextArea commentsArea;

//scrolpane
private JScrollPane scrollableTxtArea;

//private button
private JButton applyBtn;

    public GymMembershipFrame() {
        
        setTitle("Gym membership");
        setSize(500, 500);
        
        headingPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl=new JPanel(new GridLayout(4, 1, 1, 1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.black, 1),"Client details"));
        
        namePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
         contractPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl=new JPanel(new GridLayout(2, 1, 1, 1));
        membershipPnl.setBorder(new TitledBorder(new TitledBorder(new LineBorder(Color.black, 1)), "Contract options"));
        
        commentsPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl=new JPanel(new BorderLayout());
        membershipCommentsCombinedPnl=new JPanel(new BorderLayout());
        mainPnl=new JPanel(new BorderLayout());
        
        headingLb1=new JLabel("Membership Form");
        headingLb1.setFont(new Font(Font.SANS_SERIF,Font.ITALIC +Font.BOLD,20)); 
        headingLb1.setForeground(Color.blue);
        headingLb1.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        
        nameLb1=new JLabel("Name:     ");
       surnameLbl=new JLabel("Surname:     ");       
        idNoLbl=new JLabel("Id no:     ");       
        genderLbl=new JLabel("Gender:     ");        
        contractTypeLb1=new JLabel("Type of contract:     ");        
        personalTrainerLbl=new JLabel("Select the checkbox if you need personal trainer: ");
        
        
        nameTxtFld=new JTextField(10);
        surnameTxtFld=new JTextField(10);
        idNoTxtFld=new JTextField(10);
        
        genderComboBox=new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        
        
        monthtoMonthRadBtn=new JRadioButton("Month-to-month");
        sixMonthsRadBtn=new JRadioButton("Six months");
        annualRadBtn=new JRadioButton("Annual");
        
        
        personalTrainerChkBox=new JCheckBox();
        
        
        btnGrp=new ButtonGroup();
        btnGrp.add(monthtoMonthRadBtn);
        btnGrp.add(sixMonthsRadBtn);
        btnGrp.add(annualRadBtn);
        
        
        commentsArea=new JTextArea(20,40);
        commentsArea.setBorder(new TitledBorder(new LineBorder(Color.black, 1),"Comments"));
        
        scrollableTxtArea=new JScrollPane(commentsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        applyBtn=new JButton("Apply");
        
        headingPnl.add(headingLb1);
        
        namePnl.add(nameLb1);
       namePnl.add(nameTxtFld);
        
       
        surnamePnl.add(surnameLbl);
       surnamePnl.add(surnameTxtFld);
       
       idNoPnl.add(idNoLbl);
       idNoPnl.add(idNoTxtFld);
       
       genderPnl.add(genderLbl);
       genderPnl.add(genderComboBox);
       
    clientPnl.add(namePnl);
    clientPnl.add(surnamePnl);
    clientPnl.add(idNoPnl);
    clientPnl.add(genderPnl);
        
    headingClientCombinedPnl.add(headingPnl,BorderLayout.NORTH);
    headingClientCombinedPnl.add(clientPnl,BorderLayout.CENTER);
    
    
   contractPnl.add(contractTypeLb1);
   contractPnl.add(monthtoMonthRadBtn);
   contractPnl.add(sixMonthsRadBtn);
   contractPnl.add(annualRadBtn);
   
   
   personalTrainerOptionPnl.add(personalTrainerLbl);
   personalTrainerOptionPnl.add(personalTrainerChkBox);
   
   membershipPnl.add(contractPnl);
   membershipPnl.add(personalTrainerOptionPnl);
        
   
   commentsPnl.add(scrollableTxtArea);
   
   membershipCommentsCombinedPnl.add(membershipPnl,BorderLayout.CENTER);
   membershipCommentsCombinedPnl.add(commentsPnl,BorderLayout.CENTER);
   
   btnsPnl.add(applyBtn);
   
   
   mainPnl.add(headingClientCombinedPnl,BorderLayout.NORTH);
   mainPnl.add(membershipCommentsCombinedPnl,BorderLayout.CENTER);
   mainPnl.add(btnsPnl,BorderLayout.SOUTH);
   
   
   add(mainPnl);
        pack();
        
        setVisible(true);
        
        
        }
}
        
        
        
        
                
    




