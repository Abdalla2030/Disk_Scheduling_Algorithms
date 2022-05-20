// Abdalla Fadl Shehata
// 20190305
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiskScheduling diskScheduling = new DiskScheduling();
        ArrayList<Integer> inputData = new ArrayList<Integer>(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Requests: ");
        int requestsNumber = sc.nextInt();
        int request ; 
        System.out.print("Enter The Requests: ");
        for(int i = 0 ; i < requestsNumber;i++){
            request = sc.nextInt();
            inputData.add(request);
        }
        int headInitial ; 
        System.out.print("Enter The Initial Head Start Cylinder : ");
        headInitial = sc.nextInt();       
        diskScheduling.head = headInitial ; 
        boolean b = true ;
        while(b){
            diskScheduling.chooseAlgorithm();
            int choose = sc.nextInt();
            diskScheduling.addRequests(inputData);
            switch (choose){
               case 1:
                   diskScheduling.FCFS();
                   break ;
               case 2:  
                   diskScheduling.SSTF();
                   break ;
               case 3:
                   diskScheduling.SCAN();       
                   break ;
               case 4:
                   diskScheduling.CSCAN();
                   break; 
               case 5:
                   diskScheduling.LOOK();
                   break;
               case 6:
                   diskScheduling.CLOOK();
                   break;
               case 7:
                   diskScheduling.newlyOptimizedAlgorithm();
                   break;
               default :
                   b = false ;
            }
            diskScheduling.deleteRequests();            
            diskScheduling.sum = 0 ;
            diskScheduling.head = headInitial ;
        }
        
    }

}
    

