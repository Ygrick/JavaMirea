package pr7;

import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choice: Stack, Deque, Queue");
        if(scanner.next() == "Stack"){
            Stack<Integer> first = new Stack();
            Stack<Integer> second = new Stack();
            GameStack(first, second);
        } else if (scanner.next() == "Deque") {
            Deque<Integer> first = new LinkedList<Integer>();
            Deque<Integer> second = new LinkedList<Integer>();
            GameDeque(first, second);
        } else {
            Queue<Integer> first = new LinkedList<Integer>();
            Queue<Integer> second = new LinkedList<Integer>();
            GameQueue(first,second);
        }
    }
    public static void GameDeque(Deque<Integer> first,Deque<Integer> second) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pull cards: ");
        for(int i=0;i<5;i++)
            first.add(scanner.nextInt());
        for(int i=0;i<5;i++)
            second.add(scanner.nextInt());
        int moves = 0;
        while (!first.isEmpty() && !second.isEmpty() && moves < 107) {
            int FirstCard = first.pop();
            int SecondCard = second.pop();
            if (FirstCard == 0 && SecondCard == 9) {
                first.add(FirstCard);
                first.add(SecondCard);
            } else if (FirstCard == 9 && SecondCard == 0) {
                second.add(FirstCard);
                second.add(SecondCard);
            } else if (FirstCard < SecondCard) {
                second.add(FirstCard);
                second.add(SecondCard);
            } else {
                first.add(FirstCard);
                first.add(SecondCard);
            }
            moves++;
        }
        if (moves == 107) {
            System.out.println("botva");
        }
        else if (second.isEmpty()) {
            System.out.println("FIRST is the winner! Quantity of moves before the winning: "+moves);
        }
        else {
            System.out.println("SECOND is the winner! Quantity of moves before the winning: "+moves);
        }
    }
    public static void GameStack(Stack<Integer> st1,Stack<Integer> st2){
        int moves=0;
        while(!st1.isEmpty() && !st2.isEmpty() && moves<107){
            int FirstCard= st1.pop();
            int SecondCard=st2.pop();
            if(FirstCard==0 && SecondCard==9){
                st1.add(0,FirstCard);
                st1.add(0,SecondCard);
            }else if(FirstCard==9 && SecondCard==0){
                st2.add(0,FirstCard);
                st2.add(0,SecondCard);
            } else if(FirstCard<SecondCard){
                st2.add(0,FirstCard);
                st2.add(0,SecondCard);
            } else {
                st1.add(0,FirstCard);
                st1.add(0,SecondCard);
            }
            moves++;
        }
        if(moves==107){
            System.out.println("botva");
        }
        else if(st2.isEmpty()){
            System.out.println("FIRST is the winner! Quantity of moves before the winning: "+moves);
        }
        else{
            System.out.println("SECOND is the winner! Quantity of moves before the winning: "+moves);
        }
    }
    public static void GameQueue(Queue<Integer> q1, Queue<Integer> q2){
        int moves=0;
        while(!q1.isEmpty() && !q2.isEmpty() && moves<107){
            int FCard = q1.remove();
            int SCard = q2.remove();
            if(FCard==0 && SCard==9){
                q1.add(FCard);
                q1.add(SCard);
            }
            if(FCard==9 && SCard==0){
                q2.add(FCard);
                q2.add(SCard);
            }
            else if(FCard<SCard){
                q2.add(FCard);
                q2.add(SCard);
            }
            else if(FCard>SCard){
                q1.add(FCard);
                q1.add(SCard);
            }
            moves++;
        }
        if(moves==107)
            System.out.println("botva "+moves);
        else if(q1.isEmpty())
            System.out.println("SECOND is the winner! Quantity of moves before the winning: "+moves);
        else if(q2.isEmpty())
            System.out.println("FIRST is the winner! Quantity of moves before the winning: "+moves);
    }
}