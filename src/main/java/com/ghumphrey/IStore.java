package com.ghumphrey;

public interface IStore {
    /*
     * Receipt format:
     * 
      _________________________
      Item    Quantity    Price 
      Milk    2           $2.56 
      Bread   1           $1.00
      _________________________   
      Total: $6.02
      _________________________
    */
    String printReceipt(Item[] items);
    /*
    * greet the customer and have the customer greet back
    */
    String enterStore(IPerson person);
    /*
    * say good bye to the customer and have the customer say good bye back
    */
    String exitStore(IPerson person);
}
