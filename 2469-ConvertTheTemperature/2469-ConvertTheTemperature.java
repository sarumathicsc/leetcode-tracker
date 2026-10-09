// Last updated: 10/9/2026, 9:36:27 AM
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00; 

        return new double[] {kelvin,fahrenheit}; 
    }
}