package Functions;

public class Doubling {
    public static void main(String[] args) {
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`
        int baseNum = 123; //először megadjuk a váltózkat aztán;
        System.out.println( doubling(baseNum));//új sorban megadjuk milyen funtiont fogok hozzá csatolni
        //int ibolya = 34; //egyszerre több váltózót is megadhatunk
        //doubling(ibolya); //és ezekhez is csatolhatjuk ugyan azt a functiont
        /*int b = doubling(baseNum);
        System.out.println(b);*/ //itt a példa a return fontosságára, return nélkül a "int b = doubling(baseNum)"-t nem tudnánk shoutolni

    }
    public static int doubling(int n) {
        //return n *2; //a returnt static int esteén használunk amikor a metód eredményét "följebb" returnöljük
      int  doubled= n * 2;
        return doubled;
    }
}
