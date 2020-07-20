package com.udacity.jwdnd.c1.review;

public class MessageForm {
    private String animalName;
    private String adjective;
    //private String messageType;

    public MessageForm(String animalName, String adj){
        this.animalName = animalName;
        this.adjective = adj;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }



}
