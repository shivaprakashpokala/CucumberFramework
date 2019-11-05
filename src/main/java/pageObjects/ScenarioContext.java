package pageObjects;

import java.util.HashMap;
import java.util.Map;

 
public class ScenarioContext {
 
 Map<String, Object> ExpectedProductDetails;
 Map<String, Object> CartSummaryProductDetails;
 
     public ScenarioContext(){
    	 ExpectedProductDetails = new HashMap<>();
    	 CartSummaryProductDetails = new HashMap<>();
     }
 
     public void setProductDetails(String key, String value) {
    	 ExpectedProductDetails.put(key, value);
     }
 
     public Object getProductDetails(String key){
         return ExpectedProductDetails.get(key);
     }
     
     public void setCartSummaryProductDetails(String key, String value) {
    	 CartSummaryProductDetails.put(key, value);
     }
 
     public Object getCartSummaryProductDetails(String key){
         return CartSummaryProductDetails.get(key);
     }
 
}
