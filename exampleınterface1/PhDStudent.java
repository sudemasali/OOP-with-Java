
package exampleınterface1;


public class PhDStudent extends MasterStudent implements IArticleScoreBehaviour{
    int numberOfArticle;
   
    public PhDStudent(int id,float mid,float fin,int conf,int noa){
        super(id,mid,fin,conf);
        this.numberOfArticle=noa;
    }
    
    
    @Override
    public float computeTotalScore(){
        return super.computeTotalScore()+articleScore();
    }
    
    @Override
    public float articleScore(){
        return numberOfArticle*8;
    }
    
    @Override
   public String toString(){
       return super.toString()+" Article score of the student:"+articleScore();
   }
    
}
