import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectedArea extends JFrame {

	private JFrame frmSelectAreaIn;
	private JPanel selectedAreaPanel;
	static JPanel selected1;
	static Component c;
	int check=0;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	static JPanel selected2;
	private JPanel selected3;
	private JPanel selected4;
	private JButton btnAnalyse;
	static BufferedImage x1;
	BufferedImage x2;
	BufferedImage x3;
	BufferedImage x4;
	static int grey=0;
	static int values []=new int [4];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectedArea window = new SelectedArea();
					window.frmSelectAreaIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public SelectedArea() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frmSelectAreaIn = new JFrame();
		frmSelectAreaIn.setTitle("Select Area In Image");
		frmSelectAreaIn.setBounds(100, 100, 1650, 1200);
		frmSelectAreaIn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frmSelectAreaIn.getContentPane().setLayout(null);
		
	
		
		
		// Image Panel display selected area of the image
		selectedAreaPanel = new JPanel();
		selectedAreaPanel.setBounds(740, 36, 338, 204);
		frmSelectAreaIn.getContentPane().add(selectedAreaPanel);
		
		deneme2 x= new deneme2();
	
		// Image Panel display image with graphics
		JPanel mainPanel = new ImagePanel( x.o, this); 
		mainPanel.setBounds(10, 11, 710, 707);
		frmSelectAreaIn.getContentPane().add(mainPanel); 
		
		JLabel lblSelectedArea = new JLabel("Selected Area");
		lblSelectedArea.setBounds(871, 11, 221, 14);
		frmSelectAreaIn.getContentPane().add(lblSelectedArea);
		
		selected1 = new JPanel();
		selected1.setBounds(771, 251, 245, 224);
		frmSelectAreaIn.getContentPane().add(selected1);
		Component[] components = selected1.getComponents();  
		
		
		JButton btnAdd = new JButton("add1");
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

	updateSelectedRegion1(ImagePanel.nb);
	x1=ImagePanel.nb;

//	System.out.println(x1.getRGB(0, 0));
//	System.out.println(x1.getRGB(10, 10));
//	System.out.println(x1.getWidth());
//	System.out.println(x1.getHeight());


int r=0;
int gr=0;
int b=0;
int sum=0;
final int gw=x1.getWidth();
final int gh = x1.getHeight();
//System.out.println(gh);
//System.out.println(gw);

	for(int i=0;i<gw-1;i++) {
		for(int ii= gh-1;ii>0;ii--) {
     	Color c=new Color(x1.getRGB(i, ii));
		 r=c.getRed();
			 gr=c.getGreen();
			 b=c.getBlue();
			grey=(r+gr+b)/3;
			 System.out.print(r+" ");
			 System.out.print(b+" ");
			 System.out.print(gr+" ");
			 System.out.println();
			 
			sum+=grey; 
			
		}
	}
	
	
	System.out.println("-------"+sum/(gw*gh)+"----------------");
values[0]=sum/(gw*gh);

			}
		});


		btnAdd.setBounds(1177, 36, 89, 23);
		frmSelectAreaIn.getContentPane().add(btnAdd);
		
		button = new JButton("add2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			updateSelectedRegion2(ImagePanel.nb);
			x2=ImagePanel.nb;
			int r=0;
			int gr=0;
			int b=0;
			int sum=0;
			final int gw=x2.getWidth();
			final int gh = x2.getHeight();
				for(int i=0;i<gw-1;i++) {
					for(int ii= gh-1;ii>0;ii--) {
			     	Color c=new Color(x2.getRGB(i, ii));
					 r=c.getRed();
						 gr=c.getGreen();
						 b=c.getBlue();
						 System.out.print(r+" ");
						 System.out.print(b+" ");
						 System.out.print(gr+" ");
						 System.out.println();
						grey=(r+gr+b)/3;
						sum+=grey; 
						
					}
				}
	
				System.out.println("-------"+sum/(gw*gh)+"----------------");
				values[1]=sum/(gw*gh);
			}
		});
		button.setBounds(1177, 83, 89, 23);
		frmSelectAreaIn.getContentPane().add(button);
		
		button_1 = new JButton("add3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateSelectedRegion3(ImagePanel.nb);
				x3=ImagePanel.nb;
				int r=0;
				int gr=0;
				int b=0;
				int sum=0;
				final int gw=x3.getWidth();
				final int gh = x3.getHeight();
					for(int i=0;i<gw-1;i++) {
						for(int ii= gh-1;ii>0;ii--) {
				     	Color c=new Color(x3.getRGB(i, ii));
						 r=c.getRed();
							 gr=c.getGreen();
							 b=c.getBlue();
							 System.out.print(r+" ");
							 System.out.print(b+" ");
							 System.out.print(gr+" ");
							 System.out.println();
							grey=(r+gr+b)/3;
							sum+=grey; 
							
						}
					}
		
					System.out.println("-------"+sum/(gw*gh)+"----------------");
					values[2]=sum/(gw*gh);
			}
		});
		button_1.setBounds(1177, 129, 89, 23);
		frmSelectAreaIn.getContentPane().add(button_1);
		
		button_2 = new JButton("add4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateSelectedRegion4(ImagePanel.nb);
				x4=ImagePanel.nb;
				int r=0;
				int gr=0;
				int b=0;
				int sum=0;
				final int gw=x4.getWidth();
				final int gh = x4.getHeight();
					for(int i=0;i<gw-1;i++) {
						for(int ii= gh-1;ii>0;ii--) {
				     	Color c=new Color(x4.getRGB(i, ii));
						 r=c.getRed();
							 gr=c.getGreen();
							 b=c.getBlue();
							 System.out.print(r+" ");
							 System.out.print(b+" ");
							 System.out.print(gr+" ");
							 System.out.println();
							grey=(r+gr+b)/3;
							sum+=grey; 
							
						}
					}
		
					System.out.println("-------"+sum/(gw*gh)+"----------------");
					values[3]=sum/(gw*gh);
			}
		});
		button_2.setBounds(1177, 180, 89, 23);
		frmSelectAreaIn.getContentPane().add(button_2);
		System.out.println(x1);
		selected2 = new JPanel();
		selected2.setBounds(771, 486, 245, 232);
		frmSelectAreaIn.getContentPane().add(selected2);
		
		selected3 = new JPanel();
		selected3.setBounds(1082, 251, 245, 224);
		frmSelectAreaIn.getContentPane().add(selected3);
		
		selected4 = new JPanel();
		selected4.setBounds(1082, 486, 245, 232);
		frmSelectAreaIn.getContentPane().add(selected4);
		System.out.println(values[0]);
		btnAnalyse = new JButton("analyse");
		btnAnalyse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graph.main(null);
			
			}
		});
		btnAnalyse.setBounds(1177, 217, 89, 23);
		frmSelectAreaIn.getContentPane().add(btnAnalyse);
		
	}
	  BufferedImage createImage(JPanel panel) {    
	        int w = panel.getWidth();
	        int h = panel.getHeight();
	        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	        Graphics2D g = bi.createGraphics();
	        panel.paint(g);
	        return bi;
	    }
	public void updateSelectedRegion1(BufferedImage bufferedImage) {
		Graphics g = selected1.getGraphics();
		g.clearRect(0, 0, 400, 400);
    	g.drawImage(bufferedImage, 0, 0, null);
	}
	public void updateSelectedRegion2(BufferedImage bufferedImage) {
		Graphics g = selected2.getGraphics();
		g.clearRect(0, 0, 400, 400);
    	g.drawImage(bufferedImage, 0, 0, null);
	}
	public void updateSelectedRegion3(BufferedImage bufferedImage) {
		Graphics g = selected3.getGraphics();
		g.clearRect(0, 0, 400, 400);
    	g.drawImage(bufferedImage, 0, 0, null);
	}
	public void updateSelectedRegion4(BufferedImage bufferedImage) {
		Graphics g = selected4.getGraphics();
		g.clearRect(0, 0, 400, 400);
    	g.drawImage(bufferedImage, 0, 0, null);
	}
	
	
	// function to update selected region of the image
	public void updateSelectedRegion(BufferedImage bufferedImage) {
		Graphics g = selectedAreaPanel.getGraphics();
		g.clearRect(0, 0, 400, 400);
    	g.drawImage(bufferedImage, 0, 0, null);
    
    	

	}

	public void run() {
		try {
			SelectedArea window = new SelectedArea();
			window.frmSelectAreaIn.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}