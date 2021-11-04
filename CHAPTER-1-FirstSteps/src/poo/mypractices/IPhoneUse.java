package poo.mypractices;

public class IPhoneUse {
    public static void main(String[] args) {
        // MY OBJECT IS BASED ON MY TEMPLATE(CLASS)
        IPhone iphone64=new IPhone(64);

        IPhone iphone256v1=new IPhone(256);
        IPhone iphone256v2=new IPhone();

        System.out.println(iphone64.getDataIPhone());
        System.out.println(iphone64.setColor("blue"));

        System.out.println(iphone256v1.getDataIPhone());
        System.out.println(iphone256v2.getDataIPhone());
    }
}
