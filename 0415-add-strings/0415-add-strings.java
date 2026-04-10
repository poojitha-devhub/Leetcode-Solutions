class Solution {
    public String addStrings(String num1, String num2) {
        // construct a string using StringBuilder
        StringBuilder result=new StringBuilder();
        //take lengths of num1,num2
        int i=num1.length()-1;
        int j=num2.length()-1;
        //intialize carry to 0
        int carry =0;
        // add num until carry is not 0 and i ,j >=0
        while(i>=0||j>=0||carry!=0){
            // assign sum = carry
            int sum=carry;
            if(i>=0){
                //char gives character at i
                //sum is integer
                //Ascii of 0 is 48,1 is 49, 2 is 50 and so on
                //if char at i is '4' then
                //ascii for 4 is 52 and ascii for '0' is 48
                //sum will be 52-48 =4
                sum+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=num2.charAt(j)-'0';
                j--;
            }
            result.append(sum%10);
            carry=sum/10;
            
        }

    return result.reverse().toString();  
    }
}