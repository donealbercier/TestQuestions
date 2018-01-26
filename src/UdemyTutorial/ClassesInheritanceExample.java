package UdemyTutorial;

class Frog {
    public String toString(){
        return "Hello";
    }


}

public class ClassesInheritanceExample {

    public static boolean bobThere(String str) {

        for(int i = 0;i<str.length()-2;i++){

            String check3 = str.substring(i,i+3);
            if(check3.charAt(0)=='b'&&check3.charAt(2)=='b'){
                return true;
            }

        }
        return false;

    }


//    public static String mixString(String a, String b) {
//        String[] aArray = {};
//        String[] bArray = {};
//
//        for(int i = 0;i<a.length()-3;i++) {
//            aArray[i]=a.substring(i,i++);
//
//        }
//        for(int i = 0;i<b.length()-3;i++) {
//            bArray[i]=b.substring(i,i++);
//
//        }
//        System.out.println("aArray = "+aArray);
//        System.out.println("bArray = "+bArray);
//
//        return "f";
//    }
//

    public static int[] fix23(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==2&&nums[i++]==3){
                nums[i++]=0;
            }
        }
        System.out.println(nums);
        return nums;
    }



    public static void main(String[] args){

        //System.out.println(bobThere("b9b"));
        //System.out.println(mixString("hello","from the"));

//        int[] list = {4,4,5,3,2};
//        boolean is22 = false;
//        boolean is44 = false;
//        for (int i = 0; i < list.length-1; i++) {
//            if(list[i]==2&&list[i++]==2){
//                is22=true;
//            }
//            if(list[i]==4&&list[i++]==4){
//                is44=true;
//            }
//        }
//        if(is22&&is44){
//            System.out.println("wrong");
//        }
//        else{
//            System.out.println("right");
//        }
        int[] exampleInt = {2,3,5};
        System.out.println(fix23(exampleInt));
    }


}
