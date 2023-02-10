public class App {
    public static void main(String[] args) throws Exception {
       
        //item in form of a Diaper
        //Polymorphic Variable
        GroceryItem item1 = new Diaper();
        item1.name = "Pampers ";
        item1.price = 10;
        item1.showItemName();
        

        //item in form of a Softdrink
        GroceryItem item2 = new Softdrinks();
        item2.name = "Pepsi ";
        item2.price = 15;
        item2.showItemName();
        

        //Cashier Object
        Cashier c1 = new Cashier();

        System.out.println();

        //Polymorphic Parameter
        c1.checkOut(item1);
        c1.ShowItemPrice(item1);
        c1.checkOut(item2);
        c1.ShowItemPrice(item2);

        System.out.println();

        //Polymorphic Array
        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item1;
        itemArray[1] = item2;
        
        double totalPrice = 0; 
        
        for (int i = 0; i< itemArray.length; i++) {
        itemArray[i].showItemName();
        System.out.println(itemArray[i].price);
        totalPrice += itemArray[i].price; 
        }

        System.out.println();

        System.out.println("Total Price: " + totalPrice); 


        Cat mycat = new Cat();
        mycat.eat();
    }
        
}
