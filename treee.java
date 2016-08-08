
package tree;
 
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
 
public class ZigZagTreeTraversal {
 private Node rootNode;
 
 public static void main(String[] args) {
  new ZigZagTreeTraversal();
 }
 
 public ZigZagTreeTraversal(){
 
  addNode(rootNode, 1);
  addNode(rootNode, 2);
  addNode(rootNode, 3);
  addNode(rootNode, 4);
  addNode(rootNode, 5);
  addNode(rootNode, 6);
  addNode(rootNode, 7);
  addNode(rootNode, 8);
  addNode(rootNode, 9);
  addNode(rootNode, 10);
  addNode(rootNode, 11);
 
  zigZagTraverse(rootNode); 
 }
 
 private void zigZagTraverse(Node rootNode) {
  if(rootNode==null){
   return;
  }
  Stack<Node> currentLevelStack = new Stack<Node>();
  Stack<Node> nextLevelStack = new Stack<Node>();
   
  boolean isLeftRightReading = true;
  currentLevelStack.add(rootNode);
   
  while(!currentLevelStack.isEmpty()){
   Node n = currentLevelStack.pop();
   System.out.print(n.getData() + " ");
   if(isLeftRightReading){
    if(n.getLeft()!=null)
     nextLevelStack.push(n.getLeft());
    if(n.getRight()!=null)
     nextLevelStack.push(n.getRight());
   }else{
    if(n.getRight()!=null)
     nextLevelStack.push(n.getRight());
    if(n.getLeft()!=null)
     nextLevelStack.push(n.getLeft());
   }
   if(currentLevelStack.isEmpty()){
    isLeftRightReading = !isLeftRightReading;
    currentLevelStack=nextLevelStack;
    nextLevelStack = new Stack<Node>();
   }
  }
 }
  
  
 private void addNode(Node rootNode, int data){
 
  //First check is there any Nodes present.
  if(rootNode==null){
   // No Nodes are Present, create one and assign it to startNode
   Node temp1=new Node(data);
   this.rootNode=temp1;
  }else{
   //Nodes present, So check the proper position where to add New Node.
 
   //Checking whether Left child and Right child are present for root Node.
   if(rootNode.getLeft()!=null && rootNode.getRight()!=null){
    //Left and Right Child exist, Also, we need to add new Node in Sequential Fashion of Left and Right,
    //We have to scan all Levels one by one to check a proper place for new Node.
    //Also, we for each and every node we need to check whether Left and Right Exist,
    //So we need to store them for later Processing that is why we introduced Queue.
 
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(rootNode);
 
    while(!queue.isEmpty()){
     Node obj = (Node)queue.poll();
     if(obj.getLeft()!=null && obj.getRight()!=null){
      queue.add(obj.getLeft());
      queue.add(obj.getRight());
     }else if(obj.getLeft()==null){
      Node temp1=new Node(data);
      obj.setLeft(temp1);
      break;
     }else{
      Node temp1=new Node(data);
      obj.setRight(temp1);
      break;
     }
    }
 
   }else{
    // We reach this condition when either Left or Right is Null, but not sure which side is Null.
    if(rootNode.getLeft()==null){
     Node temp1=new Node(data);
     rootNode.setLeft(temp1);
    }else{
     Node temp1=new Node(data);
     rootNode.setRight(temp1);
    }
   }
  }
 }
  
}
