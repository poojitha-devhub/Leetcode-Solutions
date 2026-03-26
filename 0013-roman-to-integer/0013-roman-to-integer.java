class Solution {
    public int character(char a){
        if(a=='I'){
            return 1;
        }
        else if(a=='V'){
            return 5;
        }
        else if(a=='X'){
            return 10;
        }
        else if(a=='L'){
            return 50;
        }
        else if(a=='C'){
            return 100;
        }
        else if(a=='D'){
            return 500;
        }
        else {
            return 1000;
        }
    }
    public int romanToInt(String s) {
        int add=0;
        int n=s.length();
        int v1,v2;
        for(int i=0;i<n;i++){
            if(i<(n-1)){
                v1=character(s.charAt(i));
                v2=character(s.charAt(i+1));
                if(v1<v2){
                    add-=v1;
                }
                else{
                    add+=v1;
                }

            }
            else{
                add+=character(s.charAt(n-1));
            }
        }
        return add;
        
    }
}