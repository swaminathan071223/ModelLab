import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
    
    

class Product   
    {  
          
        private int id;  
        private String pname;  
        private int qty;  
        private double price;  
        private double totalPrice;  
           

        Product(int id, String pname, int qty, double price, double totalPrice)   
        {  
            this.id=id;  
            this.pname = pname;  
            this.qty = qty;  
            this.price = price;  
            this.totalPrice = totalPrice;  
        }  
             
            public int getId()   
                {  
                    return id;  
                }  
                public String getPname()   
                {  
                    return pname;  
                }  
                public int getQty()   
                {  
                    return qty;  
                }  
                public double getPrice()   
                {  
                    return price;  
                }  
                public double getTotalPrice()   
                {  
                    return totalPrice;  
                }  
                 
                public static void displayFormat()   
                {  
                    System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
                    System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");  
                    System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
                }  
                   
                  
                public void display()   
                {  
                    System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, pname, qty, price, totalPrice);  
                }  
    }  
public class Main   
    {  
        public static void main(String args[])   
            {  
                
                int id = 0;  
                String productName = null;  
                int quantity = 0;  
                double price = 0.0;  
                double totalPrice = 0.0;  
                double overAllPrice = 0.0;  
                double cgst, sgst, subtotal=0.0, discount=0.0;  
                char choice = '\0';  
		System.out.println(" 1:- Egg");
		System.out.println(" 2:- Rice");
		System.out.println(" 3:- Milk");
		System.out.println(" 4:- Softdrink");
		System.out.println(" 5:- Chips");
		System.out.println(" 6:- Soap");
		System.out.println(" 7:- Shampoo");
		System.out.println(" 9:- Chocolate");
		System.out.println(" 10:- Noodles");
		System.out.println(" 11:- Biscuit");
		System.out.println(" 12:- Paneer");
		System.out.println(" 13:- Yogurt");
		System.out.println(" 14:- Razor");
		System.out.println(" 15:- Newspaper");
		System.out.println(" 16:- Icecream");
		System.out.println(" 17:- Wheatflour");
		System.out.println(" 18:- Pen");
		System.out.println(" 19:- Semiya");
		System.out.println(" 20:- Maida");
                System.out.println("\t\t\t\t--------------------Invoice-----------------");  
                System.out.println("\t\t\t\t\t "+"  "+"      Grab Grocers");  
                System.out.println("\t\t\t\t\t      6,Park Town,Madurai");  
                System.out.println("\t\t\t\t\t"  +"    " +"opp Indian Oil Petrol Bunk");  
                System.out.println("GSTIN: 03AWBPP8756K592"+"\t\t\t\t\t\t\tContact: (+91) 6379814932");  
                
                  System.out.println("Date: 1/11/2022"  +"\tTuesday" +"\t\t\t\t\t\t\t\t (+91) 7373013970");  
                Scanner sc = new Scanner(System.in);  
                System.out.print("Enter Customer Name: ");  
                String customername=sc.nextLine();  
                List<Product> product = new ArrayList<Product>();  
                do   
                    {  
                        
                        System.out.println("Enter the product details: ");  
                        System.out.print("Product ID: ");  
                        id = sc.nextInt();  
switch(id)
{
case 1:
System.out.println(" Item Name and Price:- Egg:5Rs");
productName="egg";
 price=5;
 break;
case 2:
System.out.println(" Item Name and price:- Rice:35Rs per kg");
productName="Rice";
 price=35;
 break;
 case 3:
System.out.println("Item Name and Price:- Milk:22Rs per 500ml");
productName="Milk";
 price=22;  
 break;
 case 4:
System.out.println(" Item Name and price:- Soft drink:12Rs");
productName="Softdrink";
 price=12;
 break;
 case 5:
System.out.println(" Item Name and price:- Chips:5Rs");
productName="Chips";
 price=5;
 break;
 case 6:
System.out.println(" Item Name and price:- Soap:40Rs");
productName="Soap";
 price=40;
 break;
 case 7:
System.out.println(" Item Name and price:- Shampoo:95Rs");
productName="Shampoo";
 price=95;
 break;
 case 8:
System.out.println(" Item Name and price:- chocolate:10Rs");
productName="Chocolate";
 price=10;
 break;
 case 9:
System.out.println(" Item:- Noodles:120Rs");
productName="Noodles";
 price=120;
 break;
 case 10:
System.out.println(" Item Name and price:- Biscuit:20Rs");
productName="Biscuit";
 price=20;
 break;
 case 11:
System.out.println(" Item Name and price:- Paneer:100Rs");
productName="Paneer";
 price=100;
 break;
 case 12:
System.out.println(" Item Name and price:- Yogurt:15Rs");
productName="Yogurt";
 price=15;
 break;
  case 13:
System.out.println(" Item Name and price:- Razor:10Rs");
productName="Razor";
 price=10;
 break;
  case 14:
System.out.println(" Item Name and price:- Newspaper:5Rs");
productName="Newspaper";
 price=5;
 break;
  case 15:
System.out.println(" Item Name and price:- Icecream:15Rs");
productName="Icecream";
 price=15;
 break;
  case 16:
System.out.println(" Item Name and price:-Wheat Flour:25Rs per kg");
productName="Wheat Flour";
 price=25;
 break;
 case 17:
System.out.println(" Item Name and price:- Ball Pen:5Rs");
productName="Ball pen";
 price=5;
 break;
 case 18:
System.out.println(" Item Name and price:- Semia:50Rs");
productName="Semia";
 price=50;
 break;
 case 19:
System.out.println(" Item Name and price:- Maida Flour:26Rs per kg");
productName="Maida flour";
 price=26;
 break;
 case 20:
System.out.println(" Item Name and price:- Brush:15Rs");
productName="Brush";
 price=15;
 break;
 
  default:
 System.out.println("Invalid");
 break;
}
                        System.out.print("Quantity: ");  
                        quantity = sc.nextInt();  
                      
                        totalPrice = price * quantity;  
                         overAllPrice = overAllPrice + totalPrice;  
                        product.add( new Product(id, productName, quantity, price, totalPrice) );  
                        System.out.print("Want to add more items? (y or n): ");  
                        choice = sc.next().charAt(0);  
                         sc.nextLine();  
                    }   
                while (choice == 'y' || choice == 'Y');  
              
                Product.displayFormat();  
                for (Product p : product)   
                {  
                    p.display();  
                }  
                 System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);  
                 
                discount = overAllPrice*2/100;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " +discount);  
                  
                subtotal = overAllPrice-discount;   
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal);  
          
                sgst=overAllPrice*12/100;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) "+sgst);  
                cgst=overAllPrice*12/100;  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) "+cgst);  
                  
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal+cgst+sgst));  
                System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");  
                System.out.println("\t\t\t\t                     Visit Again");  
               
                
            }     
    }