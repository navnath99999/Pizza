
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 
public  class pizza extends JFrame implements MouseListener  {
//JFrame f = new JFrame();
	static String k,k1,k2,k4,k5,k6;
	static int k3,u;
static JFrame f1 = new JFrame();
static JFrame f2= new JFrame();
static JFrame f3=new JFrame();
static JFrame f4=new JFrame();
static JFrame f5=new JFrame();
static JFrame f6=new JFrame();
 

static  JButton b3=new JButton("WELCOME "); 
  static  JButton b1=new JButton("LOGIN"); 
  static JLabel a=new JLabel("OR");
  static  JButton b2=new JButton("CREATE");
 static ImageIcon logo = new ImageIcon("pizza.jpg");
 static JButton x = new JButton(logo);
  
  JLabel l1=new JLabel("UserName");
	JLabel l2=new JLabel("Password");
	static JButton B1=new JButton("LOGIN");
 static ImageIcon logo2 = new ImageIcon("pizza.jpg");
 static JButton x2= new JButton(logo2);
  
	 JTextField t1=new JTextField(""); 
	 JTextField t2=new JTextField("");
	 
		JLabel L1=new JLabel("UserName");
		JLabel L2=new JLabel("Password");
		 JLabel L3=new JLabel("EmailId");
			JLabel L4=new JLabel("Mobile no");
			static JButton B2=new JButton("SUBMIT");
			static JButton c=new JButton("CANCEL");
			 JTextField T1=new JTextField(""); 
			 JTextField T2=new JTextField("");
			 JTextField T3=new JTextField(""); 
			 JTextField T4=new JTextField("");

			  static  JButton v=new JButton("VEG"); 
			  static JLabel o=new JLabel("OR");
			  static  JButton n=new JButton("NON VEG");
			  static  JButton ba2=new JButton("BACK");
 static ImageIcon logo1 = new ImageIcon("my-pizzamania.png");
 static JButton x1 = new JButton(logo1);
			  
			  JLabel m=new JLabel("VEG PIZZA MENU");
			  JLabel M=new JLabel("Deluxe Veggie");
			  JLabel fa=new JLabel("Cheese and corn");
			  JLabel pp=new JLabel("Paneer Tikka:");
			  JLabel de=new JLabel("");
			  JLabel s=new JLabel("Regular");
			  JLabel me=new JLabel("Medium");
			  JLabel l=new JLabel("Large");
			  static  JButton pl=new JButton("+");
			  static  JButton su=new JButton("SUBMIT");
			  static  JButton ba=new JButton("BACK");
			  static  JButton s1=new JButton("150");
			  static  JButton m1=new JButton("200");
			  static  JButton la1=new JButton("325");
			  
			  static  JButton s2=new JButton("175");
			  static  JButton m2=new JButton("375");
			  static  JButton la2=new JButton("475");
			  
			  static  JButton s3=new JButton("160");
			  static  JButton m3=new JButton("290");
			  static  JButton la3=new JButton("340");
			  
			  static  JButton s4=new JButton("");
			  static  JButton m4=new JButton("");
			  static  JButton la4=new JButton("");
			  
			  JLabel n1=new JLabel("NON VEG PIZZA MENU");
			  JLabel M1=new JLabel("Chicken Tikka");
			  JLabel fa1=new JLabel("Pepper Barbecue Chicken");
			  JLabel pp1=new JLabel("Non-Veg Supreme");
			  JLabel de1=new JLabel("");
			  JLabel sa=new JLabel("Regular");
			  JLabel me1=new JLabel("Medium");
			  JLabel lar=new JLabel("Large");
			  static  JButton pl1=new JButton("+");
			 static  JButton su1=new JButton("SUBMIT");
			  static  JButton ba1=new JButton("BACK");
			  
			  static  JButton s11=new JButton("210");
			  static  JButton m11=new JButton("370");
			  static  JButton la11=new JButton("500");
			  
			  static  JButton s22=new JButton("220");
			  static  JButton m22=new JButton("380");
			  static  JButton la22=new JButton("525");
			  
			  static  JButton s33=new JButton("190");
			  static  JButton m33=new JButton("325");
			  static  JButton la33=new JButton("425");
			  
			  static  JButton s44=new JButton("");
			  static  JButton m44=new JButton("");
			  static  JButton la44=new JButton("");
			  
			  JLabel tp=new JLabel("TOTAL PRICE");
			  JLabel tq=new JLabel("THANK YOU");
			  static  JTextField T7=new JTextField("");
			  static  JButton TP=new JButton("TOTAL PRICE");
static ImageIcon logo3 = new ImageIcon("pp.jpg");
 static JButton x3 = new JButton(logo3);
			  
			  
			  
			  
   public void pizza() {
	   x.setBounds(100,100,1000,1000);
	   b1.setBounds(120,50,100,50);
	   a.setBounds(240,50,50,30);
	   b2.setBounds(270,50,100,50);
		 l1.setBounds(100,100, 100,30);
		 l2.setBounds(100,150, 100,30);
		   B1.setBounds(100,200,100,30);
		    t1.setBounds(300,100,100,30);
		    t2.setBounds(300,150,100,30);
x2.setBounds(550,50,800,800);
			f1.add(l1);
			f1.add(l2);
			f1.add(B1);
			f1.add(t1);
			f1.add(t2);
f1.add(x2);
			  f1.setSize(1000,800);  
			    f1.setLayout(null);
			    
			    L1.setBounds(50,100, 100,30);
			    L2.setBounds(50,150, 100,30);
			    L3.setBounds(50,200, 100,30);
			    L4.setBounds(50,250, 100,30);
			    B2.setBounds(100,300,100,30);
			    T1.setBounds(200,100,100,30);
			    T2.setBounds(200,150,100,30);
			    T3.setBounds(200,200,100,30);
			    T4.setBounds(200,250,100,30);
			    c.setBounds(250,300,100,30);
			    f2.add(L1);
				f2.add(L2);
				f2.add(L3);
				f2.add(L4);
				f2.add(B2);
				f2.add(T1);
				f2.add(T2);
				f2.add(T3);
				f2.add(T4);
				f2.add(c);
				  f2.setSize(500,500);  
				    f2.setLayout(null); 
				    
				    v.setBounds(100,100,100,50);
					   o.setBounds(220,100,50,30);
					   n.setBounds(250,100,100,50);
					   ba2.setBounds(450,450,100,30);
x1.setBounds(150,200,270,270);
					   f3.add(v);
					   f3.add(o);
					   f3.add(n);
                                            f3.add(x1);
					   f3.add(ba2);
					   f3.setSize(600,600);  
					    f3.setLayout(null);
					    
					    m.setBounds(50,50,200,50);
					    M.setBounds(50,150,100,50);
					    fa.setBounds(50,200,100,50);
					    pp.setBounds(50,250,100,50);
					    de.setBounds(50,300,100,50);
					    s.setBounds(230,120,50,30);
					    me.setBounds(300,120,50,30);
					    l.setBounds(380,120,50,30);
					    s1.setBounds(220,170,80,20);
					    m1.setBounds(290,170,80,20);
					    la1.setBounds(360,170,80,20);
					    s2.setBounds(220,220,80,20);
					    m2.setBounds(290,220,80,20);
					    la2.setBounds(360,220,80,20);
					    s3.setBounds(220,270,80,20);
					    m3.setBounds(290,270,80,20);
					    la3.setBounds(360,270,80,20);
					    s4.setBounds(220,320,80,20);
					    m4.setBounds(290,320,80,20);
					    la4.setBounds(360,320,80,20);			   
					    ba.setBounds(400,380,100,30);
					    su.setBounds(250,380,100,30);
					    pl.setBounds(50,450,50,30);
					    
					    f4.add(m); f4.add(m1);  f4.add(la1);  f4.add(la4);  
					    f4.add(M);  f4.add(s1);  f4.add(s2);  f4.add(m4);  
					    f4.add(fa);  f4.add(l);  f4.add(m2);  f4.add(s4);  f4.add(su);
					    f4.add(pp);  f4.add(me);  f4.add(la2);  f4.add(la3);  f4.add(pl);  
					    f4.add(de); f4.add(s);  f4.add(s3);  f4.add(m3);  f4.add(ba);
					    f4.setSize(600,600);  
					    f4.setLayout(null);
					    
					    n1.setBounds(50,50,200,50);
					    M1.setBounds(20,150,140,50);
					    fa1.setBounds(20,200,140,50);
					    pp1.setBounds(20,250,140,50);
					    de1.setBounds(20,300,140,50);
					    sa.setBounds(230,120,50,30);
					    me1.setBounds(300,120,50,30);
					    lar.setBounds(380,120,50,30);
					    s11.setBounds(220,170,80,20);
					    m11.setBounds(290,170,80,20);
					    la11.setBounds(360,170,80,20);
					    s22.setBounds(220,220,80,20);
					    m22.setBounds(290,220,80,20);
					    la22.setBounds(360,220,80,20);
					    s33.setBounds(220,270,80,20);
					    m33.setBounds(290,270,80,20);
					    la33.setBounds(360,270,80,20);
					    s44.setBounds(220,320,80,20);
					    m44.setBounds(290,320,80,20);
					    la44.setBounds(360,320,80,20);
					    ba1.setBounds(400,380,100,30);
					    su1.setBounds(250,380,100,30);
					    pl1.setBounds(50,450,50,30);
					    f5.add(n1); f5.add(m11);  f5.add(la11);  f5.add(la44);  
					    f5.add(M1);  f5.add(s11);  f5.add(s22);  f5.add(m44);  f5.add(su1);
					    f5.add(fa1);  f5.add(lar);  f5.add(m22);  f5.add(s44);  f5.add(pl1);
					    f5.add(pp1);  f5.add(me1);  f5.add(la22);  f5.add(la33);    f5.add(ba1);
					    f5.add(de1); f5.add(sa);  f5.add(s33);  f5.add(m33); 
					    f5.setSize(600,600);  
					    f5.setLayout(null);
					    
					    tp.setBounds(100,100,100,30);
					    tq.setBounds(200,400,100,30);
					    T7.setBounds(250,100,200,30);
					    TP.setBounds(50,50,200,30);
x3.setBounds(50,300,300,300);
						   f6.add(tp);
						   f6.add(tq);
						   f6.add(T7);
						   f6.add(TP);
f6.add(x3);
						   f6.setSize(600,600);  
						    f6.setLayout(null);
					    
					
   }


	

	

   public static void main(String[] args) {
	   JFrame f = new JFrame();
	   f.add(b1); 
	    f.add(b2);
	    f.add(b3);
	    f.add(a);
	    f.add(x);
	    f.setSize(700,700);  
	    f.setLayout(null);  
	    f.setVisible(true);
	   pizza t=new pizza();
	  t.pizza();
	   
	    b1.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		f1.setVisible(true);
	    		
	    	}  
	    	});  

	    b2.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		f2.setVisible(true);
	    		
	    	}  
	    	});  
	    
	    // b3
	    b3.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		f1.setVisible(true);
	    		
	    	}  
	    	});  
	    
	    
	    
	    	su.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		f6.setVisible(true);
	    		
	    	}  
	    	}); 
	    	 su1.addActionListener(new ActionListener(){  
	 	    	public void actionPerformed(ActionEvent e){  
	 	    		f6.setVisible(true);
	 	    		
	 	    	}  
	 	    	});  
	    	B2.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		f1.setVisible(true);
		    		
		    	}  
		    	}); 
	    	B1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		f3.setVisible(true);
		    		
		    	}  
		    	}); 
	    	v.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		f4.setVisible(true);
		    		
		    	}  
		    	}); 
	    	n.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		f5.setVisible(true);
		    		
		    	}  
		    	}); 
	    	c.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		f.setVisible(true);
		    		
		    	}  
		    	}); 
	    	ba.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		f3.setVisible(true);
		    		
		    	}  
		    	}); 
	    	ba1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		f3.setVisible(true);
		    		
		    	}  
		    	}); 
	    	ba2.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		f2.setVisible(true);
		    		
		    	}  
		    	}); 
	    	pl1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		 if(e.getSource()==pl1)
		    	        {
		    	            k4 = T7.getText();
		    	            T7.setText("");
		    	            k3=1;
		    	 
		    	        }
		    		
		    	}  
		    	}); 
	     	pl.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		 if(e.getSource()==pl)
		    	        {
		    	            k4 = T7.getText();
		    	            T7.setText("");
		    	            k3=2;
		    	 
		    	        }
		    		
		    	}  
		    	});
	     	TP.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==TP)
		            {
		                k5 = T7.getText();
		                if(k3==1)
		                {
		                    u= Integer.parseInt(k4)+Integer.parseInt(k5);
		                    T7.setText(String.valueOf(u));
		                }
		                else
		                
		                {
		                    u = Integer.parseInt(k4)+Integer.parseInt(k5);
		                    T7.setText(String.valueOf(u));
		                }
		    		
		    	}  
		    	}}); 
	     /*	TP.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==TP)
		            {
		                k5 = T7.getText();
		                k6= T7.getText();
		                if(k3==1)
		                {
		                    u= Integer.parseInt(k4)+Integer.parseInt(k5)+Integer.parseInt(k6);
		                    T7.setText(String.valueOf(u));
		                }
		                else
		                
		                {
		                    u = Integer.parseInt(k4)+Integer.parseInt(k5)+Integer.parseInt(k6);
		                    T7.setText(String.valueOf(u));
		                }
		    		
		    	}  
		    	}}); */
	    /*	pl.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==pl)
		            {
		                k1 = T7.getText();
		                k2 = "+";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});*/
	   
	    	s1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==s1)
		            {
		                k1 = T7.getText();
		                k2 = "109";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	m1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==m1)
		            {
		                k1 = T7.getText();
		                k2 = "209";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	la1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==la1)
		            {
		                k1 = T7.getText();
		                k2 = "351";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	s2.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==s2)
		            {
		                k1 = T7.getText();
		                k2 = "109";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	m2.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==m2)
		            {
		                k1 = T7.getText();
		                k2 = "209";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	la2.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==la2)
		            {
		                k1 = T7.getText();
		                k2 = "351";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	s3.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==s3)
		            {
		                k1 = T7.getText();
		                k2 = "99";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	m3.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==m3)
		            {
		                k1 = T7.getText();
		                k2 = "199";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	la3.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==la3)
		            {
		                k1 = T7.getText();
		                k2 = "329";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	s4.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==s4)
		            {
		                k1 = T7.getText();
		                k2 = "99";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	m4.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==m4)
		            {
		                k1 = T7.getText();
		                k2 = "199";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	la4.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==la4)
		            {
		                k1 = T7.getText();
		                k2 = "329";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    
	    /*	pl1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==pl1)
		            {
		                k1 = T7.getText();
		                k2 = "+";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});*/
	    	s11.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==s11)
		            {
		                k1 = T7.getText();
		                k2 = "139";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	m11.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==m11)
		            {
		                k1 = T7.getText();
		                k2 = "249";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	la11.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==la11)
		            {
		                k1 = T7.getText();
		                k2 = "399";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	s22.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==s22)
		            {
		                k1 = T7.getText();
		                k2 = "139";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	m22.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==m22)
		            {
		                k1 = T7.getText();
		                k2 = "249";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	la22.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==la22)
		            {
		                k1 = T7.getText();
		                k2 = "399";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	s33.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==s33)
		            {
		                k1 = T7.getText();
		                k2 = "120";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	m33.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==m33)
		            {
		                k1 = T7.getText();
		                k2 = "229";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	la33.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==la33)
		            {
		                k1 = T7.getText();
		                k2 = "409";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	s44.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==s44)
		            {
		                k1 = T7.getText();
		                k2 = "120";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	m44.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==m44)
		            {
		                k1 = T7.getText();
		                k2 = "229";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	la44.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		if(e.getSource()==la44)
		            {
		                k1 = T7.getText();
		                k2 = "409";
		                k = k1+k2;
		                T7.setText(k);
		            }
		    		
		    	}  
		    	});
	    	
	    	
	  
	   
   }


@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}


