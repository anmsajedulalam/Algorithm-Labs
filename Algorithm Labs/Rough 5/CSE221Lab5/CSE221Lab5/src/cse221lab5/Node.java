    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package cse221lab5;

    /**
     *
     * @author BRACU\12201027
     */
    public class Node {

      int value;
      int distance;//dis[]
      int parent;//prev[]
      Node next;
      public Node(int v,Node n,int d,int p)
      {
        value=v;
        next=n;
        distance=d;
        parent=p;
      }

    }
