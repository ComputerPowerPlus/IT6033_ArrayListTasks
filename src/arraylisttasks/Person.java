/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;

/**
 *
 * @author CPP_Curriculum
 */
public class Person {
    
    private int id;
    private String name;
    private float weight;

    //person's constructor
    public Person(int id, String name, float weight){
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    //printing persion's information in a user-friendly manner
    @Override
    public String toString(){
       return "Person Information:\nId: " + id + "\nName: " + name + "\nWeight: " + weight; 
    }    
}
