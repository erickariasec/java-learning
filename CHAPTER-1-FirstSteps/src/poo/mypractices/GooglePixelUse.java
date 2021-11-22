package poo.mypractices;

public class GooglePixelUse {
    public static void main(String[] args) {

        GooglePixel6 myGooglePixel6=new GooglePixel6(599, "Stormy Black, Kinda Coral, Sorta Seafoam", "Google" +
                " Tensor with Titan M2", "128, 256", "Fingerprint Unlock with under-display fingerprint sensor", 7.3);
        System.out.println("Parent price: "+ myGooglePixel6.getPrice());
        System.out.println(myGooglePixel6.getDataGooglePixel6());


        GooglePixel6Pro myGooglePixel6Pro=new GooglePixel6Pro(599, "Stormy Black, Cloudy White, Sorta Sunny", "Google" +
                " Tensor with Titan M2", "128, 256, 512", "Fingerprint Unlock with under-display fingerprint sensor", 7.4);
        myGooglePixel6Pro.setAditionalPrice(300);
        System.out.println(myGooglePixel6Pro.getDataGooglePixel6());
    }
}
