package org.itacademie.java.java8;

public class MulipleGenericContainer<T,S> {

	 private T firstPosition;
	    private S secondPosition;
	   
	    public MulipleGenericContainer(T firstPosition, S secondPosition){
	        this.firstPosition = firstPosition;
	        this.secondPosition = secondPosition;
	    }
	    
	    public T getFirstPosition(){
	        return firstPosition;
	    }
	    
	    public void setFirstPosition(T firstPosition){
	        this.firstPosition = firstPosition;
	    }
	    
	    public S getSecondPosition(){
	        return secondPosition;
	    }
	    
	    public void setSecondPosition(S secondPosition){
	        this.secondPosition = secondPosition;
	    }
	    
	    public static void main(String [] args){
	    	
	    	MulipleGenericContainer<String, String> mondayWeather =
	    	        new MulipleGenericContainer<String,String>("Monday", "Sunny");
	    	
	    	MulipleGenericContainer<Integer, Double> dayOfWeekDegrees = 
	    	        new MulipleGenericContainer<Integer, Double>(1, 78.0);
	    	//Invoking Generic type class
	    	System.out.println("MulipleGenericContainer<String, String>-->1-"+mondayWeather.getFirstPosition().toString()+"-->2-"+mondayWeather.getSecondPosition());
	    	System.out.println("MulipleGenericContainer<Integer, Double>-->1-"+dayOfWeekDegrees.getFirstPosition()+"-->2-"+dayOfWeekDegrees.getSecondPosition());
	    	
	    	  //calling Generic Method
	    	double i = add(dayOfWeekDegrees.getFirstPosition(),dayOfWeekDegrees.getSecondPosition());
	    	System.out.println("Sum " + i);
	    }
	    
	    // Generic Method
	    public static <N extends Number> double add(N a, N b){
	        double sum = 0;
	        sum = a.doubleValue() + b.doubleValue();
	        return sum;
	    } 
	    
	}