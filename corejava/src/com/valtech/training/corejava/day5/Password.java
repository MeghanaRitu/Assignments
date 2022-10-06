package com.valtech.training.corejava.day5;

public class Password{
	char ch;

          public boolean checklower(String str) {
        	  int cnt = 0;
                int flag = 0;
                if (str.length() < 8)
                    return false;
                for (char ch = 0; ch < str.length(); ch++) {
                    if (Character.isLowerCase(ch)) {
                        if (flag == 0) {
                            cnt += 5;
                            flag = 1;
                            return true;
                        } else {
                            break;
                        }
                    }
                }
                return true;
            }
         public boolean checkupper(String str) {
        	 int cnt = 0;
               int flag = 0;
               if (str.length() < 8)
                   return false;
               for (char ch = 0; ch < str.length(); ch++) {
                   if (!Character.isLowerCase(ch)) {
                       if (flag == 0) {
                           cnt += 5;
                           flag = 1;
                           return true;
                       } else {
                           break;
                       }
                 }
             }
               return true;
         }
         
public int checkspecialchar(String str) {
	int cnt = 0;
    int flag=0;        
    String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
    for (int i = 0; i < str.length(); i++) {
        String strChar = Character.toString(str.charAt(i));
        if (specialChars.contains(strChar)) {
            if(flag==0) {
            cnt+=5;
            flag=1;
        }
            else {
                cnt+=2;
            }
        }
        }
    return cnt;
    }

        boolean isNumber(char ch) {
            return (ch=='1' || ch=='2' || ch=='3' ||
                    ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' ||
                            ch=='9' || ch=='0');
        }
        
        
        
        int countNum(String str) {
            int count = 0,set=0;
               for (int i = 0; i < str.length(); i++) {
                   if (isNumber(str.charAt(i))) {
                       if(set==0) {
                           count=5;
                           set=1;
                       }
                       else count++;
                   }
               }
                       
               return count;
            
        }

       public int checker(String str) {
           int strength=0;
           if (str.length()<8) {
               return 0;
           }
           if(checklower(str)) {
               strength=strength+5;
           }
           if(checkupper(str)) {
               strength=strength+5;
           }
           int st=checkspecialchar(str);
           int nt=countNum(str);
           
           strength=strength+st+nt;
           if(strength>25)
               System.out.println("Strong"); 
           else if(strength> 20)
        	   System.out.println("Moderate");
           else
        	   System.out.println("weak");
           return strength;
           
       }
          	
       	
       	
       }
