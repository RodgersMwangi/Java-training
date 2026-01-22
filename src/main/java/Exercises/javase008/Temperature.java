package Exercises.javase008;



public class Temperature {
    private double celcius;
    double fahrenheit;
    double kelvin;
    boolean error;

    //constructor
    public Temperature(double celcius){
        setCelcius(celcius);


    }

    //setters and getters
    public double getCelcius() {
        return celcius;
    }
    public void setCelcius(double celcius) {
        if(celcius<-273.15){
            System.out.println("Minimum allowed value for temperature is -273.15°C");
            error=true;
            return;
        }
        this.celcius = celcius;
    }

    public double getFahrenheit(){
        fahrenheit=(this.celcius*9/5)+32;
        return fahrenheit;
    }
    public double getKelvin() {
        kelvin=celcius+273.15;
        return kelvin;
    }

    //method to convert units
    public void converter() {
        
        if(error){
            
        }else{
            double convertedFahrenheit=(celcius*9/5)+32;
            double convertedKelvin=celcius+273.15;
            System.out.println("===========================================");
            System.out.println("You entered "+ celcius + " degrees celcius");
            System.out.println("Fahrenheit: "+ convertedFahrenheit);
            System.out.println("Kelvin: "+ convertedKelvin);

            System.out.println("===========================================");
        }
        
    }

}
