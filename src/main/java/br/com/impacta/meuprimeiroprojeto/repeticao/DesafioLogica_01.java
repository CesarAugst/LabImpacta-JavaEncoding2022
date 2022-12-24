package br.com.impacta.meuprimeiroprojeto.repeticao;

public class DesafioLogica_01 {
    public static void main(String[] args) {
        int[] nums1 = {2,11,15,7};
        int target1 = 9;
        String response = "";
        for (int index = 0; index < nums1.length;index++){
            int num1 = nums1[index];
            for (int index2 = 0; index2 < nums1.length;index2++){
                int num2 = nums1[index2];
                if(num1 + num2 == target1){
                    response = "num1[" + index + "] + num1[" + index2 + "] = target1 (" +target1+")";
                }
            }
        }
        System.out.println(response);
        int[] nums2 = {3,2,4};
        int target2 = 6;
        for (int index = 0; index < nums2.length;index++){
            int num1 = nums2[index];
            for (int index2 = 0; index2 < nums2.length;index2++){
                int num2 = nums2[index2];
                if(num1 + num2 == target2){
                    response = "num1[" + index + "] + num1[" + index2 + "] = target2 (" +target2+")";
                }
            }
        }
        System.out.println(response);
        int[] nums3 = {3,3};
        int target3 = 6;
        for (int index = 0; index < nums3.length;index++){
            int num1 = nums3[index];
            for (int index2 = 0; index2 < nums3.length;index2++){
                int num2 = nums3[index2];
                if(num1 + num2 == target3){
                    response = "num3[" + index + "] + num3[" + index2 + "] = target3 (" +target3+")";
                }
            }
        }
        System.out.println(response);
    }
}
