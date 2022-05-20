# Disk_Scheduling_Algorithms
Advanced Operating Systems (CS342) - Assignment(2) - Disk Scheduling

Applying all the following disk scheduling algorithms (FCFS, SSTF, SCAN, C-SCAN, LOOK and C-LOOK) as well as the newly optimized algorithm.

The algorithms which simulated in this project:

1- FCFS: It is the simplest of all the Disk Scheduling Algorithms. In FCFS, the requests are addressed in the order they arrive in the disk queue.

2- SSTF: (Shortest Seek Time First): It requests having shortest seek time are executed first.

3- SCAN: In SCAN disk scheduling algorithm, head starts from one end of the disk and moves towards the other end, servicing requests in between one by one and reach the other end. Then the direction of the head is reversed and the process continues as head continuously scan back and forth to access the disk.

4- C-SCAN: Circular SCAN (C-SCAN) scheduling algorithm is a modified version of SCAN disk scheduling algorithm that deals with the inefficiency of SCAN algorithm by servicing the requests more uniformly.

5- LOOK: It is advanced version of SCAN disk scheduling with a better seek time, it is like SCAN algorithm but it also looks ahead for more requests to be serviced in the same direction, if there are no pending requests in the the head then we reverse direction and start servicing requests in the opposite direction.

6- C-LOOK: C-LOOK is an enhanced version of both SCAN as well as LOOK disk scheduling algorithms. This algorithm also uses the idea of wrapping the tracks as a circular cylinder as C-SCAN algorithm but the seek time is better than C-SCAN algorithm. We know that C-SCAN is used to avoid starvation and services all the requests more uniformly, the same goes for C-LOOK.

7-Newly Optimized Algorithm: Is a new disk scheduling algorithm for improving the performance of modern storage devices in terms of throughput. Initially the disk head is at position (0). If there are a request arrives in the requests queue, it will be served immediately. This algorithm generates minimum total head movement.
