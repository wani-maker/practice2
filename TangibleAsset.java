public abstract class TangibleAsset{
  
  private String name;
  private int praice;
  private String color;
  
  public TangibleAsset(String name, int praice, String color){
    this.name = name;
    this.praice = praice;
    this.color = color;
  }
  
  public String getName(){
    return this.name;
  }
  public String getPraice(){
    return this.praice;
  }
  public String getColor(){
    return this.color;
  }
