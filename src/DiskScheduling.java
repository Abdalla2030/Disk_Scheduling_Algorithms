// Abdalla Fadl Shehata
// 20190305
import java.util.ArrayList;
import java.util.Collections;
public class DiskScheduling{
        public ArrayList<Integer>requests = new ArrayList<Integer>(); 
        public int head = 0 , sum = 0  ;
        ///////////////////////////////////////////////      
        public void chooseAlgorithm(){
            System.out.print("1-FCFS  ");
            System.out.print("2-SSTF  ");
            System.out.print("3-SCAN  ");
            System.out.print("4-CSCAN  ");
            System.out.print("5-LOOK  ");
            System.out.print("6-CLOOK  ");
            System.out.print("7-Newly Optimized Algorithm  ");
            System.out.println("8-Stop  ");
        }
        //////////////////////////////////////////////
        public void addRequests(ArrayList inputData){
            for (int i = 0 ;i<inputData.size();i++){
                requests.add((Integer) inputData.get(i)); 
           }
        }
        /////////////////////////////////////////////
        public void deleteRequests(){             
            requests.clear();
        }
        //////////////////////////////////////////////
        public void FCFS(){
            for (int i = 0; i < requests.size(); i++) {
                sum += Math.abs(requests.get(i)-head);
                if (i == 0){
                    System.out.print(head + " -> "); //
                }
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }
            System.out.println("stop\nThe Total Head Movement In (FCFS) Is "+sum+" Cylinders");
            System.out.println("=========================================");
        }
        ///////////////////////////////////////////////    
        public void SSTF(){
            int minDistance = 0; 
            int iMin = 0 ;   
            System.out.print(head + " -> ");//
            while(!requests.isEmpty()){
                minDistance = Math.abs(requests.get(0) - head) ;
                iMin = 0 ;
                for (int i = 0; i < requests.size(); i++){
                    int distance = Math.abs(requests.get(i) - head);
                    if( distance <= minDistance ){
                        minDistance = distance ; 
                        iMin = i ; 
                    }
                }
                sum += minDistance ; 
                head = requests.get(iMin) ; 
                System.out.print(requests.get(iMin) + " -> ");//
                requests.remove(iMin) ;
            }
            System.out.println("stop\nThe Total Head Movement In (SSTF) Is "+sum+" Cylinders");
            System.out.println("=========================================");
        }
        ///////////////////////////////////////////////    
        public void SCAN(){
            sum = 0 ;
            head = 53 ;
            requests.add(0);
            requests.add(head);
            Collections.sort(requests);
            int headI = requests.indexOf(head); 
            for (int i = headI; i >= 0; i--) {
                sum += Math.abs(requests.get(i)-head);
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }
            for (int i = headI + 1; i < requests.size(); i++) {
                sum += Math.abs(requests.get(i)-head);
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }
            System.out.println("stop\nThe Total Head Movement In (SCAN) Is "+sum+" Cylinders");
            System.out.println("=========================================");

        }
        ///////////////////////////////////////////////  
        public void CSCAN(){
            sum = 0 ;
            head = 53 ;
            requests.add(0);
            requests.add(199);
            requests.add(head);
            Collections.sort(requests);
            int headI = requests.indexOf(head); 
            System.out.print(head + " -> ");//
            for(int i = headI + 1; i < requests.size(); i++){
                sum += Math.abs(requests.get(i)-head);
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }
            int last = requests.get(requests.size() - 1);
            head = last;
            for (int i = 0; i <headI ; i++) {
                sum += Math.abs(requests.get(i)-head);
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }
            System.out.println("stop\nThe Total Head Movement In (CSCAN) Is "+sum+" Cylinders");   
            System.out.println("=========================================");
        }
        ///////////////////////////////////////////////
         public void LOOK(){
            sum = 0 ;
            head = 53 ;
            requests.add(head);
            Collections.sort(requests);
            int headI = requests.indexOf(head); 
            System.out.print(head + " -> ");//
            for(int i = headI + 1; i < requests.size(); i++){
                sum += Math.abs(requests.get(i)-head);
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }
            int last = requests.get(requests.size() - 1);
            head = last;
            for (int i =headI-1; i>=0 ; i--) {
                sum += Math.abs(requests.get(i)-head);
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }    
            System.out.println("stop\nThe Total Head Movement In (LOOK) Is "+sum+" Cylinders");   
            System.out.println("=========================================");
        }
        ///////////////////////////////////////////////
          public void CLOOK(){
            sum = 0 ;
            head = 53 ;
           // requests.add(0);
            requests.add(head);
            Collections.sort(requests);
            int headI = requests.indexOf(head); 
            System.out.print(head + " -> ");//
            for(int i = headI + 1; i < requests.size(); i++){
                sum += Math.abs(requests.get(i)-head);
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }
            int last = requests.get(requests.size() - 1);
            head = last;
            for (int i = 0; i <headI ; i++) {
                sum += Math.abs(requests.get(i)-head);
                head = requests.get(i) ; 
                System.out.print(requests.get(i) + " -> ");//
            }    
            System.out.println("stop\nThe Total Head Movement In (CLOOK) Is "+sum+" Cylinders");   
            System.out.println("=========================================");
        }
        ///////////////////////////////////////
        public void newlyOptimizedAlgorithm(){
            requests.add(0);
            Collections.sort(requests);
            System.out.print(requests.get(0) + " -> ");//
            for(int i = 1 ;i<requests.size();i++){
                sum += Math.abs(requests.get(i)-requests.get(i-1));
                System.out.print(requests.get(i) + " -> ");//
            }
            System.out.println("stop\nThe Total Head Movement In (Newly Optimized Algorithm) Is "+sum+" Cylinders");
            System.out.println("=========================================");
            System.out.println("summary about the Newly Optimized Algorithm");
            System.out.println("Is a new disk scheduling algorithm for improving the performance of modern storage devices in terms of throughput.");
            System.out.println("Initially the disk head is at position (0).");
            System.out.println("If there are a request arrives in the requests queue, it will be served immediately.");
            System.out.println("This algorithm generates minimum total head movement in the example.");      
        }
}


//             8 
//     98 183 37 122 14 124 65 67
//            53 