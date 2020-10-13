import java.util.ArrayList;

public class Model {

  
  //weekly volume sets / body part
  private int weeklySets, weeklyReps; //total sets and reps
  private int bicepSetVol, bicepReps, totalBicep;
  private int tricepSetVol, tricepReps, totalTricep;
  private int chestSetVol, chestReps, totalChest;
  private int legSetVol, legReps, totalLegs;
  private int shoulderSetVol, shoulderReps, totalShoulder;
  private int backSetVol, backReps, totalBack;
  
  public Model() {
    this.weeklySets = 0;
    this.weeklyReps = 0;
    
    this.bicepSetVol = 0;
    this.tricepSetVol = 0;
    this.chestSetVol = 0;
    this.legSetVol = 0;
    this.shoulderSetVol = 0;
    this.backSetVol = 0;
    
    this.bicepReps = 0;
    this.tricepReps = 0;
    this.chestReps = 0;
    this.legReps = 0;
    this.shoulderReps = 0;
    this.backReps = 0;
    
    this.totalBicep = 0;
    this.totalTricep = 0;
    this.totalChest = 0;
    this.totalLegs = 0;
    this.totalShoulder = 0;
    this.totalBack = 0;
  }
  
  public String getStats() {
    
    
    String sets = "This week's weekly sets & reps, by body part" + "\n";
    String totalSets = "Total sets: " + this.weeklySets + "\n";
    String totalReps = "Total reps: " + this.weeklyReps + "\n";
    
    String bicep = "Biceps: " + "Sets: " + this.bicepSetVol + " Reps: " + this.bicepReps + ", Total bicep "
        + "volume: " + this.totalBicep + "\n";
    String tricep = "Triceps: " + this.tricepSetVol + " Reps: " + this.tricepReps + ", Total tricep "
        + "volume: " + this.totalTricep + "\n";
    String chest = "Chest: " + this.chestSetVol + " Reps: " + this.chestReps + ", Total chest "
        + "volume: " + this.totalChest + "\n";
    String leg = "Lets: " + this.legSetVol + " Reps: " + this.legReps + ", Total legs "
        + "volume: " + this.totalLegs + "\n";
    String shoulder = "Shoulder: " + this.shoulderSetVol + " Reps: " + this.shoulderReps + ", Total shoulder "
        + "volume: " + this.totalShoulder + "\n";
    String back = "Back: " + this.backSetVol + " Reps: " + this.backReps + ", Total back "
        + "volume: " + this.totalBack + "\n";
    
    
    String stats = sets + totalSets + totalReps + bicep + tricep + chest + leg + shoulder + back;
    
    return stats;
    
  }
  
  //goes through list of exercises and updates set counts
  public void setCounts(ArrayList<ExerciseView> arrayList) {
    for(ExerciseView e: arrayList) {
   
      this.updateCounts(e.getSetVolume(), e.getRepVolume(), e.getGroup());
    }
  }
  
  //gets the 
  public void updateCounts(int setCount, int repCount, MuscleGroup m) {
    switch(m) {
    case BICEP: 
      this.bicepSetVol += setCount;
      this.bicepReps += repCount;
      this.weeklySets += setCount;
      this.weeklyReps +=repCount;
      
      int bVol = bicepSetVol * bicepReps;
      this.totalBicep+= bVol;

      break;
    case TRICEP:
      this.tricepSetVol += setCount;
      this.tricepReps += repCount;
      this.weeklySets += setCount;
      this.weeklyReps +=repCount;
      
      int tVol = tricepSetVol * tricepReps;
      this.totalTricep+= tVol;

      break;
    case BACK:
      this.backSetVol += setCount;
      this.backReps += repCount;
      this.weeklySets += setCount;
      this.weeklyReps +=repCount;

      int baVol = backSetVol * backReps;
      this.totalBack+= baVol;
      
      break;
    case CHEST:
      this.chestSetVol += setCount;
      this.chestReps += repCount;
      this.weeklySets += setCount;
      this.weeklyReps +=repCount;
      
      int cVol = chestSetVol * chestReps;
      this.totalChest+= cVol;
      
      break;
    case LEGS:
      this.legSetVol+= setCount;
      this.legReps += repCount;
      this.weeklySets += setCount;
      this.weeklyReps +=repCount;
      
      int lVol = legSetVol * legReps;
      this.totalLegs+= lVol;
      
      break;
    case SHOULDERS:
      this.shoulderSetVol += setCount;
      this.shoulderReps += repCount;
      this.weeklySets += setCount;
      this.weeklyReps +=repCount;
      
      int sVol = shoulderSetVol * shoulderReps;
      this.totalShoulder+= sVol;

      break;
    }
  }
      
  
}
