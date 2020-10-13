import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

  private JFrameView v;
  private Model m;
  
  Controller(JFrameView v, Model m) {
    this.v = v;
    this.m = m;//prints out stats that model has manipulated
    v.setActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()) {
    case "Add": 
      v.addExView();
      break;
    case "Calculate":
      m.setCounts(v.getList());
      v.getList().clear();
      v.printStats(m.getStats());
      break;
    }
    
  }

}
