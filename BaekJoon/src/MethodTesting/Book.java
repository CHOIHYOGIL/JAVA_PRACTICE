package MethodTesting;
public class Book implements Comparable<Book> {
    private String name;
    private int price;
  	int i=0;
    public Book(String name, int price) {
    	
    	System.out.println("Hi"+i);
    	i++;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book o) {
  System.out.println("dafsf");
    	System.out.println(i+" o: "+o+"  o.price  :  "+o.price+"  price :"+price+"price- o.price : "+(price-o.price));
    	i++;
    return o.price-price;
    }
}