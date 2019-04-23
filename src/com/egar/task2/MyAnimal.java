package com.egar.task2;

public class MyAnimal implements Animal {
    String nickname;
    String view;
    private String getNickname() {
        return nickname;
    }
    private void setNickname(int number) {
        switch (number) {
            case 0:
                this.nickname = this.barsic;
                break;
            case 1:
                this.nickname = this.myrka;
                break;
            default:
                this.nickname = this.myrzic;
        }
    }
 
    public String getAnimal() {
        String s = "Animal: " + this.view + "Name: " + getNickname();
        return s;
    }
 
    public void setAnimal(int number1, int number2) {
        switch (number1) {
            case 0:
                this.view = this.Animal1;
                setNickname(number2);
                break;
            default:
                this.view = this.Animal2;
                this.nickname = this.bobic;
                break;
        }
    }}