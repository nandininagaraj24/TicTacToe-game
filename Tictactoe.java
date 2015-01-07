package game;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Tictactoe extends JFrame {
	
	Main main = new Main();
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JButton button4;
	public JButton button5;
	public JButton button6;
	public JButton button7;
	public JButton button8;
	public JButton button9;
	public JButton quit;
	public JButton replay;
	
	public Tictactoe()
	{
		initComponents();
	}
	private void button1ActionPerformed(ActionEvent e)
	{
		if(button1.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button1.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button1.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
		
	}
	private void button2ActionPerformed(ActionEvent e)
	{
		if(button2.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button2.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button2.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
	}
	private void button3ActionPerformed(ActionEvent e)
	{
		if(button3.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button3.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button3.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
	}
	private void button4ActionPerformed(ActionEvent e)
	{
		if(button4.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button4.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button4.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
	}
	private void button5ActionPerformed(ActionEvent e)
	{
		if(button5.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button5.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button5.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
	}
	private void button6ActionPerformed(ActionEvent e)
	{
		if(button6.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button6.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button6.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
	}
	private void button7ActionPerformed(ActionEvent e)
	{
		if(button7.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button7.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button7.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
	}
	private void button8ActionPerformed(ActionEvent e)
	{
		if(button8.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button8.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button8.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
	}
	private void button9ActionPerformed(ActionEvent e)
	{
		if(button9.getText().equals(""))
		{
			if(Main.playerTurn==true)
			{
				button9.setText("X");
				Main.checkForWin();
				Main.playerTurn=false;
			}
			else
			{
				button9.setText("O");
				Main.checkForWin();
				Main.playerTurn=true;
			}
		}
	}
	private void quitActionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	private void replayActionPerformed(ActionEvent e)
	{
		
			button1.setText(" ");
			button2.setText(" ");
			button3.setText(" ");
			button4.setText(" ");
			button5.setText(" ");
			button6.setText(" ");
			button7.setText(" ");
			button8.setText(" ");
			button9.setText(" ");
			
			
		
	}
	public void initComponents()
	{
		button1= new JButton();
		button2= new JButton();
		button3= new JButton();
		button4= new JButton();
		button5= new JButton();
		button6= new JButton();
		button7= new JButton();
		button8= new JButton();
		button9= new JButton();
		quit= new JButton("QUIT");
		replay= new JButton("REPLAY");
		setTitle("Tic-Tac-Toe game");
		JPanel contentPane= new JPanel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		//contentPane.setLayout(contentPaneLayout);
		JFrame f=new JFrame();
		
		
		button1.setBounds(10,10,50,30);
		button2.setBounds(60,10,50,30);
		button3.setBounds(110,10,50,30);
		button4.setBounds(10,70,50,30);
		button5.setBounds(60,70,50,30);
		button6.setBounds(110,70,50,30);
		button7.setBounds(10,130,50,30);
		button8.setBounds(60,130,50,30);
		button9.setBounds(110,130,50,30);
		quit.setBounds(20, 200, 100, 30);
		replay.setBounds(140, 200, 100, 30);
		f.add(button1);	
		f.add(button2);
		f.add(button3);
		f.add(button4);
		f.add(button5);
		f.add(button6);
		f.add(button7);
		f.add(button8);
		f.add(button9);
		f.add(replay);
		f.add(quit);
		f.add(contentPane);
		f.setSize(350, 350);
		f.setVisible(true);
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				button1ActionPerformed(e);
			}
		});
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				button2ActionPerformed(e);
			}
		});
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				button3ActionPerformed(e);
			}
		});
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				button4ActionPerformed(e);
			}

			
		});
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				button5ActionPerformed(e);
				
			}
		});
		button6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				button6ActionPerformed(e);
				
			}			
			
		});
		button7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				button7ActionPerformed(e);
				
			}
			
		});
		button8.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				button8ActionPerformed(e);
				
			}
			
		});
		button9.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				button9ActionPerformed(e);
				
			}
			
		});
		quit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				quitActionPerformed(e);
			}
			
		});
		replay.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				replayActionPerformed(e);
			}
			
		});
		
	}
}
