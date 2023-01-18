import java.util.Scanner;


public class Vandal {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String t1;
        String t2;

        System.out.println("Vnestie T1");
        t1 = sc.nextLine();

        System.out.println("Vnestie T2");
        t2 = sc.nextLine();


        char[] vseCrke2 = new char[t2.length()];

        for (int i = 0; i<t2.length(); i++){
            vseCrke2[i] = t2.charAt(i);

        }


        char[] vseCrke1 = new char[t2.length()];

        for (int i = 0; i<t1.length(); i++){
            vseCrke1[i] = t1.charAt(i);

        }
        
        char[] izhod = new char[t1.length()];

      //  for (int i = 0; i<t2.length(); i++){
      //      for(int j = 0; i<t1.length(); j++)
      //          if(vseCrke2[i] == (vseCrke1[j])){
      //              izhod[i] = vseCrke1[j];
      //          }
      //          else{
      //              izhod[i] = '#';
      //          }
      //  }

        for (int i = 0; i<t1.length();i++){
            for(int j = 0; i<t2.length();j++){
                if(vseCrke1[i] != (vseCrke2[j])){
                    izhod[i] = '#';
                }
                else{
                    izhod[i] = vseCrke1[i];
                }
            }
        }

        System.out.println(izhod);

    }
}
