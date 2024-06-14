import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tetris extends Game implements ActionListener, MouseListener {
	JPanel questionPanel, boardPanel;
	JLabel header;
	public Tetris() {
		super(1);
		header = new JLabel("GAME OF TETRIS");
		boardPanel = new JPanel(new GridLayout(5, 4, 1, 1));
		boardPanel.setPreferredSize(new Dimension(700, 700));
		boardPanel.setBackground(Color.GREEN);
		boardPanel.setBounds(0, 50, 700, 800);
		boardPanel.add(header);
		boardPanel.addMouseListener(this);
		add(boardPanel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("X: "+e.getX()+" y: "+e.getY());
	//	Graphics g = e.
		
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
