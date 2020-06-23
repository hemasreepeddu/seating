package seating;


import java.util.*;
class seat {
    public static void main(String args[]){
       
        Scanner s = new Scanner(System.in);
        int inp = s.nextInt();
        int j = 0;
        int [] tArray = new int[inp];   
        String [] seatArray = new String[inp];
        String pArray[] = {"WS","MS","AS"};
        for(int i=0; i<inp; i++ ) {
        	tArray[i]= s.nextInt();
        }
        for(int i=0;i<inp;i++){
            if(tArray[i]%12==0) {
            	seatArray[i]=pArray[0];
            	tArray[i]=tArray[i]-11;
            
            }
            else if(tArray[i]%12==1) {
            	seatArray[i]=pArray[0];
            	tArray[i]=tArray[i]+11;
            
            }
            else if(tArray[i]%12==2) {
            	seatArray[i]=pArray[1];
            	tArray[i]=tArray[i]+9;
            	
            }
            else if(tArray[i]%12==3) {
            	seatArray[i]=pArray[2];
            	tArray[i]=tArray[i]+7;
            
            }
            else if(tArray[i]%12==4) {
            	seatArray[i]=pArray[2];
            	tArray[i]=tArray[i]+5;
            
            }
            else if(tArray[i]%12==5) {
            	seatArray[i]=pArray[1];
            	tArray[i]=tArray[i]+3;
            
            }
            else if(tArray[i]%12==6) {
            	seatArray[i]=pArray[0];
            	tArray[i]=tArray[i]+1;
            	
            }
            else if(tArray[i]%12==7) {
            	seatArray[i]=pArray[0];
            	tArray[i]=tArray[i]-1;
            	
            }
            else if(tArray[i]%12==8) {
            	seatArray[i]=pArray[1];
            	tArray[i]=tArray[i]-3;
            	
            }
            else if(tArray[i]%12==9) {
            	seatArray[i]=pArray[2];
            	tArray[i]=tArray[i]-5;
            	
            }
            else if(tArray[i]%12==10) {
            	seatArray[i]=pArray[2];
            	tArray[i]=tArray[i]-7;
            
            }
            else if(tArray[i]%12==11) {
            	seatArray[i]=pArray[1];
            	tArray[i]=tArray[i]-9;
   
            }
            System.out.println( tArray[i] + " " +seatArray[i]);  // Writing output to STDOUT
        }
        
    }
}

