package UdemyTutorial;

public class ArraysExamples {


     static void arraysExample(){
        //MultiDimensional Arrays
        int[][] multi = {
                {3, 54, 824},
                {64, 43, 54}
        };

        //Single Level Arrays
        String[] strings = {"Hello","From","Russia"};

        //Iterating through Ar`rays
        for (int row = 0; row < multi.length; row++) {
            for (int col = 0; col < multi[row].length; col++) {
                System.out.println(multi[row][col]+"\t");
            }
        }


        System.out.println(multi[0][2]);
        multi[0][2]=45;
        System.out.println(multi[0][2]);
        System.out.println(strings[2]);
    }

/*
    static String[] splitStrings(String str){

         String[] newStr = {""};

        for (int i = 0; i <= str.length()-1; i++) {
            newStr[i]=str.substring(i,i++);
        }

         return newStr;
    }
*/
    public static void main(String[] args){
        //arraysExample();
    }
}
