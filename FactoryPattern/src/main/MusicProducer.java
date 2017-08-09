package main;

public class MusicProducer {

   public Music getMusic(String musicType){
      if(musicType == null){
         return null;
      }		
      if(musicType.equalsIgnoreCase("rock")){
         return new Rock();
      } else if(musicType.equalsIgnoreCase("metal")){
         return new Metal();   
      } else if(musicType.equalsIgnoreCase("pop")){
         return new Pop();
      }
      return null;
   }
}