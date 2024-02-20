public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraTopingsPrice=100;
    private int pack=20;
    private int basePizzaPrice=300;
    private boolean isextracheese=false;
    private boolean isextratopping=false;
    private boolean istakeaway=false;




    public Pizza(Boolean veg){
        this.veg =veg;
        if (this.veg){ 
           this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void getPizzaPrice() {
        System.out.println(this.price);
    }


    public void addExtraCheese(){
        isextracheese=true;
        //System.out.println("Extra cheese added....");
        this.price+=extraCheesePrice;



    }
    
    public void addExtraTopings(){
        isextratopping=true;
        //System.out.println("Extra topping added....");
        this.price+=extraTopingsPrice;
        
    }
    
    public void takeAway(){
        istakeaway=true;
        //System.out.println("Take away charges....");
        this.price+=pack;
        
    }
    
    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isextracheese){
            bill+="extra cheese added :" + extraCheesePrice +"\n";
        }

        if(isextratopping){
            bill+="extra topings added :" + extraTopingsPrice +"\n";
        }

        if(istakeaway){
            bill+="Packing charges :" + pack +"\n";
        }
        bill+="Bill : "+this.price+" rs"+"\n";
        System.out.println(bill);

        
    }

    
}
