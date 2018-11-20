//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address
{
   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }
   
   /**
    * Copy constructor 
    * @param Address object
    */
   public Address(Address other)
   {
       //this = other;//this is a big no no
       this.streetAddress = other.streetAddress;
       this.city = other.city;
       state = other.state;
       zipCode = other.zipCode;
    }
   public boolean equals(Address other)
   {
       return(streetAddress.equals(other.streetAddress) && city.equals(other.city) && 
       state.equals(other.state) && zipCode == other.zipCode);
    }



   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
