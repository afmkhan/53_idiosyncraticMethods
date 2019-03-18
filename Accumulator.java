/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */

public class Accumulator {

    /**
      @return the concatenation of all the Strings
      in the \list that begin with \prefix,
      each followed by a space.
     */
    public static String catElementsStartingWith(
        List_inArraySlots list
      , String prefix
      ) {
        String result = "";

        for( int integ = 0; integ < list.size(); integ++)
            if (list.get(integ) instanceof String){
            String stringElem = (String)list.get(integ);
            if (stringElem.startsWith(prefix)) 
                    result += stringElem + " ";
            }

        return result;
    }


    /**
      @return a list of each of the Double elements
      from the \list whose value is "finite".
     */
    public static List_inArraySlots finites(
        List_inArraySlots list
      ) { 
      // create list to hold values
      List_inArraySlots finite = new List_inArraySlots();
      
      // repeat the drill
      for (int index = 0; index < list.size(); index++){
          if (list.get(index) instanceof Double){
              Double doubleElem = (Double)list.get(index);
              if (!doubleElem.isInfinite()) finite.add( doubleElem);
          }
      }
      
      return finite;
          
    }
}