package mian_clalss;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
public class main extends JFrame{
		JPanel main=new JPanel();
		JPanel panel_north=new JPanel();
		JPanel panel_south=new JPanel();
		JPanel panel_center=new JPanel();
		JPanel panel_center_north=new JPanel();
		JPanel panel_center_south=new JPanel();
		JPanel panel_south_north=new JPanel();
		JPanel panel_south_south=new JPanel();
		JPanel panel_south_north_n=new JPanel();
		JPanel panel_south_north_s=new JPanel();
		JTextField tf=new JTextField();
		JTextField txt_p_d=new JTextField(15);
		JTextField txt_b_d=new JTextField(15);
		JTextField txt_1st=new JTextField(20);
		JTextField txt_2nd=new JTextField(20);
		JTextField txt_3rd=new JTextField(20);
		JTextField txt_4th=new JTextField(20);
		JTextField txt_5th=new JTextField(20);
		JTextField txt_6th=new JTextField(20);
		JTextField txt_7th=new JTextField(20);
		JTextField txt_8th=new JTextField(20);
		
		JLabel lbl_p_d=new JLabel("Present Date :");
		JDateChooser date_p_d=new JDateChooser();
	
		JLabel lbl_b_d=new JLabel("Born Date :");
		JDateChooser date_b_d=new JDateChooser();
		JLabel lbl_1st=new JLabel("1st Semister :");
		JLabel lbl_2nd=new JLabel("2nd Semister:");
		JLabel lbl_3rd=new JLabel("3rd Semister :");
		JLabel lbl_4th=new JLabel("4th Semister :");
		JLabel lbl_5th=new JLabel("5th Semister :");
		JLabel lbl_6th=new JLabel("6th Semister :");
		JLabel lbl_7th=new JLabel("7th Semister :");
		JLabel lbl_8th=new JLabel("8th Semister :");
		ImageIcon defaul=new ImageIcon("pic/Untitled.png");
		
		JButton age=new JButton("Age");
		JButton cgpa=new JButton("CGPA");
		JButton cancel=new JButton("Cancel");
		JButton clear=new JButton("Clear");
		
		JLabel lbl=new JLabel("Please Enter Semister Point");
		JLabel lbl1=new JLabel("Please Enter Present & Born Date");
		GridBagConstraints gr=new GridBagConstraints();
		double a,b,c,d,e,f,g,h,i,j,result;
		String s,s1,s2,s3,s4,s5,s6,s7,s8,s9;
			public main()
			{
				cmp();
				init();
				btn_action();
				//key_action();
				date_take();
			}
				public void cmp()
				{
					add(main);
					main.setLayout(new BorderLayout());
					main.add(panel_north,BorderLayout.NORTH);
					panel_north_work();
					main.add(panel_south,BorderLayout.SOUTH);
					panel_south_work();
					main.add(panel_center,BorderLayout.CENTER);
					panel_center_work();
				}
				/*public void date_take(){
					DateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
				    Date date=new Date();
					String start =dateformat.format(date).toString();
					txt_p_d.setText(start);
				}*/
				public void panel_north_work()
				{
					panel_north.setBorder(BorderFactory.createMatteBorder(10, 0, 0, 0, defaul));
					panel_north.setPreferredSize(new Dimension(10,90));
					panel_north.add(tf);
					tf.setPreferredSize(new Dimension(390,75));
					tf.setHorizontalAlignment(JTextField.RIGHT);
					tf.setEditable(false);
				}
				public void panel_south_work()
				{
					
					
					panel_south.setLayout(new BorderLayout());
					panel_south.setPreferredSize(new Dimension(10,420));
					panel_south.add(panel_south_north,BorderLayout.NORTH);
					panel_south_north_work();
					panel_south.add(panel_south_south,BorderLayout.SOUTH);
					panel_south_south_work();
					
					
					
					
				}
				public void panel_south_north_work()
				{
					panel_south_north.setLayout(new BorderLayout());
					panel_south_north.add(panel_south_north_n,BorderLayout.NORTH);
					//panel_south_north_n.setPreferredSize(new Dimension(10,10));
					panel_south_north_n.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 40, defaul));
					panel_south_north_n.add(lbl);
					lbl.setFont(new Font("Arial", Font.BOLD, 25));
					lbl.setForeground(Color.red);
					panel_south_north.add(panel_south_north_s,BorderLayout.SOUTH);
					
					
					panel_south_north_s.setPreferredSize(new Dimension(10,330));
					panel_south_north_s.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 50, defaul));
					panel_south_north_s.setLayout(new GridBagLayout());
					gr.insets=new Insets(5, 5, 5, 5);
					gr.fill=GridBagConstraints.BOTH;
					gr.gridx=0;
					gr.gridy=0;
					panel_south_north_s.add(lbl_1st,gr);
					lbl_1st.setFont(new Font("Arial", Font.BOLD, 15)); 
					gr.gridx=1;
					gr.gridy=0;
					panel_south_north_s.add(txt_1st,gr);
					gr.gridx=0;
					gr.gridy=1;
					panel_south_north_s.add(lbl_2nd,gr);
					lbl_2nd.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=1;
					panel_south_north_s.add(txt_2nd,gr);
					gr.gridx=0;
					gr.gridy=2;
					panel_south_north_s.add(lbl_3rd,gr);
					lbl_3rd.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=2;
					panel_south_north_s.add(txt_3rd,gr);
					gr.gridx=0;
					gr.gridy=3;
					panel_south_north_s.add(lbl_4th,gr);
					lbl_4th.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=3;
					panel_south_north_s.add(txt_4th,gr);
					gr.gridx=0;
					gr.gridy=4;
					panel_south_north_s.add(lbl_5th,gr);
					lbl_5th.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=4;
					panel_south_north_s.add(txt_5th,gr);
					gr.gridx=0;
					gr.gridy=5;
					panel_south_north_s.add(lbl_6th,gr);
					lbl_6th.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=5;
					panel_south_north_s.add(txt_6th,gr);
					gr.gridx=0;
					gr.gridy=6;
					panel_south_north_s.add(lbl_7th,gr);
					lbl_7th.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=6;
					panel_south_north_s.add(txt_7th,gr);
					gr.gridx=0;
					gr.gridy=7;
					panel_south_north_s.add(lbl_8th,gr);
					lbl_8th.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=7;
					panel_south_north_s.add(txt_8th,gr);
				}
				public void panel_south_south_work()
				{
					panel_south_south.setPreferredSize(new Dimension(10,40));
					panel_south_south.setLayout(new GridLayout(1,4,7,7));
					panel_south_south.add(age);
					age.setFont(new Font("Arial", Font.BOLD, 20));
					age.setForeground(Color.red);
					panel_south_south.add(cgpa);
					cgpa.setFont(new Font("Arial", Font.BOLD, 20));
					cgpa.setForeground(Color.red);
					panel_south_south.add(clear);
					clear.setFont(new Font("Arial", Font.BOLD, 20));
					clear.setForeground(Color.red);
					
					panel_south_south.add(cancel);
					cancel.setFont(new Font("Arial", Font.BOLD, 20));
					cancel.setForeground(Color.red);
				}
				public void panel_center_work()
				{
					
					panel_center.setLayout(new BorderLayout());
					panel_center.add(panel_center_north,BorderLayout.NORTH);
					panel_center_north.setBorder(BorderFactory.createMatteBorder(20, 40, 0, 0, defaul));
					//panel_center_north.setPreferredSize(new Dimension(10,10));
					panel_center_north.add(lbl1);
					lbl1.setFont(new Font("Arial", Font.BOLD, 25));
					lbl1.setForeground(Color.red);
					panel_center.add(panel_center_south,BorderLayout.SOUTH);
					panel_center_south.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 90, defaul));
					
					panel_center_south.setLayout(new GridBagLayout());
					gr.gridx=0;
					gr.gridy=0;
					gr.insets=new Insets(5, 5, 5, 5);
					gr.fill=GridBagConstraints.BOTH;
					panel_center_south.add(lbl_p_d,gr);
					lbl_p_d.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=0;
					gr.insets=new Insets(5, 5, 5, 5);
					gr.fill=GridBagConstraints.BOTH;
					panel_center_south.add(txt_p_d,gr);
					//date_p_d.setDateFormatString("yyyy-MM-dd");
					/*java.util.Date date=new java.util.Date();
					DateFormat dateformate=new SimpleDateFormat("yyyy-MM-dd");
					txt_p_d.setText(dateformate.format(date).toString());*/
					
					txt_p_d.setToolTipText("yyyy-MM-dd");
					date_p_d.setPreferredSize(new Dimension(180,30));
					
					panel_center_south.setLayout(new GridBagLayout());
					gr.gridx=0;
					gr.gridy=1;
					gr.insets=new Insets(5, 0, 5, 5);
					gr.fill=GridBagConstraints.BOTH;
					panel_center_south.add(lbl_b_d,gr);
					
					lbl_b_d.setFont(new Font("Arial", Font.BOLD, 15));
					gr.gridx=1;
					gr.gridy=1;
					gr.insets=new Insets(5, 5, 5, 5);
					gr.fill=GridBagConstraints.BOTH;
					panel_center_south.add(date_b_d,gr);
					date_b_d.setDateFormatString("yyyy-MM-dd");
					//date_b_d.setDateFormatString("yyyy-MM-dd");
					DateFormat date_h_m=new SimpleDateFormat("HH:mm:ss");
					Date date=new Date();
					String start=date_h_m.format(date).toString();
					
					date_b_d.setPreferredSize(new Dimension(180,30));
					
				}
				public void init()
				{
					setSize(500,690);
					setResizable(false);
					setLocationRelativeTo(null);
					setVisible(true);
					setTitle("Age & GPA Calculator");
					setIconImage(Toolkit.getDefaultToolkit().getImage("pic/"));
				}
				public void btn_action()
				{
					cgpa.addActionListener(new ActionListener() {
						
					
						public void actionPerformed(ActionEvent arg0) {
							if(txt_1st.getText().trim().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Enter 1st Semister Point");
							}
							else if(txt_2nd.getText().trim().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Enter 2nd Semister Point");
							}
							else if(txt_3rd.getText().trim().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Enter 3rd semister Point");
							}
							else if(txt_4th.getText().trim().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Enter 4th Semister Point");
							}
							else if(txt_5th.getText().trim().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Enter 5th Semister Point");
							}
							else if(txt_6th.getText().trim().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Enter 6th semister Point");
							}
							else if(txt_7th.getText().trim().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Enter 7th Semister Point");
							}
							else if(txt_8th.getText().trim().isEmpty())
							{
								JOptionPane.showMessageDialog(null, "Enter 8th Semister Point");
							}
							else{
								s1=txt_1st.getText().trim();
								a=Double.parseDouble(s1);
								
								s2=txt_2nd.getText().trim();
								b=Double.parseDouble(s2);
								
								s3=txt_3rd.getText().trim();
								c=Double.parseDouble(s3);
								
								s4=txt_4th.getText().trim();
								d=Double.parseDouble(s4);
								
								s5=txt_5th.getText().trim();
								e=Double.parseDouble(s5);
								
								s6=txt_6th.getText().trim();
								f=Double.parseDouble(s6);
								
								s7=txt_7th.getText().trim();
								g=Double.parseDouble(s7);
								
								s8=txt_8th.getText().trim();
								h=Double.parseDouble(s8);
								
								result=((a*5)/100+(b*5)/100+(c*5)/100+(d*15)/100+(e*15)/100+(f*20)/100+(g*25)/100+(h*10)/100);
							    s=Double.toString(result);
							    tf.setText("Your CGPA is:"+s);
							    tf.setFont(new Font("Serif", Font.PLAIN, 20));
								tf.setForeground(Color.red);
							}
							
							
						}
					});
					
					clear.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							tf.setText("");
							txt_1st.setText("");
							txt_2nd.setText("");
							txt_3rd.setText("");
							txt_4th.setText("");
							txt_5th.setText("");
							txt_6th.setText("");
							txt_7th.setText("");
							txt_8th.setText("");
						}
					});
					cancel.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							int confirm=JOptionPane.showConfirmDialog(null, "Are You Sure","Confirmation",JOptionPane.YES_NO_OPTION);
							if(confirm==JOptionPane.YES_OPTION)
								
									
							dispose();
							
						}
					});
					/*cgpa.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								Date p_Date=new Date();
								long time=p_Date.getTime();
								SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
								Date b_date=format.parse(date_b_d.getDateFormatString());
								long time1=b_date.getTime();
								long res=time-time1;
								System.out.println(""+res);
							}
							catch(Exception ee) {
								JOptionPane.showMessageDialog(null, "Not Match With Format");
							}
							
						}
					});*/
					age.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							try {
								int day=0;
								int month=0;
								int year=0;
								SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
								String d_o_b_s=format.format(date_b_d.getDate());
								String dob_array[]=d_o_b_s.split("-");
								int b_y=Integer.parseInt(dob_array[0]);
								int b_m=Integer.parseInt(dob_array[1]);
								int b_d=Integer.parseInt(dob_array[2]);
								
								Date date=new Date();
								String now_s=format.format(date);
								String now_array[]=now_s.split("-");
								int now_y=Integer.parseInt(now_array[0]);
								int now_m=Integer.parseInt(now_array[1]);
								int now_d=Integer.parseInt(now_array[2]);
								if(b_d>now_d) {
									now_m--;
									day=(now_d+30)-b_d;
									if(b_m>now_m) {
										now_y--;
										month=(now_m+12)-b_m;
									}
									else {
										month=now_m-b_m;
										year=now_y-b_y;
									}
									JOptionPane.showMessageDialog(null, "Age==>"+year+"  Years "+"  "+month+" Months "+" "+day+" days");
									//String years=Integer.toString(year);
									//String months=Integer.toString(month);
									//String days=Integer.toString(day);
									//String resDate="Your Age Is==>".concat(years.concat("  Years  ".concat(months.concat("  Months  ".concat(days.concat(" Days"))))));
									//tf.setText(resDate);
									//tf.setFont(new Font("Serif", Font.PLAIN, 20));
									//tf.setForeground(Color.RED);
								}
								else {
									day=now_d-b_d;
									if(b_m>now_m) {
										now_y--;
										month=(now_m+12)-b_m;
									}
									else {
										month=now_m-b_m;
										year=now_y-b_y;
									}
									JOptionPane.showMessageDialog(null, "Age==>"+year+"  Years "+"  "+month+" Months "+" "+day+" days");
									//String years=Integer.toString(year);
									//String months=Integer.toString(month);
									//String days=Integer.toString(day);
									//String x="Your Age Is";
									//String resDate="Your Age Is==>".concat(years.concat("  Years  ".concat(months.concat("  Months  ".concat(days.concat(" Days"))))));
									//tf.setText(resDate);
									//tf.setFont(new Font("Serif", Font.PLAIN, 20));
									//tf.setForeground(Color.red);
								}
							}
							catch(Exception ee){
								JOptionPane.showMessageDialog(null, "Date Of Birth Field Is Empty Or(No Match)");
							}
							
						}
					});
					
				}
				public void key_action(){
					txt_1st.addKeyListener(new KeyListener() {
						
						@Override
						public void keyTyped(KeyEvent evt) {
							// TODO Auto-generated method stub
							char c=evt.getKeyChar();
							if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE){
								getToolkit().beep();
								evt.consume();
								
							}
						}
						
						@Override
						public void keyReleased(KeyEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void keyPressed(KeyEvent arg0) {
							// TODO Auto-generated method stub
							
						}
					});
					txt_2nd.addKeyListener(new KeyListener() {
						
						
						public void keyTyped(KeyEvent evt) {
							
							char c=evt.getKeyChar();
							if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
							{
								getToolkit().beep();
								evt.consume();
								JOptionPane.showMessageDialog(null, "Enter digit");
							}
						}
						
						@Override
						public void keyReleased(KeyEvent evt) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void keyPressed(KeyEvent arg0) {
							// TODO Auto-generated method stub
							
						}
					});
					
						txt_3rd.addKeyListener(new KeyListener() {
						
						
						public void keyTyped(KeyEvent evt) {
							
							char c=evt.getKeyChar();
							if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
							{
								getToolkit().beep();
								evt.consume();
								JOptionPane.showMessageDialog(null, "Enter digit");
							}
						}
						
						@Override
						public void keyReleased(KeyEvent evt) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void keyPressed(KeyEvent arg0) {
							// TODO Auto-generated method stub
							
						}
					});
						txt_4th.addKeyListener(new KeyListener() {
							
							
							public void keyTyped(KeyEvent evt) {
								
								char c=evt.getKeyChar();
								if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
								{
									getToolkit().beep();
									evt.consume();
									//JOptionPane.showMessageDialog(null, "Enter digit");
								}
							}
							
							@Override
							public void keyReleased(KeyEvent evt) {
								// TODO Auto-generated method stub
								
							}
							
							@Override
							public void keyPressed(KeyEvent arg0) {
								// TODO Auto-generated method stub
								
							}
						});
						
						txt_5th.addKeyListener(new KeyListener() {
							
							
							public void keyTyped(KeyEvent evt) {
								
								char c=evt.getKeyChar();
								if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
								{
									getToolkit().beep();
									evt.consume();
									//JOptionPane.showMessageDialog(null, "Enter digit");
								}
							}
							
							@Override
							public void keyReleased(KeyEvent evt) {
								// TODO Auto-generated method stub
								
							}
							
							@Override
							public void keyPressed(KeyEvent arg0) {
								// TODO Auto-generated method stub
								
							}
						});
						txt_6th.addKeyListener(new KeyListener() {
							
							
							public void keyTyped(KeyEvent evt) {
								
								char c=evt.getKeyChar();
								if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
								{
									getToolkit().beep();
									evt.consume();
									//JOptionPane.showMessageDialog(null, "Enter digit");
								}
							}
							
							@Override
							public void keyReleased(KeyEvent evt) {
								// TODO Auto-generated method stub
								
							}
							
							@Override
							public void keyPressed(KeyEvent arg0) {
								// TODO Auto-generated method stub
								
							}
						});
						txt_7th.addKeyListener(new KeyListener() {
							
							
							public void keyTyped(KeyEvent evt) {
								
								char c=evt.getKeyChar();
								if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
								{
									getToolkit().beep();
									evt.consume();
									//JOptionPane.showMessageDialog(null, "Enter digit");
								}
							}
							
							@Override
							public void keyReleased(KeyEvent evt) {
								// TODO Auto-generated method stub
								
							}
							
							@Override
							public void keyPressed(KeyEvent arg0) {
								// TODO Auto-generated method stub
								
							}
						});
						txt_8th.addKeyListener(new KeyListener() {
							
							
							public void keyTyped(KeyEvent evt) {
								
								char c=evt.getKeyChar();
								if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))
								{
									getToolkit().beep();
									evt.consume();
									//JOptionPane.showMessageDialog(null, "Enter digit");
								}
							}
							
							@Override
							public void keyReleased(KeyEvent evt) {
								// TODO Auto-generated method stub
								
							}
							
							@Override
							public void keyPressed(KeyEvent arg0) {
								// TODO Auto-generated method stub
								
							}
						});
					/*	age.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								try{
								java.util.Date date=new java.util.Date();
								DateFormat dateformate=new SimpleDateFormat("yyyy-MM-dd");
								String p_d=(dateformate.format(date).toString());
								String b_d=(dateformate.format(date).toString());
								Date date1=null;
								Date date2=null;
								date1=(Date) dateformate.parse(p_d);
								date2=(Date) dateformate.parse(b_d);
								long date_or=(date1.getDate()-date2.getDate());
								//System.out.println(date1.getDate());
								//System.out.println(date2.getDate());
								String s=Long.toString(date_or);
								tf.setText(s);
								}
								catch(Exception e){
									JOptionPane.showMessageDialog(null, e);
								}
							}
						});*/
				}
				public void date_take(){
					DateFormat date_formate=new SimpleDateFormat("yyyy-MM-dd");
					Date date=new Date();
					String a=date_formate.format(date);
					//int p_d=Integer.parseInt(a);
					txt_p_d.setText(a);
					
					/*DateFormat date_born_date=new SimpleDateFormat("yyyy-MM-dd");
					String b=date_born_date.format(2000).toString();
					int b_d=Integer.parseInt(b);
					int sum=p_d-1995;
					String result=String.valueOf(sum);
					tf.setText(result);*/
					
					
					
					
					//txt_p_d.setText(date_formate.format(date).toString());
				}
public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
{
	javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	//javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	main ma=new main();
	
}
}
