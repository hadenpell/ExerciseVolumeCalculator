import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExerciseView {
  
  private JPanel p;
  private Box b;
  private JTextField name;
  private JComboBox<MuscleGroup> muscleGroup;
  private JLabel setLabel, repLabel, frequencyLabel;
  private JTextField sets,reps,freq;

  //a GUI/visual representation of an Exercise object
  public ExerciseView() {
    
    this.p = new JPanel();
    this.b = Box.createHorizontalBox();
    this.b.setMaximumSize(new Dimension(350, 30));
    this.name = new JTextField();
    this.name.setText("NAME");
    this.name.setPreferredSize(new Dimension(30,30));
    this.muscleGroup = new JComboBox<>();
    this.muscleGroup.setModel(new DefaultComboBoxModel<MuscleGroup>(new MuscleGroup[] { MuscleGroup.BICEP, MuscleGroup.TRICEP, MuscleGroup.CHEST, MuscleGroup.SHOULDERS, MuscleGroup.LEGS, MuscleGroup.BACK }));
    this.setLabel = new JLabel("Sets:");
    this.repLabel = new JLabel("Reps:");
    this.sets = new JTextField();
    this.reps = new JTextField();
    this.frequencyLabel = new JLabel("Freq:");
    this.freq = new JTextField();
    b.add(name);
    b.add(muscleGroup);
    b.add(setLabel);
    b.add(sets);
    b.add(repLabel);
    b.add(reps);
    b.add(frequencyLabel);
    b.add(freq);
    
    
  }
  
  
  //returns the name the user entered
  public String getNameInput() {
    return this.name.getText();
  }
  
  //return the reps the user entered
  public int getRepVolume() {
    
    String input = this.reps.getText();
    int value = 0;
    int frequency=0;
    
    if(input.equals("")) {
      value = 0;
    }
    else {
      value = Integer.parseInt(this.reps.getText());
      frequency = Integer.parseInt(this.freq.getText());
    }
    
    int repVolume = value * frequency;
    
    return repVolume;
  }
  
  //return the total number of sets performed by that exercise
  //that week. Multiplied by frequency
  public int getSetVolume() {
    
    String setInput = this.sets.getText();
    String freqInput = this.freq.getText();
    
    int sets = 0;
    int frequency = 1;
    
    int vol = 0;
    
    //if no input is entered, the sets performed are set to 0
    if(setInput.equals("") || freqInput.equals("")) {
      vol = 0;
    }
    
    else {
    sets = Integer.parseInt(setInput);
    frequency = Integer.parseInt(freqInput);
    
    vol = sets * frequency;
    
    }
    
    return vol;
  }
  
  //returns the muscle group
  public MuscleGroup getGroup() {
    return (MuscleGroup) this.muscleGroup.getSelectedItem();
  }
  
  public JPanel getPanel() {
    return this.p;
  }
  
  public Box getBox() {
    return this.b;
  }


}
