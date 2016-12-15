package employeeProgramme.ui;

import employeeProgramme.employeeProgramme.main.TaskProcessing;
import employeeProgramme.employeeProgramme.models.Employee;
import static employeeProgramme.employeeProgramme.models.GeneratedEmployees.employees;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

/**
 * Created by Joe on 14/12/2016.
 */
public class SwingUI implements ActionListener {
    private List<Employee> current;
    private static JFrame mainFrame;
    private JPanel listPanel, fieldPanel;
    private JList employeeJList;
    private JTextField txtId, txtFirstName, txtLastName, txtDob,
    txtEmployeeId, txtHireDate,txtPosition;

    private final int NOT_SELECTED =  -1;
    private int selectedIndex = NOT_SELECTED;


    public SwingUI() {
        mainFrame = new JFrame("Awesome Employee BOOM Programme");

        mainFrame.setVisible(true);
        mainFrame.setSize(800, 400);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        WindowListener l = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame, "Are you sure? Exit? Seriously", "Exit Confirmation",
                        JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (confirm == 0) {
                    mainFrame.dispose();
                    System.exit(0);
                }
            }
        };
        mainFrame.addWindowListener(l);

        Dimension di = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(di.width / 2 - mainFrame.getWidth() / 2, di.height / 2 - mainFrame.getHeight() / 2);

        //prepare menuBar!
        mainFrame.setJMenuBar(createMenu());

        //prepare main Panel
        JPanel content = (JPanel) mainFrame.getContentPane();
        content.setLayout(new GridLayout(1,2,5,5));

        //prepare our List
        current = employees;
        prepareJList();


        //prepare list panel
        listPanel = new JPanel();
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        JScrollPane scrollPane = new JScrollPane(createEmployeeList(employees));
        scrollPane.setPreferredSize(new Dimension(380,320));
        listPanel.add(scrollPane);
        content.add(listPanel);

        //prepare field panel
        fieldPanel = new JPanel();
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Employee's Details");
        fieldPanel.setBorder(title);

        //prepare sub-Panel for label and text field
        fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER);
        content.add(fieldPanel);
        fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH);


        mainFrame.setVisible(true);
    }
        private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.GRAY);

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.addActionListener(this);

        JMenuItem newMenuItem = new JMenuItem("New");
            newMenuItem.setMnemonic(KeyEvent.VK_N);
            newMenuItem.addActionListener(this);

            JMenuItem exitMenuItem = new JMenuItem("Exit");
            exitMenuItem.setMnemonic(KeyEvent.VK_X);
            exitMenuItem.addActionListener(this);


            JMenu optionMenu = new JMenu("Option");
            fileMenu.setMnemonic(KeyEvent.VK_O);
            fileMenu.addActionListener(this);



            JMenuItem searchMenuItem = new JMenuItem("Search");
            searchMenuItem.setMnemonic(KeyEvent.VK_S);
            searchMenuItem.addActionListener(this);

            JMenuItem listAllItems = new JMenuItem("List All Items");
            listAllItems.setMnemonic(KeyEvent.VK_L);
            listAllItems.addActionListener(this);

            JMenuItem sortAllItems = new JMenuItem("Sort items");
            sortAllItems.setMnemonic(KeyEvent.VK_B);
            sortAllItems.addActionListener(this);

            fileMenu.add(newMenuItem);
            fileMenu.add(exitMenuItem);

            optionMenu.add(searchMenuItem);
            optionMenu.add(listAllItems);
            optionMenu.add(sortAllItems);

            menuBar.add(fileMenu);
            menuBar.add(optionMenu);

            return menuBar;
        }

    private void prepareJList() {
        employeeJList = new JList<>();
        employeeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        employeeJList.addListSelectionListener(e -> {
            if(!employeeJList.getValueIsAdjusting()) {
                if(!employeeJList.isSelectionEmpty()) {
                    selectedIndex = employeeJList.getSelectedIndex();
                    if(selectedIndex > NOT_SELECTED) {
                        //display on text field
                        setEmployeeField(selectedIndex, current);
                    }
                }
            }
        });



}
        //list employee on JList

        private JList<Employee> createEmployeeList(List<Employee> resultList) {
            DefaultListModel<Employee> listModel = new DefaultListModel<>();
            if(resultList.size() > 0)
                for (Employee e : resultList)
                    listModel.addElement(e);

            employeeJList.setModel(listModel);

            return employeeJList;

        }

        private JPanel createFieldsPanel() {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0,2,5,5));

        JLabel lbId = new JLabel("ID:");
        inputPanel.add(lbId);
        txtId = new JTextField();
        inputPanel.add(txtId);

            JLabel lbfN = new JLabel("First Name:");
            inputPanel.add(lbfN);
            txtFirstName = new JTextField();
            inputPanel.add(txtFirstName);

            JLabel lblN = new JLabel("Last Name:");
            inputPanel.add(lblN);
            txtLastName = new JTextField();
            inputPanel.add(txtLastName);

            JLabel lbDOB = new JLabel("DOB: (YYYY-MM-DD)");
            inputPanel.add(lbDOB);
            txtDob = new JTextField();
            inputPanel.add(txtDob);

            JLabel lbEID = new JLabel("Employee ID");
            inputPanel.add(lbEID);
            txtEmployeeId = new JTextField();
            inputPanel.add(txtEmployeeId);

            JLabel lbHD = new JLabel("Hire Date: (YYYY-MM-DD)");
            inputPanel.add(lbHD);
            txtHireDate = new JTextField();
            inputPanel.add(txtHireDate);

            JLabel lbP = new JLabel("Position");
            inputPanel.add(lbP);
            txtPosition = new JTextField();
            inputPanel.add(txtPosition);


            return inputPanel;

    }

    private void setEmployeeField(int index, List<Employee> current) {
        Employee selected  = current.get(index);
        txtId.setText(Integer.toString(selected.getId()));
        txtFirstName.setText(selected.getFirstName());
        txtLastName.setText(selected.getLastName());
        txtDob.setText(selected.getDob().toString());
        txtEmployeeId.setText(selected.getEmployeeId());
        txtHireDate.setText(selected.getHireDate().toString());
        txtPosition.setText(selected.getPosition());

    }

    private void clearField(){
        txtId.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtDob.setText("");
        txtEmployeeId.setText("");
        txtHireDate.setText("");
        txtPosition.setText("");
    }

    private java.util.List<String> getEmployeeInfo() {
        java.util.List<String> data = new ArrayList<>();
        data.add(txtId.getText());
        data.add(txtFirstName.getText());
        data.add(txtLastName.getText());
        data.add(txtDob.getText());
        data.add(txtEmployeeId.getText());
        data.add(txtHireDate.getText());
        data.add(txtPosition.getText());

        //check to ensure its not empty
        for(int i=0; i < data.size(); i ++) {
            if(data.get(i).isEmpty()) {
                JOptionPane.showMessageDialog(mainFrame, "Some fields are empty");
                return null;
            }
        }
        return data;
    }

    private JPanel createButtonPanel() {
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectedIndex == NOT_SELECTED) {
                    JOptionPane.showMessageDialog(mainFrame, TaskProcessing.createNew(getEmployeeInfo()));
                } else {
                    JOptionPane.showMessageDialog(mainFrame,TaskProcessing.editEmployee(selectedIndex,getEmployeeInfo()));
                    selectedIndex = NOT_SELECTED;
                }
                clearField();
                current = employees;
                createEmployeeList(employees);
            }
        });
        btnPanel.add(btnSave);

        JButton btnRemove = new JButton("Remove");
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // Employee temp = employees.get(selectedIndex);
                TaskProcessing.removeEmployee(selectedIndex);
                current = employees;
                createEmployeeList(employees);
                clearField();

            }
        });
        btnPanel.add(btnRemove);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearField();
                employeeJList.clearSelection();
                current = employees;
                createEmployeeList(current);

            }
        });

        btnPanel.add(btnClear);

        return btnPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if("New".equals(action)){
            clearField();
            employeeJList.clearSelection();
            selectedIndex = NOT_SELECTED;
        } else if("Exit".equals(action)) {
            System.exit(0);
        } else if("Search".equals(action)) {
            String input = JOptionPane.showInputDialog("Enter String to Search ");
            current = TaskProcessing.search(input);
            createEmployeeList(current);
        } else if ("List All Items".equals(action)) {
            current = employees;
            createEmployeeList(current);
        } else if ("Sort items".equals(action)) {
            TaskProcessing.sortByFirstName();
            createEmployeeList(employees);
        }

    }
}




