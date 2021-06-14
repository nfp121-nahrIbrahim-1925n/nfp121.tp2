package question2;


public class FahrenheitCelsius{


    public static void main(String[] args){
        int fahrenheit = 0;
        double celsius = 0.0;

        
        for (String fahrenheitTemperature : args) {
            try {
                fahrenheit = Integer.parseInt(fahrenheitTemperature);
                celsius = fahrenheitEnCelsius(fahrenheit);

                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 

            } catch (NumberFormatException nfe){
                System.out.println("error : " + nfe.getMessage());  
            }
        }   

     

    }

 
    public static double fahrenheitEnCelsius(int f){
        double celsiusTemperature = (((double)5)/((double)9))*(f - 32);
        celsiusTemperature = ((long)(celsiusTemperature * 10))/10.0;

        return celsiusTemperature;
    }

}
