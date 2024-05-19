### Java Comman Util functions

``` java 
        String originalString = "apple,banana,orange";
        1. String[] splitString = originalString.split(","); // Splitting by comma
        
        String[] arrayOfStrings = {"apple", "banana", "orange"};
        2. String joinedString = String.join(",", arrayOfStrings); // Joining by comma

        3. joinedString = joinedString.toLowerCase();
        
        4. Character.isLetterOrDigit(ch) // for any char ch
        
        5. Character.toLowerCase(ch) // for any char ch 
        6. int x = Math.min(a,b);

        7. int x = Math.max(a,b);
        
        8. int x = Math.abs(a,b);

        9. Arrays.sort(arr, Collections.reverseOrder())

        10. char[] ch = arr.toCharArray();

        11. int[] newArr = arr.clone()
```

### java.lang.Math
```java 
import java.lang.Math;
public class MathDemo {
    public static void main(String[] args) {
        int x = -10;
        double y = 3.75;
        double angle = Math.PI / 4; // 45 degrees in radians

        // Absolute value
        int absX = Math.abs(x);
        
        // Ceil and floor
        double ceilY = Math.ceil(y);
        double floorY = Math.floor(y);
        
        // Rounding
        long roundedY = Math.round(y);
        
        // Maximum and minimum
        int maxVal = Math.max(10, 20);
        int minVal = Math.min(10, 20);
        
        // Power and square root
        double powerResult = Math.pow(2, 3);
        double sqrtResult = Math.sqrt(16);
        
        // Trigonometric functions
        double sinValue = Math.sin(angle);
        double cosValue = Math.cos(angle);
        double tanValue = Math.tan(angle);
        
        // Inverse trigonometric functions
        double arcsinValue = Math.asin(sinValue);
        double arccosValue = Math.acos(cosValue);
        double arctanValue = Math.atan(tanValue);
        
        // Logarithmic functions
        double naturalLog = Math.log(10); // base e
        double log10 = Math.log10(100);
        double log10 = Math.log(4)/Math.log(2); //for base 2 
        
        // Exponential function
        double expValue = Math.exp(2); //equivalent to Math.E*Math.E or e^2
        
        // Constants
        double pi = Math.PI;
        double e = Math.E; 
        
        // Rounding functions
        double roundedDown = Math.floor(3.75);
        double roundedUp = Math.ceil(3.75);
        int step = (int)Math.floor(Math.sqrt(n)); //casting
    }
}
