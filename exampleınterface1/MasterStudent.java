
package exampleınterface1;

public  class MasterStudent extends Student  implements IConferenceScoreBehaviour{
    int numberOfConf;
    
    
    public MasterStudent(int id, float mid, float fin,int noc) {
        super(id, mid, fin);
        this.numberOfConf=noc;
    }
    
    @Override
    float computeTotalScore(){
        return super.computeBaseScore()+conferenceScore();
    }
    
    @Override
    public float conferenceScore(){
        return numberOfConf*5;
    }
    @Override
   public String toString(){
       return super.toString()+" Conference score of the student:"+conferenceScore();
   }
    
    
    



    
}
