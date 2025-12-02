package co.com.ias;

/*

Question 2
Assume are climbing a staircase of 10 steps. Also, assume that you can only take 1 or 2 steps each time you move up the stairs.
Below is an example of two different ways you can climb the staircase.

1, 1, 2, 2, 1, 2, 1
2, 2, 2, 2, 2

Write an algorithm to calculate the total number of unique ways we can climb the staircase.

Part 1: If you do a google search on this problem, you will find that one of the solutions uses the Fibonacci sequence.
Explain how this solution works. You do not need to write any code.

//Explanation in words:

First, in another way, the problem says that there are only two possible moves you could have made right before reaching step n.

Breaking the problem into smaller pieces:

We just have 2 options, because you only can climb 1 or 2 steps:

   Approach A:
        You came from step (n-1). It means the last step was 1. You init with n=1.
        What it means is the number of ways to reach step (n-1) determines how many ways lead to n applying this option.

Approach b.
     You came from step (n-2). It means the last step was 2 steps.
     What it means the number of ways to reach step (n-2) also leads to step n.


   To sum it up, the number of ways to reach the n stair is:
      all the ways to reach to n-1 and climb a step more or all the ways to reach to n-2
      and climb twice steps more.

       Ways(n) = ways(n-1) + ways(n-2). What it looks like to a mathematic expresion from Fibonacci: F(n) = F(n-1)+ F(n-2)



Every number appears depending on the 2 last numbers.





Desktop test:

If Step 1 is:

1

Ways(1)=1

Step 2 is:

There are 2 ways:

 1,1 or 2.

Ways(2)=2



Step 3:

You can choose came from the step 1 [ways(1) = 1; 1 final step] or from the step 2 [ways(2) = 2 ways; 1 final step]



Ways(3) = 2 + 1 = 3



Step 4:

Cam from step 3 (3 different ways) or came from step 2 (two different ways)



Ways(4) = 3 + 2 = 5.



The pattern is something like:
Step

1          -> 1 => similar to Fibonacci pattern

2          -> 2

3          -> 3

4          -> 5

5          -> 8

...


Part 2: If we do not use Fibonacci sequence solution, how could we solve this problem? Please explain your algorithm.





If the staircase has 10 steps, we can create an array of 11 size (index from 1 to 10).



By using pseudo code:



Way[1] = 1; one way to be here.

Way[2] = 2; two way to be here.



After this 2 steps (always are the same):



We use a for in pseudo code:

   For i from 3 to 10 {

         Ways[i] = ways[i-1] + ways[i-2];

}

(each value is built from the previuos values)







Desktop test:



N=5;

Ways[1]= 1;

Ways[2] = 2;

//From here it changes depending how to init the first steps:

Ways[3] = ways[2] + ways[1] = 2 + 1 = 3;

Ways[4] = ways[3] + ways[2] = 3 + 2 = 5;
ways[5] = ways[4] + ways[3] = 5 + 3 = 8;

So, there are 8 different ways to climb 5 steps.


 */


public class Marso_technologies2 {


}
