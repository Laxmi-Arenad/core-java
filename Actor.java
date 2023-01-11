package com.xworkz.springTasks;

import org.springframework.stereotype.Component;

@Component
public class Actor {
     private String name;
     private String langauge;
     private int age;
     
     public Actor(String name,String langauge,int age) {
    	 super();
    	 this.name=name;
    	 this.langauge=langauge;
    	 this.age=age;
    	 
     }
     public String getName() {
    	 return name;
     }
     public String getLangauge() {
    	 return langauge;
     }
     public int getAge() {
    	 return age;
     }
    
}
