public class Einmaleins
{
  public static void main( String[] args)
  {
    for( int i = 1; i <= 10; i++)
    {
      for( int j = 1; j <= 10; j++)
      {
                                             // Abstand
        if( i * j < 10) System.out.print( " ");
        if( i * j < 100) System.out.print( " ");
                                             // Produkt
        System.out.print( " " + i * j);
      }
                                       // Zeilenwechsel
      System.out.println( "");
    }
  }
}