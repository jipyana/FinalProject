package pc.builder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.swing.*;



//import pc.builder.PCBuilder;
//import pc.builder.PriceForOS;

public class BuildYourPCWindow extends JFrame implements ActionListener {

	private int clicked;
    private Container con;
    private ButtonGroup BG1,BG2,BG3,BG4,BG5,BG6,BG7,BG8,BG9;
    private JRadioButton powerSupplyb1,powerSupplyb2,powerSupplyb3,powerSupplyb4,powerSupplyb5,powerSupplyb6,powerSupplyb7,powerSupplyb8;
    private JLabel priceOfOS1,priceOfOS2,priceOfOS3, priceOfOS4,priceOfOS5,priceOfOS6,priceOfOS7,priceOfOS8,priceOfOS9,priceOfOS10,priceOfOS11;
    private JRadioButton OS1,OS2,OS3,OS4,OS5,OS6,OS7,OS8,OS9,OS10,OS11;
    private JRadioButton h;
    private JRadioButton Rb20,Rb16,Rb17,Rb18,Rb19;
    private JRadioButton Rb25,Rb21,Rb22,Rb23,Rb24;
    private JLabel pl1,pl2,pl3,pl4,pl5;
    private JLabel l1, l2, l3, l4, l5;
    private String[] Sary;
    private JButton oS,Sub,rem;

	public BuildYourPCWindow() {

		Sary = new String[5];
		for (int x = 0; x < Sary.length; x++)
			Sary[x] = " ";

		this.setVisible(true);
		this.setSize(1568, 1037);
		con = getContentPane();
		con.setLayout(null);
		
		final Box b1= Box.createVerticalBox();
        final Box b2= Box.createVerticalBox();
        final Box b3= Box.createVerticalBox();
        final Box b4= Box.createVerticalBox();
        final Box b5= Box.createVerticalBox();
        final Box partSelector = Box.createVerticalBox();
        final Box shoppingCart = Box.createVerticalBox();
        final Box choz = Box.createVerticalBox();

		partSelector.setVisible(true);
        partSelector.setBounds(150, 0, 300, 960);
        partSelector.setBorder(BorderFactory.createTitledBorder(" "));
        con.add(partSelector);
        shoppingCart.setVisible(true);
        shoppingCart.setBounds(400, 0, 300, 960);
        shoppingCart.setBorder(BorderFactory.createTitledBorder("Selected items"));
        con.add(shoppingCart);
        
        BG1 = new ButtonGroup();
        BG2 = new ButtonGroup();
        BG3 = new ButtonGroup();
        BG4 = new ButtonGroup();
        BG5 = new ButtonGroup();
        BG6 = new ButtonGroup();
        BG7 = new ButtonGroup();
        BG8 = new ButtonGroup();
        BG9 = new ButtonGroup();
        
        priceOfOS1 = new JLabel(PriceForOS.Microsoft_Windows_10_Home_32_64_bit.getPrice());
        priceOfOS2 = new JLabel(PriceForOS.Microsoft_Windows_10_Home_32_bit.getPrice());
        priceOfOS3 = new JLabel(PriceForOS.Microsoft_Windows_10_Home_64_bit.getPrice());
        priceOfOS4 = new JLabel(PriceForOS.Microsoft_Windows_7_Home_Premium_32_64_bit.getPrice());
        priceOfOS5 = new JLabel(PriceForOS.Microsoft_Windows_7_Home_Premium_SP1_32_bit.getPrice());
        priceOfOS6 = new JLabel(PriceForOS.Microsoft_Windows_7_Home_Premium_SP1_64_bit.getPrice());
        priceOfOS7 = new JLabel(PriceForOS.Microsoft_Windows_8_1_32_64_bit.getPrice());
        priceOfOS8 = new JLabel(PriceForOS.Microsoft_Windows_8_1_32_bit.getPrice());
        priceOfOS9 = new JLabel(PriceForOS.Microsoft_Windows_8_1_64_bit.getPrice());
        priceOfOS10 = new JLabel(PriceForOS.Microsoft_Windows_8_32_bit.getPrice());
        priceOfOS11 = new JLabel(PriceForOS.Microsoft_Windows_8_64_bit.getPrice());
        
        OS1 = new JRadioButton(PCBuilder.windows10Home_32_64Bit.getName());
        OS2 = new JRadioButton(PCBuilder.windows10Home_32Bit.getName());
        OS3 = new JRadioButton(PCBuilder.windows10Home_64Bit.getName());
        OS4 = new JRadioButton(PCBuilder.windows7Home_32_64Bit.getName());
        OS5 = new JRadioButton(PCBuilder.windows7Home_32Bit.getName());
        OS6 = new JRadioButton(PCBuilder.windows7Home_64Bit.getName());
        OS7 = new JRadioButton(PCBuilder.windows8_1_32_64Bit.getName());
        OS8 = new JRadioButton(PCBuilder.windows8_1_32Bit.getName());
        OS9 = new JRadioButton(PCBuilder.windows8_1_64Bit.getName());
        OS10 = new JRadioButton(PCBuilder.windows8_32Bit.getName());
        OS11 = new JRadioButton(PCBuilder.windows8_64Bit.getName());
        
        
        BG2.add(powerSupplyb1);
        ImageIcon p1 = new ImageIcon("images\\p1.jpg");
        JLabel Lp1 = new JLabel(" ", p1, JLabel.CENTER);
        
        BG1.add(OS1);
        BG1.add(OS2);
        BG1.add(OS3);
        BG1.add(OS4);
        BG1.add(OS5);
        BG1.add(OS6);
        BG1.add(OS7);
        BG1.add(OS8);
        BG1.add(OS9);
        BG1.add(OS10);
        BG1.add(OS11);
        
        l1= new JLabel("");
        l2= new JLabel("");
        l3= new JLabel("");
        l4= new JLabel("");
        l5= new JLabel("");
        
        
        
        
        
      //  b1.add( Box.createRigidArea(new Dimension(0,10)));

        
        b1.add(OS1);
        b1.add(priceOfOS1);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS2);
        b1.add(priceOfOS2);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS3);
        b1.add(priceOfOS3);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS4);
        b1.add(priceOfOS4);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS5);
        b1.add(priceOfOS5);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS6);
        b1.add(priceOfOS6);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS7);
        b1.add(priceOfOS7);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS8);
        b1.add(priceOfOS8);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS9);
        b1.add(priceOfOS9);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS10);
        b1.add(priceOfOS10);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(OS11);
        b1.add(priceOfOS11);
        b1.add( Box.createRigidArea(new Dimension(0,20)));
        b1.add(Lp1);
        
        
        OS1.addActionListener( new ActionListener() {           
                  public void actionPerformed(ActionEvent e) {{
                   Sary[0]= OS1.getText(); 
                     l2.setText(Sary[0]);
                  }}});
        OS2.addActionListener( new ActionListener() {           
                  public void actionPerformed(ActionEvent e) {{
                   Sary[0]= OS2.getText(); 
                     l2.setText(Sary[0]);
                  }}});
        OS3.addActionListener( new ActionListener() {           
                  public void actionPerformed(ActionEvent e) {{
                   Sary[0]= OS3.getText(); 
                     l2.setText(Sary[0]);
                  }}});
        OS4.addActionListener( new ActionListener() {           
                  public void actionPerformed(ActionEvent e) {{
                   Sary[0]= OS4.getText(); 
                     l2.setText(Sary[0]);
                  }}});
        OS5.addActionListener( new ActionListener() {           
                  public void actionPerformed(ActionEvent e) {{
                   Sary[0]= OS5.getText(); 
                     l2.setText(Sary[0]);
                  }}});
        
        b1.setVisible(false);
        b1.setBounds(125, 0, 300, 960);
        b1.setBorder(BorderFactory.createTitledBorder(" "));
        oS = new javax.swing.JButton("Operating Systems");
        oS.setMaximumSize(new Dimension(150, 25));
        

        con.add(b1);
        
        oS.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                   b1.setVisible(true); 
                   b2.setVisible(false);
                   b3.setVisible(false);
                   b4.setVisible(false);
                   b5.setVisible(false);
                   partSelector.setVisible(false);
                 }});
        
        
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        
		// Ram

//		Rb10 = new JRadioButton("1GB DDR3");
//		Rb9 = new JRadioButton("2GB DDR3");
//		Rb6 = new JRadioButton("4GB DDR3");
//		Rb7 = new JRadioButton("6GB DDR3");
//		Rb8 = new JRadioButton("8GB DDR3");
//
//		pl1 = new JLabel("Price - Rs.223 ");
//		pl2 = new JLabel("Price - Rs 2 ");
//		pl3 = new JLabel("Price - Rs 3 ");
//		pl4 = new JLabel("Price - Rs 222 ");
//		pl5 = new JLabel("Price - Rs 22222 ");
//
//		ImageIcon r1 = new ImageIcon("images\\R1.jpg");
//		JLabel R1 = new JLabel(" ", r1, JLabel.CENTER);
//
//		BG2.add(Rb10);
//		BG2.add(Rb9);
//		BG2.add(Rb6);
//		BG2.add(Rb7);
//		BG2.add(Rb8);
//
//		b2.add(Box.createRigidArea(new Dimension(0, 20)));
//		b2.add(Rb10);
//		b2.add(pl1);
//		b2.add(Box.createRigidArea(new Dimension(0, 8)));
//		b2.add(Rb9);
//		b2.add(pl2);
//		b2.add(Box.createRigidArea(new Dimension(0, 8)));
//		b2.add(Rb6);
//		b2.add(pl3);
//		b2.add(Box.createRigidArea(new Dimension(0, 8)));
//		b2.add(Rb7);
//		b2.add(pl4);
//		b2.add(Box.createRigidArea(new Dimension(0, 8)));
//		b2.add(Rb8);
//		b2.add(pl5);
//		b2.add(Box.createRigidArea(new Dimension(0, 10)));
//		b2.add(R1);
//
//		Rb9.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[1] = Rb9.getText();
//					l3.setText(Sary[1]);
//				}
//			}
//		});
//		Rb10.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[1] = Rb10.getText();
//					l3.setText(Sary[1]);
//				}
//			}
//		});
//		Rb6.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[1] = Rb6.getText();
//					l3.setText(Sary[1]);
//				}
//			}
//		});
//		Rb7.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[1] = Rb7.getText();
//					l3.setText(Sary[1]);
//				}
//			}
//		});
//		Rb8.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[1] = Rb8.getText();
//					l3.setText(Sary[1]);
//				}
//			}
//		});
//
//		b2.setVisible(false);
//		b2.setBounds(125, 0, 275, 450);
//		b2.setBorder(BorderFactory.createTitledBorder(" "));
//		btnR = new JButton("RAM");
//		btnR.setMaximumSize(new Dimension(120, 25));
//		con.add(b2);
//
//		btnR.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				b2.setVisible(true);
//				b1.setVisible(false);
//				b3.setVisible(false);
//				b4.setVisible(false);
//				b5.setVisible(false);
//				first.setVisible(false);
//
//			}
//		});
//		// Hard
//
//		Rb11 = new JRadioButton("250GB");
//		Rb12 = new JRadioButton("320GB");
//		Rb13 = new JRadioButton("500GB");
//		Rb14 = new JRadioButton("640GB");
//		Rb15 = new JRadioButton("750GB");
//
//		pl1 = new JLabel("Price - Rs.323 ");
//		pl2 = new JLabel("Price - Rs 33 ");
//		pl3 = new JLabel("Price - Rs 3 ");
//		pl4 = new JLabel("Price - Rs 3322 ");
//		pl5 = new JLabel("Price - Rs 32222 ");
//
//		ImageIcon h1 = new ImageIcon("images\\Lh1.jpg");
//		JLabel hd1 = new JLabel(" ", h1, JLabel.CENTER);
//
//		BG3.add(Rb15);
//		BG3.add(Rb11);
//		BG3.add(Rb12);
//		BG3.add(Rb13);
//		BG3.add(Rb14);
//
//		b3.add(Box.createRigidArea(new Dimension(0, 20)));
//		b3.add(Rb15);
//		b3.add(pl1);
//		b3.add(Box.createRigidArea(new Dimension(0, 8)));
//		b3.add(Rb11);
//		b3.add(pl2);
//		b3.add(Box.createRigidArea(new Dimension(0, 8)));
//		b3.add(Rb12);
//		b3.add(pl3);
//		b3.add(Box.createRigidArea(new Dimension(0, 8)));
//		b3.add(Rb13);
//		b3.add(pl4);
//		b3.add(Box.createRigidArea(new Dimension(0, 8)));
//		b3.add(Rb14);
//		b3.add(pl5);
//		// b3.add( Box.createRigidArea(new Dimension(0,10)));
//		b3.add(hd1);
//
//		Rb15.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[2] = Rb15.getText();
//					l4.setText(Sary[2]);
//				}
//			}
//		});
//		Rb11.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[2] = Rb11.getText();
//					l4.setText(Sary[2]);
//				}
//			}
//		});
//		Rb12.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[2] = Rb12.getText();
//					l4.setText(Sary[2]);
//				}
//			}
//		});
//		Rb13.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[2] = Rb13.getText();
//					l4.setText(Sary[2]);
//				}
//			}
//		});
//		Rb14.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[2] = Rb14.getText();
//					l4.setText(Sary[2]);
//				}
//			}
//		});
//
//		b3.setVisible(false);
//		b3.setBounds(125, 0, 275, 450);
//		b3.setBorder(BorderFactory.createTitledBorder(" "));
//		btnH = new JButton("HDD");
//		btnH.setMaximumSize(new Dimension(120, 25));
//		con.add(b3);
//
//		btnH.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				b3.setVisible(true);
//				b1.setVisible(false);
//				b2.setVisible(false);
//				b4.setVisible(false);
//				b5.setVisible(false);
//				first.setVisible(false);
//
//			}
//		});
//		// Disply
//
//		Rb20 = new JRadioButton("14\" WXGA");
//		Rb19 = new JRadioButton("14.1\" wxga");
//		Rb16 = new JRadioButton("15\" XGA ");
//		Rb17 = new JRadioButton("15.4\"WXGA");
//		Rb18 = new JRadioButton("17\"WUXGA");
//
//		pl1 = new JLabel("Price - Rs.423 ");
//		pl2 = new JLabel("Price - Rs 43 ");
//		pl3 = new JLabel("Price - Rs 4 ");
//		pl4 = new JLabel("Price - Rs 4322 ");
//		pl5 = new JLabel("Price - Rs 42222 ");
//
//		Rb19.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[3] = Rb19.getText();
//					l5.setText(Sary[3]);
//				}
//			}
//		});
//		Rb20.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[3] = Rb20.getText();
//					l5.setText(Sary[3]);
//				}
//			}
//		});
//		Rb16.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[3] = Rb16.getText();
//					l5.setText(Sary[3]);
//				}
//			}
//		});
//		Rb17.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[3] = Rb17.getText();
//					l5.setText(Sary[3]);
//				}
//			}
//		});
//		Rb18.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[3] = Rb18.getText();
//					l5.setText(Sary[3]);
//				}
//			}
//		});
//
//		ImageIcon s1 = new ImageIcon("images\\LS1.jpg");
//		JLabel ls1 = new JLabel(" ", s1, JLabel.CENTER);
//
//		BG4.add(Rb20);
//		BG4.add(Rb19);
//		BG4.add(Rb16);
//		BG4.add(Rb17);
//		BG4.add(Rb18);
//
//		b4.add(Box.createRigidArea(new Dimension(0, 50)));
//		b4.add(Rb20);
//		b4.add(pl1);
//		b4.add(Box.createRigidArea(new Dimension(0, 8)));
//		b4.add(Rb19);
//		b4.add(pl2);
//		b4.add(Box.createRigidArea(new Dimension(0, 8)));
//		b4.add(Rb16);
//		b4.add(pl3);
//		b4.add(Box.createRigidArea(new Dimension(0, 8)));
//		b4.add(Rb17);
//		b4.add(pl4);
//		b4.add(Box.createRigidArea(new Dimension(0, 8)));
//		b4.add(Rb18);
//		b4.add(pl5);
//		b4.add(ls1);
//
//		b4.setVisible(false);
//		b4.setBounds(125, 0, 275, 450);
//		b4.setBorder(BorderFactory.createTitledBorder(" "));
//		btnV = new JButton("SCREEN");
//		btnV.setMaximumSize(new Dimension(120, 25));
//		con.add(b4);
//
//		btnV.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				b4.setVisible(true);
//				b1.setVisible(false);
//				b3.setVisible(false);
//				b2.setVisible(false);
//				b5.setVisible(false);
//				first.setVisible(false);
//
//			}
//		});
//
//		// typ
//		pl1 = new JLabel("Price - Rs.423 ");
//		pl2 = new JLabel("Price - Rs 43 ");
//		pl3 = new JLabel("Price - Rs 4 ");
//		pl4 = new JLabel("Price - Rs 4322 ");
//		pl5 = new JLabel("Price - Rs 42222 ");
//
//		final Box hb1 = Box.createHorizontalBox();
//		final Box hb2 = Box.createHorizontalBox();
//		final Box hb3 = Box.createHorizontalBox();
//		final Box hb4 = Box.createHorizontalBox();
//
//		final Box hb11 = Box.createHorizontalBox();
//		final Box hb12 = Box.createHorizontalBox();
//
//		ImageIcon i1 = new ImageIcon("images\\LM1.jpg");
//		JLabel LM1 = new JLabel(" ", i1, JLabel.CENTER);
//
//		ImageIcon i2 = new ImageIcon("images\\LM2.jpg");
//		JLabel LM2 = new JLabel(" ", i2, JLabel.CENTER);
//
//		ImageIcon i3 = new ImageIcon("images\\LM3.jpg");
//		JLabel LM3 = new JLabel(" ", i3, JLabel.CENTER);
//
//		ImageIcon i4 = new ImageIcon("images\\LM4.jpg");
//		JLabel LM4 = new JLabel(" ", i4, JLabel.CENTER);
//
//		ImageIcon i5 = new ImageIcon("images\\LM5.jpg");
//		JLabel LM5 = new JLabel(" ", i5, JLabel.CENTER);
//
//		Rb21 = new JRadioButton("HP Probook 4530s");
//		Rb22 = new JRadioButton("HP Pavilion DV6");
//		Rb23 = new JRadioButton("Dell Vostro");
//		Rb24 = new JRadioButton("Dell Inspiron N5110");
//		Rb25 = new JRadioButton("Acer Aspire 5750");
//
//		BG5.add(Rb21);
//		BG5.add(Rb22);
//		BG5.add(Rb23);
//		BG5.add(Rb24);
//		BG5.add(Rb25);
//
//		// b5.add( Box.createRigidArea(new Dimension(0,50)));
//		hb1.add(LM1);
//		hb2.add(Rb21);
//		hb11.add(pl1);
//		hb11.add(Box.createRigidArea(new Dimension(10, 0)));
//		hb11.add(pl2);
//		hb1.add(LM2);
//		hb2.add(Rb22);
//
//		b5.add(hb1);
//		b5.add(hb2);
//		b5.add(hb11);
//		// b5.add( Box.createRigidArea(new Dimension(0,5)));
//
//		hb3.add(LM3);
//		hb4.add(Rb23);
//		hb3.add(LM4);
//		hb4.add(Rb24);
//		hb12.add(pl3);
//		hb12.add(Box.createRigidArea(new Dimension(10, 0)));
//		hb12.add(pl4);
//		b5.add(hb3);
//		b5.add(hb4);
//		b5.add(hb12);
//
//		b5.add(LM5);
//		b5.add(Rb25);
//		b5.add(pl5);
//
//		Rb21.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[4] = Rb21.getText();
//					l1.setText(Sary[4]);
//				}
//			}
//		});
//		Rb22.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[4] = Rb22.getText();
//					l1.setText(Sary[4]);
//				}
//			}
//		});
//		Rb23.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[4] = Rb23.getText();
//					l1.setText(Sary[4]);
//				}
//			}
//		});
//		Rb24.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[4] = Rb24.getText();
//					l1.setText(Sary[4]);
//				}
//			}
//		});
//		Rb25.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				{
//					Sary[4] = Rb25.getText();
//					l1.setText(Sary[4]);
//				}
//			}
//		});
//
//		b5.setVisible(false);
//		b5.setBounds(125, 0, 275, 450);
//		b5.setBorder(BorderFactory.createTitledBorder(" "));
//		btnD = new JButton("MODEL");
//		btnD.setMaximumSize(new Dimension(120, 25));
//		con.add(b5);
//
//		btnD.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				b5.setVisible(true);
//				b1.setVisible(false);
//				b3.setVisible(false);
//				b4.setVisible(false);
//				b2.setVisible(false);
//				first.setVisible(false);
//
//			}
//		});
		// Submit
		Sub = new JButton(" SUBMIT ");
		Sub.setMaximumSize(new Dimension(120, 25));
		Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int x = 0; x < Sary.length; x++)
					System.out.println(Sary[x]);

				ProductsSelectionLaptop1 PSL1 = new ProductsSelectionLaptop1();

				setVisible(false);
				PSL1.getPrice(Sary);
			}
		});
//
		shoppingCart.add(l1);
		shoppingCart.add(l2);
		shoppingCart.add(l3);
		shoppingCart.add(l4);
		shoppingCart.add(l5);
		// remove
		rem = new JButton(" Remove ");
		rem.setMaximumSize(new Dimension(120, 25));
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int x = 0; x < Sary.length; x++)
					Sary[x] = " ";

				l1.setText(" ");
				l2.setText(" ");
				l3.setText(" ");
				l4.setText(" ");
				l5.setText(" ");

			}
		});
		
		


        choz.add(oS);
        choz.add( Box.createRigidArea(new Dimension(0,5)));
        
		shoppingCart.add(Box.createRigidArea(new Dimension(0, 50)));
		ImageIcon image = new ImageIcon("images\\1.jpg");
		JLabel label1 = new JLabel(" ", image, JLabel.CENTER);
		shoppingCart.add(label1);
		shoppingCart.add(Sub);
		shoppingCart.add(rem);
		choz.setBorder(BorderFactory.createTitledBorder("Choose "));
		choz.setBounds(0, 0, 500, 960);
		con.add(choz);

	}

	public void back(String[] ar) {
		for (int x = 0; x < 5; x++) {
			Sary[x] = ar[x];
		}

		l2.setText(Sary[0]);
		l3.setText(Sary[1]);
		l4.setText(Sary[2]);
		l5.setText(Sary[3]);
		l1.setText(Sary[4]);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

	}
	
	private javax.swing.JButton Case;
    private javax.swing.JButton cPU;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton hardDrive;
    private javax.swing.JButton heatSink;
    private javax.swing.JButton memory;
    private javax.swing.JButton motheBoard;
    private javax.swing.JButton powerSupply;
    private javax.swing.JButton videoCard;
}
