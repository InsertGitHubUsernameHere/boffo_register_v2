package product;
import java.util.HashMap;
import database.BoffoDbObject;

public class ProductObject extends BoffoDbObject implements TicketElement{
   //need product object 'factory' 
        protected String name = "";
        protected int quantity = 0;
        protected double price = 0.00;
        protected int UPC = 0;
        protected String SKU = "";
        protected Rating rat = null;
        protected String tableName = "Product";
        protected String uuid = "";
        protected HashMap map = null;
        protected String description = "";
        
    public ProductObject(String _name, int _quant, double _price, int _UPC, String _sk, Rating _rat, String _upc, String _tableName, String _description) {
       this.name = _name;
       this.quantity = _quant;
       this.price = _price;
       this.UPC = _UPC;
       this.SKU = _sk;
       this.rat = _rat;
       this.uuid = _upc;
       this.tableName = _tableName;
       this.description = description;
    }
    
    
    public void setDescription(String _description) {
        this.description = _description;
    }
    
    
    public String getDescription() {
        return this.description;
    }
    
    
    public void setName(String _name) {
        this.name = _name;
    }
    
    
    public String getName() {
        return this.name;
    }
    
    
    public void setPrice(double _price) {
        this.price = _price;
    }
    
    
    public double getPrice() {
        return this.price;
    }
     
    
    public ProductObject getProduct() {
        return new ProductObject(this.name, this.quantity, this.price, this.UPC, this.SKU, this.rat, this.uuid, this.tableName, this.description);
    }
    
    public void setQuantity(int _quant) {
        this.quantity = _quant; 
    }
    
    
    public int getQuantity() {
        return this.quantity;
    }
    
    
    public void setRating(Rating _rat) {
        this.rat = _rat;
    }
    
    
    public Rating getRating() {
        return this.rat;
    }
    public void setUPC(int _upc) {
        this.UPC = _upc;
    }
    
    
    public int getUPC() {
        return this.UPC;
    }
    
    
    public void setSKU(String _sku) {
        this.SKU = _sku;
    }
    
    
    public String getSKU() {
        return this.SKU;
    }
    
    
    @Override
    public String toString() {
        String str = "Name: " + this.getName() + "\n" + 
                     "Quantity: " + this.getQuantity() + "\n" + 
                     "Price: $" + this.getPrice() + "\n" + 
                     "UPC: " + this.getUPC() + "\n" + 
                     "SKU: " + this.getSKU() + "\n" + 
                     "Rating: " + this.getRating() + "\n" + 
                     "UUID: " + this.uuid + "\n" + 
                     "Description: " + this.description + "\n";
        return str;
    }
    
    
    public static ProductObject loadBySKU(String _sku) {
        return (ProductObject)BoffoDbObject.load(waitForLoadToRepair, "sku", _sku);
    }
    
    
    public static ProductObject loadByUPC( String _upc) {
        return (ProductObject)BoffoDbObject.load(waitForLoadToRepair, "field", _upc);
    }
    
    
    public static ProductObject loadByName(String _name) {
       return (ProductObject)BoffoDbObject.load(waitForLoadToRepair, "name", _name);
    }
    
    
    public static ProductObject loadByQuantity(String _quant) {
       return (ProductObject)BoffoDbObject.load(waitForLoadToRepair, "quantity", _quant);
    }
    
    
    public static ProductObject loadByRating(String _rat) {
        return (ProductObject)BoffoDbObject.load(waitForLoadToRepair, "rating", _rat);
    }
    
    
    public static ProductObject loadByPrice(String _price) {
        return (ProductObject)BoffoDbObject.load(BoffoDbObject.waitForLoadToRepair, "price", _price);
        //where loadByPrice(field, value) is a load looking up from a table
        //cast as Product
    } 
    
    
    public static void main(String[] args) {

    }
} 