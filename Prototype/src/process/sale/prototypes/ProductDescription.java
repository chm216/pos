
package process.sale.prototypes;

public class ProductDescription {
    private int productCode;
    private float price;
    private String description;
    private static int nextCode = 1;
    
    public ProductDescription(String description, float price){
        this.price=price;
        this.description = description;
        // this.productCode = DB.ProductDescription.getNextCode();
        this.productCode = getNextCode();
    }

    public ProductDescription(ProductDescription desc, int code, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCode() {
        return this.productCode;
    }
    
    private int getNextCode() {
        return nextCode++;
    }

    public float getPrice(){
        return price;
    }
    
    public String getDescription(){
        return description;
    }
    
    @Override
    public String toString(){
        // return "" + productCode + "\t" + description + "\t" + price;
        return String.format("%2d %-15.15s\t%7.2f", productCode, description, price);
    }
}
