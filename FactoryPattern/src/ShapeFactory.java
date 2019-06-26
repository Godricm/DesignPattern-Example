/**
 * @program: DesignPattern-Example
 * @description: 工厂
 * @author: miaochen
 * @create: 2019-06-25 14:54
 **/
public class ShapeFactory {
    public  Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else{
            return null;
        }
    }
}
