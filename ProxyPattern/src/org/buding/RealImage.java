package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:14
 * @description:
 **/
public class RealImage implements Image {

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private String fileName;



    @Override
    public void display() {
        System.out.println("Displaying "+fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading "+fileName);
    }
}
