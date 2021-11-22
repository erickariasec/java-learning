package poo.mypractices;

// Inherited Class
public class GooglePixel6Pro extends GooglePixel6{

    public GooglePixel6Pro(int pri, String col, String proc, String stor, String auth, double weig){
        super(pri, col, proc, stor, auth, weig);
    }

    public void setAditionalPrice(int aditionalPrice){
        this.aditionalPrice=aditionalPrice;
        super.setPrice(aditionalPrice + super.getPrice());
    }

    @Override
    public int getPrice() {  // OVERWRITING
        int pricePro = super.getPrice();  // Calling returnSalary form Parent Class
        return pricePro + aditionalPrice;
    }

//    @Override
//    public void setPrice(int price){ // OVERWRITING
//        super.setPrice(price+aditionalPrice);
//    }

    private int aditionalPrice;
}
