public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String china = "China";
  private String chinaCapital = "Beijing";
  private String chinaLanguage = "Chinese";
  private String chinaImg = "China.jpg";

  private String egypt = "Egypt";
  private String egyptCapital = "Cairo";
  private String egyptLanguage = "Arabic";
  private String egyptImg = "Egypt.jpg";

  private String france = "France";
  private String franceCapital = "Paris";
  private String franceLanguage = "French";
  private String franceImg = "France.jpg";

  private String germany = "Germany";
  private String germanyCapital = "Berlin";
  private String germanyLanguage = "German";
  private String germanyImg = "Germany.jpg";

  private String india = "India";
  private String indiaCapital = "New Dehli";
  private String indiaLanguage = "Hindi";
  private String indiaImg = "India.jpg";

  private  String japan = "Japan";
  private  String japanCapital = "Tokyo";
  private  String japanLanguage = "Japanese";
  private  String japanImg = "Japan.jpg";

  private  String kenya = "Kenya";
  private  String kenyaCapital = "Nairobi";
  private  String kenyaLanguage = "Swahili";
  private  String kenyaImg = "Kenya.jpg";

  private  String mexico = "Mexico";
  private  String mexicoCapital = "Mexico City";
  private  String mexicoLanguage = "Spanish";
  private  String mexicoImg = "Mexico.jpg";

  private  String uk = "United Kingdom";
  private  String ukCapital = "London";
  private  String ukLanguage = "English";
  private  String ukImg = "UK.jpg";

  private  String us = "United States";
  private  String usCapital = "Washington D.C.";
  private  String usLanguage = "English";
  private  String usImg = "US.jpg";

  private String name;
  private String capital;
  private String language;
  private String img;
  // add constructors
  public Country(){
    name = "";
    capital = "";
    language = "";
    img = "";
  }
  public Country(String newName, String newCapital, String newLanguage, String newImg){
    name = newName;
    capital = newCapital;
    language = newLanguage;
    img = newImg;
  }
  public String getName(){
    return name;
  }
  public String getCapital(){
    return capital;
  }
  public String getLanguage(){
    return language;
  }
  public String getImg(){
    return img;
  }
  public String toString(){
    return(name + "'s capital is " + capital + ", they speak " + language);

  }

  // Write accessor/get methods for each instance variable that returns it.

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 


  
}