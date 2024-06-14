import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArcadeMain extends JFrame implements ActionListener {
	private JButton[] buttons = new JButton[3];
	//private JPanel mainPanel = new JPanel();
	public static Player player1 = new Player();
	public static Player player2 = new Player();
	public static JButton btnPlayer1 = new JButton("Player 1");
	public static JButton btnPlayer2 = new JButton("Player 2");
	public static JButton btnReset = new JButton("Reset");
	public static JPanel menuPanel = new JPanel();
	JPanel boardPanel = new JPanel();
	JPanel playerPanel = new JPanel();

	public ArcadeMain() {
		// JLabel boardLabel = new JLabel("GAME BOARD");
		// boardPanel.add(boardLabel);
		buttons[0] = new JButton("Jeopardy");
		buttons[0].addActionListener(this);
		buttons[0].setSize(10, 10);
		buttons[1] = new JButton("Tetris");
		buttons[1].addActionListener(this);
		buttons[1].setSize(10, 10);
		buttons[2] = new JButton("Pacman");
		buttons[2].addActionListener(this);
		buttons[2].setSize(10, 10);

		// menuPanel.setBounds(0, 50, 700, 800);
		menuPanel.add(buttons[0]);
		menuPanel.add(buttons[1]);
		menuPanel.add(buttons[2]);
		menuPanel.setPreferredSize(new Dimension(700, 50));
		menuPanel.setBounds(0, 50, 700, 800);
		menuPanel.setBackground(Color.RED);

		boardPanel.setPreferredSize(new Dimension(700, 700));
		boardPanel.setBackground(Color.BLUE);

		btnPlayer1.setSize(10, 10);
		btnPlayer2.setSize(10, 10);
		JLabel score1 = new JLabel("Score:");
		btnReset.addActionListener(this);
		playerPanel.add(btnPlayer1);
		playerPanel.add(btnPlayer2);
		playerPanel.add(btnReset);

		playerPanel.setPreferredSize(new Dimension(700, 100));
		playerPanel.setBounds(0, 800, 700, 50);
		playerPanel.setBackground(Color.lightGray);

		getContentPane().add(menuPanel, BorderLayout.NORTH);
		getContentPane().add(boardPanel, BorderLayout.CENTER);
		getContentPane().add(playerPanel, BorderLayout.SOUTH);

	}

	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		System.out.println(source.getActionCommand());
		if (source.getActionCommand().equals("Jeopardy")) {
			boardPanel.removeAll();
			buttons[0].setEnabled(false);
			buttons[1].setEnabled(true);
			buttons[2].setEnabled(true);
			btnReset.setEnabled(true);
			add(boardPanel);
			boardPanel.add(loadJeopardy());
			player1.reset();
			player2.reset();
			source.setEnabled(false);
			setVisible(false);
			setVisible(true);
		} else if (source.getActionCommand().equals("Tetris")) {
			boardPanel.removeAll();
			buttons[0].setEnabled(true);
			buttons[1].setEnabled(false);
			buttons[1].setEnabled(false);
			player1.reset();
			player2.reset();
			add(boardPanel);
			this.revalidate();
			setVisible(false);
			this.repaint();
			boardPanel.add(loadTetris(), BorderLayout.CENTER);
			btnReset.setEnabled(true);
			source.setEnabled(false);
			setVisible(true);
		} else if (source.getActionCommand().equals("Pacman")) {
			boardPanel.removeAll();
			buttons[0].setEnabled(true);
			buttons[1].setEnabled(true);
			buttons[2].setEnabled(false);
			player1.reset();
			player2.reset();
			add(boardPanel);
			this.revalidate();
			setVisible(false);
			this.repaint();
			boardPanel.add(loadPacman(), BorderLayout.CENTER);
			btnReset.setEnabled(true);
			source.setEnabled(false);
			setVisible(true); 
		}
		else if (source.getActionCommand().equals("Reset")) {
			boardPanel.removeAll();
			// remove(boardPanel);
			player1.reset();
			player2.reset();
			btnPlayer1.setText("Player 1");
			btnPlayer2.setText("Player 2");
			buttons[0].setEnabled(true);
			buttons[1].setEnabled(true);
			this.revalidate();
			setVisible(false);
			this.repaint();
			source.setEnabled(false);
			setVisible(true);
		}

	}

	public static void main(String[] args) {
		UIManager.put("Button.margin", new Insets(5, 5, 0, 0));
		ArcadeMain frame = new ArcadeMain();

		frame.setSize(800, 1000);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// frame.pack();
		frame.setVisible(true);
		// frame.setResizable(true);
	}

	public static Jeopardy loadJeopardy() {
		Jeopardy jeopardy = new Jeopardy(player1, player2);
		return jeopardy;

	}

	public static Tetris loadTetris() {
		Tetris tetris = new Tetris();
		return tetris;

	}
	public static Pacman loadPacman() {
		Pacman pacman = new Pacman();
		return pacman;

	}

	public static void addMenu() {

	}
}