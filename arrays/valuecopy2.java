/**
 * クラス twomethod の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util.Arrays;
public class valuecopy2{
    public static void main(String[]args){
      double[]grades = {98.2,22.9,30.0};
      double[]scores = Arrays.copyOf(grades,2);
      System.out.println(Arrays.toString(scores));
    }
}