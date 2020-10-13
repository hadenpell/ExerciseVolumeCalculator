import java.util.ArrayList;

public class Model {

  //private ArrayList<Exercise> el; //list of exercises
  
  //weekly volume sets / body part
  private int weeklySets; //total sets
  private int bicepSetVol;
  private int tricepSetVol;
  private int chestSetVol;
  private int legSetVol;
  private int shoulderSetVol;
  private int backSetVol;
  
  public Model() {
    this.weeklySets = 0;
    this.bicepSetVol = 0;
    this.tricepSetVol = 0;
    this.chestSetVol = 0;
    this.legSetVol = 0;
    this.shoulderSetVol = 0;
    this.backSetVol = 0;
  }
  
  public String getStats() {
    
    String sets = "This week's weekly sets, by body part" + "\n";
    String total = "Total sets: " + this.weeklySets + "\n";
    String bicep = "Biceps: " + this.bicepSetVol + "\n";
    String tricep = "Triceps: " + this.tricepSetVol + "\n";
    String chest = "Chest: " + this.chestSetVol + "\n";
    String leg = "Legs: " + this.legSetVol + "\n";
    String shoulder = "Shoulder: " + this.shoulderSetVol + "\n";
    String back = "Back: " + this.backSetVol;
    
    String stats = sets + total + bicep + tricep + chest + leg + shoulder + back;
    
    return stats;
    
  }
  
  //goes through list of exercises and updates set counts
  public void setCounts(ArrayList<ExerciseView> arrayList) {
    for(ExerciseView e: arrayList) {
      this.updateSetCount(e.getSetVolume(), e.getGroup());
    }
  }
  
  //adds x number of sets to a muscle group
  public void updateSetCount(int count, MuscleGroup m) {
    switch(m) {
    case BICEP: 
      this.bicepSetVol += count;
      break;
    case TRICEP:
      this.tricepSetVol+= count;
      break;
    case BACK:
      this.backSetVol+= count;
      break;
    case CHEST:
      this.chestSetVol+= count;
      break;
    case LEGS:
      this.legSetVol+= count;
      break;
    case SHOULDERS:
      this.shoulderSetVol+= count;
      break;
    }
      
      
  }
  
  
  
  
}
