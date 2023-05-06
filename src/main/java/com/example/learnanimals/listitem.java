package com.example.learnanimals;

public class listitem {
    public String name;
    public String description;
    public int image;
    public listitem(String name, String description,int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

