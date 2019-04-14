package Test;

public class Primitive {

    public static void main(String[] args) {
        Class stringClass=String.class;
        System.out.println("String is primitive type："+stringClass.isPrimitive());

        Class booleanClass=Boolean.class;
        System.out.println("Boolean is primitive type："+booleanClass.isPrimitive());

        Class booleanType=boolean.class;
        System.out.println("boolean is primitive type："+booleanType.isPrimitive());

        Class byteType=byte.class;
        System.out.println("byte is primitive type："+byteType.isPrimitive());

        Class charType=char.class;
        System.out.println("char is primitive type："+charType.isPrimitive());

        Class shortType=short.class;
        System.out.println("short is primitive type："+shortType.isPrimitive());

        Class intType=int.class;
        System.out.println("int is primitive type："+intType.isPrimitive());

        Class longType=long.class;
        System.out.println("long is primitive type："+longType.isPrimitive());

        Class floatType=float.class;
        System.out.println("float is primitive type："+floatType.isPrimitive());

        Class doubleType=double.class;
        System.out.println("double is primitive type："+doubleType.isPrimitive());

        Class voidType=void.class;
        System.out.println("void is primitive type："+voidType.isPrimitive());
    }


}
