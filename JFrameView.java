import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JFrameView extends JFrame {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private JPanel p;
  private JScrollPane jsp;
  private Box b;
  private JButton add, calculate;
  private ArrayList<ExerciseView> eList;
  
  public JFrameView() {
    
    getContentPane().setForeground(Color.RED);
    setBounds(0, 0, 500, 442);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
   
    
    //create panel, box, and scrollpane
    p = new JPanel();
    p.setBackground(Color.WHITE);
    b = Box.createVerticalBox();
    jsp = new JScrollPane(b);
    jsp.setPreferredSize(new Dimension(450,370));
    
    p.add(jsp);
    
    //create buttons
    add = new JButton("Add exercise");
    add.setActionCommand("Add");
    calculate = new JButton("Calculate my volume");
    calculate.setActionCommand("Calculate");
    
    
    //add add and calculate buttons to panel
    p.add(add);
    p.add(calculate);
    this.add(p); //add panel to frame
    
    eList = new ArrayList<ExerciseView>();
    
    this.setVisible(true);
    
  }

  //sets action listeners
  public void setActionListener(ActionListener a) {
    add.addActionListener(a);
    calculate.addActionListener(a);
  }
  
  //adds a new exerciseview to box
  public void addExView() {
    
    ExerciseView ev = new ExerciseView();
    //create an exercise object from user input
    //Exercise e = new Exercise(ev.getGroup(), ev.getNameInput(), 0);
    
    b.add(ev.getBox());
    eList.add(ev); //add exercise to list of exercises 
    b.repaint();
    b.revalidate();
    
  }
  
  public ArrayList<ExerciseView> getList() {
    return this.eList;
  }
  
  //prints stats passed to it
  public void printStats(String stats) {
    System.out.println(stats);
  }

  

  
}
