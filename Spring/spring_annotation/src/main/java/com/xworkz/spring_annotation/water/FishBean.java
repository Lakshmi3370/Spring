package com.xworkz.spring_annotation.water;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FishBean {
	
  private String name;
  private String color;
  private WaterBean waterbean;
  
  /*@Autowired
  public FishBean(WaterBean waterbean) {
	  System.out.println(waterbean);
  */
  

  public FishBean( String name,String color,WaterBean waterbean) {
	  this.name=name;
	  this.color=color;
	  this.waterbean=waterbean;

  
	  System.out.println("Fish Name: "+name+  ", Color: "+color);
	  
  }

}
