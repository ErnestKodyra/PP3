
public class Temperature
{
   static void CelsiusToKevin(int Celsius){
    System.out.println(Celsius + "°C in Kelvin is " + (Celsius + 273.15) + "K");
   }
   static void CelsiusToFahrenheit(int Celsius){
    System.out.println(Celsius + "°C in Fahrenheit is " + (Celsius * 1.8 + 32) + "°F");
   }
   static void KelvinToCelsius(int Kelvin){
    System.out.println(Kelvin + "K in Celsius is " + (Kelvin - 273.15) + "°C");
   }
   static void KelvinToFahrenheit(int Kelvin){
    System.out.println(Kelvin + "K in Fahrenheit is " + (Kelvin * 1.8 - 459.67) + "°F");
   }
   static void FahrenheitToCelsius(int Fahrenheit){
    System.out.println(Fahrenheit + "°F in Celsius is " + ((Fahrenheit - 32) * 5/9 + "°C"));
    }
   static void FahrenheitToKelvin(int Fahrenheit){
    System.out.println(Fahrenheit + "°F in Kelvin is " + ((Fahrenheit + 459.67) * 5/9 + "K"));
   }
   
   public static void main(String[] args){
       CelsiusToKevin(25);
       CelsiusToFahrenheit(25);
       FahrenheitToCelsius(100);
       FahrenheitToKelvin(100);
       KelvinToCelsius(0);
       KelvinToFahrenheit(0);
   }
}
