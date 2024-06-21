class Solution {

    String compareFrac(String str) {
        // Code here
        String[] input=str.split(",");
        
        String fraction[]=input[0].split("/");
        
        String fraction2[]=input[1].split("/");
        
        int numerator1=Integer.parseInt(fraction[0]);
        int denominator1=Integer.parseInt(fraction[1]);
        
        int numerator2=Integer.parseInt(fraction2[0].trim());
        int denominator2=Integer.parseInt(fraction2[1]);
       
        
        float first=(float)numerator1/denominator1;
        float second=(float)numerator2/denominator2;
        
        
        if(first>second)
        return input[0];
        else if(first<second)
        return input[1].trim();
        return "equal";
    }
}