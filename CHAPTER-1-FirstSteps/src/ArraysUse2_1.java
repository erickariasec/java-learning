public class ArraysUse2_1 {
    public static void main(String[] args) {

        int [] arrayRandom=new int[150];

        for (int i=0; i<arrayRandom.length; i++){
            arrayRandom[i]=(int)Math.round(Math.random()*100);
        }

        for(int number:arrayRandom){
            System.out.print(number + " ");
        }

    }
}
