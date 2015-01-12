
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public void multiplesOfFive()
    {
        int multiplos = 15;
        while (multiplos < 95)
        {
            System.out.println(multiplos);
            multiplos = multiplos + 5;
        }
    }

    public void sumValues()
    {
        int suma = 0;
        int indice = 0;
        int incremento = 1;
        while (indice < 10)
        {
            suma = suma + incremento;
            System.out.println(suma);
            indice = indice + 1;
            incremento = incremento + 1;
        }
    }

}
