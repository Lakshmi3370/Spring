package com.xworkz.spring_annotation.water;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Component
public class WaterBean {
	
    //@Value("true")	
	private boolean isTransparent;
    //@Value("blue")
	private String color;
   // @Value("5.4")
	private double phLevel;
	
	
    
	public WaterBean(boolean isTransparent, String color, double phLevel) {
		
		this.isTransparent = isTransparent;
		this.color = color;
		this.phLevel = phLevel;
	}
    
	
	 public void printAll() {
	    	System.out.println(isTransparent+" "+color+" "+phLevel);
	    }

}
