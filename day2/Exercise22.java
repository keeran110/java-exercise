
/**
 * クラス Exercise8の注釈をここに書きます.
 * 
 * @author (kiran)
 * @version (バージョン番号もしくは日付)
 */
public class Exercise22{
    public static void main(String[]args){
        int a = 1;
        for(int i = 0; i <= 4;i++){
            for(int j = 0; j <= 4;j++){
              if(i+j == 4 || i == j){
              System.out.print(a);
              a = a+1;
              }else{
              System.out.print(" ");
              }
            }
          System.out.print("\n"); 
       }
    }
}
