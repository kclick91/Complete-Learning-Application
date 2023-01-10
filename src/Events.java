import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


//To do List
//1. Know or don't know
//2. Saving to text files
//3. Web of notecard packs
//4. Additional terms/concepts listed at bottom of front of card or back of card
//5. Processes
//6. Timed Terms
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
    RJ rjOne = new RJ();

    JLabel lNCF;
    JLabel lNCB;
    JLabel lNum;
    JLabel lPack;

    JButton bAddNewCard;
    JButton bAddPack;
    JButton bCoverBack;
    JButton setPack;
    boolean backCovered= false;
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
    JLabel labelAddedFive = new JLabel();
    JLabel packAdded = new JLabel();
    JLabel packAddedCount = new JLabel();
    JLabel cardDisplayFront;
    JLabel cardDisplayBack;
    int packNumber = 1;
    JTextField packIDTF = new JTextField();
    JLabel enterLabel = new JLabel();
    JTextField enterID = new JTextField();
    JLabel setPackIDLabel = new JLabel();

    ArrayList<NotecardPack> noteCardPacks = new ArrayList<NotecardPack>();

    RJ rj = new RJ();

    JButton nextButton;
    JButton prevButton;
    JButton showOnlyFrontForward;
    JButton showOnlyFrontBackward;
    JButton showRandom;
    JButton butFT;

    int packCount = 1;
    int cardCount = 1;

    JFrame openingFrame;
    JFrame frame;//Notecards
    JFrame frameTwo;
    JFrame frameThree;//Timed Terms


    JButton bNotecards;
    JLabel test;//second frame

    JButton bTimedTerms;

    JButton know = new JButton();
    JButton dontKnow = new JButton();

    //Frame Three
    JButton bAddTerm;
    JTextField tfSetTerm;
    JTextField tfSetDefinition;


    public Events()
    {
        openingFrame = new JFrame();
        bNotecards = new JButton();
        bNotecards.setText("Notecards");
        bNotecards.setBounds(50,50, 200, 200);

        bTimedTerms = new JButton();
        bTimedTerms.setText("Timed Terms");
        bTimedTerms.setBounds(300, 50, 200, 200);

        openingFrame.getContentPane().add(bNotecards);
        openingFrame.getContentPane().add(bTimedTerms);

        //RJ rjOne = new RJ();




        frame = new JFrame();

        //Second Frame
        frameTwo = new JFrame();
        butFT = new JButton();
        butFT.setText("NEXT FRAME TEST");
        butFT.setBounds(50, 650, 230, 30);
        frame.setSize(700, 400);
        frame.setLayout(null);

        frameThree = new JFrame();
        frameThree.setSize(700, 400);
        frameThree.setLayout(null);






        //frameTwo.setSize(700, 400);
        //frameTwo.setLayout(null);
        //frame.setVisible(true);
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

        enterLabel.setText("Add To Pack ID");
        enterLabel.setBounds(50, 250, 300, 30);
        enterID.setText("1");
        enterID.setBounds(350, 250, 150, 20);

        bAddNewCard = new JButton("Add This New Card");
        bAddNewCard.setBounds(50, 300, 230, 30);
        bAddPack = new JButton("Add a Pack of Notecards");
        bAddPack.setBounds(50, 500, 230, 30);

        //Next, Previous Buttons
        prevButton = new JButton();
        prevButton.setText("Previous");
        prevButton.setBounds(900, 500, 100, 30);
        nextButton = new JButton();
        nextButton.setText("Next");
        nextButton.setBounds(1050, 500, 100, 30);
        //Cover back of card
        bCoverBack = new JButton();
        bCoverBack.setText("Cover Back of Card");
        bCoverBack.setBounds(900, 550, 250, 30);



        cardDisplayFront = new JLabel();
        cardDisplayFront.setText("FRONT OF CARD SHOWN HERE TEST");
        cardDisplayFront.setBounds(900, 100, 950, 400);

        cardDisplayBack = new JLabel();
        cardDisplayBack.setText("BACK OF CARD SHOWN HERE TEST");
        cardDisplayBack.setBounds(900, 100, 950, 600);


        notecardPack = new NotecardPack("First Pack",1);
        noteCardPacks.add(notecardPack);

        setPack = new JButton();
        setPack.setText("Set Pack ID");
        setPack.setBounds(900, 100, 100, 30);

        setPackIDLabel.setText("CURRENT PACK");
        setPackIDLabel.setBounds(900,130, 100, 30);

        packIDTF.setBounds(900, 50, 100, 30);
        packIDTF.setText(String.valueOf(1));

        //Web of cards
        //Relations between cards








        /*
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
         */
        JLabel label = new JLabel("Complete Learning Application Notecard Page");
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


        labelAdded.setBounds(50, 140, 950, 400);
        labelAddedTwo.setBounds(50, 160, 950, 400);
        labelAddedThree.setBounds(50, 180, 950, 400);
        labelAddedFour.setBounds(50, 200, 950, 400);
        labelAddedFive.setBounds(50, 220, 950, 400);


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
        frame.getContentPane().add(bCoverBack);
        frame.getContentPane().add(labelAdded);
        frame.getContentPane().add(labelAddedTwo);
        frame.getContentPane().add(labelAddedThree);
        frame.getContentPane().add(labelAddedFour);
        frame.getContentPane().add(labelAddedFive);
        frame.getContentPane().add(packIDTF);
        frame.getContentPane().add(setPack);
        frame.getContentPane().add(enterID);
        frame.getContentPane().add(enterLabel);
        frame.getContentPane().add(setPackIDLabel);
        frame.getContentPane().add(butFT);




        //frame.getContentPane().add(packID);
        //frame.doLayout();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        //frame.pack();
        openingFrame.doLayout();
        openingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        openingFrame.setLayout(null);
        openingFrame.pack();
        openingFrame.setVisible(true);
        //Frame set visible from button on originalFrame
        //frame.setVisible(true);
        bAddNewCard.addActionListener(this::actionPerformed);
        //Button that adds pack of notecards
        bAddPack.addActionListener(this::actionPerformedTwo);
        nextButton.addActionListener(this::actionPerformedThree);
        prevButton.addActionListener(this::actionPerformedFour);
        bCoverBack.addActionListener(this::actionPerformedFive);
        setPack.addActionListener(this::actionPerformedSix);
        butFT.addActionListener(this::actionPerformedSeven);
        bNotecards.addActionListener(this::actionPerformedEight);
        bTimedTerms.addActionListener(this::actionPerformedNine);

        frameTwo.setSize(700, 400);
        frameTwo.setLayout(null);
        test = new JLabel();
        test.setText("TESTING LABEL IN NEW FRAME");
        test.setBounds(400, 400, 250, 50);




    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Added New Card:");
        System.out.println(frontField.getText());
        System.out.println(backField.getText());
        System.out.println(lPack.getText());
        System.out.println(enterID.getText());
        cardCount = cardCount + 1;

        //packCount
        //notecardPack = new NotecardPack(packName.getText(), packCount);
        /*
        notecardPack.AddToPack(new Notecard(frontField.getText(), backField.getText()));
        noteCardPacks.add(notecardPack);
        */

        labelAdded.setText("Added: ");
        labelAddedTwo.setText(frontField.getText());
        labelAddedThree.setText(backField.getText());
        labelAddedFour.setText(packName.getText());
        labelAddedFive.setText(enterID.getText());

        //Get notecardPack.get(iD - 1).front

        //notecardPack.AddToPack(new Notecard(frontField.getText(), backField.getText()));

        noteCardPacks.get(Integer.parseInt(enterID.getText()) - 1).AddToPack(new Notecard(frontField.getText(), backField.getText()));




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

    public void actionPerformedThree(ActionEvent e) {
        labelAddedTwo.setText("");
        labelAddedThree.setText("");
        labelAddedFour.setText("");
        labelAddedFive.setText("");
        //Next

        //NotecardPack np = noteCardPacks.get(packCount - 1);

        if (cardCount < noteCardPacks.get(packNumber - 1).GetList().size())
        {
            cardCount = cardCount + 1;
            System.out.println("CC: " + cardCount);
        }
        else
        {
            cardCount = 1;
            System.out.println("CC: " + cardCount);
        }

        cardDisplayFront.setText(noteCardPacks.get(packNumber - 1).GetCard(cardCount).GetFront());
        if (backCovered == false)
        {
            cardDisplayBack.setText(noteCardPacks.get(packNumber - 1).GetCard(cardCount).GetBack());
        }
        else
        {
            cardDisplayBack.setText("BACK IS HIDDEN");
        }



    }

    public void actionPerformedFour(ActionEvent e) {
        labelAddedTwo.setText("");
        labelAddedThree.setText("");
        labelAddedFour.setText("");
        labelAddedFive.setText("");
        //Previous

        //NotecardPack np = noteCardPacks.get(packCount);
        if (cardCount == 1)
        {
            cardCount = noteCardPacks.get(packNumber - 1).GetList().size();
            System.out.println("CC: " + cardCount);
        }
        else
        {
            cardCount = cardCount - 1;
            System.out.println("CC: " + cardCount);
        }

        cardDisplayFront.setText(noteCardPacks.get(packNumber - 1).GetCard(cardCount).GetFront());
        if (backCovered == false)
        {
            cardDisplayBack.setText(noteCardPacks.get(packNumber - 1).GetCard(cardCount).GetBack());
        }
        else
        {
            cardDisplayBack.setText("BACK IS HIDDEN");
        }





    }
    public void actionPerformedFive(ActionEvent e)
    {
        if (backCovered == false)
        {
            backCovered = true;
        }
        else
        {
            backCovered = false;
        }
    }
    public void actionPerformedSix(ActionEvent e)
    {
        packNumber = Integer.parseInt(packIDTF.getText());
        setPackIDLabel.setText(String.valueOf(packNumber));
    }

    public void actionPerformedSeven(ActionEvent e) {

        frameTwo.setVisible(true);
        frameTwo.getContentPane().add(test);



    }

    public void actionPerformedEight(ActionEvent e)
    {
        ShowNotecardPage();
    }
    //List notecard packs by Name

    public void actionPerformedNine(ActionEvent e) {ShowTimedTermsPage();}

    public void ShowNotecardPage()
    {
        frame.setVisible(true);
    }

    public void ShowTimedTermsPage(){
        bAddTerm = new JButton();
        bAddTerm.setBounds(50, 150, 100, 20);
        bAddTerm.setText("Add Term");
        tfSetTerm = new JTextField();
        tfSetTerm.setBounds(50, 50, 200, 20);
        tfSetTerm.setText("TERM GOES HERE");
        tfSetDefinition = new JTextField();
        tfSetDefinition.setBounds(50, 100, 200, 20);
        tfSetDefinition.setText("DEFINITION GOES HERE");
        frameThree.getContentPane().add(bAddTerm);
        frameThree.getContentPane().add(tfSetTerm);
        frameThree.getContentPane().add(tfSetDefinition);

        frameThree.setVisible(true);
    }


}
