package org.github.ewu.proxy.impl;

import org.github.ewu.proxy.annon.Seven;

/**
 * @author ewu
 * @date 2021-05-06 下午 2:30
 **/
public class DogImp implements AnimalInterface {

    @Seven(value = "Lumia")
    private String name;

    private String Property;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void say() {
        System.out.println("小狗:汪汪汪汪.....");
    }

    @Override
    public void getProperty() {
        System.out.println(this.name + this.Property);
    }

    @Override
    @Seven(Property = "水陆两栖战士")
    public void setProperty(String property) {
        this.Property = property;
    }
}
