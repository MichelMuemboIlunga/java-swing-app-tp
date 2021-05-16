/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_project_swing_term2;

/**
 *
 * @author MICHEL MUEMBO ILUNGA
 * Student number: 218303335
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.List;


public class SoftwareTechCompany extends JFrame implements ActionListener {
    private JPanel panelNorth;
    private JPanel panelSouth;
    private JPanel panelEast;

    private JLabel titleLabel;
    private JLabel EmpIDLabel;
    private JLabel EmpFNLabel;
    private JLabel EmpLNLabel;
    private JLabel EmpGenderLabel;
    private JLabel EmpIsTeamMemberLabel;
    private JLabel RecordMessage;

    private JCheckBox EmpIsTeamMemberBox;

    private JComboBox EmpTitles;

    private JTextField EmpIDField;
    private JTextField EmpFNField;
    private JTextField EmpLNField;
    private JTextArea RecordMessageField;

    private JPanel GenderPanel;
    private JRadioButton radBtnMale;
    private JRadioButton radBtnFemale;
    private ButtonGroup btnGroupGender;

    private JButton btnPrev;
    private JButton btnNext;
    private JButton btnEXit;

    private JFrame frame;


    private List<Employee> employeeList = new ArrayList<Employee>();
    private static int employeeListId = 0;



    SoftwareTechCompany(){
        // populating arrayList

        employeeList.add(new Employee("Full Stack", 101,"Muembo","Ilunga","Male",true));
        employeeList.add(new Employee("Front End", 102,"Losa","Michel","Male",true));
        employeeList.add(new Employee("Back End", 103,"Kruben","Naido","Male",false));
        employeeList.add(new Employee("Front End", 104,"Mpiana","Clarisse","Female",false));
        employeeList.add(new Employee("Front End", 105,"Marco","Tshimanga","Male",true));
        employeeList.add(new Employee("Dev Ops", 106,"Maningo","Rachel","Female",false));
        employeeList.add(new Employee("Full Stack", 107,"Bolonda","Ruphin","Male",true));
        employeeList.add(new Employee("Back End", 108,"Mabiala","Rusty","Male",true));
        employeeList.add(new Employee("Front End", 109,"Stella","Ntumba","Female",false));
        employeeList.add(new Employee("Full Stack", 110,"Junior","Muembo","Male",true));


        // getting values of Title Combo Box
        employeeList.get(0).setTitle("Full Stack");
        employeeList.get(1).setTitle("Front End");
        employeeList.get(2).setTitle("Back End");
        employeeList.get(3).setTitle("Front End");
        employeeList.get(4).setTitle("Front End");
        employeeList.get(5).setTitle("Dev Ops");
        employeeList.get(6).setTitle("Full Stack");
        employeeList.get(7).setTitle("Back End");
        employeeList.get(8).setTitle("Front End");
        employeeList.get(9).setTitle("Back End");

        // getting values of ID Fields
        employeeList.get(0).setEmployeeID(101);
        employeeList.get(1).setEmployeeID(102);
        employeeList.get(2).setEmployeeID(103);
        employeeList.get(3).setEmployeeID(104);
        employeeList.get(4).setEmployeeID(105);
        employeeList.get(5).setEmployeeID(106);
        employeeList.get(6).setEmployeeID(107);
        employeeList.get(7).setEmployeeID(108);
        employeeList.get(8).setEmployeeID(109);
        employeeList.get(9).setEmployeeID(110);

        // getting values of First Name
        employeeList.get(0).setEmployeeFirstName("Muembo");
        employeeList.get(1).setEmployeeFirstName("Losa");
        employeeList.get(2).setEmployeeFirstName("Kruben");
        employeeList.get(3).setEmployeeFirstName("Mpiana");
        employeeList.get(4).setEmployeeFirstName("Marco");
        employeeList.get(5).setEmployeeFirstName("Maningo");
        employeeList.get(6).setEmployeeFirstName("Bolonda");
        employeeList.get(7).setEmployeeFirstName("Mabiala");
        employeeList.get(8).setEmployeeFirstName("Stella");
        employeeList.get(9).setEmployeeFirstName("Junior");

        // getting values of Last Name
        employeeList.get(0).setEmployeeLastName("Ilunga");
        employeeList.get(1).setEmployeeLastName("Michel");
        employeeList.get(2).setEmployeeLastName("Naido");
        employeeList.get(3).setEmployeeLastName("Clarisse");
        employeeList.get(4).setEmployeeLastName("Tshimanga");
        employeeList.get(5).setEmployeeLastName("Rachel");
        employeeList.get(6).setEmployeeLastName("Ruphin");
        employeeList.get(7).setEmployeeLastName("Rusty");
        employeeList.get(8).setEmployeeLastName("Ntumba");
        employeeList.get(9).setEmployeeLastName("Muembo");

        // getting values of Gender
        employeeList.get(0).setEmployeeGender("Male");
        employeeList.get(1).setEmployeeGender("Male");
        employeeList.get(2).setEmployeeGender("Male");
        employeeList.get(3).setEmployeeGender("Female");
        employeeList.get(4).setEmployeeGender("Male");
        employeeList.get(5).setEmployeeGender("Female");
        employeeList.get(6).setEmployeeGender("Male");
        employeeList.get(7).setEmployeeGender("Male");
        employeeList.get(8).setEmployeeGender("Female");
        employeeList.get(9).setEmployeeGender("Male");

        // getting values of Company member 
        employeeList.get(0).setTeamMember(true);
        employeeList.get(1).setTeamMember(true);
        employeeList.get(2).setTeamMember(false);
        employeeList.get(3).setTeamMember(false);
        employeeList.get(4).setTeamMember(true);
        employeeList.get(5).setTeamMember(false);
        employeeList.get(6).setTeamMember(true);
        employeeList.get(7).setTeamMember(true);
        employeeList.get(8).setTeamMember(false);
        employeeList.get(9).setTeamMember(true);

        // main frame structure

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the size of the frame or window and the application title
        this.setSize(1000, 800);
        this.setTitle("Software Tech");

        // change icon for the app instead of java icon use logo icon
        ImageIcon ic = new ImageIcon("src/icons.svg");
        this.setIconImage(ic.getImage());

        this.setVisible(true);

        // instantiating
        panelNorth = new JPanel();
        panelSouth = new JPanel();
        panelEast = new JPanel();

        // set Panel North
        panelNorth.setBackground(Color.blue);
        panelNorth.setPreferredSize(new Dimension(100,100));

        // set The title
        JLabel title = new JLabel("Software Tech", JLabel.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setPreferredSize(new Dimension(500,90));

        // set the image
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("src/logo.png").getImage().getScaledInstance(80, 100, Image.SCALE_DEFAULT));
        JLabel labelImage = new JLabel();
        labelImage.setIcon(imageIcon);

        panelNorth.add(labelImage);
        panelNorth.add(title);

        /* Form Section */

        // creating a panel GridBagLayout where content will be

        JPanel newPanelContent = new JPanel(new GridBagLayout());
        newPanelContent.setBackground(Color.GRAY);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(10, 10, 10, 10);


        // set border for the panel
        newPanelContent.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Software Tech DashBoard"));

        // role comboBox

        titleLabel = new JLabel("role: ");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        String EmpList[] = {"Front End", "Back End", "Full Stack", "Dev Ops"};
        EmpTitles = new JComboBox(EmpList);
        EmpTitles.setSelectedItem(employeeList.get(0).getTitle());

        // positioning ComboBox and label
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanelContent.add(titleLabel, constraints);

        constraints.gridx = 1;
        newPanelContent.add(EmpTitles, constraints);

        // add the panel to this frame
        add(newPanelContent);

        // ID Field

        EmpIDLabel = new JLabel("ID: ");
        EmpIDLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        EmpIDField = new JTextField();
        EmpIDField.setPreferredSize(new Dimension(250,30));
        EmpIDField.setFont(new Font("Arial", Font.PLAIN, 20));
        EmpIDField.setText("" + employeeList.get(0).getEmployeeID());


        // positioning ID Field and label
        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanelContent.add(EmpIDLabel, constraints);

        constraints.gridx = 1;
        newPanelContent.add(EmpIDField, constraints);

        // First Name
        EmpFNLabel = new JLabel("First Name: ");
        EmpFNLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        EmpFNField = new JTextField();
        EmpFNField.setPreferredSize(new Dimension(250,30));
        EmpFNField.setFont(new Font("Arial", Font.PLAIN, 20));
        EmpFNField.setText(employeeList.get(0).getEmployeeFirstName());

        // positioning First Name Field and label
        constraints.gridx = 0;
        constraints.gridy = 2;
        newPanelContent.add(EmpFNLabel, constraints);

        constraints.gridx = 1;
        newPanelContent.add(EmpFNField, constraints);

        // Last Name
        EmpLNLabel = new JLabel("Last Name: ");
        EmpLNLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        EmpLNField = new JTextField();
        EmpLNField.setPreferredSize(new Dimension(250,30));
        EmpLNField.setFont(new Font("Arial", Font.PLAIN, 20));
        EmpLNField.setText(employeeList.get(0).getEmployeeLastName());

        // positioning last Name Field and label
        constraints.gridx = 0;
        constraints.gridy = 3;
        newPanelContent.add(EmpLNLabel, constraints);

        constraints.gridx = 1;
        newPanelContent.add(EmpLNField, constraints);

        // Gender
        EmpGenderLabel = new JLabel("Gender: ");
        EmpGenderLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        GenderPanel = new JPanel();
        radBtnMale = new JRadioButton("Male",true);
        radBtnFemale = new JRadioButton("Female");

        btnGroupGender = new ButtonGroup();
        btnGroupGender.add(radBtnMale);
        btnGroupGender.add(radBtnFemale);

        GenderPanel.setLayout(new GridLayout(1, 2));

        GenderPanel.add(radBtnMale);
        GenderPanel.add(radBtnFemale);

        // positioning Gender and label
        constraints.gridx = 0;
        constraints.gridy = 4;
        newPanelContent.add(EmpGenderLabel, constraints);

        constraints.gridx = 1;
        newPanelContent.add(GenderPanel, constraints);

        // radio btn
        EmpIsTeamMemberLabel = new JLabel("Company member: ");;
        EmpIsTeamMemberLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        EmpIsTeamMemberBox = new JCheckBox();
        EmpIsTeamMemberBox.setSelected(employeeList.get(0).isTeamMember());

        // positioning radio btn and label
        constraints.gridx = 0;
        constraints.gridy = 5;
        newPanelContent.add(EmpIsTeamMemberLabel, constraints);

        constraints.gridx = 1;
        newPanelContent.add(EmpIsTeamMemberBox, constraints);

        /* show record message */

        // Records label
        RecordMessage = new JLabel("Display: ");
        RecordMessage.setFont(new Font("Arial", Font.PLAIN, 20));

        // Records text area
        RecordMessageField = new JTextArea(5,15);
        RecordMessageField.setFont(new Font("Arial", Font.PLAIN, 20));
        RecordMessageField.setForeground(Color.RED);
        RecordMessageField.setSize(300, 400);
        RecordMessageField.setEditable(false);
        RecordMessageField.setText("         Employee Records\n         ==============\n" + ((int)employeeListId+1));

        // positioning radio btn and label
        constraints.gridx = 0;
        constraints.gridy = 8;
        newPanelContent.add(RecordMessage, constraints);

        constraints.gridx = 1;
        newPanelContent.add(RecordMessageField, constraints);

        // buttons

        btnPrev = new JButton("Previous");
        btnPrev.setBackground(Color.MAGENTA);
        btnPrev.setForeground(Color.WHITE);
        btnPrev.setFont(btnPrev.getFont().deriveFont(20.0f));

        btnPrev.addActionListener(this);

        btnNext = new JButton("Next");
        btnNext.setBackground(Color.GREEN);
        btnNext.setForeground(Color.WHITE);
        btnNext.setFont(btnNext.getFont().deriveFont(20.0f));

        btnNext.addActionListener(this);

        btnEXit = new JButton("Exit");
        btnEXit.setBackground(Color.RED);
        btnEXit.setForeground(Color.WHITE);
        btnEXit.setFont(btnEXit.getFont().deriveFont(20.0f));

        btnEXit.addActionListener(this);

        // set the south panel
        panelSouth.setLayout(new GridLayout(1, 3));
        panelSouth.setPreferredSize(new Dimension(100,50));

        panelSouth.add(btnPrev);
        panelSouth.add(btnNext);
        panelSouth.add(btnEXit);


    }
    // this method display the GUI when it's call on the main class
    void displayGUI(){
        this.add(panelNorth,BorderLayout.NORTH);
        this.add(panelSouth, BorderLayout.SOUTH);

    }

    // action perform section

    @Override
    public void actionPerformed(ActionEvent e) {

        // btn Next
        if(e.getSource() == btnNext){
            if ( employeeListId+1 < employeeList.size() ) {
                // getting values and setting to their particular field 
                EmpTitles.setSelectedItem(employeeList.get(employeeListId+1).getTitle());
                EmpIDField.setText("" + employeeList.get(employeeListId+1).getEmployeeID());
                EmpFNField.setText(employeeList.get(employeeListId+1).getEmployeeFirstName());
                EmpLNField.setText(employeeList.get(employeeListId+1).getEmployeeLastName());
                
                // condition for gender values
                if(employeeList.get(employeeListId+1).getEmployeeGender().equals("Male")){
                    radBtnMale.setSelected(true);
                }else if(employeeList.get(employeeListId+1).getEmployeeGender().equals("Female")){
                    radBtnFemale.setSelected(true);
                }
                

                EmpIsTeamMemberBox.setSelected(employeeList.get(employeeListId+1).isTeamMember());
                
                // display records numbers

                int pos = employeeListId + 1;
                int pos_final = pos + 1;


                String data = "         Employee Records\n         ==============\n" + pos_final;

                RecordMessageField.setText(data);




                employeeListId++;

            }else {
                // end of the elements in the array show message box

                JOptionPane.showMessageDialog(frame,"End of Employee Records Click Previous 👈🏿.");
            }
        }

        // btn previous

        else if(e.getSource() == btnPrev){
            // error handling block
            try {
                if (employeeListId - 1 < employeeList.size()) {
                    // getting values and setting to their particular field 
                    EmpTitles.setSelectedItem(employeeList.get(employeeListId - 1).getTitle());
                    EmpIDField.setText("" + employeeList.get(employeeListId - 1).getEmployeeID());
                    EmpFNField.setText(employeeList.get(employeeListId - 1).getEmployeeFirstName());
                    EmpLNField.setText(employeeList.get(employeeListId - 1).getEmployeeLastName());
                    
                     // condition for gender values
                    if(employeeList.get(employeeListId-1).getEmployeeGender().equals("Male")){
                        radBtnMale.setSelected(true);
                    }else if(employeeList.get(employeeListId-1).getEmployeeGender().equals("Female")){
                        radBtnFemale.setSelected(true);
                    }

                    EmpIsTeamMemberBox.setSelected(employeeList.get(employeeListId - 1).isTeamMember());


                     // display records numbers
                     
                   int pos = employeeListId + 1;
                   int pos_final = pos - 1;
                   
                   String data1 = "         Employee Records\n         ==============\n" + pos_final;

                   RecordMessageField.setText(data1);


                    employeeListId--;
                }
                // if the indexoutBound occurs
            }catch (IndexOutOfBoundsException error){
                
                JOptionPane.showMessageDialog(frame,"End of Employee Records Click Next 👉🏿.");
            }

        }

        // btn Exit
        else if(e.getSource() == btnEXit){
            System.exit(0);
        }

    }

    // main class

    public static void main(String[] args) {
        new SoftwareTechCompany().displayGUI();
    }
}

