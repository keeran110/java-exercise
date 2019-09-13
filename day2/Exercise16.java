
/**
 * クラス Exercise16 の注釈をここに書きます.
 * 
 * @author (kiran)
 * @version (バージョン番号もしくは日付)
 */
public class Exercise16{
    public static void main(String[]args){
        for(int i = 1; i<= 2;i++){
            for(int j=1; j<= 5;j++){
                if(i > 1){
                System.out.print(j+5);
                }else{
                    System.out.print(j);
              }              
            }
            System.out.print("\n");       
        }
    }
}
