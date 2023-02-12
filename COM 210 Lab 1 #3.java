import java.util.Scanner;  // Import the Scanner class
import java.util.Arrays;   //Import the Arrays class

class Main
{
  public static void main(String[] args)
  {
    //Make an Array of Item Names
    String[] itemNames = makeItemNamesArray();
    //System.out.println(Arrays.toString(itemNames));

    //Make an Array of Item Prices
    System.out.println("\n");
    double[] itemPrices = makeItemPricesArray();
    //System.out.println(Arrays.toString(itemPrices));

    //Print Out Items and Their Associated Prices
    System.out.println("\n\nYour Items:");
    for(int i = itemNames.length - 1; i >= 0; i--)
    {
        System.out.println(itemNames[i] + " cost(s) $" + itemPrices[i]);
    }

    //Find and Print Out Average Item Cost if Peas is an Item
    boolean itemPeas = false;
    for(int i = 0; i < itemNames.length; i++)
    {
      if(itemNames[i].toLowerCase().equals("peas"))
      {
        itemPeas = true;
      }
    }
    if(itemPeas)
    {
      double averageItemCost = 0;
      for(int i = 0; i < itemPrices.length; i++)
      {
        averageItemCost += itemPrices[i];
      }
      averageItemCost /= itemPrices.length;
      System.out.println("\nThe average item cost is $" + averageItemCost);
    }
    else
    {
      System.out.println("\nno average output");
    }
  }

  public static String[] makeItemNamesArray()
  {
    //Create a Scanner Object
    Scanner methodObject = new Scanner(System.in);
    
    //Get Number of Items
    System.out.println("\nHow many items do you want to input?:");
    int numItems = methodObject.nextInt();
    methodObject.nextLine();
    
    //Create the Array of Item Names
    String[] itemNames = new String[numItems];
    
    //Get Item Names to Put Into Array
    for(int i = 0; i < numItems; i++)
    {
      int itemNum = i + 1;
      System.out.println("\nEnter item " + itemNum + " name:");
      itemNames[i] = methodObject.nextLine();
    }
    return itemNames;
  }

  public static double[] makeItemPricesArray()
  {
    //Create a Scanner Object
    Scanner methodObject = new Scanner(System.in);

    //Get Number of Items
    System.out.println("\nHow many items do you want to input?:");
    int numItems = methodObject.nextInt();
    methodObject.nextLine();

    //Create the Array of Item Prices
    double[] itemPrices = new double[numItems];

    //Get Item Prices to Put Into Array
    for(int i = 0; i < numItems; i++)
    {
      int itemNum = i + 1;
      System.out.println("\nEnter item " + itemNum + " price:");
      itemPrices[i] = methodObject.nextDouble();
    }
    return itemPrices;
  }
}
//rbendelson