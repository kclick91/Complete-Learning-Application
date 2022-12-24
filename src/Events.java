import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Events implements ActionListener {
    //TextField text = new TextField(50);
    //TextField textTwo = new TextField(50);
    //JButton bNCF;
    //JButton bNCB;
    //JButton bAddNewCard;
    //private int numClicks = 0;
    //RJ rj = new RJ();
    //JTextField frontField;
    //JTextField backField;
    /*
    JButton bNCF;
    JButton bNCB;
    JButton bNum;
    JButton bPack;
     */
    JLabel lNCF;
    JLabel lNCB;
    JLabel lNum;
    JLabel lPack;

    JButton bAddNewCard;
    JButton bAddPack;
    JTextField frontField;
    JTextField backField;
    JTextField packName;
    //JTextField packID;
    JTextField addPackTextField;
    NotecardPack notecardPack;
    JLabel labelAdded = new JLabel();
    JLabel labelAddedTwo = new JLabel();
    JLabel labelAddedThree = new JLabel();
    JLabel labelAddedFour = new JLabel();
    JLabel packAdded = new JLabel();
    JLabel packAddedCount = new JLabel();
    JLabel cardDisplayFront;
    JLabel cardDisplayBack;

    ArrayList<NotecardPack> noteCardPacks = new ArrayList<NotecardPack>();

    RJ rj = new RJ();

    JButton nextButton;
    JButton prevButton;

    int packCount = 0;

    public Events()
    {
        JFrame frame = new JFrame();
        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        //Main myWindow = new Main("CLA");
        //myWindow.setSize(750,500);
        //myWindow.setVisible(true);


        lNCF = new JLabel("Front of Card");
        lNCF.setLocation(50, 100);
        lNCF.setSize(300, 30);
        lNCB = new JLabel("Back of Card");
        lNCB.setLocation(50, 150);
        lNCB.setSize(300, 30);

        //bNum = new JButton("Card Number");
        //bNum.setBounds(50, 200, 230, 30);
        lPack = new JLabel("PACK NAME");
        lPack.setLocation(50, 200);
        lPack.setSize(300, 30);

        bAddNewCard = new JButton("Add This New Card");
        bAddNewCard.setBounds(50, 250, 230, 30);
        bAddPack = new JButton("Add a Pack of Notecards");
        bAddPack.setBounds(50, 500, 230, 30);

        //Next, Previous Buttons
        prevButton = new JButton();
        prevButton.setText("Previous");
        prevButton.setBounds(900, 500, 100, 30);
        nextButton = new JButton();
        nextButton.setText("Next");
        nextButton.setBounds(1050, 500, 100, 30);


        cardDisplayFront = new JLabel();
        cardDisplayFront.setText("FRONT OF CARD");
        cardDisplayFront.setBounds(900, 100, 200, 400);

        cardDisplayBack = new JLabel();
        cardDisplayBack.setText("BACK OF CARD");
        cardDisplayBack.setBounds(900, 100, 200, 600);








        /*
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
         */
        JLabel label = new JLabel("Complete Learning Application");
        label.setLocation(50, 50);
        label.setSize(300,30);
        frontField = new JTextField();
        frontField.setBounds(350,100, 150, 20);
        frontField.setColumns(60);
        frontField.setText("FRONT OF CARD");
        backField = new JTextField();
        backField.setBounds(350, 150, 150, 20);
        backField.setColumns(60);
        backField.setText("BACK OF CARD");
        //numberField = new JTextField();
        //numberField.setBounds(350, 200, 150, 20);
        //numberField.setColumns(60);
        //numberField.setText("1");
        packName = new JTextField();
        packName.setBounds(350, 200, 150, 20);
        packName.setColumns(60);
        packName.setText("PACK NAME");
        //packID = new JTextField();
        //packID.setBounds(350, 300, 150, 20);
        //packID.setColumns(60);
        //packID.setText("ID #");
        //Pack Button:50, 500, 230, 30
        addPackTextField = new JTextField();
        addPackTextField.setBounds(350, 500, 150, 20);
        addPackTextField.setColumns(60);
        addPackTextField.setText("PACK NAME");


        packAdded.setBounds(550, 500, 250, 20);
        packAddedCount.setBounds(550, 520, 250, 20);


        labelAdded.setBounds(50, 110, 530, 400);
        labelAddedTwo.setBounds(50, 130, 530, 400);
        labelAddedThree.setBounds(50, 150, 530, 400);
        labelAddedFour.setBounds(50, 170, 530, 400);


        //Add name field for notecard pack
        frame.getContentPane().add(lNCF);
        frame.getContentPane().add(frontField);
        frame.getContentPane().add(lNCB);
        frame.getContentPane().add(backField);
        frame.getContentPane().add(bAddNewCard);
        //frame.getContentPane().add(bNum);
        //frame.getContentPane().add(numberField);
        frame.getContentPane().add(label);
        frame.getContentPane().add(lPack);
        frame.getContentPane().add(packName);
        frame.getContentPane().add(bAddPack);
        frame.getContentPane().add(addPackTextField);
        frame.getContentPane().add(packAdded);
        frame.getContentPane().add(packAddedCount);
        frame.getContentPane().add(cardDisplayFront);
        frame.getContentPane().add(cardDisplayBack);
        frame.getContentPane().add(prevButton);
        frame.getContentPane().add(nextButton);
        frame.getContentPane().add(labelAdded);
        frame.getContentPane().add(labelAddedTwo);
        frame.getContentPane().add(labelAddedThree);
        frame.getContentPane().add(labelAddedFour);

        //frame.getContentPane().add(packID);
        //frame.doLayout();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.pack();
        frame.setVisible(true);
        bAddNewCard.addActionListener(this::actionPerformed);
        //Button that adds pack of notecards
        bAddPack.addActionListener(this::actionPerformedTwo);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Added New Card:");
        System.out.println(frontField.getText());
        System.out.println(backField.getText());
        System.out.println(lPack.getText());
        notecardPack = new NotecardPack(packName.getText(), packCount);
        notecardPack.AddToPack(new Notecard(frontField.getText(), backField.getText()));

        labelAdded.setText("Added: ");
        labelAddedTwo.setText(frontField.getText());
        labelAddedThree.setText(backField.getText());
        labelAddedFour.setText(packName.getText());

        //Get notecardPack.get(iD - 1).front





    }

    public void actionPerformedTwo(ActionEvent e) {
        noteCardPacks.add(new NotecardPack(addPackTextField.getText(), packCount));
        packCount = packCount + 1;
        packAdded.setText("Added: " + addPackTextField.getText());
        packAddedCount.setText("Number of packs:  " + packCount);
        //System.out.println(addPackTextField.getText());
        //System.out.println(noteCardPacks.get(packCount - 1).);
        //System.out.println("Number of packs: " + packCount);









    }

}