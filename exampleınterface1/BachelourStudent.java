
package exampleınterface1;

public class BachelourStudent extends Student implements IProjectScoreBehaviour {
       
    
    public BachelourStudent(int id, float mid, float fin){
        super(id, mid, fin );
    }
    
    @Override
    float computeTotalScore(){
        return super.computeBaseScore()+projectScore();
    }
    
    @Override
    public float projectScore(){
        return 20;
    }
@Override
   public String toString(){
       return super.toString()+" Project score of the student:"+projectScore();
   }
    
    
    
    
       
    
    

   
       
}
